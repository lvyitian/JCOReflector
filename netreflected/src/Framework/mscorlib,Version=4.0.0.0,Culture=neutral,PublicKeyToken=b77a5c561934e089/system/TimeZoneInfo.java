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
import system.TimeSpan;
import system.DateTimeOffset;
import system.DateTime;
import system.TimeZoneInfo;


/**
 * The base .NET class managing System.TimeZoneInfo, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TimeZoneInfo extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.TimeZoneInfo";
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

    public TimeZoneInfo(Object instance) throws Throwable {
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

    public static TimeZoneInfo castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TimeZoneInfo(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public TimeSpan[] GetAmbiguousTimeOffsets(DateTimeOffset dateTimeOffset) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OverflowException {
        try {
            ArrayList<TimeSpan> resultingArrayList = new ArrayList<TimeSpan>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetAmbiguousTimeOffsets", (Object)dateTimeOffset.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new TimeSpan(resultingObject));
            }
            TimeSpan[] resultingArray = new TimeSpan[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan[] GetAmbiguousTimeOffsets(DateTime dateTime) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException {
        try {
            ArrayList<TimeSpan> resultingArrayList = new ArrayList<TimeSpan>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetAmbiguousTimeOffsets", (Object)dateTime.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new TimeSpan(resultingObject));
            }
            TimeSpan[] resultingArray = new TimeSpan[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan GetUtcOffset(DateTimeOffset dateTimeOffset) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException, system.ArgumentNullException {
        try {
            JCObject objGetUtcOffset = (JCObject)classInstance.Invoke("GetUtcOffset", (Object)dateTimeOffset.getJCOInstance());
            return new TimeSpan(objGetUtcOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan GetUtcOffset(DateTime dateTime) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            JCObject objGetUtcOffset = (JCObject)classInstance.Invoke("GetUtcOffset", (Object)dateTime.getJCOInstance());
            return new TimeSpan(objGetUtcOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAmbiguousTime(DateTimeOffset dateTimeOffset) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.InvalidOperationException, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("IsAmbiguousTime", (Object)dateTimeOffset.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAmbiguousTime(DateTime dateTime) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("IsAmbiguousTime", (Object)dateTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDaylightSavingTime(DateTimeOffset dateTimeOffset) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("IsDaylightSavingTime", (Object)dateTimeOffset.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDaylightSavingTime(DateTime dateTime) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("IsDaylightSavingTime", (Object)dateTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsInvalidTime(DateTime dateTime) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException {
        try {
            return (boolean)classInstance.Invoke("IsInvalidTime", (Object)dateTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ClearCachedData() throws Throwable {
        try {
            classType.Invoke("ClearCachedData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTimeOffset ConvertTimeBySystemTimeZoneId(DateTimeOffset dateTimeOffset, java.lang.String destinationTimeZoneId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.TimeZoneNotFoundException, system.security.SecurityException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException {
        try {
            JCObject objConvertTimeBySystemTimeZoneId = (JCObject)classType.Invoke("ConvertTimeBySystemTimeZoneId", (Object)dateTimeOffset.getJCOInstance(), (Object)destinationTimeZoneId);
            return new DateTimeOffset(objConvertTimeBySystemTimeZoneId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime ConvertTimeBySystemTimeZoneId(DateTime dateTime, java.lang.String destinationTimeZoneId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.TimeZoneNotFoundException, system.security.SecurityException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException {
        try {
            JCObject objConvertTimeBySystemTimeZoneId = (JCObject)classType.Invoke("ConvertTimeBySystemTimeZoneId", (Object)dateTime.getJCOInstance(), (Object)destinationTimeZoneId);
            return new DateTime(objConvertTimeBySystemTimeZoneId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime ConvertTimeBySystemTimeZoneId(DateTime dateTime, java.lang.String sourceTimeZoneId, java.lang.String destinationTimeZoneId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.TimeZoneNotFoundException {
        try {
            JCObject objConvertTimeBySystemTimeZoneId = (JCObject)classType.Invoke("ConvertTimeBySystemTimeZoneId", (Object)dateTime.getJCOInstance(), (Object)sourceTimeZoneId, (Object)destinationTimeZoneId);
            return new DateTime(objConvertTimeBySystemTimeZoneId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTimeOffset ConvertTime(DateTimeOffset dateTimeOffset, TimeZoneInfo destinationTimeZone) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException {
        try {
            JCObject objConvertTime = (JCObject)classType.Invoke("ConvertTime", (Object)dateTimeOffset.getJCOInstance(), (Object)destinationTimeZone.getJCOInstance());
            return new DateTimeOffset(objConvertTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime ConvertTime(DateTime dateTime, TimeZoneInfo destinationTimeZone) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException {
        try {
            JCObject objConvertTime = (JCObject)classType.Invoke("ConvertTime", (Object)dateTime.getJCOInstance(), (Object)destinationTimeZone.getJCOInstance());
            return new DateTime(objConvertTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime ConvertTime(DateTime dateTime, TimeZoneInfo sourceTimeZone, TimeZoneInfo destinationTimeZone) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.OverflowException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            JCObject objConvertTime = (JCObject)classType.Invoke("ConvertTime", (Object)dateTime.getJCOInstance(), (Object)sourceTimeZone.getJCOInstance(), (Object)destinationTimeZone.getJCOInstance());
            return new DateTime(objConvertTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime ConvertTimeFromUtc(DateTime dateTime, TimeZoneInfo destinationTimeZone) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException {
        try {
            JCObject objConvertTimeFromUtc = (JCObject)classType.Invoke("ConvertTimeFromUtc", (Object)dateTime.getJCOInstance(), (Object)destinationTimeZone.getJCOInstance());
            return new DateTime(objConvertTimeFromUtc);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime ConvertTimeToUtc(DateTime dateTime) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException {
        try {
            JCObject objConvertTimeToUtc = (JCObject)classType.Invoke("ConvertTimeToUtc", (Object)dateTime.getJCOInstance());
            return new DateTime(objConvertTimeToUtc);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DateTime ConvertTimeToUtc(DateTime dateTime, TimeZoneInfo sourceTimeZone) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException {
        try {
            JCObject objConvertTimeToUtc = (JCObject)classType.Invoke("ConvertTimeToUtc", (Object)dateTime.getJCOInstance(), (Object)sourceTimeZone.getJCOInstance());
            return new DateTime(objConvertTimeToUtc);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(TimeZoneInfo other) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeZoneInfo FromSerializedString(java.lang.String source) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.serialization.SerializationException, system.InvalidTimeZoneException, system.OverflowException {
        try {
            JCObject objFromSerializedString = (JCObject)classType.Invoke("FromSerializedString", (Object)source);
            return new TimeZoneInfo(objFromSerializedString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HasSameRules(TimeZoneInfo other) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("HasSameRules", (Object)other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToSerializedString() throws Throwable, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OverflowException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.ArgumentException {
        try {
            return (java.lang.String)classInstance.Invoke("ToSerializedString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeZoneInfo CreateCustomTimeZone(java.lang.String id, TimeSpan baseUtcOffset, java.lang.String displayName, java.lang.String standardDisplayName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidTimeZoneException, system.OverflowException {
        try {
            JCObject objCreateCustomTimeZone = (JCObject)classType.Invoke("CreateCustomTimeZone", (Object)id, (Object)baseUtcOffset.getJCOInstance(), (Object)displayName, (Object)standardDisplayName);
            return new TimeZoneInfo(objCreateCustomTimeZone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeZoneInfo FindSystemTimeZoneById(java.lang.String id) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.OverflowException, system.TimeZoneNotFoundException, system.security.SecurityException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException {
        try {
            JCObject objFindSystemTimeZoneById = (JCObject)classType.Invoke("FindSystemTimeZoneById", (Object)id);
            return new TimeZoneInfo(objFindSystemTimeZoneById);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDisplayName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DisplayName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getStandardName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("StandardName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDaylightName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DaylightName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getBaseUtcOffset() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BaseUtcOffset");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsDaylightSavingTime() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsDaylightSavingTime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeZoneInfo getLocal() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Local");
            return new TimeZoneInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TimeZoneInfo getUtc() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Utc");
            return new TimeZoneInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}