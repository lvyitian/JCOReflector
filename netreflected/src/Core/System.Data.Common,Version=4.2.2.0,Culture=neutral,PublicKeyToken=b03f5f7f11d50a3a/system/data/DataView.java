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

package system.data;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.DataTable;
import system.data.DataViewRowState;
import system.data.DataView;
import system.data.DataRowView;
import system.Array;
import system.data.DataViewManager;
import system.componentmodel.ListChangedEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Data.DataView, System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DataView extends NetObject  {
    public static final String assemblyFullName = "System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Data.Common";
    public static final String className = "System.Data.DataView";
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

    public DataView(Object instance) throws Throwable {
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

    public static DataView castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataView(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataView(DataTable table) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.threading.SynchronizationLockException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.threading.LockRecursionException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)table.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataView() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.threading.SynchronizationLockException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataView(DataTable table, java.lang.String RowFilter, java.lang.String Sort, DataViewRowState RowState) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.MulticastNotSupportedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)table.getJCOInstance(), (Object)RowFilter, (Object)Sort, (Object)RowState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public DataTable ToTable() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.globalization.CultureNotFoundException, system.threading.SynchronizationLockException, system.InvalidOperationException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException {
        try {
            JCObject objToTable = (JCObject)classInstance.Invoke("ToTable");
            return new DataTable(objToTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable ToTable(java.lang.String tableName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.globalization.CultureNotFoundException, system.threading.SynchronizationLockException, system.InvalidOperationException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException {
        try {
            JCObject objToTable = (JCObject)classInstance.Invoke("ToTable", (Object)tableName);
            return new DataTable(objToTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable ToTable(boolean distinct, java.lang.String... columnNames) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.globalization.CultureNotFoundException, system.threading.SynchronizationLockException, system.InvalidOperationException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException {
        try {
            JCObject objToTable = (JCObject)classInstance.Invoke("ToTable", distinct, (Object)columnNames);
            return new DataTable(objToTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable ToTable(java.lang.String tableName, boolean distinct, java.lang.String... columnNames) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.threading.SynchronizationLockException, system.InvalidOperationException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.InvalidCastException {
        try {
            JCObject objToTable = (JCObject)classInstance.Invoke("ToTable", (Object)tableName, distinct, (Object)columnNames);
            return new DataTable(objToTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(DataView view) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)view.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRowView AddNew() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        try {
            JCObject objAddNew = (JCObject)classInstance.Invoke("AddNew");
            return new DataRowView(objAddNew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginInit() throws Throwable {
        try {
            classInstance.Invoke("BeginInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndInit() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.SynchronizationLockException, system.NotSupportedException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("EndInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Array array, int index) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("CopyTo", (Object)array.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete(int index) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("Delete", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Find(NetObject key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            return (int)classInstance.Invoke("Find", (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Find(NetObject[] key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            return (int)classInstance.Invoke("Find", (Object)toObjectFromArray(key));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRowView[] FindRows(NetObject key) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        try {
            ArrayList<DataRowView> resultingArrayList = new ArrayList<DataRowView>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("FindRows", (Object)key.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new DataRowView(resultingObject));
            }
            DataRowView[] resultingArray = new DataRowView[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRowView[] FindRows(NetObject[] key) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.diagnostics.tracing.EventSourceException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        try {
            ArrayList<DataRowView> resultingArrayList = new ArrayList<DataRowView>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("FindRows", (Object)toObjectFromArray(key));
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new DataRowView(resultingObject));
            }
            DataRowView[] resultingArray = new DataRowView[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetService(NetType service) throws Throwable {
        try {
            JCObject objGetService = (JCObject)classInstance.Invoke("GetService", (Object)service.getJCOInstance());
            return new NetObject(objGetService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAllowDelete() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowDelete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowDelete(boolean AllowDelete) throws Throwable {
        try {
            classInstance.Set("AllowDelete", AllowDelete);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getApplyDefaultSort() throws Throwable {
        try {
            return (boolean)classInstance.Get("ApplyDefaultSort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplyDefaultSort(boolean ApplyDefaultSort) throws Throwable {
        try {
            classInstance.Set("ApplyDefaultSort", ApplyDefaultSort);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowEdit() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowEdit(boolean AllowEdit) throws Throwable {
        try {
            classInstance.Set("AllowEdit", AllowEdit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowNew() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowNew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowNew(boolean AllowNew) throws Throwable {
        try {
            classInstance.Set("AllowNew", AllowNew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataViewManager getDataViewManager() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataViewManager");
            return new DataViewManager(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInitialized() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsInitialized");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRowFilter() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RowFilter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRowFilter(java.lang.String RowFilter) throws Throwable {
        try {
            classInstance.Set("RowFilter", (Object)RowFilter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataViewRowState getRowStateFilter() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RowStateFilter");
            return new DataViewRowState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRowStateFilter(DataViewRowState RowStateFilter) throws Throwable {
        try {
            classInstance.Set("RowStateFilter", (Object)RowStateFilter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSort() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Sort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSort(java.lang.String Sort) throws Throwable {
        try {
            classInstance.Set("Sort", (Object)Sort);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable getTable() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Table");
            return new DataTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTable(DataTable Table) throws Throwable {
        try {
            classInstance.Set("Table", (Object)Table.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDesignMode() throws Throwable {
        try {
            return (boolean)classInstance.Get("DesignMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addListChanged(ListChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ListChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeListChanged(ListChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ListChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addInitialized(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Initialized", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeInitialized(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Initialized", handler);
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