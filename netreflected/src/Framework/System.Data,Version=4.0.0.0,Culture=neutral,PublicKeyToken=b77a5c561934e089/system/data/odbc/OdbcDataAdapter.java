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

package system.data.odbc;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.odbc.OdbcCommand;
import system.data.odbc.OdbcConnection;
import system.data.DataTable;
import system.data.SchemaType;
import system.data.DataSet;
import system.data.DataRow;
import system.runtime.remoting.ObjRef;
import system.data.LoadOption;
import system.data.MissingMappingAction;
import system.data.MissingSchemaAction;
import system.data.common.DataTableMappingCollection;
import system.data.odbc.OdbcRowUpdatedEventHandler;
import system.data.odbc.OdbcRowUpdatingEventHandler;
import system.data.FillErrorEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Data.Odbc.OdbcDataAdapter, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class OdbcDataAdapter extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.Odbc.OdbcDataAdapter";
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

    public OdbcDataAdapter(Object instance) throws Throwable {
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

    public static OdbcDataAdapter castFrom(IJCOBridgeReflected from) throws Throwable {
        return new OdbcDataAdapter(from.getJCOInstance());
    }

    // Constructors section
    
    
    public OdbcDataAdapter() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OdbcDataAdapter(OdbcCommand selectCommand) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)selectCommand.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OdbcDataAdapter(java.lang.String selectCommandText, OdbcConnection selectConnection) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)selectCommandText, (Object)selectConnection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OdbcDataAdapter(java.lang.String selectCommandText, java.lang.String selectConnectionString) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)selectCommandText, (Object)selectConnectionString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public DataTable FillSchema(DataTable dataTable, SchemaType schemaType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.data.DataException {
        try {
            JCObject objFillSchema = (JCObject)classInstance.Invoke("FillSchema", (Object)dataTable.getJCOInstance(), (Object)schemaType.getJCOInstance());
            return new DataTable(objFillSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable[] FillSchema(DataSet dataSet, SchemaType schemaType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.collections.generic.KeyNotFoundException, system.data.DataException {
        try {
            ArrayList<DataTable> resultingArrayList = new ArrayList<DataTable>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("FillSchema", (Object)dataSet.getJCOInstance(), (Object)schemaType.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new DataTable(resultingObject));
            }
            DataTable[] resultingArray = new DataTable[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable[] FillSchema(DataSet dataSet, SchemaType schemaType, java.lang.String srcTable) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.collections.generic.KeyNotFoundException, system.data.DataException {
        try {
            ArrayList<DataTable> resultingArrayList = new ArrayList<DataTable>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("FillSchema", (Object)dataSet.getJCOInstance(), (Object)schemaType.getJCOInstance(), (Object)srcTable);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new DataTable(resultingObject));
            }
            DataTable[] resultingArray = new DataTable[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Fill(DataSet dataSet) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.data.sqltypes.SqlNullValueException {
        try {
            return (int)classInstance.Invoke("Fill", (Object)dataSet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Fill(DataSet dataSet, java.lang.String srcTable) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.data.sqltypes.SqlNullValueException {
        try {
            return (int)classInstance.Invoke("Fill", (Object)dataSet.getJCOInstance(), (Object)srcTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Fill(DataSet dataSet, int startRecord, int maxRecords, java.lang.String srcTable) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.data.sqltypes.SqlNullValueException {
        try {
            return (int)classInstance.Invoke("Fill", (Object)dataSet.getJCOInstance(), startRecord, maxRecords, (Object)srcTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Fill(DataTable dataTable) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.data.sqltypes.SqlNullValueException {
        try {
            return (int)classInstance.Invoke("Fill", (Object)dataTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Fill(int startRecord, int maxRecords, DataTable... dataTables) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.data.sqltypes.SqlNullValueException {
        try {
            return (int)classInstance.Invoke("Fill", startRecord, maxRecords, (Object[])toObjectFromArray(dataTables));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Update(DataSet dataSet) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.data.DataException, system.collections.generic.KeyNotFoundException, system.data.sqltypes.SqlNullValueException, system.xml.XmlException {
        try {
            return (int)classInstance.Invoke("Update", (Object)dataSet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Update(DataRow[] dataRows) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.data.DataException, system.collections.generic.KeyNotFoundException, system.FormatException, system.OverflowException, system.InvalidCastException, system.data.sqltypes.SqlNullValueException, system.xml.XmlException {
        try {
            return (int)classInstance.Invoke("Update", (Object)toObjectFromArray(dataRows));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Update(DataTable dataTable) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.data.DataException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.xml.XmlException {
        try {
            return (int)classInstance.Invoke("Update", (Object)dataTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Update(DataSet dataSet, java.lang.String srcTable) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NotSupportedException, system.data.DataException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.xml.XmlException {
        try {
            return (int)classInstance.Invoke("Update", (Object)dataSet.getJCOInstance(), (Object)srcTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldSerializeAcceptChangesDuringFill() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeAcceptChangesDuringFill");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldSerializeFillLoadOption() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeFillLoadOption");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResetFillLoadOption() throws Throwable {
        try {
            classInstance.Invoke("ResetFillLoadOption");
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
    
    
    public OdbcCommand getDeleteCommand() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DeleteCommand");
            return new OdbcCommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeleteCommand(OdbcCommand DeleteCommand) throws Throwable {
        try {
            classInstance.Set("DeleteCommand", (Object)DeleteCommand.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OdbcCommand getInsertCommand() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InsertCommand");
            return new OdbcCommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInsertCommand(OdbcCommand InsertCommand) throws Throwable {
        try {
            classInstance.Set("InsertCommand", (Object)InsertCommand.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OdbcCommand getSelectCommand() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectCommand");
            return new OdbcCommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectCommand(OdbcCommand SelectCommand) throws Throwable {
        try {
            classInstance.Set("SelectCommand", (Object)SelectCommand.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OdbcCommand getUpdateCommand() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UpdateCommand");
            return new OdbcCommand(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdateCommand(OdbcCommand UpdateCommand) throws Throwable {
        try {
            classInstance.Set("UpdateCommand", (Object)UpdateCommand.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getUpdateBatchSize() throws Throwable {
        try {
            return (int)classInstance.Get("UpdateBatchSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdateBatchSize(int UpdateBatchSize) throws Throwable {
        try {
            classInstance.Set("UpdateBatchSize", UpdateBatchSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAcceptChangesDuringFill() throws Throwable {
        try {
            return (boolean)classInstance.Get("AcceptChangesDuringFill");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAcceptChangesDuringFill(boolean AcceptChangesDuringFill) throws Throwable {
        try {
            classInstance.Set("AcceptChangesDuringFill", AcceptChangesDuringFill);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAcceptChangesDuringUpdate() throws Throwable {
        try {
            return (boolean)classInstance.Get("AcceptChangesDuringUpdate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAcceptChangesDuringUpdate(boolean AcceptChangesDuringUpdate) throws Throwable {
        try {
            classInstance.Set("AcceptChangesDuringUpdate", AcceptChangesDuringUpdate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getContinueUpdateOnError() throws Throwable {
        try {
            return (boolean)classInstance.Get("ContinueUpdateOnError");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContinueUpdateOnError(boolean ContinueUpdateOnError) throws Throwable {
        try {
            classInstance.Set("ContinueUpdateOnError", ContinueUpdateOnError);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LoadOption getFillLoadOption() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FillLoadOption");
            return new LoadOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFillLoadOption(LoadOption FillLoadOption) throws Throwable {
        try {
            classInstance.Set("FillLoadOption", (Object)FillLoadOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MissingMappingAction getMissingMappingAction() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MissingMappingAction");
            return new MissingMappingAction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMissingMappingAction(MissingMappingAction MissingMappingAction) throws Throwable {
        try {
            classInstance.Set("MissingMappingAction", (Object)MissingMappingAction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MissingSchemaAction getMissingSchemaAction() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MissingSchemaAction");
            return new MissingSchemaAction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMissingSchemaAction(MissingSchemaAction MissingSchemaAction) throws Throwable {
        try {
            classInstance.Set("MissingSchemaAction", (Object)MissingSchemaAction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReturnProviderSpecificTypes() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReturnProviderSpecificTypes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReturnProviderSpecificTypes(boolean ReturnProviderSpecificTypes) throws Throwable {
        try {
            classInstance.Set("ReturnProviderSpecificTypes", ReturnProviderSpecificTypes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTableMappingCollection getTableMappings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TableMappings");
            return new DataTableMappingCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addRowUpdated(OdbcRowUpdatedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("RowUpdated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeRowUpdated(OdbcRowUpdatedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("RowUpdated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addRowUpdating(OdbcRowUpdatingEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("RowUpdating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeRowUpdating(OdbcRowUpdatingEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("RowUpdating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addFillError(FillErrorEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("FillError", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFillError(FillErrorEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("FillError", handler);
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