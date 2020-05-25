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

package system.data.objects;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.DateTime;
import system.Decimal;
import system.Single;
import system.Guid;
import system.data.common.DbDataRecord;
import system.data.common.DbDataReader;
import system.data.common.DataRecordInfo;


/**
 * The base .NET class managing System.Data.Objects.DbUpdatableDataRecord, System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DbUpdatableDataRecord extends NetObject  {
    public static final String assemblyFullName = "System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data.Entity";
    public static final String className = "System.Data.Objects.DbUpdatableDataRecord";
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

    public DbUpdatableDataRecord(Object instance) throws Throwable {
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

    public static DbUpdatableDataRecord castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DbUpdatableDataRecord(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public boolean GetBoolean(int ordinal) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetBoolean", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte GetByte(int ordinal) throws Throwable {
        try {
            return (byte)classInstance.Invoke("GetByte", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetBytes(int ordinal, long dataIndex, byte[] buffer, int bufferIndex, int length) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (long)classInstance.Invoke("GetBytes", ordinal, dataIndex, buffer, bufferIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char GetChar(int ordinal) throws Throwable {
        try {
            return (char)classInstance.Invoke("GetChar", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetChars(int ordinal, long dataIndex, char[] buffer, int bufferIndex, int length) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (long)classInstance.Invoke("GetChars", ordinal, dataIndex, buffer, bufferIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetDataTypeName(int ordinal) throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetDataTypeName", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetDateTime(int ordinal) throws Throwable {
        try {
            JCObject objGetDateTime = (JCObject)classInstance.Invoke("GetDateTime", ordinal);
            return new DateTime(objGetDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal GetDecimal(int ordinal) throws Throwable {
        try {
            JCObject objGetDecimal = (JCObject)classInstance.Invoke("GetDecimal", ordinal);
            return new Decimal(objGetDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double GetDouble(int ordinal) throws Throwable {
        try {
            return (double)classInstance.Invoke("GetDouble", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetFieldType(int ordinal) throws Throwable {
        try {
            JCObject objGetFieldType = (JCObject)classInstance.Invoke("GetFieldType", ordinal);
            return new NetType(objGetFieldType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single GetFloat(int ordinal) throws Throwable {
        try {
            JCObject objGetFloat = (JCObject)classInstance.Invoke("GetFloat", ordinal);
            return new Single(objGetFloat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid GetGuid(int ordinal) throws Throwable {
        try {
            JCObject objGetGuid = (JCObject)classInstance.Invoke("GetGuid", ordinal);
            return new Guid(objGetGuid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short GetInt16(int ordinal) throws Throwable {
        try {
            return (short)classInstance.Invoke("GetInt16", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetInt32(int ordinal) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetInt32", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetInt64(int ordinal) throws Throwable {
        try {
            return (long)classInstance.Invoke("GetInt64", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetName(int ordinal) throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetName", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetOrdinal(java.lang.String name) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetOrdinal", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetString(int ordinal) throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetString", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(int ordinal) throws Throwable {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", ordinal);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetValues(NetObject[] values) throws Throwable, system.ArgumentNullException {
        try {
            return (int)classInstance.Invoke("GetValues", (Object)toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDBNull(int ordinal) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsDBNull", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetBoolean(int ordinal, boolean value) throws Throwable {
        try {
            classInstance.Invoke("SetBoolean", ordinal, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetByte(int ordinal, byte value) throws Throwable {
        try {
            classInstance.Invoke("SetByte", ordinal, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetChar(int ordinal, char value) throws Throwable {
        try {
            classInstance.Invoke("SetChar", ordinal, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetDateTime(int ordinal, DateTime value) throws Throwable {
        try {
            classInstance.Invoke("SetDateTime", ordinal, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetDecimal(int ordinal, Decimal value) throws Throwable {
        try {
            classInstance.Invoke("SetDecimal", ordinal, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetDouble(int ordinal, double value) throws Throwable {
        try {
            classInstance.Invoke("SetDouble", ordinal, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetFloat(int ordinal, Single value) throws Throwable {
        try {
            classInstance.Invoke("SetFloat", ordinal, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetGuid(int ordinal, Guid value) throws Throwable {
        try {
            classInstance.Invoke("SetGuid", ordinal, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetInt16(int ordinal, short value) throws Throwable {
        try {
            classInstance.Invoke("SetInt16", ordinal, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetInt32(int ordinal, int value) throws Throwable {
        try {
            classInstance.Invoke("SetInt32", ordinal, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetInt64(int ordinal, long value) throws Throwable {
        try {
            classInstance.Invoke("SetInt64", ordinal, value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetString(int ordinal, java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("SetString", ordinal, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(int ordinal, NetObject value) throws Throwable {
        try {
            classInstance.Invoke("SetValue", ordinal, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int SetValues(NetObject... values) throws Throwable {
        try {
            return (int)classInstance.Invoke("SetValues", (Object[])toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetDBNull(int ordinal) throws Throwable {
        try {
            classInstance.Invoke("SetDBNull", ordinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbDataRecord GetDataRecord(int ordinal) throws Throwable {
        try {
            JCObject objGetDataRecord = (JCObject)classInstance.Invoke("GetDataRecord", ordinal);
            return new DbDataRecord(objGetDataRecord);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbDataReader GetDataReader(int i) throws Throwable, system.NotSupportedException {
        try {
            JCObject objGetDataReader = (JCObject)classInstance.Invoke("GetDataReader", i);
            return new DbDataReader(objGetDataReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getFieldCount() throws Throwable {
        try {
            return (int)classInstance.Get("FieldCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRecordInfo getDataRecordInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataRecordInfo");
            return new DataRecordInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}