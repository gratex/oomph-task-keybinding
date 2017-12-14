/**
 */
package com.gratex.oomph.task.keybinding;

import org.eclipse.oomph.base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Binding Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.keybinding.KeyBindingContext#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingContext()
 * @model
 * @generated
 */
public interface KeyBindingContext extends ModelElement
{
  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * The default value is <code>"org.eclipse.ui.contexts.window"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see #setID(String)
   * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingContext_ID()
   * @model default="org.eclipse.ui.contexts.window"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
  String getID();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.keybinding.KeyBindingContext#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ID</em>' attribute.
   * @see #getID()
   * @generated
   */
  void setID(String value);

} // KeyBindingContext
