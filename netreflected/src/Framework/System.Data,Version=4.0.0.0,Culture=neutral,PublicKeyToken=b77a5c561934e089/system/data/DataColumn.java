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
import system.data.MappingType;
import system.data.DataSetDateTime;
import system.data.PropertyCollection;
import system.data.DataTable;
import system.EventHandler;


/**
 * The base .NET class managing System.Data.DataColumn, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DataColumn extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.DataColumn";
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

    public DataColumn(Object instance) throws Throwable {
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

    public static DataColumn castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataColumn(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataColumn() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.data.DataException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataColumn(java.lang.String columnName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.data.DataException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)columnName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataColumn(java.lang.String columnName, NetType dataType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.data.DataException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)columnName, (Object)dataType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataColumn(java.lang.String columnName, NetType dataType, java.lang.String expr) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.data.DataException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.InvalidCastException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)columnName, (Object)dataType.getJCOInstance(), (Object)expr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataColumn(java.lang.String columnName, NetType dataType, java.lang.String expr, MappingType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.NotSupportedException, system.NullReferenceException, system.data.DataException, system.OutOfMemoryException, system.OverflowException, system.data.sqltypes.SqlNullValueException, system.data.sqltypes.SqlTruncateException, system.InvalidCastException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)columnName, (Object)dataType.getJCOInstance(), (Object)expr, (Object)type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void SetOrdinal(int ordinal) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException {
        try {
            classInstance.Invoke("SetOrdinal", ordinal);
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

    public NetObject GetService(NetType service) throws Throwable {
        try {
            JCObject objGetService = (JCObject)classInstance.Invoke("GetService", (Object)service.getJCOInstance());
            return new NetObject(objGetService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAllowDBNull() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowDBNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowDBNull(boolean AllowDBNull) throws Throwable {
        try {
            classInstance.Set("AllowDBNull", AllowDBNull);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAutoIncrement() throws Throwable {
        try {
            return (boolean)classInstance.Get("AutoIncrement");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoIncrement(boolean AutoIncrement) throws Throwable {
        try {
            classInstance.Set("AutoIncrement", AutoIncrement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getAutoIncrementSeed() throws Throwable {
        try {
            return (long)classInstance.Get("AutoIncrementSeed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoIncrementSeed(long AutoIncrementSeed) throws Throwable {
        try {
            classInstance.Set("AutoIncrementSeed", AutoIncrementSeed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getAutoIncrementStep() throws Throwable {
        try {
            return (long)classInstance.Get("AutoIncrementStep");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoIncrementStep(long AutoIncrementStep) throws Throwable {
        try {
            classInstance.Set("AutoIncrementStep", AutoIncrementStep);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCaption() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Caption");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCaption(java.lang.String Caption) throws Throwable {
        try {
            classInstance.Set("Caption", (Object)Caption);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getColumnName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ColumnName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnName(java.lang.String ColumnName) throws Throwable {
        try {
            classInstance.Set("ColumnName", (Object)ColumnName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPrefix() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Prefix");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrefix(java.lang.String Prefix) throws Throwable {
        try {
            classInstance.Set("Prefix", (Object)Prefix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDataType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataType(NetType DataType) throws Throwable {
        try {
            classInstance.Set("DataType", (Object)DataType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataSetDateTime getDateTimeMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DateTimeMode");
            return new DataSetDateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDateTimeMode(DataSetDateTime DateTimeMode) throws Throwable {
        try {
            classInstance.Set("DateTimeMode", (Object)DateTimeMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getDefaultValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultValue(NetObject DefaultValue) throws Throwable {
        try {
            classInstance.Set("DefaultValue", (Object)DefaultValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getExpression() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Expression");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExpression(java.lang.String Expression) throws Throwable {
        try {
            classInstance.Set("Expression", (Object)Expression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyCollection getExtendedProperties() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ExtendedProperties");
            return new PropertyCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxLength() throws Throwable {
        try {
            return (int)classInstance.Get("MaxLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxLength(int MaxLength) throws Throwable {
        try {
            classInstance.Set("MaxLength", MaxLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNamespace() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Namespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNamespace(java.lang.String Namespace) throws Throwable {
        try {
            classInstance.Set("Namespace", (Object)Namespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getOrdinal() throws Throwable {
        try {
            return (int)classInstance.Get("Ordinal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadOnly(boolean ReadOnly) throws Throwable {
        try {
            classInstance.Set("ReadOnly", ReadOnly);
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

    public boolean getUnique() throws Throwable {
        try {
            return (boolean)classInstance.Get("Unique");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnique(boolean Unique) throws Throwable {
        try {
            classInstance.Set("Unique", Unique);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MappingType getColumnMapping() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnMapping");
            return new MappingType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnMapping(MappingType ColumnMapping) throws Throwable {
        try {
            classInstance.Set("ColumnMapping", (Object)ColumnMapping.getJCOInstance());
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