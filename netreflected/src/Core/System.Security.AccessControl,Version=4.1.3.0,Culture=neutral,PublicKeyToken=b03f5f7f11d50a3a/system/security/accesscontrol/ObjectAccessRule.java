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

package system.security.accesscontrol;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Guid;
import system.security.accesscontrol.ObjectAceFlags;
import system.security.accesscontrol.AccessControlType;
import system.security.principal.IdentityReference;
import system.security.accesscontrol.InheritanceFlags;
import system.security.accesscontrol.PropagationFlags;


/**
 * The base .NET class managing System.Security.AccessControl.ObjectAccessRule, System.Security.AccessControl, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ObjectAccessRule extends NetObject  {
    public static final String assemblyFullName = "System.Security.AccessControl, Version=4.1.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Security.AccessControl";
    public static final String className = "System.Security.AccessControl.ObjectAccessRule";
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

    public ObjectAccessRule(Object instance) throws Throwable {
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

    public static ObjectAccessRule castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ObjectAccessRule(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
    public Guid getObjectType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ObjectType");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getInheritedObjectType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InheritedObjectType");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectAceFlags getObjectFlags() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ObjectFlags");
            return new ObjectAceFlags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessControlType getAccessControlType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AccessControlType");
            return new AccessControlType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityReference getIdentityReference() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IdentityReference");
            return new IdentityReference(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInherited() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsInherited");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InheritanceFlags getInheritanceFlags() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InheritanceFlags");
            return new InheritanceFlags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropagationFlags getPropagationFlags() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PropagationFlags");
            return new PropagationFlags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}