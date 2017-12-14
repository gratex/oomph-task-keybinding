/**
 */
package com.gratex.oomph.task.keybinding;

import org.eclipse.oomph.base.BasePackage;
import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.gratex.oomph.task.keybinding.KeybindingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/gratex/oomph-task-keybinding/master/com.gratex.oomph.task.keybinding/model/Keybinding-1.0.ecore'"
 * @generated
 */
public interface KeybindingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "keybinding";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.gratex.com/oomph/task/keybinding/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "keybinding";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KeybindingPackage eINSTANCE = com.gratex.oomph.task.keybinding.impl.KeybindingPackageImpl.init();

  /**
   * The meta object id for the '{@link com.gratex.oomph.task.keybinding.impl.KeyBindingTaskImpl <em>Key Binding Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.keybinding.impl.KeyBindingTaskImpl
   * @see com.gratex.oomph.task.keybinding.impl.KeybindingPackageImpl#getKeyBindingTask()
   * @generated
   */
  int KEY_BINDING_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Scheme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__SCHEME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__CONTEXTS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__PLATFORM = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Locale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__LOCALE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Keys</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__KEYS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__COMMAND = SetupPackage.SETUP_TASK_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Command Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK__COMMAND_PARAMETERS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Key Binding Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.gratex.oomph.task.keybinding.impl.KeyBindingContextImpl <em>Key Binding Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.keybinding.impl.KeyBindingContextImpl
   * @see com.gratex.oomph.task.keybinding.impl.KeybindingPackageImpl#getKeyBindingContext()
   * @generated
   */
  int KEY_BINDING_CONTEXT = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_CONTEXT__ANNOTATIONS = BasePackage.MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_CONTEXT__ID = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Key Binding Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_BINDING_CONTEXT_FEATURE_COUNT = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.gratex.oomph.task.keybinding.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.keybinding.impl.CommandParameterImpl
   * @see com.gratex.oomph.task.keybinding.impl.KeybindingPackageImpl#getCommandParameter()
   * @generated
   */
  int COMMAND_PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__ANNOTATIONS = BasePackage.MODEL_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__ID = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER__VALUE = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Command Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_PARAMETER_FEATURE_COUNT = BasePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * Returns the meta object for class '{@link com.gratex.oomph.task.keybinding.KeyBindingTask <em>Key Binding Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Binding Task</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingTask
   * @generated
   */
  EClass getKeyBindingTask();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getScheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scheme</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingTask#getScheme()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Scheme();

  /**
   * Returns the meta object for the containment reference list '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getContexts <em>Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexts</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingTask#getContexts()
   * @see #getKeyBindingTask()
   * @generated
   */
  EReference getKeyBindingTask_Contexts();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getPlatform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Platform</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingTask#getPlatform()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Platform();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getLocale <em>Locale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Locale</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingTask#getLocale()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Locale();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keys</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingTask#getKeys()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Keys();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingTask#getCommand()
   * @see #getKeyBindingTask()
   * @generated
   */
  EAttribute getKeyBindingTask_Command();

  /**
   * Returns the meta object for the containment reference list '{@link com.gratex.oomph.task.keybinding.KeyBindingTask#getCommandParameters <em>Command Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Command Parameters</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingTask#getCommandParameters()
   * @see #getKeyBindingTask()
   * @generated
   */
  EReference getKeyBindingTask_CommandParameters();

  /**
   * Returns the meta object for class '{@link com.gratex.oomph.task.keybinding.KeyBindingContext <em>Key Binding Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Binding Context</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingContext
   * @generated
   */
  EClass getKeyBindingContext();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.keybinding.KeyBindingContext#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see com.gratex.oomph.task.keybinding.KeyBindingContext#getID()
   * @see #getKeyBindingContext()
   * @generated
   */
  EAttribute getKeyBindingContext_ID();

  /**
   * Returns the meta object for class '{@link com.gratex.oomph.task.keybinding.CommandParameter <em>Command Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command Parameter</em>'.
   * @see com.gratex.oomph.task.keybinding.CommandParameter
   * @generated
   */
  EClass getCommandParameter();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.keybinding.CommandParameter#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see com.gratex.oomph.task.keybinding.CommandParameter#getID()
   * @see #getCommandParameter()
   * @generated
   */
  EAttribute getCommandParameter_ID();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.keybinding.CommandParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.gratex.oomph.task.keybinding.CommandParameter#getValue()
   * @see #getCommandParameter()
   * @generated
   */
  EAttribute getCommandParameter_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KeybindingFactory getKeybindingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.gratex.oomph.task.keybinding.impl.KeyBindingTaskImpl <em>Key Binding Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.keybinding.impl.KeyBindingTaskImpl
     * @see com.gratex.oomph.task.keybinding.impl.KeybindingPackageImpl#getKeyBindingTask()
     * @generated
     */
    EClass KEY_BINDING_TASK = eINSTANCE.getKeyBindingTask();

    /**
     * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__SCHEME = eINSTANCE.getKeyBindingTask_Scheme();

    /**
     * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_BINDING_TASK__CONTEXTS = eINSTANCE.getKeyBindingTask_Contexts();

    /**
     * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__PLATFORM = eINSTANCE.getKeyBindingTask_Platform();

    /**
     * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__LOCALE = eINSTANCE.getKeyBindingTask_Locale();

    /**
     * The meta object literal for the '<em><b>Keys</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__KEYS = eINSTANCE.getKeyBindingTask_Keys();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_TASK__COMMAND = eINSTANCE.getKeyBindingTask_Command();

    /**
     * The meta object literal for the '<em><b>Command Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_BINDING_TASK__COMMAND_PARAMETERS = eINSTANCE.getKeyBindingTask_CommandParameters();

    /**
     * The meta object literal for the '{@link com.gratex.oomph.task.keybinding.impl.KeyBindingContextImpl <em>Key Binding Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.keybinding.impl.KeyBindingContextImpl
     * @see com.gratex.oomph.task.keybinding.impl.KeybindingPackageImpl#getKeyBindingContext()
     * @generated
     */
    EClass KEY_BINDING_CONTEXT = eINSTANCE.getKeyBindingContext();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_BINDING_CONTEXT__ID = eINSTANCE.getKeyBindingContext_ID();

    /**
     * The meta object literal for the '{@link com.gratex.oomph.task.keybinding.impl.CommandParameterImpl <em>Command Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.keybinding.impl.CommandParameterImpl
     * @see com.gratex.oomph.task.keybinding.impl.KeybindingPackageImpl#getCommandParameter()
     * @generated
     */
    EClass COMMAND_PARAMETER = eINSTANCE.getCommandParameter();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_PARAMETER__ID = eINSTANCE.getCommandParameter_ID();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_PARAMETER__VALUE = eINSTANCE.getCommandParameter_Value();

  }

} // KeybindingPackage
