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

package system.data.sqlclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.sqlclient.SqlConnection;
import system.data.sqlclient.SqlTransaction;
import system.data.sqlclient.SqlCommandColumnEncryptionSetting;
import system.data.sqlclient.SqlParameter;
import system.xml.XmlReader;
import system.data.sqlclient.SqlDataReader;
import system.data.CommandBehavior;
import system.data.sqlclient.SqlCommand;
import system.runtime.remoting.ObjRef;
import system.data.sql.SqlNotificationRequest;
import system.data.CommandType;
import system.data.sqlclient.SqlParameterCollection;
import system.data.UpdateRowSource;
import system.data.StatementCompletedEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Data.SqlClient.SqlCommand, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SqlCommand extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.SqlClient.SqlCommand";
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

    public SqlCommand(Object instance) throws Throwable {
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

    public static SqlCommand castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SqlCommand(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SqlCommand() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlCommand(java.lang.String cmdText) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)cmdText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlCommand(java.lang.String cmdText, SqlConnection connection) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)cmdText, (Object)connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlCommand(java.lang.String cmdText, SqlConnection connection, SqlTransaction transaction) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)cmdText, (Object)connection.getJCOInstance(), (Object)transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlCommand(java.lang.String cmdText, SqlConnection connection, SqlTransaction transaction, SqlCommandColumnEncryptionSetting columnEncryptionSetting) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)cmdText, (Object)connection.getJCOInstance(), (Object)transaction.getJCOInstance(), (Object)columnEncryptionSetting.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void ResetCommandTimeout() throws Throwable {
        try {
            classInstance.Invoke("ResetCommandTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Prepare() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.data.sqlclient.SqlException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException {
        try {
            classInstance.Invoke("Prepare");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Cancel() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.OperationCanceledException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException, system.threading.SemaphoreFullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.NotSupportedException, system.data.sqlclient.SqlException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlParameter CreateParameter() throws Throwable {
        try {
            JCObject objCreateParameter = (JCObject)classInstance.Invoke("CreateParameter");
            return new SqlParameter(objCreateParameter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ExecuteScalar() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.reflection.TargetInvocationException, system.data.sqltypes.SqlTypeException, system.InvalidCastException, system.data.sqlclient.SqlException, system.data.sqltypes.SqlTruncateException, system.NullReferenceException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.AggregateException, system.threading.SemaphoreFullException, system.threading.tasks.TaskSchedulerException, system.security.cryptography.CryptographicUnexpectedOperationException {
        try {
            JCObject objExecuteScalar = (JCObject)classInstance.Invoke("ExecuteScalar");
            return new NetObject(objExecuteScalar);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ExecuteNonQuery() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.reflection.TargetInvocationException, system.data.sqltypes.SqlTypeException, system.InvalidCastException, system.data.sqlclient.SqlException, system.data.sqltypes.SqlTruncateException, system.DivideByZeroException, system.transactions.TransactionException, system.threading.SemaphoreFullException, system.threading.tasks.TaskSchedulerException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.AggregateException, system.NullReferenceException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicUnexpectedOperationException {
        try {
            return (int)classInstance.Invoke("ExecuteNonQuery");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlReader ExecuteXmlReader() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.reflection.TargetInvocationException, system.data.sqltypes.SqlTypeException, system.InvalidCastException, system.data.sqlclient.SqlException, system.data.sqltypes.SqlTruncateException, system.NullReferenceException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.AggregateException, system.threading.SemaphoreFullException, system.threading.tasks.TaskSchedulerException, system.security.cryptography.CryptographicUnexpectedOperationException {
        try {
            JCObject objExecuteXmlReader = (JCObject)classInstance.Invoke("ExecuteXmlReader");
            return new XmlReader(objExecuteXmlReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDataReader ExecuteReader() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTypeException, system.InvalidCastException, system.data.sqlclient.SqlException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.data.sqltypes.SqlTruncateException, system.NotImplementedException, system.threading.tasks.TaskSchedulerException, system.security.cryptography.CryptographicUnexpectedOperationException {
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader");
            return new SqlDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDataReader ExecuteReader(CommandBehavior behavior) throws Throwable, system.IndexOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTypeException, system.InvalidCastException, system.data.sqlclient.SqlException, system.OverflowException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.data.sqltypes.SqlTruncateException, system.NotImplementedException, system.threading.tasks.TaskSchedulerException, system.security.cryptography.CryptographicUnexpectedOperationException {
        try {
            JCObject objExecuteReader = (JCObject)classInstance.Invoke("ExecuteReader", (Object)behavior.getJCOInstance());
            return new SqlDataReader(objExecuteReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlCommand Clone() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new SqlCommand(objClone);
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
    
    
    public SqlConnection getConnection() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Connection");
            return new SqlConnection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnection(SqlConnection Connection) throws Throwable {
        try {
            classInstance.Set("Connection", (Object)Connection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNotificationAutoEnlist() throws Throwable {
        try {
            return (boolean)classInstance.Get("NotificationAutoEnlist");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNotificationAutoEnlist(boolean NotificationAutoEnlist) throws Throwable {
        try {
            classInstance.Set("NotificationAutoEnlist", NotificationAutoEnlist);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlNotificationRequest getNotification() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Notification");
            return new SqlNotificationRequest(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNotification(SqlNotificationRequest Notification) throws Throwable {
        try {
            classInstance.Set("Notification", (Object)Notification.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlTransaction getTransaction() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Transaction");
            return new SqlTransaction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransaction(SqlTransaction Transaction) throws Throwable {
        try {
            classInstance.Set("Transaction", (Object)Transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCommandText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CommandText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandText(java.lang.String CommandText) throws Throwable {
        try {
            classInstance.Set("CommandText", (Object)CommandText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlCommandColumnEncryptionSetting getColumnEncryptionSetting() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnEncryptionSetting");
            return new SqlCommandColumnEncryptionSetting(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCommandTimeout() throws Throwable {
        try {
            return (int)classInstance.Get("CommandTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandTimeout(int CommandTimeout) throws Throwable {
        try {
            classInstance.Set("CommandTimeout", CommandTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CommandType getCommandType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CommandType");
            return new CommandType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandType(CommandType CommandType) throws Throwable {
        try {
            classInstance.Set("CommandType", (Object)CommandType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDesignTimeVisible() throws Throwable {
        try {
            return (boolean)classInstance.Get("DesignTimeVisible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDesignTimeVisible(boolean DesignTimeVisible) throws Throwable {
        try {
            classInstance.Set("DesignTimeVisible", DesignTimeVisible);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlParameterCollection getParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parameters");
            return new SqlParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UpdateRowSource getUpdatedRowSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UpdatedRowSource");
            return new UpdateRowSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdatedRowSource(UpdateRowSource UpdatedRowSource) throws Throwable {
        try {
            classInstance.Set("UpdatedRowSource", (Object)UpdatedRowSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addStatementCompleted(StatementCompletedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("StatementCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeStatementCompleted(StatementCompletedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("StatementCompleted", handler);
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