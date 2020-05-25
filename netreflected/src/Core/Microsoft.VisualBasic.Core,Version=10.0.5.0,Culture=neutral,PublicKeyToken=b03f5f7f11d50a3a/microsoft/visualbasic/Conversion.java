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

package microsoft.visualbasic;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Single;
import system.Decimal;
import system.SByte;
import system.UInt16;
import system.UInt32;
import system.UInt64;


/**
 * The base .NET class managing Microsoft.VisualBasic.Conversion, Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Conversion extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic.Core";
    public static final String className = "Microsoft.VisualBasic.Conversion";
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

    public Conversion(Object instance) throws Throwable {
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

    public static Conversion castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Conversion(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static java.lang.String ErrorToString() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.NotSupportedException {
        try {
            return (java.lang.String)classType.Invoke("ErrorToString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ErrorToString(int ErrorNumber) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (java.lang.String)classType.Invoke("ErrorToString", ErrorNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short Fix(short Number) throws Throwable {
        try {
            return (short)classType.Invoke("Fix", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Fix(int Number) throws Throwable {
        try {
            return (int)classType.Invoke("Fix", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Fix(long Number) throws Throwable {
        try {
            return (long)classType.Invoke("Fix", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Fix(double Number) throws Throwable {
        try {
            return (double)classType.Invoke("Fix", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Fix(Single Number) throws Throwable {
        try {
            JCObject objFix = (JCObject)classType.Invoke("Fix", (Object)Number.getJCOInstance());
            return new Single(objFix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Fix(Decimal Number) throws Throwable, system.PlatformNotSupportedException {
        try {
            JCObject objFix = (JCObject)classType.Invoke("Fix", (Object)Number.getJCOInstance());
            return new Decimal(objFix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Fix(NetObject Number) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.InvalidCastException {
        try {
            JCObject objFix = (JCObject)classType.Invoke("Fix", (Object)Number.getJCOInstance());
            return new NetObject(objFix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short Int(short Number) throws Throwable {
        try {
            return (short)classType.Invoke("Int", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Int(int Number) throws Throwable {
        try {
            return (int)classType.Invoke("Int", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Int(long Number) throws Throwable {
        try {
            return (long)classType.Invoke("Int", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Int(double Number) throws Throwable {
        try {
            return (double)classType.Invoke("Int", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Int(Single Number) throws Throwable {
        try {
            JCObject objInt = (JCObject)classType.Invoke("Int", (Object)Number.getJCOInstance());
            return new Single(objInt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Int(Decimal Number) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException {
        try {
            JCObject objInt = (JCObject)classType.Invoke("Int", (Object)Number.getJCOInstance());
            return new Decimal(objInt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Int(NetObject Number) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.IndexOutOfRangeException, system.FormatException, system.OverflowException, system.InvalidCastException {
        try {
            JCObject objInt = (JCObject)classType.Invoke("Int", (Object)Number.getJCOInstance());
            return new NetObject(objInt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Hex(SByte Number) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (java.lang.String)classType.Invoke("Hex", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Hex(byte Number) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            return (java.lang.String)classType.Invoke("Hex", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Hex(short Number) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (java.lang.String)classType.Invoke("Hex", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Hex(UInt16 Number) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            return (java.lang.String)classType.Invoke("Hex", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Hex(int Number) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            return (java.lang.String)classType.Invoke("Hex", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Hex(UInt32 Number) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            return (java.lang.String)classType.Invoke("Hex", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Hex(long Number) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            return (java.lang.String)classType.Invoke("Hex", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Hex(UInt64 Number) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            return (java.lang.String)classType.Invoke("Hex", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Hex(NetObject Number) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException, system.InvalidCastException, system.NotSupportedException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("Hex", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Oct(SByte Number) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OverflowException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("Oct", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Oct(byte Number) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OverflowException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("Oct", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Oct(short Number) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OverflowException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("Oct", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Oct(UInt16 Number) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OverflowException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("Oct", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Oct(int Number) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OverflowException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("Oct", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Oct(UInt32 Number) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OverflowException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("Oct", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Oct(long Number) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OverflowException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("Oct", Number);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Oct(UInt64 Number) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OverflowException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("Oct", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Oct(NetObject Number) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.OverflowException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.InvalidCastException, system.NotSupportedException {
        try {
            return (java.lang.String)classType.Invoke("Oct", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Str(NetObject Number) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidCastException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.ArrayTypeMismatchException, system.OverflowException, system.NotSupportedException {
        try {
            return (java.lang.String)classType.Invoke("Str", (Object)Number.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Val(java.lang.String InputStr) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (double)classType.Invoke("Val", (Object)InputStr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Val(char Expression) throws Throwable {
        try {
            return (int)classType.Invoke("Val", Expression);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Val(NetObject Expression) throws Throwable, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.InvalidCastException, system.NotSupportedException {
        try {
            return (double)classType.Invoke("Val", (Object)Expression.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CTypeDynamic(NetObject Expression, NetType TargetType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.FormatException, system.OverflowException, system.InvalidCastException, system.NotSupportedException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NullReferenceException, system.MissingMemberException {
        try {
            JCObject objCTypeDynamic = (JCObject)classType.Invoke("CTypeDynamic", (Object)Expression.getJCOInstance(), (Object)TargetType.getJCOInstance());
            return new NetObject(objCTypeDynamic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}