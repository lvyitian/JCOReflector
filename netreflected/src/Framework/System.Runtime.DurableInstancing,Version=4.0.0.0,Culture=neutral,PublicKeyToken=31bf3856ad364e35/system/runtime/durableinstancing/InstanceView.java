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

package system.runtime.durableinstancing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Guid;
import system.runtime.durableinstancing.InstanceOwner;
import system.runtime.durableinstancing.InstanceState;
import system.runtime.durableinstancing.InstanceValueConsistency;


/**
 * The base .NET class managing System.Runtime.DurableInstancing.InstanceView, System.Runtime.DurableInstancing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class InstanceView extends NetObject  {
    public static final String assemblyFullName = "System.Runtime.DurableInstancing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Runtime.DurableInstancing";
    public static final String className = "System.Runtime.DurableInstancing.InstanceView";
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

    public InstanceView(Object instance) throws Throwable {
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

    public static InstanceView castFrom(IJCOBridgeReflected from) throws Throwable {
        return new InstanceView(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
    public Guid getInstanceId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InstanceId");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceId(Guid InstanceId) throws Throwable {
        try {
            classInstance.Set("InstanceId", (Object)InstanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBoundToInstance() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsBoundToInstance");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsBoundToInstance(boolean IsBoundToInstance) throws Throwable {
        try {
            classInstance.Set("IsBoundToInstance", IsBoundToInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InstanceOwner getInstanceOwner() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InstanceOwner");
            return new InstanceOwner(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceOwner(InstanceOwner InstanceOwner) throws Throwable {
        try {
            classInstance.Set("InstanceOwner", (Object)InstanceOwner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBoundToInstanceOwner() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsBoundToInstanceOwner");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBoundToLock() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsBoundToLock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InstanceState getInstanceState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InstanceState");
            return new InstanceState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceState(InstanceState InstanceState) throws Throwable {
        try {
            classInstance.Set("InstanceState", (Object)InstanceState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InstanceValueConsistency getInstanceDataConsistency() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InstanceDataConsistency");
            return new InstanceValueConsistency(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceDataConsistency(InstanceValueConsistency InstanceDataConsistency) throws Throwable {
        try {
            classInstance.Set("InstanceDataConsistency", (Object)InstanceDataConsistency.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InstanceValueConsistency getInstanceMetadataConsistency() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InstanceMetadataConsistency");
            return new InstanceValueConsistency(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceMetadataConsistency(InstanceValueConsistency InstanceMetadataConsistency) throws Throwable {
        try {
            classInstance.Set("InstanceMetadataConsistency", (Object)InstanceMetadataConsistency.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InstanceValueConsistency getInstanceOwnerMetadataConsistency() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InstanceOwnerMetadataConsistency");
            return new InstanceValueConsistency(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceOwnerMetadataConsistency(InstanceValueConsistency InstanceOwnerMetadataConsistency) throws Throwable {
        try {
            classInstance.Set("InstanceOwnerMetadataConsistency", (Object)InstanceOwnerMetadataConsistency.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InstanceValueConsistency getInstanceKeysConsistency() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InstanceKeysConsistency");
            return new InstanceValueConsistency(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceKeysConsistency(InstanceValueConsistency InstanceKeysConsistency) throws Throwable {
        try {
            classInstance.Set("InstanceKeysConsistency", (Object)InstanceKeysConsistency.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}