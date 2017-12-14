/**
 */
package com.gratex.oomph.task.keybinding;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.gratex.oomph.task.keybinding.KeybindingPackage
 * @generated
 */
public interface KeybindingFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KeybindingFactory eINSTANCE = com.gratex.oomph.task.keybinding.impl.KeybindingFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Key Binding Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Binding Task</em>'.
   * @generated
   */
  KeyBindingTask createKeyBindingTask();

  /**
   * Returns a new object of class '<em>Key Binding Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Binding Context</em>'.
   * @generated
   */
  KeyBindingContext createKeyBindingContext();

  /**
   * Returns a new object of class '<em>Command Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command Parameter</em>'.
   * @generated
   */
  CommandParameter createCommandParameter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KeybindingPackage getKeybindingPackage();

} // KeybindingFactory
