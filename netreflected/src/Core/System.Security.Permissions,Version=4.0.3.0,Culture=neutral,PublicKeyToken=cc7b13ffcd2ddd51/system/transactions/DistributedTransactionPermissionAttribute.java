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

package system.transactions;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.permissions.SecurityAction;


/**
 * The base .NET class managing System.Transactions.DistributedTransactionPermissionAttribute, System.Security.Permissions, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class DistributedTransactionPermissionAttribute extends NetObject  {
    public static final String assemblyFullName = "System.Security.Permissions, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Security.Permissions";
    public static final String className = "System.Transactions.DistributedTransactionPermissionAttribute";
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

    public DistributedTransactionPermissionAttribute(Object instance) throws Throwable {
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

    public static DistributedTransactionPermissionAttribute castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DistributedTransactionPermissionAttribute(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DistributedTransactionPermissionAttribute(SecurityAction action) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)action.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Match(NetObject obj) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Match", (Object)obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDefaultAttribute() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsDefaultAttribute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getUnrestricted() throws Throwable {
        try {
            return (boolean)classInstance.Get("Unrestricted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnrestricted(boolean Unrestricted) throws Throwable {
        try {
            classInstance.Set("Unrestricted", Unrestricted);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityAction getAction() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Action");
            return new SecurityAction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAction(SecurityAction Action) throws Throwable {
        try {
            classInstance.Set("Action", (Object)Action.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTypeId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TypeId");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}