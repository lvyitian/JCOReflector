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
import system.security.accesscontrol.AccessRule;
import system.security.principal.IdentityReference;
import system.security.accesscontrol.InheritanceFlags;
import system.security.accesscontrol.PropagationFlags;
import system.security.accesscontrol.AccessControlType;
import system.security.accesscontrol.AuditRule;
import system.security.accesscontrol.AuditFlags;
import system.security.accesscontrol.EventWaitHandleAccessRule;
import system.security.accesscontrol.EventWaitHandleAuditRule;
import system.security.accesscontrol.AuthorizationRuleCollection;
import system.security.accesscontrol.AccessControlSections;
import system.security.accesscontrol.AccessControlModification;


/**
 * The base .NET class managing System.Security.AccessControl.EventWaitHandleSecurity, System.Threading.AccessControl, Version=4.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class EventWaitHandleSecurity extends NetObject  {
    public static final String assemblyFullName = "System.Threading.AccessControl, Version=4.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Threading.AccessControl";
    public static final String className = "System.Security.AccessControl.EventWaitHandleSecurity";
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

    public EventWaitHandleSecurity(Object instance) throws Throwable {
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

    public static EventWaitHandleSecurity castFrom(IJCOBridgeReflected from) throws Throwable {
        return new EventWaitHandleSecurity(from.getJCOInstance());
    }

    // Constructors section
    
    
    public EventWaitHandleSecurity() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public AccessRule AccessRuleFactory(IdentityReference identityReference, int accessMask, boolean isInherited, InheritanceFlags inheritanceFlags, PropagationFlags propagationFlags, AccessControlType type) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException {
        try {
            JCObject objAccessRuleFactory = (JCObject)classInstance.Invoke("AccessRuleFactory", (Object)identityReference.getJCOInstance(), accessMask, isInherited, (Object)inheritanceFlags.getJCOInstance(), (Object)propagationFlags.getJCOInstance(), (Object)type.getJCOInstance());
            return new AccessRule(objAccessRuleFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuditRule AuditRuleFactory(IdentityReference identityReference, int accessMask, boolean isInherited, InheritanceFlags inheritanceFlags, PropagationFlags propagationFlags, AuditFlags flags) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException {
        try {
            JCObject objAuditRuleFactory = (JCObject)classInstance.Invoke("AuditRuleFactory", (Object)identityReference.getJCOInstance(), accessMask, isInherited, (Object)inheritanceFlags.getJCOInstance(), (Object)propagationFlags.getJCOInstance(), (Object)flags.getJCOInstance());
            return new AuditRule(objAuditRuleFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddAccessRule(EventWaitHandleAccessRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("AddAccessRule", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAccessRule(EventWaitHandleAccessRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetAccessRule", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResetAccessRule(EventWaitHandleAccessRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("ResetAccessRule", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RemoveAccessRule(EventWaitHandleAccessRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            return (boolean)classInstance.Invoke("RemoveAccessRule", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAccessRuleAll(EventWaitHandleAccessRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("RemoveAccessRuleAll", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAccessRuleSpecific(EventWaitHandleAccessRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("RemoveAccessRuleSpecific", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddAuditRule(EventWaitHandleAuditRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("AddAuditRule", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAuditRule(EventWaitHandleAuditRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetAuditRule", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RemoveAuditRule(EventWaitHandleAuditRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            return (boolean)classInstance.Invoke("RemoveAuditRule", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAuditRuleAll(EventWaitHandleAuditRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("RemoveAuditRuleAll", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAuditRuleSpecific(EventWaitHandleAuditRule rule) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("RemoveAuditRuleSpecific", (Object)rule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthorizationRuleCollection GetAccessRules(boolean includeExplicit, boolean includeInherited, NetType targetType) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.principal.IdentityNotMappedException, system.threading.SynchronizationLockException {
        try {
            JCObject objGetAccessRules = (JCObject)classInstance.Invoke("GetAccessRules", includeExplicit, includeInherited, (Object)targetType.getJCOInstance());
            return new AuthorizationRuleCollection(objGetAccessRules);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthorizationRuleCollection GetAuditRules(boolean includeExplicit, boolean includeInherited, NetType targetType) throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.UnauthorizedAccessException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.principal.IdentityNotMappedException, system.threading.SynchronizationLockException {
        try {
            JCObject objGetAuditRules = (JCObject)classInstance.Invoke("GetAuditRules", includeExplicit, includeInherited, (Object)targetType.getJCOInstance());
            return new AuthorizationRuleCollection(objGetAuditRules);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityReference GetOwner(NetType targetType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            JCObject objGetOwner = (JCObject)classInstance.Invoke("GetOwner", (Object)targetType.getJCOInstance());
            return new IdentityReference(objGetOwner);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOwner(IdentityReference identity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetOwner", (Object)identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentityReference GetGroup(NetType targetType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            JCObject objGetGroup = (JCObject)classInstance.Invoke("GetGroup", (Object)targetType.getJCOInstance());
            return new IdentityReference(objGetGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetGroup(IdentityReference identity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetGroup", (Object)identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PurgeAccessRules(IdentityReference identity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("PurgeAccessRules", (Object)identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PurgeAuditRules(IdentityReference identity) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("PurgeAuditRules", (Object)identity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAccessRuleProtection(boolean isProtected, boolean preserveInheritance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetAccessRuleProtection", isProtected, preserveInheritance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAuditRuleProtection(boolean isProtected, boolean preserveInheritance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetAuditRuleProtection", isProtected, preserveInheritance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetSecurityDescriptorSddlForm(AccessControlSections includeSections) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.InvalidOperationException, system.threading.SynchronizationLockException {
        try {
            return (java.lang.String)classInstance.Invoke("GetSecurityDescriptorSddlForm", (Object)includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorSddlForm(java.lang.String sddlForm) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.ArrayTypeMismatchException, system.OverflowException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetSecurityDescriptorSddlForm", (Object)sddlForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorSddlForm(java.lang.String sddlForm, AccessControlSections includeSections) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.OverflowException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetSecurityDescriptorSddlForm", (Object)sddlForm, (Object)includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetSecurityDescriptorBinaryForm() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.LockRecursionException, system.PlatformNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.threading.SynchronizationLockException {
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

    public void SetSecurityDescriptorBinaryForm(byte[] binaryForm) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.OverflowException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", binaryForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityDescriptorBinaryForm(byte[] binaryForm, AccessControlSections includeSections) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.FormatException, system.OverflowException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SetSecurityDescriptorBinaryForm", binaryForm, (Object)includeSections.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
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



	// Instance Events section
    
    
}