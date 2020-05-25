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
import system.security.accesscontrol.AuthorizationRuleCollection;
import system.security.principal.IdentityReference;
import system.security.accesscontrol.AccessControlSections;
import system.security.accesscontrol.AccessControlModification;
import system.security.accesscontrol.AccessRule;
import system.security.accesscontrol.AuditRule;


/**
 * The base .NET class managing System.Security.AccessControl.NativeObjectSecurity, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class NativeObjectSecurity extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Security.AccessControl.NativeObjectSecurity";
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

    public NativeObjectSecurity(Object instance) throws Throwable {
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

    public static NativeObjectSecurity castFrom(IJCOBridgeReflected from) throws Throwable {
        return new NativeObjectSecurity(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public AuthorizationRuleCollection GetAccessRules(boolean includeExplicit, boolean includeInherited, NetType targetType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.SystemException, system.InvalidOperationException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.AccessViolationException, system.security.principal.IdentityNotMappedException {
        try {
            JCObject objGetAccessRules = (JCObject)classInstance.Invoke("GetAccessRules", includeExplicit, includeInherited, (Object)targetType.getJCOInstance());
            return new AuthorizationRuleCollection(objGetAccessRules);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthorizationRuleCollection GetAuditRules(boolean includeExplicit, boolean includeInherited, NetType targetType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.SystemException, system.InvalidOperationException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.globalization.CultureNotFoundException, system.AccessViolationException, system.security.principal.IdentityNotMappedException {
        try {
            JCObject objGetAuditRules = (JCObject)classInstance.Invoke("GetAuditRules", includeExplicit, includeInherited, (Object)targetType.getJCOInstance());
            return new AuthorizationRuleCollection(objGetAuditRules);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityReference GetOwner(NetType targetType) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objGetOwner = (JCObject)classInstance.Invoke("GetOwner", (Object)targetType.getJCOInstance());
            return new IdentityReference(objGetOwner);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOwner(IdentityReference identity) throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("SetOwner", (Object)identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityReference GetGroup(NetType targetType) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objGetGroup = (JCObject)classInstance.Invoke("GetGroup", (Object)targetType.getJCOInstance());
            return new IdentityReference(objGetGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetGroup(IdentityReference identity) throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("SetGroup", (Object)identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PurgeAccessRules(IdentityReference identity) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("PurgeAccessRules", (Object)identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PurgeAuditRules(IdentityReference identity) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("PurgeAuditRules", (Object)identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAccessRuleProtection(boolean isProtected, boolean preserveInheritance) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("SetAccessRuleProtection", isProtected, preserveInheritance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAuditRuleProtection(boolean isProtected, boolean preserveInheritance) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("SetAuditRuleProtection", isProtected, preserveInheritance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetSecurityDescriptorSddlForm(AccessControlSections includeSections) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetSecurityDescriptorSddlForm", (Object)includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorSddlForm(java.lang.String sddlForm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.SystemException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException {
        try {
            classInstance.Invoke("SetSecurityDescriptorSddlForm", (Object)sddlForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorSddlForm(java.lang.String sddlForm, AccessControlSections includeSections) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.SystemException, system.ArgumentOutOfRangeException, system.FormatException, system.OverflowException {
        try {
            classInstance.Invoke("SetSecurityDescriptorSddlForm", (Object)sddlForm, (Object)includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetSecurityDescriptorBinaryForm() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetSecurityDescriptorBinaryForm");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetSecurityDescriptorBinaryForm = 0; indexGetSecurityDescriptorBinaryForm < resultingArrayList.size(); indexGetSecurityDescriptorBinaryForm++ ) {
				resultingArray[indexGetSecurityDescriptorBinaryForm] = (byte)resultingArrayList.get(indexGetSecurityDescriptorBinaryForm);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(byte[] binaryForm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.SystemException, system.OverflowException, system.InvalidOperationException {
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", binaryForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(byte[] binaryForm, AccessControlSections includeSections) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.SystemException, system.OverflowException, system.InvalidOperationException {
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", binaryForm, (Object)includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAreAccessRulesProtected() throws Throwable {
        try {
            return (boolean)classInstance.Get("AreAccessRulesProtected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAreAuditRulesProtected() throws Throwable {
        try {
            return (boolean)classInstance.Get("AreAuditRulesProtected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAreAccessRulesCanonical() throws Throwable {
        try {
            return (boolean)classInstance.Get("AreAccessRulesCanonical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAreAuditRulesCanonical() throws Throwable {
        try {
            return (boolean)classInstance.Get("AreAuditRulesCanonical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getAccessRightType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AccessRightType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getAccessRuleType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AccessRuleType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getAuditRuleType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AuditRuleType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}