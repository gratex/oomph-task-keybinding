#!/bin/bash

set -o errexit
#set -x

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

NEXT_VERSION=$(git tag --sort=v:refname | tail -1 | gawk -F"." '{$NF+=1}{print $0RT}' OFS="." ORS="")

read -p "Release version: " -e -i "$NEXT_VERSION" VERSION

if [[ -z $VERSION ]]; then
    >&2 echo "Provide release version"
    exit 1
fi

if [[ -n $(git status --porcelain) ]]; then
    >&2 echo "Repo is dirty, commit your changes before release"
    exit 1
fi

git pull --rebase

# build
$DIR/build.sh

git tag "$VERSION"
git push --follow-tags

pushd $DIR/../oomph-task-keybinding-gh-pages
{
    git reset HEAD --hard
    git clean -dfx
    git pull
    mkdir -p repository
    rm -rf repository/*
    cp -r $DIR/com.gratex.oomph.task.keybinding.site/target/repository/* repository/
    git add -A
    git commit -m "release $VERSION"
    git tag -a -m "release $VERSION" "$VERSION"
    git push --follow-tags
} && {
    popd
}

