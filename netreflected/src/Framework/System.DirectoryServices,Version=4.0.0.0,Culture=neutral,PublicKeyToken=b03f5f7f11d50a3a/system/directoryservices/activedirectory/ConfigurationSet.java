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

package system.directoryservices.activedirectory;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.activedirectory.AdamInstance;
import system.directoryservices.activedirectory.AdamInstanceCollection;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.ReplicationSecurityLevel;
import system.directoryservices.activedirectory.ConfigurationSet;
import system.directoryservices.activedirectory.DirectoryContext;
import system.directoryservices.activedirectory.ReadOnlySiteCollection;
import system.directoryservices.activedirectory.ApplicationPartitionCollection;
import system.directoryservices.activedirectory.ActiveDirectorySchema;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.ConfigurationSet, System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ConfigurationSet extends NetObject  {
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.DirectoryServices";
    public static final String className = "System.DirectoryServices.ActiveDirectory.ConfigurationSet";
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

    public ConfigurationSet(Object instance) throws Throwable {
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

    public static ConfigurationSet castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ConfigurationSet(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamInstance FindAdamInstance() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objFindAdamInstance = (JCObject)classInstance.Invoke("FindAdamInstance");
            return new AdamInstance(objFindAdamInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamInstance FindAdamInstance(java.lang.String partitionName) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objFindAdamInstance = (JCObject)classInstance.Invoke("FindAdamInstance", (Object)partitionName);
            return new AdamInstance(objFindAdamInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamInstance FindAdamInstance(java.lang.String partitionName, java.lang.String siteName) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objFindAdamInstance = (JCObject)classInstance.Invoke("FindAdamInstance", (Object)partitionName, (Object)siteName);
            return new AdamInstance(objFindAdamInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamInstanceCollection FindAllAdamInstances() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objFindAllAdamInstances = (JCObject)classInstance.Invoke("FindAllAdamInstances");
            return new AdamInstanceCollection(objFindAllAdamInstances);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamInstanceCollection FindAllAdamInstances(java.lang.String partitionName) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objFindAllAdamInstances = (JCObject)classInstance.Invoke("FindAllAdamInstances", (Object)partitionName);
            return new AdamInstanceCollection(objFindAllAdamInstances);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamInstanceCollection FindAllAdamInstances(java.lang.String partitionName, java.lang.String siteName) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objFindAllAdamInstances = (JCObject)classInstance.Invoke("FindAllAdamInstances", (Object)partitionName, (Object)siteName);
            return new AdamInstanceCollection(objFindAllAdamInstances);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException {
        try {
            JCObject objGetDirectoryEntry = (JCObject)classInstance.Invoke("GetDirectoryEntry");
            return new DirectoryEntry(objGetDirectoryEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReplicationSecurityLevel GetSecurityLevel() throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objGetSecurityLevel = (JCObject)classInstance.Invoke("GetSecurityLevel");
            return new ReplicationSecurityLevel(objGetSecurityLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSecurityLevel(ReplicationSecurityLevel securityLevel) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            classInstance.Invoke("SetSecurityLevel", (Object)securityLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ConfigurationSet GetConfigurationSet(DirectoryContext context) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.security.cryptography.CryptographicException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            JCObject objGetConfigurationSet = (JCObject)classType.Invoke("GetConfigurationSet", (Object)context.getJCOInstance());
            return new ConfigurationSet(objGetConfigurationSet);
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

    public ReadOnlySiteCollection getSites() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Sites");
            return new ReadOnlySiteCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamInstanceCollection getAdamInstances() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AdamInstances");
            return new AdamInstanceCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ApplicationPartitionCollection getApplicationPartitions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ApplicationPartitions");
            return new ApplicationPartitionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectorySchema getSchema() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Schema");
            return new ActiveDirectorySchema(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamInstance getSchemaRoleOwner() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SchemaRoleOwner");
            return new AdamInstance(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamInstance getNamingRoleOwner() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NamingRoleOwner");
            return new AdamInstance(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}