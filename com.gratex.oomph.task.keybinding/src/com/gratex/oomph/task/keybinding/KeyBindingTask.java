/**
 */
package com.gratex.oomph.task.keybinding;

import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Binding Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getScheme <em>Scheme</em>}</li>
 *   <li>{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getContexts <em>Contexts</em>}</li>
 *   <li>{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getPlatform <em>Platform</em>}</li>
 *   <li>{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getLocale <em>Locale</em>}</li>
 *   <li>{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getKeys <em>Keys</em>}</li>
 *   <li>{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getCommand <em>Command</em>}</li>
 *   <li>{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getCommandParameters <em>Command Parameters</em>}</li>
 * </ul>
 *
 * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.keybinding' repository='https://gratex.github.io/oomph-task-keybinding/repository' installableUnits='com.gratex.oomph.task.keybinding.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface KeyBindingTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Scheme</b></em>' attribute.
   * The default value is <code>"org.eclipse.ui.defaultAcceleratorConfiguration"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheme</em>' attribute.
   * @see #setScheme(String)
   * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingTask_Scheme()
   * @model default="org.eclipse.ui.defaultAcceleratorConfiguration" required="true"
   * @generated
   */
  String getScheme();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getScheme <em>Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheme</em>' attribute.
   * @see #getScheme()
   * @generated
   */
  void setScheme(String value);

  /**
   * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
   * The list contents are of type {@link com.gratex.oomph.task.keybinding.KeyBindingContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexts</em>' containment reference list.
   * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingTask_Contexts()
   * @model containment="true" required="true"
   *        extendedMetaData="name='context'"
   * @generated
   */
  EList<KeyBindingContext> getContexts();

  /**
   * Returns the value of the '<em><b>Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Platform</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Platform</em>' attribute.
   * @see #setPlatform(String)
   * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingTask_Platform()
   * @model
   * @generated
   */
  String getPlatform();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getPlatform <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platform</em>' attribute.
   * @see #getPlatform()
   * @generated
   */
  void setPlatform(String value);

  /**
   * Returns the value of the '<em><b>Locale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locale</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locale</em>' attribute.
   * @see #setLocale(String)
   * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingTask_Locale()
   * @model
   * @generated
   */
  String getLocale();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getLocale <em>Locale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Locale</em>' attribute.
   * @see #getLocale()
   * @generated
   */
  void setLocale(String value);

  /**
   * Returns the value of the '<em><b>Keys</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keys</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keys</em>' attribute.
   * @see #setKeys(String)
   * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingTask_Keys()
   * @model
   * @generated
   */
  String getKeys();

  boolean hasKeys();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getKeys <em>Keys</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keys</em>' attribute.
   * @see #getKeys()
   * @generated
   */
  void setKeys(String value);

  /**
   * Returns the value of the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' attribute.
   * @see #setCommand(String)
   * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingTask_Command()
   * @model required="true"
   * @generated
   */
  String getCommand();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getCommand <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' attribute.
   * @see #getCommand()
   * @generated
   */
  void setCommand(String value);

  /**
   * Returns the value of the '<em><b>Command Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.gratex.oomph.task.keybinding.CommandParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command Parameters</em>' containment reference list.
   * @see com.gratex.oomph.task.keybinding.KeybindingPackage#getKeyBindingTask_CommandParameters()
   * @model containment="true"
   *        extendedMetaData="name='commandParameter'"
   * @generated
   */
  EList<CommandParameter> getCommandParameters();

} // KeyBindingTask
