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

package system.data.oracleclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.DataTable;
import system.data.oracleclient.OracleTransaction;
import system.data.IsolationLevel;
import system.data.oracleclient.OracleConnection;
import system.data.oracleclient.OracleCommand;
import system.transactions.Transaction;
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import system.runtime.remoting.ObjRef;
import system.data.ConnectionState;
import system.data.oracleclient.OracleInfoMessageEventHandler;
import system.data.StateChangeEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Data.OracleClient.OracleConnection, System.Data.OracleClient, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class OracleConnection extends NetObject  {
    public static final String assemblyFullName = "System.Data.OracleClient, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data.OracleClient";
    public static final String className = "System.Data.OracleClient.OracleConnection";
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

    public OracleConnection(Object instance) throws Throwable {
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

    public static OracleConnection castFrom(IJCOBridgeReflected from) throws Throwable {
        return new OracleConnection(from.getJCOInstance());
    }

    // Constructors section
    
    
    public OracleConnection(java.lang.String connectionString) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)connectionString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleConnection() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static void ClearAllPools() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.threading.SemaphoreFullException {
        try {
            classType.Invoke("ClearAllPools");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.transactions.TransactionException, system.PlatformNotSupportedException, system.NotSupportedException, system.threading.LockRecursionException, system.threading.SynchronizationLockException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Open() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            classInstance.Invoke("Open");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema(java.lang.String collectionName) throws Throwable, system.NotSupportedException {
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema", (Object)collectionName);
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema(java.lang.String collectionName, java.lang.String[] restrictionValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException {
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema", (Object)collectionName, (Object)restrictionValues);
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleTransaction BeginTransaction() throws Throwable {
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction");
            return new OracleTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleTransaction BeginTransaction(IsolationLevel il) throws Throwable {
        try {
            JCObject objBeginTransaction = (JCObject)classInstance.Invoke("BeginTransaction", (Object)il.getJCOInstance());
            return new OracleTransaction(objBeginTransaction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ChangeDatabase(java.lang.String value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("ChangeDatabase", (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ClearPool(OracleConnection connection) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.threading.SemaphoreFullException {
        try {
            classType.Invoke("ClearPool", (Object)connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleCommand CreateCommand() throws Throwable, system.ArgumentNullException {
        try {
            JCObject objCreateCommand = (JCObject)classInstance.Invoke("CreateCommand");
            return new OracleCommand(objCreateCommand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnlistTransaction(Transaction transaction) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("EnlistTransaction", (Object)transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchema() throws Throwable, system.NotSupportedException {
        try {
            JCObject objGetSchema = (JCObject)classInstance.Invoke("GetSchema");
            return new DataTable(objGetSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task OpenAsync() throws Throwable, system.InvalidOperationException, system.ArgumentNullException {
        try {
            JCObject objOpenAsync = (JCObject)classInstance.Invoke("OpenAsync");
            return new Task(objOpenAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task OpenAsync(CancellationToken cancellationToken) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException {
        try {
            JCObject objOpenAsync = (JCObject)classInstance.Invoke("OpenAsync", (Object)cancellationToken.getJCOInstance());
            return new Task(objOpenAsync);
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

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", (Object)requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getConnectionString() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ConnectionString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnectionString(java.lang.String ConnectionString) throws Throwable {
        try {
            classInstance.Set("ConnectionString", (Object)ConnectionString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getConnectionTimeout() throws Throwable {
        try {
            return (int)classInstance.Get("ConnectionTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDatabase() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Database");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDataSource() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DataSource");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getServerVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ServerVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConnectionState getState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new ConnectionState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addInfoMessage(OracleInfoMessageEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("InfoMessage", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeInfoMessage(OracleInfoMessageEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("InfoMessage", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addStateChange(StateChangeEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("StateChange", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeStateChange(StateChangeEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("StateChange", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}