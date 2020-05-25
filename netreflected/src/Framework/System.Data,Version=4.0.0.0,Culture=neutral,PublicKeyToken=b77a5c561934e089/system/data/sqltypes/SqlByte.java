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

package system.data.sqltypes;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.sqltypes.SqlByte;
import system.data.sqltypes.SqlBoolean;
import system.data.sqltypes.SqlDouble;
import system.data.sqltypes.SqlInt16;
import system.data.sqltypes.SqlInt32;
import system.data.sqltypes.SqlInt64;
import system.data.sqltypes.SqlMoney;
import system.data.sqltypes.SqlDecimal;
import system.data.sqltypes.SqlSingle;
import system.data.sqltypes.SqlString;
import system.xml.XmlQualifiedName;
import system.xml.schema.XmlSchemaSet;


/**
 * The base .NET class managing System.Data.SqlTypes.SqlByte, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SqlByte extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.SqlTypes.SqlByte";
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

    public SqlByte(Object instance) throws Throwable {
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

    public static SqlByte castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SqlByte(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SqlByte(byte value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static SqlByte Parse(java.lang.String s) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.OverflowException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)s);
            return new SqlByte(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte OnesComplement(SqlByte x) throws Throwable {
        try {
            JCObject objOnesComplement = (JCObject)classType.Invoke("OnesComplement", (Object)x.getJCOInstance());
            return new SqlByte(objOnesComplement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte Add(SqlByte x, SqlByte y) throws Throwable, system.OverflowException {
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlByte(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte Subtract(SqlByte x, SqlByte y) throws Throwable, system.OverflowException {
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlByte(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte Multiply(SqlByte x, SqlByte y) throws Throwable, system.OverflowException {
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlByte(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte Divide(SqlByte x, SqlByte y) throws Throwable, system.DivideByZeroException {
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlByte(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte Mod(SqlByte x, SqlByte y) throws Throwable, system.DivideByZeroException {
        try {
            JCObject objMod = (JCObject)classType.Invoke("Mod", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlByte(objMod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte Modulus(SqlByte x, SqlByte y) throws Throwable, system.DivideByZeroException {
        try {
            JCObject objModulus = (JCObject)classType.Invoke("Modulus", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlByte(objModulus);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte BitwiseAnd(SqlByte x, SqlByte y) throws Throwable {
        try {
            JCObject objBitwiseAnd = (JCObject)classType.Invoke("BitwiseAnd", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlByte(objBitwiseAnd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte BitwiseOr(SqlByte x, SqlByte y) throws Throwable {
        try {
            JCObject objBitwiseOr = (JCObject)classType.Invoke("BitwiseOr", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlByte(objBitwiseOr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlByte Xor(SqlByte x, SqlByte y) throws Throwable {
        try {
            JCObject objXor = (JCObject)classType.Invoke("Xor", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlByte(objXor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean Equals(SqlByte x, SqlByte y) throws Throwable {
        try {
            JCObject objEquals = (JCObject)classType.Invoke("Equals", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean NotEquals(SqlByte x, SqlByte y) throws Throwable {
        try {
            JCObject objNotEquals = (JCObject)classType.Invoke("NotEquals", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objNotEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThan(SqlByte x, SqlByte y) throws Throwable {
        try {
            JCObject objLessThan = (JCObject)classType.Invoke("LessThan", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objLessThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThan(SqlByte x, SqlByte y) throws Throwable {
        try {
            JCObject objGreaterThan = (JCObject)classType.Invoke("GreaterThan", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objGreaterThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThanOrEqual(SqlByte x, SqlByte y) throws Throwable {
        try {
            JCObject objLessThanOrEqual = (JCObject)classType.Invoke("LessThanOrEqual", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objLessThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThanOrEqual(SqlByte x, SqlByte y) throws Throwable {
        try {
            JCObject objGreaterThanOrEqual = (JCObject)classType.Invoke("GreaterThanOrEqual", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objGreaterThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBoolean ToSqlBoolean() throws Throwable, system.data.sqltypes.SqlNullValueException {
        try {
            JCObject objToSqlBoolean = (JCObject)classInstance.Invoke("ToSqlBoolean");
            return new SqlBoolean(objToSqlBoolean);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDouble ToSqlDouble() throws Throwable, system.data.sqltypes.SqlNullValueException, system.OverflowException {
        try {
            JCObject objToSqlDouble = (JCObject)classInstance.Invoke("ToSqlDouble");
            return new SqlDouble(objToSqlDouble);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt16 ToSqlInt16() throws Throwable, system.data.sqltypes.SqlNullValueException {
        try {
            JCObject objToSqlInt16 = (JCObject)classInstance.Invoke("ToSqlInt16");
            return new SqlInt16(objToSqlInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt32 ToSqlInt32() throws Throwable, system.data.sqltypes.SqlNullValueException {
        try {
            JCObject objToSqlInt32 = (JCObject)classInstance.Invoke("ToSqlInt32");
            return new SqlInt32(objToSqlInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlInt64 ToSqlInt64() throws Throwable, system.data.sqltypes.SqlNullValueException {
        try {
            JCObject objToSqlInt64 = (JCObject)classInstance.Invoke("ToSqlInt64");
            return new SqlInt64(objToSqlInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlMoney ToSqlMoney() throws Throwable, system.data.sqltypes.SqlNullValueException {
        try {
            JCObject objToSqlMoney = (JCObject)classInstance.Invoke("ToSqlMoney");
            return new SqlMoney(objToSqlMoney);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDecimal ToSqlDecimal() throws Throwable, system.data.sqltypes.SqlNullValueException {
        try {
            JCObject objToSqlDecimal = (JCObject)classInstance.Invoke("ToSqlDecimal");
            return new SqlDecimal(objToSqlDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlSingle ToSqlSingle() throws Throwable, system.data.sqltypes.SqlNullValueException, system.OverflowException {
        try {
            JCObject objToSqlSingle = (JCObject)classInstance.Invoke("ToSqlSingle");
            return new SqlSingle(objToSqlSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString ToSqlString() throws Throwable, system.data.sqltypes.SqlNullValueException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            JCObject objToSqlString = (JCObject)classInstance.Invoke("ToSqlString");
            return new SqlString(objToSqlString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            return (int)classInstance.Invoke("CompareTo", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(SqlByte value) throws Throwable {
        try {
            return (int)classInstance.Invoke("CompareTo", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlQualifiedName GetXsdType(XmlSchemaSet schemaSet) throws Throwable {
        try {
            JCObject objGetXsdType = (JCObject)classType.Invoke("GetXsdType", (Object)schemaSet.getJCOInstance());
            return new XmlQualifiedName(objGetXsdType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsNull() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getValue() throws Throwable {
        try {
            return (byte)classInstance.Get("Value");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}