/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.activities.dynamicupdate;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.activities.dynamicupdate.DynamicUpdateMap;
import system.activities.Activity;
import system.activities.ActivityBuilder;


/**
 * The base .NET class managing System.Activities.DynamicUpdate.DynamicUpdateServices, System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class DynamicUpdateServices extends NetObject  {
    public static final String assemblyFullName = "System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities";
    public static final String className = "System.Activities.DynamicUpdate.DynamicUpdateServices";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DynamicUpdateServices(Object instance) throws Throwable {
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    public static DynamicUpdateServices castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DynamicUpdateServices(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static DynamicUpdateMap CreateUpdateMap(Activity updatedWorkflowDefinition) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentOutOfRangeException {
        try {
            JCObject objCreateUpdateMap = (JCObject)classType.Invoke("CreateUpdateMap", (Object)updatedWorkflowDefinition.getJCOInstance());
            return new DynamicUpdateMap(objCreateUpdateMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicUpdateMap CreateUpdateMap(ActivityBuilder updatedActivityDefinition) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            JCObject objCreateUpdateMap = (JCObject)classType.Invoke("CreateUpdateMap", (Object)updatedActivityDefinition.getJCOInstance());
            return new DynamicUpdateMap(objCreateUpdateMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void PrepareForUpdate(Activity workflowDefinitionToBeUpdated) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xaml.XamlObjectReaderException, system.NotSupportedException, system.xaml.XamlSchemaException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.xaml.XamlException {
        try {
            classType.Invoke("PrepareForUpdate", (Object)workflowDefinitionToBeUpdated.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void PrepareForUpdate(ActivityBuilder activityDefinitionToBeUpdated) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xaml.XamlObjectReaderException, system.NotSupportedException, system.xaml.XamlSchemaException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.xaml.XamlException {
        try {
            classType.Invoke("PrepareForUpdate", (Object)activityDefinitionToBeUpdated.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DynamicUpdateMap GetImplementationMap(Activity targetActivity) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            JCObject objGetImplementationMap = (JCObject)classType.Invoke("GetImplementationMap", (Object)targetActivity.getJCOInstance());
            return new DynamicUpdateMap(objGetImplementationMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetImplementationMap(Activity targetActivity, DynamicUpdateMap implementationMap) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException {
        try {
            classType.Invoke("SetImplementationMap", (Object)targetActivity.getJCOInstance(), (Object)implementationMap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}