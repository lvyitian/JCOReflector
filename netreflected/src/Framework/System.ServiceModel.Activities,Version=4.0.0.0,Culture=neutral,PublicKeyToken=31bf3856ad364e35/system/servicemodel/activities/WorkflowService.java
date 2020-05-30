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

package system.servicemodel.activities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.activities.Activity;
import system.activities.validation.ValidationResults;
import system.activities.validation.ValidationSettings;
import system.xml.linq.XName;
import system.activities.WorkflowIdentity;


/**
 * The base .NET class managing System.ServiceModel.Activities.WorkflowService, System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WorkflowService extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.ServiceModel.Activities";
    public static final String className = "System.ServiceModel.Activities.WorkflowService";
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

    public WorkflowService(Object instance) throws Throwable {
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

    public static WorkflowService castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WorkflowService(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WorkflowService() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public Activity GetWorkflowRoot() throws Throwable {
        try {
            JCObject objGetWorkflowRoot = (JCObject)classInstance.Invoke("GetWorkflowRoot");
            return new Activity(objGetWorkflowRoot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValidationResults Validate(ValidationSettings settings) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.NotSupportedException, system.NotImplementedException {
        try {
            JCObject objValidate = (JCObject)classInstance.Invoke("Validate", (Object)settings.getJCOInstance());
            return new ValidationResults(objValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Activity getBody() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Body");
            return new Activity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBody(Activity Body) throws Throwable {
        try {
            classInstance.Set("Body", (Object)Body.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XName getName() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Name");
            return new XName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(XName Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getConfigurationName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ConfigurationName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConfigurationName(java.lang.String ConfigurationName) throws Throwable {
        try {
            classInstance.Set("ConfigurationName", (Object)ConfigurationName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowBufferedReceive() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowBufferedReceive");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowBufferedReceive(boolean AllowBufferedReceive) throws Throwable {
        try {
            classInstance.Set("AllowBufferedReceive", AllowBufferedReceive);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowIdentity getDefinitionIdentity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DefinitionIdentity");
            return new WorkflowIdentity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefinitionIdentity(WorkflowIdentity DefinitionIdentity) throws Throwable {
        try {
            classInstance.Set("DefinitionIdentity", (Object)DefinitionIdentity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}