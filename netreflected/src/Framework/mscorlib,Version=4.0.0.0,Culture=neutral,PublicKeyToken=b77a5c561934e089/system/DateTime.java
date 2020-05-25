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

package system;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.DateTimeKind;
import system.globalization.Calendar;
import system.DateTime;
import system.TimeSpan;
import system.TypeCode;
import system.DayOfWeek;


/**
 * The base .NET class managing System.DateTime, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DateTime extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.DateTime";
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

    public DateTime(Object instance) throws Throwable {
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

    public static DateTime castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DateTime(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DateTime(long ticks) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(ticks);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(long ticks, DateTimeKind kind) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(ticks, (Object)kind.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(int year, int month, int day) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(int year, int month, int day, Calendar calendar) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, (Object)calendar.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second, (Object)kind.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second, Calendar calendar) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second, (Object)calendar.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second, millisecond);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second, millisecond, (Object)kind.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, Calendar calendar) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second, millisecond, (Object)calendar.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, Calendar calendar, DateTimeKind kind) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(year, month, day, hour, minute, second, millisecond, (Object)calendar.getJCOInstance(), (Object)kind.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public DateTime Add(TimeSpan value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", (Object)value.getJCOInstance());
            return new DateTime(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddDays(double value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAddDays = (JCObject)classInstance.Invoke("AddDays", value);
            return new DateTime(objAddDays);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddHours(double value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAddHours = (JCObject)classInstance.Invoke("AddHours", value);
            return new DateTime(objAddHours);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddMilliseconds(double value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAddMilliseconds = (JCObject)classInstance.Invoke("AddMilliseconds", value);
            return new DateTime(objAddMilliseconds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddMinutes(double value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAddMinutes = (JCObject)classInstance.Invoke("AddMinutes", value);
            return new DateTime(objAddMinutes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddMonths(int months) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAddMonths = (JCObject)classInstance.Invoke("AddMonths", months);
            return new DateTime(objAddMonths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddSeconds(double value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAddSeconds = (JCObject)classInstance.Invoke("AddSeconds", value);
            return new DateTime(objAddSeconds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddTicks(long value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAddTicks = (JCObject)classInstance.Invoke("AddTicks", value);
            return new DateTime(objAddTicks);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddYears(int value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAddYears = (JCObject)classInstance.Invoke("AddYears", value);
            return new DateTime(objAddYears);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Compare(DateTime t1, DateTime t2) throws Throwable {
        try {
            return (int)classType.Invoke("Compare", (Object)t1.getJCOInstance(), (Object)t2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(NetObject value) throws Throwable, system.ArgumentException {
        try {
            return (int)classInstance.Invoke("CompareTo", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(DateTime value) throws Throwable {
        try {
            return (int)classInstance.Invoke("CompareTo", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int DaysInMonth(int year, int month) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            return (int)classType.Invoke("DaysInMonth", year, month);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(DateTime value) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Equals(DateTime t1, DateTime t2) throws Throwable {
        try {
            return (boolean)classType.Invoke("Equals", (Object)t1.getJCOInstance(), (Object)t2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime FromBinary(long dateData) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            JCObject objFromBinary = (JCObject)classType.Invoke("FromBinary", dateData);
            return new DateTime(objFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime FromFileTime(long fileTime) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidTimeZoneException, system.NotSupportedException {
        try {
            JCObject objFromFileTime = (JCObject)classType.Invoke("FromFileTime", fileTime);
            return new DateTime(objFromFileTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime FromFileTimeUtc(long fileTime) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            JCObject objFromFileTimeUtc = (JCObject)classType.Invoke("FromFileTimeUtc", fileTime);
            return new DateTime(objFromFileTimeUtc);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime FromOADate(double d) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            JCObject objFromOADate = (JCObject)classType.Invoke("FromOADate", d);
            return new DateTime(objFromOADate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDaylightSavingTime() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("IsDaylightSavingTime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime SpecifyKind(DateTime value, DateTimeKind kind) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            JCObject objSpecifyKind = (JCObject)classType.Invoke("SpecifyKind", (Object)value.getJCOInstance(), (Object)kind.getJCOInstance());
            return new DateTime(objSpecifyKind);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ToBinary() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            return (long)classInstance.Invoke("ToBinary");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsLeapYear(int year) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classType.Invoke("IsLeapYear", year);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime Parse(java.lang.String s) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.NullReferenceException, system.OverflowException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)s);
            return new DateTime(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan Subtract(DateTime value) throws Throwable {
        try {
            JCObject objSubtract = (JCObject)classInstance.Invoke("Subtract", (Object)value.getJCOInstance());
            return new TimeSpan(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime Subtract(TimeSpan value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objSubtract = (JCObject)classInstance.Invoke("Subtract", (Object)value.getJCOInstance());
            return new DateTime(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double ToOADate() throws Throwable, system.OverflowException {
        try {
            return (double)classInstance.Invoke("ToOADate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ToFileTime() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.InvalidOperationException, system.NotSupportedException, system.OverflowException {
        try {
            return (long)classInstance.Invoke("ToFileTime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ToFileTimeUtc() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.InvalidOperationException, system.NotSupportedException, system.OverflowException {
        try {
            return (long)classInstance.Invoke("ToFileTimeUtc");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime ToLocalTime() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.InvalidOperationException, system.NotSupportedException {
        try {
            JCObject objToLocalTime = (JCObject)classInstance.Invoke("ToLocalTime");
            return new DateTime(objToLocalTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(java.lang.String format) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NullReferenceException {
        try {
            return (java.lang.String)classInstance.Invoke("ToString", (Object)format);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime ToUniversalTime() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            JCObject objToUniversalTime = (JCObject)classInstance.Invoke("ToUniversalTime");
            return new DateTime(objToUniversalTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetDateTimeFormats() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.OverflowException, system.IndexOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetDateTimeFormats");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetDateTimeFormats = 0; indexGetDateTimeFormats < resultingArrayList.size(); indexGetDateTimeFormats++ ) {
				resultingArray[indexGetDateTimeFormats] = (java.lang.String)resultingArrayList.get(indexGetDateTimeFormats);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetDateTimeFormats(char format) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NullReferenceException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetDateTimeFormats", format);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetDateTimeFormats = 0; indexGetDateTimeFormats < resultingArrayList.size(); indexGetDateTimeFormats++ ) {
				resultingArray[indexGetDateTimeFormats] = (java.lang.String)resultingArrayList.get(indexGetDateTimeFormats);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeCode GetTypeCode() throws Throwable {
        try {
            JCObject objGetTypeCode = (JCObject)classInstance.Invoke("GetTypeCode");
            return new TypeCode(objGetTypeCode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToLongDateString() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NullReferenceException {
        try {
            return (java.lang.String)classInstance.Invoke("ToLongDateString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToLongTimeString() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NullReferenceException {
        try {
            return (java.lang.String)classInstance.Invoke("ToLongTimeString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToShortTimeString() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NullReferenceException {
        try {
            return (java.lang.String)classInstance.Invoke("ToShortTimeString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToShortDateString() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.OverflowException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NullReferenceException {
        try {
            return (java.lang.String)classInstance.Invoke("ToShortDateString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public DateTime getDate() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Date");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDay() throws Throwable {
        try {
            return (int)classInstance.Get("Day");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DayOfWeek getDayOfWeek() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DayOfWeek");
            return new DayOfWeek(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDayOfYear() throws Throwable {
        try {
            return (int)classInstance.Get("DayOfYear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getHour() throws Throwable {
        try {
            return (int)classInstance.Get("Hour");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeKind getKind() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Kind");
            return new DateTimeKind(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMillisecond() throws Throwable {
        try {
            return (int)classInstance.Get("Millisecond");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinute() throws Throwable {
        try {
            return (int)classInstance.Get("Minute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMonth() throws Throwable {
        try {
            return (int)classInstance.Get("Month");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSecond() throws Throwable {
        try {
            return (int)classInstance.Get("Second");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getTicks() throws Throwable {
        try {
            return (long)classInstance.Get("Ticks");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getTimeOfDay() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TimeOfDay");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getYear() throws Throwable {
        try {
            return (int)classInstance.Get("Year");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime getNow() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Now");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime getUtcNow() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("UtcNow");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime getToday() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Today");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}