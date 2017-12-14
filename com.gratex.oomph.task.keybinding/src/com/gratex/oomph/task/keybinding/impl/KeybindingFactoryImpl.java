/**
 */
package com.gratex.oomph.task.keybinding.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.gratex.oomph.task.keybinding.CommandParameter;
import com.gratex.oomph.task.keybinding.KeyBindingContext;
import com.gratex.oomph.task.keybinding.KeyBindingTask;
import com.gratex.oomph.task.keybinding.KeybindingFactory;
import com.gratex.oomph.task.keybinding.KeybindingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeybindingFactoryImpl extends EFactoryImpl implements KeybindingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KeybindingFactory init()
  {
    try
    {
      KeybindingFactory theKeybindingFactory = (KeybindingFactory)EPackage.Registry.INSTANCE.getEFactory(KeybindingPackage.eNS_URI);
      if (theKeybindingFactory != null)
      {
        return theKeybindingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KeybindingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeybindingFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case KeybindingPackage.KEY_BINDING_TASK:
      return createKeyBindingTask();
    case KeybindingPackage.KEY_BINDING_CONTEXT:
      return createKeyBindingContext();
    case KeybindingPackage.COMMAND_PARAMETER:
      return createCommandParameter();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyBindingTask createKeyBindingTask()
  {
    KeyBindingTaskImpl keyBindingTask = new KeyBindingTaskImpl();
    return keyBindingTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyBindingContext createKeyBindingContext()
  {
    KeyBindingContextImpl keyBindingContext = new KeyBindingContextImpl();
    return keyBindingContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandParameter createCommandParameter()
  {
    CommandParameterImpl commandParameter = new CommandParameterImpl();
    return commandParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeybindingPackage getKeybindingPackage()
  {
    return (KeybindingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KeybindingPackage getPackage()
  {
    return KeybindingPackage.eINSTANCE;
  }

} // KeybindingFactoryImpl
