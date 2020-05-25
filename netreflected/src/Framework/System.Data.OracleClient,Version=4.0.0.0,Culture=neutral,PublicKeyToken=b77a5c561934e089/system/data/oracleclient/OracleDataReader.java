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
import system.DateTime;
import system.Decimal;
import system.Single;
import system.Guid;
import system.TimeSpan;
import system.data.oracleclient.OracleBFile;
import system.data.oracleclient.OracleBinary;
import system.data.oracleclient.OracleDateTime;
import system.data.oracleclient.OracleLob;
import system.data.oracleclient.OracleMonthSpan;
import system.data.oracleclient.OracleNumber;
import system.data.oracleclient.OracleString;
import system.data.oracleclient.OracleTimeSpan;
import system.io.TextReader;
import system.data.common.DbDataReader;
import system.io.Stream;
import system.runtime.remoting.ObjRef;


/**
 * The base .NET class managing System.Data.OracleClient.OracleDataReader, System.Data.OracleClient, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class OracleDataReader extends NetObject  {
    public static final String assemblyFullName = "System.Data.OracleClient, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data.OracleClient";
    public static final String className = "System.Data.OracleClient.OracleDataReader";
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

    public OracleDataReader(Object instance) throws Throwable {
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

    public static OracleDataReader castFrom(IJCOBridgeReflected from) throws Throwable {
        return new OracleDataReader(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public NetObject GetProviderSpecificValue(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.ArgumentOutOfRangeException, system.OverflowException {
        try {
            JCObject objGetProviderSpecificValue = (JCObject)classInstance.Invoke("GetProviderSpecificValue", i);
            return new NetObject(objGetProviderSpecificValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetProviderSpecificValues(NetObject[] values) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetProviderSpecificValues", (Object)toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetDataTypeName(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (java.lang.String)classInstance.Invoke("GetDataTypeName", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetProviderSpecificFieldType(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objGetProviderSpecificFieldType = (JCObject)classInstance.Invoke("GetProviderSpecificFieldType", i);
            return new NetType(objGetProviderSpecificFieldType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetFieldType(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objGetFieldType = (JCObject)classInstance.Invoke("GetFieldType", i);
            return new NetType(objGetFieldType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetName(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (java.lang.String)classInstance.Invoke("GetName", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetOrdinal(java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            return (int)classInstance.Invoke("GetOrdinal", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataTable GetSchemaTable() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.data.DataException, system.OverflowException, system.FormatException, system.InvalidCastException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException {
        try {
            JCObject objGetSchemaTable = (JCObject)classInstance.Invoke("GetSchemaTable");
            return new DataTable(objGetSchemaTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.OutOfMemoryException, system.FormatException, system.OverflowException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", i);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetValues(NetObject[] values) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.OutOfMemoryException, system.FormatException, system.OverflowException {
        try {
            return (int)classInstance.Invoke("GetValues", (Object)toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetBoolean(int i) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetBoolean", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte GetByte(int i) throws Throwable {
        try {
            return (byte)classInstance.Invoke("GetByte", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetBytes(int i, long fieldOffset, byte[] buffer2, int bufferoffset, int length) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            return (long)classInstance.Invoke("GetBytes", i, fieldOffset, buffer2, bufferoffset, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char GetChar(int i) throws Throwable {
        try {
            return (char)classInstance.Invoke("GetChar", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetChars(int i, long fieldOffset, char[] buffer2, int bufferoffset, int length) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.OutOfMemoryException {
        try {
            return (long)classInstance.Invoke("GetChars", i, fieldOffset, buffer2, bufferoffset, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetDateTime(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objGetDateTime = (JCObject)classInstance.Invoke("GetDateTime", i);
            return new DateTime(objGetDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal GetDecimal(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetDecimal = (JCObject)classInstance.Invoke("GetDecimal", i);
            return new Decimal(objGetDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double GetDouble(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            return (double)classInstance.Invoke("GetDouble", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single GetFloat(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetFloat = (JCObject)classInstance.Invoke("GetFloat", i);
            return new Single(objGetFloat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid GetGuid(int i) throws Throwable {
        try {
            JCObject objGetGuid = (JCObject)classInstance.Invoke("GetGuid", i);
            return new Guid(objGetGuid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short GetInt16(int i) throws Throwable {
        try {
            return (short)classInstance.Invoke("GetInt16", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetInt32(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.OutOfMemoryException {
        try {
            return (int)classInstance.Invoke("GetInt32", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetInt64(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.OutOfMemoryException {
        try {
            return (long)classInstance.Invoke("GetInt64", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetString(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetString", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan GetTimeSpan(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetTimeSpan = (JCObject)classInstance.Invoke("GetTimeSpan", i);
            return new TimeSpan(objGetTimeSpan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleBFile GetOracleBFile(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetOracleBFile = (JCObject)classInstance.Invoke("GetOracleBFile", i);
            return new OracleBFile(objGetOracleBFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleBinary GetOracleBinary(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetOracleBinary = (JCObject)classInstance.Invoke("GetOracleBinary", i);
            return new OracleBinary(objGetOracleBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleDateTime GetOracleDateTime(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objGetOracleDateTime = (JCObject)classInstance.Invoke("GetOracleDateTime", i);
            return new OracleDateTime(objGetOracleDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleLob GetOracleLob(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetOracleLob = (JCObject)classInstance.Invoke("GetOracleLob", i);
            return new OracleLob(objGetOracleLob);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleMonthSpan GetOracleMonthSpan(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetOracleMonthSpan = (JCObject)classInstance.Invoke("GetOracleMonthSpan", i);
            return new OracleMonthSpan(objGetOracleMonthSpan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleNumber GetOracleNumber(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetOracleNumber = (JCObject)classInstance.Invoke("GetOracleNumber", i);
            return new OracleNumber(objGetOracleNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleString GetOracleString(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetOracleString = (JCObject)classInstance.Invoke("GetOracleString", i);
            return new OracleString(objGetOracleString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OracleTimeSpan GetOracleTimeSpan(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            JCObject objGetOracleTimeSpan = (JCObject)classInstance.Invoke("GetOracleTimeSpan", i);
            return new OracleTimeSpan(objGetOracleTimeSpan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetOracleValue(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.FormatException, system.OverflowException {
        try {
            JCObject objGetOracleValue = (JCObject)classInstance.Invoke("GetOracleValue", i);
            return new NetObject(objGetOracleValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetOracleValues(NetObject[] values) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException, system.OverflowException {
        try {
            return (int)classInstance.Invoke("GetOracleValues", (Object)toObjectFromArray(values));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDBNull(int i) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.AccessViolationException {
        try {
            return (boolean)classInstance.Invoke("IsDBNull", i);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean NextResult() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("NextResult");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Read() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.AccessViolationException {
        try {
            return (boolean)classInstance.Invoke("Read");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextReader GetTextReader(int ordinal) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objGetTextReader = (JCObject)classInstance.Invoke("GetTextReader", ordinal);
            return new TextReader(objGetTextReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbDataReader GetData(int ordinal) throws Throwable, system.NotSupportedException {
        try {
            JCObject objGetData = (JCObject)classInstance.Invoke("GetData", ordinal);
            return new DbDataReader(objGetData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetStream(int ordinal) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            JCObject objGetStream = (JCObject)classInstance.Invoke("GetStream", ordinal);
            return new Stream(objGetStream);
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
    
    
    public int getDepth() throws Throwable {
        try {
            return (int)classInstance.Get("Depth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getFieldCount() throws Throwable {
        try {
            return (int)classInstance.Get("FieldCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasRows() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasRows");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsClosed() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsClosed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getRecordsAffected() throws Throwable {
        try {
            return (int)classInstance.Get("RecordsAffected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getVisibleFieldCount() throws Throwable {
        try {
            return (int)classInstance.Get("VisibleFieldCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}