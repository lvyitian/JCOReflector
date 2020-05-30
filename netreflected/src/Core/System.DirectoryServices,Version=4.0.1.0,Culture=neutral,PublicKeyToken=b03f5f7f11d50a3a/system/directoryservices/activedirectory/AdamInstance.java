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
import system.directoryservices.activedirectory.DirectoryContext;
import system.directoryservices.activedirectory.AdamInstanceCollection;
import system.directoryservices.activedirectory.AdamRole;
import system.directoryservices.activedirectory.ReplicationCursorCollection;
import system.directoryservices.activedirectory.ReplicationOperationInformation;
import system.directoryservices.activedirectory.ReplicationNeighborCollection;
import system.directoryservices.activedirectory.ReplicationFailureCollection;
import system.directoryservices.activedirectory.ActiveDirectoryReplicationMetadata;
import system.directoryservices.activedirectory.SyncFromAllServersOptions;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.activedirectory.ConfigurationSet;
import system.directoryservices.activedirectory.AdamRoleCollection;
import system.directoryservices.activedirectory.SyncUpdateCallback;
import system.directoryservices.activedirectory.ReplicationConnectionCollection;
import system.directoryservices.activedirectory.ReadOnlyStringCollection;


/**
 * The base .NET class managing System.DirectoryServices.ActiveDirectory.AdamInstance, System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class AdamInstance extends NetObject  {
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.DirectoryServices";
    public static final String className = "System.DirectoryServices.ActiveDirectory.AdamInstance";
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

    public AdamInstance(Object instance) throws Throwable {
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

    public static AdamInstance castFrom(IJCOBridgeReflected from) throws Throwable {
        return new AdamInstance(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static AdamInstance GetAdamInstance(DirectoryContext context) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.security.SecurityException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            JCObject objGetAdamInstance = (JCObject)classType.Invoke("GetAdamInstance", (Object)context.getJCOInstance());
            return new AdamInstance(objGetAdamInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AdamInstance FindOne(DirectoryContext context, java.lang.String partitionName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException {
        try {
            JCObject objFindOne = (JCObject)classType.Invoke("FindOne", (Object)context.getJCOInstance(), (Object)partitionName);
            return new AdamInstance(objFindOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static AdamInstanceCollection FindAll(DirectoryContext context, java.lang.String partitionName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.security.SecurityException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            JCObject objFindAll = (JCObject)classType.Invoke("FindAll", (Object)context.getJCOInstance(), (Object)partitionName);
            return new AdamInstanceCollection(objFindAll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TransferRoleOwnership(AdamRole role) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.security.SecurityException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("TransferRoleOwnership", (Object)role.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SeizeRoleOwnership(AdamRole role) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("SeizeRoleOwnership", (Object)role.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CheckReplicationConsistency() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("CheckReplicationConsistency");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReplicationCursorCollection GetReplicationCursors(java.lang.String partition) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        try {
            JCObject objGetReplicationCursors = (JCObject)classInstance.Invoke("GetReplicationCursors", (Object)partition);
            return new ReplicationCursorCollection(objGetReplicationCursors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReplicationOperationInformation GetReplicationOperationInformation() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        try {
            JCObject objGetReplicationOperationInformation = (JCObject)classInstance.Invoke("GetReplicationOperationInformation");
            return new ReplicationOperationInformation(objGetReplicationOperationInformation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReplicationNeighborCollection GetReplicationNeighbors(java.lang.String partition) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        try {
            JCObject objGetReplicationNeighbors = (JCObject)classInstance.Invoke("GetReplicationNeighbors", (Object)partition);
            return new ReplicationNeighborCollection(objGetReplicationNeighbors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReplicationNeighborCollection GetAllReplicationNeighbors() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        try {
            JCObject objGetAllReplicationNeighbors = (JCObject)classInstance.Invoke("GetAllReplicationNeighbors");
            return new ReplicationNeighborCollection(objGetAllReplicationNeighbors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReplicationFailureCollection GetReplicationConnectionFailures() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException {
        try {
            JCObject objGetReplicationConnectionFailures = (JCObject)classInstance.Invoke("GetReplicationConnectionFailures");
            return new ReplicationFailureCollection(objGetReplicationConnectionFailures);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActiveDirectoryReplicationMetadata GetReplicationMetadata(java.lang.String objectPath) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException {
        try {
            JCObject objGetReplicationMetadata = (JCObject)classInstance.Invoke("GetReplicationMetadata", (Object)objectPath);
            return new ActiveDirectoryReplicationMetadata(objGetReplicationMetadata);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SyncReplicaFromServer(java.lang.String partition, java.lang.String sourceServer) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException, system.AccessViolationException {
        try {
            classInstance.Invoke("SyncReplicaFromServer", (Object)partition, (Object)sourceServer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TriggerSyncReplicaFromNeighbors(java.lang.String partition) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException, system.AccessViolationException {
        try {
            classInstance.Invoke("TriggerSyncReplicaFromNeighbors", (Object)partition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SyncReplicaFromAllServers(java.lang.String partition, SyncFromAllServersOptions options) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.ArrayTypeMismatchException, system.AccessViolationException, system.directoryservices.activedirectory.SyncFromAllServersOperationException {
        try {
            classInstance.Invoke("SyncReplicaFromAllServers", (Object)partition, (Object)options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.security.SecurityException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("Save");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveToAnotherSite(java.lang.String siteName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.FormatException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("MoveToAnotherSite", (Object)siteName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry GetDirectoryEntry() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.directoryservices.activedirectory.ActiveDirectoryOperationException, system.componentmodel.InvalidEnumArgumentException, system.directoryservices.activedirectory.ActiveDirectoryObjectNotFoundException, system.OutOfMemoryException, system.security.SecurityException {
        try {
            JCObject objGetDirectoryEntry = (JCObject)classInstance.Invoke("GetDirectoryEntry");
            return new DirectoryEntry(objGetDirectoryEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public ConfigurationSet getConfigurationSet() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ConfigurationSet");
            return new ConfigurationSet(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHostName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HostName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLdapPort() throws Throwable {
        try {
            return (int)classInstance.Get("LdapPort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSslPort() throws Throwable {
        try {
            return (int)classInstance.Get("SslPort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AdamRoleCollection getRoles() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Roles");
            return new AdamRoleCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultPartition() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultPartition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultPartition(java.lang.String DefaultPartition) throws Throwable {
        try {
            classInstance.Set("DefaultPartition", (Object)DefaultPartition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getIPAddress() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("IPAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSiteName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SiteName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SyncUpdateCallback getSyncFromAllServersCallback() throws Throwable {
        try {
            return (SyncUpdateCallback)classInstance.Get("SyncFromAllServersCallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSyncFromAllServersCallback(SyncUpdateCallback SyncFromAllServersCallback) throws Throwable {
        try {
            classInstance.Set("SyncFromAllServersCallback", SyncFromAllServersCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReplicationConnectionCollection getInboundConnections() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InboundConnections");
            return new ReplicationConnectionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReplicationConnectionCollection getOutboundConnections() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OutboundConnections");
            return new ReplicationConnectionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReadOnlyStringCollection getPartitions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Partitions");
            return new ReadOnlyStringCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}