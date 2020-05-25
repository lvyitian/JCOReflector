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
import system.DateTime;
import system.data.sqltypes.SqlDateTime;
import system.TimeSpan;
import system.data.sqltypes.SqlBoolean;
import system.data.sqltypes.SqlString;
import system.xml.XmlQualifiedName;
import system.xml.schema.XmlSchemaSet;


/**
 * The base .NET class managing System.Data.SqlTypes.SqlDateTime, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SqlDateTime extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.SqlTypes.SqlDateTime";
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

    public SqlDateTime(Object instance) throws Throwable {
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

    public static SqlDateTime castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SqlDateTime(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SqlDateTime(DateTime value) throws Throwable, system.data.sqltypes.SqlTypeException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDateTime(int year, int month, int day) throws Throwable, system.OverflowException, system.data.sqltypes.SqlTypeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDateTime(int year, int month, int day, int hour, int minute, int second) throws Throwable, system.OverflowException, system.data.sqltypes.SqlTypeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDateTime(int year, int month, int day, int hour, int minute, int second, double millisecond) throws Throwable, system.OverflowException, system.data.sqltypes.SqlTypeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second, millisecond);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDateTime(int year, int month, int day, int hour, int minute, int second, int bilisecond) throws Throwable, system.OverflowException, system.data.sqltypes.SqlTypeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second, bilisecond);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlDateTime(int dayTicks, int timeTicks) throws Throwable, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(dayTicks, timeTicks);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static SqlDateTime Parse(java.lang.String s) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.InvalidOperationException, system.FormatException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NullReferenceException, system.IndexOutOfRangeException, system.OverflowException, system.data.sqltypes.SqlTypeException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)s);
            return new SqlDateTime(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDateTime Add(SqlDateTime x, TimeSpan t) throws Throwable, system.ArgumentOutOfRangeException, system.data.sqltypes.SqlTypeException, system.OverflowException {
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", (Object)x.getJCOInstance(), (Object)t.getJCOInstance());
            return new SqlDateTime(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlDateTime Subtract(SqlDateTime x, TimeSpan t) throws Throwable, system.ArgumentOutOfRangeException, system.data.sqltypes.SqlTypeException, system.OverflowException {
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", (Object)x.getJCOInstance(), (Object)t.getJCOInstance());
            return new SqlDateTime(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean Equals(SqlDateTime x, SqlDateTime y) throws Throwable {
        try {
            JCObject objEquals = (JCObject)classType.Invoke("Equals", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean NotEquals(SqlDateTime x, SqlDateTime y) throws Throwable {
        try {
            JCObject objNotEquals = (JCObject)classType.Invoke("NotEquals", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objNotEquals);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThan(SqlDateTime x, SqlDateTime y) throws Throwable {
        try {
            JCObject objLessThan = (JCObject)classType.Invoke("LessThan", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objLessThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThan(SqlDateTime x, SqlDateTime y) throws Throwable {
        try {
            JCObject objGreaterThan = (JCObject)classType.Invoke("GreaterThan", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objGreaterThan);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean LessThanOrEqual(SqlDateTime x, SqlDateTime y) throws Throwable {
        try {
            JCObject objLessThanOrEqual = (JCObject)classType.Invoke("LessThanOrEqual", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objLessThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SqlBoolean GreaterThanOrEqual(SqlDateTime x, SqlDateTime y) throws Throwable {
        try {
            JCObject objGreaterThanOrEqual = (JCObject)classType.Invoke("GreaterThanOrEqual", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
            return new SqlBoolean(objGreaterThanOrEqual);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlString ToSqlString() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
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

    public int CompareTo(SqlDateTime value) throws Throwable {
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

    public DateTime getValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Value");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDayTicks() throws Throwable {
        try {
            return (int)classInstance.Get("DayTicks");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTimeTicks() throws Throwable {
        try {
            return (int)classInstance.Get("TimeTicks");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}