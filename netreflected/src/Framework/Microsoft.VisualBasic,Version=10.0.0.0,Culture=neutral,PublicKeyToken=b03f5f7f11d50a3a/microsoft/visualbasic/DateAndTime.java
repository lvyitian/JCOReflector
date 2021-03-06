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
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package microsoft.visualbasic;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.visualbasic.DateInterval;
import system.DateTime;
import microsoft.visualbasic.FirstDayOfWeek;
import microsoft.visualbasic.FirstWeekOfYear;


/**
 * The base .NET class managing Microsoft.VisualBasic.DateAndTime, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.DateAndTime" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.DateAndTime</a>
 */
public class DateAndTime extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.VisualBasic
     */
    public static final String assemblyShortName = "Microsoft.VisualBasic";
    /**
     * Qualified class name: Microsoft.VisualBasic.DateAndTime
     */
    public static final String className = "Microsoft.VisualBasic.DateAndTime";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public DateAndTime(Object instance) throws Throwable {
        super(instance);
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DateAndTime}, a cast assert is made to check if types are compatible.
     */
    public static DateAndTime cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DateAndTime(from.getJCOInstance());
    }

    // Constructors section
    
    public DateAndTime() throws Throwable {
    }



    
    // Methods section
    
    public static int DatePart(DateInterval Interval, DateTime DateValue, FirstDayOfWeek FirstDayOfWeekValue, FirstWeekOfYear FirstWeekOfYearValue) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("DatePart", Interval == null ? null : Interval.getJCOInstance(), DateValue == null ? null : DateValue.getJCOInstance(), FirstDayOfWeekValue == null ? null : FirstDayOfWeekValue.getJCOInstance(), FirstWeekOfYearValue == null ? null : FirstWeekOfYearValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int DatePart(java.lang.String Interval, NetObject DateValue, FirstDayOfWeek DayOfWeek, FirstWeekOfYear WeekOfYear) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException, system.TypeInitializationException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("DatePart", Interval, DateValue == null ? null : DateValue.getJCOInstance(), DayOfWeek == null ? null : DayOfWeek.getJCOInstance(), WeekOfYear == null ? null : WeekOfYear.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Day(DateTime DateValue) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Day", DateValue == null ? null : DateValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Hour(DateTime TimeValue) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Hour", TimeValue == null ? null : TimeValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Minute(DateTime TimeValue) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Minute", TimeValue == null ? null : TimeValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Month(DateTime DateValue) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Month", DateValue == null ? null : DateValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Second(DateTime TimeValue) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Second", TimeValue == null ? null : TimeValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Weekday(DateTime DateValue, FirstDayOfWeek DayOfWeek) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Weekday", DateValue == null ? null : DateValue.getJCOInstance(), DayOfWeek == null ? null : DayOfWeek.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Year(DateTime DateValue) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Year", DateValue == null ? null : DateValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long DateDiff(DateInterval Interval, DateTime Date1, DateTime Date2, FirstDayOfWeek DayOfWeek, FirstWeekOfYear WeekOfYear) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("DateDiff", Interval == null ? null : Interval.getJCOInstance(), Date1 == null ? null : Date1.getJCOInstance(), Date2 == null ? null : Date2.getJCOInstance(), DayOfWeek == null ? null : DayOfWeek.getJCOInstance(), WeekOfYear == null ? null : WeekOfYear.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long DateDiff(java.lang.String Interval, NetObject Date1, NetObject Date2, FirstDayOfWeek DayOfWeek, FirstWeekOfYear WeekOfYear) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException, system.TypeInitializationException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("DateDiff", Interval, Date1 == null ? null : Date1.getJCOInstance(), Date2 == null ? null : Date2.getJCOInstance(), DayOfWeek == null ? null : DayOfWeek.getJCOInstance(), WeekOfYear == null ? null : WeekOfYear.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime DateAdd(DateInterval Interval, double Number, DateTime DateValue) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.OutOfMemoryException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDateAdd = (JCObject)classType.Invoke("DateAdd", Interval == null ? null : Interval.getJCOInstance(), Number, DateValue == null ? null : DateValue.getJCOInstance());
            return new DateTime(objDateAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime DateAdd(java.lang.String Interval, double Number, NetObject DateValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException, system.TypeInitializationException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDateAdd = (JCObject)classType.Invoke("DateAdd", Interval, Number, DateValue == null ? null : DateValue.getJCOInstance());
            return new DateTime(objDateAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime DateSerial(int Year, int Month, int Day) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.InvalidTimeZoneException, system.OutOfMemoryException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDateSerial = (JCObject)classType.Invoke("DateSerial", Year, Month, Day);
            return new DateTime(objDateSerial);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime DateValue(java.lang.String StringDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.OverflowException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDateValue = (JCObject)classType.Invoke("DateValue", StringDate);
            return new DateTime(objDateValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime TimeSerial(int Hour, int Minute, int Second) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTimeSerial = (JCObject)classType.Invoke("TimeSerial", Hour, Minute, Second);
            return new DateTime(objTimeSerial);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime TimeValue(java.lang.String StringTime) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.OverflowException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTimeValue = (JCObject)classType.Invoke("TimeValue", StringTime);
            return new DateTime(objTimeValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String MonthName(int Month, boolean Abbreviate) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("MonthName", Month, Abbreviate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String WeekdayName(int Weekday, boolean Abbreviate, FirstDayOfWeek FirstDayOfWeekValue) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.TypeInitializationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("WeekdayName", Weekday, Abbreviate, FirstDayOfWeekValue == null ? null : FirstDayOfWeekValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public double getTimer() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Timer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getNow() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Now");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getTimeOfDay() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TimeOfDay");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeOfDay(DateTime TimeOfDay) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TimeOfDay", TimeOfDay == null ? null : TimeOfDay.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getToday() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Today");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setToday(DateTime Today) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Today", Today == null ? null : Today.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDateString() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.TypeInitializationException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.OverflowException, system.FormatException, system.OutOfMemoryException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DateString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDateString(java.lang.String DateString) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.FormatException, system.OverflowException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DateString", DateString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTimeString() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException, system.TypeInitializationException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TimeString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeString(java.lang.String TimeString) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.OverflowException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidCastException, system.security.SecurityException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TimeString", TimeString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}