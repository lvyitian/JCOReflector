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
import system.activities.ActivityPropertyReference;
import system.Version;
import system.activities.Activity;


/**
 * The base .NET class managing System.Activities.ActivityBuilder, System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ActivityBuilder extends NetObject  {
    public static final String assemblyFullName = "System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities";
    public static final String className = "System.Activities.ActivityBuilder";
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

    public ActivityBuilder(Object instance) throws Throwable {
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

    public static ActivityBuilder castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ActivityBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ActivityBuilder() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static ActivityPropertyReference GetPropertyReference(NetObject target) throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException {
        try {
            JCObject objGetPropertyReference = (JCObject)classType.Invoke("GetPropertyReference", (Object)target.getJCOInstance());
            return new ActivityPropertyReference(objGetPropertyReference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetPropertyReference(NetObject target, ActivityPropertyReference value) throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            classType.Invoke("SetPropertyReference", (Object)target.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ShouldSerializePropertyReference(NetObject target) throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException {
        try {
            return (boolean)classType.Invoke("ShouldSerializePropertyReference", (Object)target.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ShouldSerializePropertyReferences(NetObject target) throws Throwable, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException {
        try {
            return (boolean)classType.Invoke("ShouldSerializePropertyReferences", (Object)target.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version getImplementationVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ImplementationVersion");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImplementationVersion(Version ImplementationVersion) throws Throwable {
        try {
            classInstance.Set("ImplementationVersion", (Object)ImplementationVersion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Activity getImplementation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Implementation");
            return new Activity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImplementation(Activity Implementation) throws Throwable {
        try {
            classInstance.Set("Implementation", (Object)Implementation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}