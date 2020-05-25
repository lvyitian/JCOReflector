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

package system.security.policy;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.policy.TrustManagerUIContext;
import system.ApplicationIdentity;


/**
 * The base .NET class managing System.Security.Policy.TrustManagerContext, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TrustManagerContext extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Security.Policy.TrustManagerContext";
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

    public TrustManagerContext(Object instance) throws Throwable {
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

    public static TrustManagerContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TrustManagerContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TrustManagerContext() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TrustManagerContext(TrustManagerUIContext uiContext) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)uiContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public TrustManagerUIContext getUIContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UIContext");
            return new TrustManagerUIContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUIContext(TrustManagerUIContext UIContext) throws Throwable {
        try {
            classInstance.Set("UIContext", (Object)UIContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNoPrompt() throws Throwable {
        try {
            return (boolean)classInstance.Get("NoPrompt");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNoPrompt(boolean NoPrompt) throws Throwable {
        try {
            classInstance.Set("NoPrompt", NoPrompt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnorePersistedDecision() throws Throwable {
        try {
            return (boolean)classInstance.Get("IgnorePersistedDecision");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnorePersistedDecision(boolean IgnorePersistedDecision) throws Throwable {
        try {
            classInstance.Set("IgnorePersistedDecision", IgnorePersistedDecision);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getKeepAlive() throws Throwable {
        try {
            return (boolean)classInstance.Get("KeepAlive");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeepAlive(boolean KeepAlive) throws Throwable {
        try {
            classInstance.Set("KeepAlive", KeepAlive);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPersist() throws Throwable {
        try {
            return (boolean)classInstance.Get("Persist");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPersist(boolean Persist) throws Throwable {
        try {
            classInstance.Set("Persist", Persist);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ApplicationIdentity getPreviousApplicationIdentity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PreviousApplicationIdentity");
            return new ApplicationIdentity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreviousApplicationIdentity(ApplicationIdentity PreviousApplicationIdentity) throws Throwable {
        try {
            classInstance.Set("PreviousApplicationIdentity", (Object)PreviousApplicationIdentity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}