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

package system.activities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.activities.Argument;
import system.activities.RuntimeArgument;
import system.Guid;
import system.activities.WorkflowDataContext;


/**
 * The base .NET class managing System.Activities.ActivityContext, System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ActivityContext extends NetObject  {
    public static final String assemblyFullName = "System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities";
    public static final String className = "System.Activities.ActivityContext";
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

    public ActivityContext(Object instance) throws Throwable {
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

    public static ActivityContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ActivityContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public NetObject GetValue(Argument argument) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)argument.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(RuntimeArgument runtimeArgument) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)runtimeArgument.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(Argument argument, NetObject value) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("SetValue", (Object)argument.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getActivityInstanceId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ActivityInstanceId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getWorkflowInstanceId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WorkflowInstanceId");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowDataContext getDataContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataContext");
            return new WorkflowDataContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}