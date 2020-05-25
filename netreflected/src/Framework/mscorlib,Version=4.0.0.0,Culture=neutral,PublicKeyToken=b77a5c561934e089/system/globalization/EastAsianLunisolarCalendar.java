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

package system.globalization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.DateTime;
import system.DayOfWeek;
import system.globalization.CalendarWeekRule;
import system.globalization.CalendarAlgorithmType;


/**
 * The base .NET class managing System.Globalization.EastAsianLunisolarCalendar, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class EastAsianLunisolarCalendar extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Globalization.EastAsianLunisolarCalendar";
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

    public EastAsianLunisolarCalendar(Object instance) throws Throwable {
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

    public static EastAsianLunisolarCalendar castFrom(IJCOBridgeReflected from) throws Throwable {
        return new EastAsianLunisolarCalendar(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public int GetSexagenaryYear(DateTime time) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            return (int)classInstance.Invoke("GetSexagenaryYear", (Object)time.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetCelestialStem(int sexagenaryYear) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            return (int)classInstance.Invoke("GetCelestialStem", sexagenaryYear);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetTerrestrialBranch(int sexagenaryYear) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            return (int)classInstance.Invoke("GetTerrestrialBranch", sexagenaryYear);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetDaysInMonth(int year, int month, int era) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            return (int)classInstance.Invoke("GetDaysInMonth", year, month, era);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime ToDateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, int era) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            JCObject objToDateTime = (JCObject)classInstance.Invoke("ToDateTime", year, month, day, hour, minute, second, millisecond, era);
            return new DateTime(objToDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddMonths(DateTime time, int months) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objAddMonths = (JCObject)classInstance.Invoke("AddMonths", (Object)time.getJCOInstance(), months);
            return new DateTime(objAddMonths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddYears(DateTime time, int years) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArgumentException {
        try {
            JCObject objAddYears = (JCObject)classInstance.Invoke("AddYears", (Object)time.getJCOInstance(), years);
            return new DateTime(objAddYears);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetDayOfYear(DateTime time) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            return (int)classInstance.Invoke("GetDayOfYear", (Object)time.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetDayOfMonth(DateTime time) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            return (int)classInstance.Invoke("GetDayOfMonth", (Object)time.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetDaysInYear(int year, int era) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            return (int)classInstance.Invoke("GetDaysInYear", year, era);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMonth(DateTime time) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            return (int)classInstance.Invoke("GetMonth", (Object)time.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetYear(DateTime time) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            return (int)classInstance.Invoke("GetYear", (Object)time.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DayOfWeek GetDayOfWeek(DateTime time) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objGetDayOfWeek = (JCObject)classInstance.Invoke("GetDayOfWeek", (Object)time.getJCOInstance());
            return new DayOfWeek(objGetDayOfWeek);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMonthsInYear(int year, int era) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            return (int)classInstance.Invoke("GetMonthsInYear", year, era);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsLeapDay(int year, int month, int day, int era) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsLeapDay", year, month, day, era);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsLeapMonth(int year, int month, int era) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsLeapMonth", year, month, era);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetLeapMonth(int year, int era) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            return (int)classInstance.Invoke("GetLeapMonth", year, era);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsLeapYear(int year, int era) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsLeapYear", year, era);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ToFourDigitYear(int year) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            return (int)classInstance.Invoke("ToFourDigitYear", year);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddMilliseconds(DateTime time, double milliseconds) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.ArgumentException {
        try {
            JCObject objAddMilliseconds = (JCObject)classInstance.Invoke("AddMilliseconds", (Object)time.getJCOInstance(), milliseconds);
            return new DateTime(objAddMilliseconds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddDays(DateTime time, int days) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.ArgumentException {
        try {
            JCObject objAddDays = (JCObject)classInstance.Invoke("AddDays", (Object)time.getJCOInstance(), days);
            return new DateTime(objAddDays);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddHours(DateTime time, int hours) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.ArgumentException {
        try {
            JCObject objAddHours = (JCObject)classInstance.Invoke("AddHours", (Object)time.getJCOInstance(), hours);
            return new DateTime(objAddHours);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddMinutes(DateTime time, int minutes) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.ArgumentException {
        try {
            JCObject objAddMinutes = (JCObject)classInstance.Invoke("AddMinutes", (Object)time.getJCOInstance(), minutes);
            return new DateTime(objAddMinutes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddSeconds(DateTime time, int seconds) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.FormatException, system.ArgumentException {
        try {
            JCObject objAddSeconds = (JCObject)classInstance.Invoke("AddSeconds", (Object)time.getJCOInstance(), seconds);
            return new DateTime(objAddSeconds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime AddWeeks(DateTime time, int weeks) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        try {
            JCObject objAddWeeks = (JCObject)classInstance.Invoke("AddWeeks", (Object)time.getJCOInstance(), weeks);
            return new DateTime(objAddWeeks);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetDaysInMonth(int year, int month) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetDaysInMonth", year, month);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetDaysInYear(int year) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetDaysInYear", year);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetHour(DateTime time) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetHour", (Object)time.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double GetMilliseconds(DateTime time) throws Throwable {
        try {
            return (double)classInstance.Invoke("GetMilliseconds", (Object)time.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMinute(DateTime time) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetMinute", (Object)time.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMonthsInYear(int year) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetMonthsInYear", year);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetSecond(DateTime time) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetSecond", (Object)time.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetWeekOfYear(DateTime time, CalendarWeekRule rule, DayOfWeek firstDayOfWeek) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            return (int)classInstance.Invoke("GetWeekOfYear", (Object)time.getJCOInstance(), (Object)rule.getJCOInstance(), (Object)firstDayOfWeek.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsLeapDay(int year, int month, int day) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsLeapDay", year, month, day);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsLeapMonth(int year, int month) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsLeapMonth", year, month);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetLeapMonth(int year) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetLeapMonth", year);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsLeapYear(int year) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsLeapYear", year);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime ToDateTime(int year, int month, int day, int hour, int minute, int second, int millisecond) throws Throwable {
        try {
            JCObject objToDateTime = (JCObject)classInstance.Invoke("ToDateTime", year, month, day, hour, minute, second, millisecond);
            return new DateTime(objToDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public CalendarAlgorithmType getAlgorithmType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AlgorithmType");
            return new CalendarAlgorithmType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTwoDigitYearMax() throws Throwable {
        try {
            return (int)classInstance.Get("TwoDigitYearMax");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTwoDigitYearMax(int TwoDigitYearMax) throws Throwable {
        try {
            classInstance.Set("TwoDigitYearMax", TwoDigitYearMax);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getMinSupportedDateTime() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MinSupportedDateTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getMaxSupportedDateTime() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MaxSupportedDateTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int[] getEras() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Eras");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            int[] resultingArray = new int[resultingArrayList.size()];
			for(int indexEras = 0; indexEras < resultingArrayList.size(); indexEras++ ) {
				resultingArray[indexEras] = (int)resultingArrayList.get(indexEras);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}