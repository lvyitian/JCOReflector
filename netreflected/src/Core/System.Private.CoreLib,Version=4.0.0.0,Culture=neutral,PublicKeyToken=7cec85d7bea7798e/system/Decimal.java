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
import system.UInt32;
import system.UInt64;
import system.Single;
import system.TypeCode;
import system.Decimal;
import system.globalization.NumberStyles;
import system.MidpointRounding;
import system.SByte;
import system.UInt16;


/**
 * The base .NET class managing System.Decimal, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link NetObject}.
 */
public class Decimal extends NetObject  {
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
	public static final String assemblyShortName = "System.Private.CoreLib";
    public static final String className = "System.Decimal";
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

    public Decimal(Object instance) throws Throwable {
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

    public static Decimal castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Decimal(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Decimal(int value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal(UInt32 value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal(long value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal(UInt64 value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal(Single value) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal(double value) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal(int[] bits) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(bits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal(int lo, int mid, int hi, boolean isNegative, byte scale) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(lo, mid, hi, isNegative, scale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public TypeCode GetTypeCode() throws Throwable {
        try {
            JCObject objGetTypeCode = (JCObject)classInstance.Invoke("GetTypeCode");
            return new TypeCode(objGetTypeCode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal FromOACurrency(long cy) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objFromOACurrency = (JCObject)classType.Invoke("FromOACurrency", cy);
            return new Decimal(objFromOACurrency);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long ToOACurrency(Decimal value) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OverflowException {
        try {
            return (long)classType.Invoke("ToOACurrency", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Add(Decimal d1, Decimal d2) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", (Object)d1.getJCOInstance(), (Object)d2.getJCOInstance());
            return new Decimal(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Ceiling(Decimal d) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objCeiling = (JCObject)classType.Invoke("Ceiling", (Object)d.getJCOInstance());
            return new Decimal(objCeiling);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Compare(Decimal d1, Decimal d2) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException {
        try {
            return (int)classType.Invoke("Compare", (Object)d1.getJCOInstance(), (Object)d2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(NetObject value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (int)classInstance.Invoke("CompareTo", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareTo(Decimal value) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException {
        try {
            return (int)classInstance.Invoke("CompareTo", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Divide(Decimal d1, Decimal d2) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.DivideByZeroException {
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", (Object)d1.getJCOInstance(), (Object)d2.getJCOInstance());
            return new Decimal(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(Decimal value) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Equals(Decimal d1, Decimal d2) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException {
        try {
            return (boolean)classType.Invoke("Equals", (Object)d1.getJCOInstance(), (Object)d2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Floor(Decimal d) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objFloor = (JCObject)classType.Invoke("Floor", (Object)d.getJCOInstance());
            return new Decimal(objFloor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(java.lang.String format) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.TypeInitializationException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.FormatException {
        try {
            return (java.lang.String)classInstance.Invoke("ToString", (Object)format);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Parse(java.lang.String s) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.TypeInitializationException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)s);
            return new Decimal(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Parse(java.lang.String s, NumberStyles style) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.TypeInitializationException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)s, (Object)style.getJCOInstance());
            return new Decimal(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int[] GetBits(Decimal d) throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetBits", (Object)d.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            int[] resultingArray = new int[resultingArrayList.size()];
            for(int indexGetBits = 0; indexGetBits < resultingArrayList.size(); indexGetBits++ ) {
				resultingArray[indexGetBits] = (int)resultingArrayList.get(indexGetBits);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Remainder(Decimal d1, Decimal d2) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.DivideByZeroException {
        try {
            JCObject objRemainder = (JCObject)classType.Invoke("Remainder", (Object)d1.getJCOInstance(), (Object)d2.getJCOInstance());
            return new Decimal(objRemainder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Multiply(Decimal d1, Decimal d2) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", (Object)d1.getJCOInstance(), (Object)d2.getJCOInstance());
            return new Decimal(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Negate(Decimal d) throws Throwable {
        try {
            JCObject objNegate = (JCObject)classType.Invoke("Negate", (Object)d.getJCOInstance());
            return new Decimal(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Round(Decimal d) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objRound = (JCObject)classType.Invoke("Round", (Object)d.getJCOInstance());
            return new Decimal(objRound);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Round(Decimal d, int decimals) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objRound = (JCObject)classType.Invoke("Round", (Object)d.getJCOInstance(), decimals);
            return new Decimal(objRound);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Round(Decimal d, MidpointRounding mode) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objRound = (JCObject)classType.Invoke("Round", (Object)d.getJCOInstance(), (Object)mode.getJCOInstance());
            return new Decimal(objRound);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Round(Decimal d, int decimals, MidpointRounding mode) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objRound = (JCObject)classType.Invoke("Round", (Object)d.getJCOInstance(), decimals, (Object)mode.getJCOInstance());
            return new Decimal(objRound);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Subtract(Decimal d1, Decimal d2) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", (Object)d1.getJCOInstance(), (Object)d2.getJCOInstance());
            return new Decimal(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte ToByte(Decimal value) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.OverflowException {
        try {
            return (byte)classType.Invoke("ToByte", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SByte ToSByte(Decimal value) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.OverflowException {
        try {
            JCObject objToSByte = (JCObject)classType.Invoke("ToSByte", (Object)value.getJCOInstance());
            return new SByte(objToSByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short ToInt16(Decimal value) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.OverflowException {
        try {
            return (short)classType.Invoke("ToInt16", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double ToDouble(Decimal d) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException {
        try {
            return (double)classType.Invoke("ToDouble", (Object)d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ToInt32(Decimal d) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.OverflowException {
        try {
            return (int)classType.Invoke("ToInt32", (Object)d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long ToInt64(Decimal d) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.OverflowException {
        try {
            return (long)classType.Invoke("ToInt64", (Object)d.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt16 ToUInt16(Decimal value) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.OverflowException {
        try {
            JCObject objToUInt16 = (JCObject)classType.Invoke("ToUInt16", (Object)value.getJCOInstance());
            return new UInt16(objToUInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 ToUInt32(Decimal d) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.OverflowException {
        try {
            JCObject objToUInt32 = (JCObject)classType.Invoke("ToUInt32", (Object)d.getJCOInstance());
            return new UInt32(objToUInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 ToUInt64(Decimal d) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.OverflowException {
        try {
            JCObject objToUInt64 = (JCObject)classType.Invoke("ToUInt64", (Object)d.getJCOInstance());
            return new UInt64(objToUInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single ToSingle(Decimal d) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException {
        try {
            JCObject objToSingle = (JCObject)classType.Invoke("ToSingle", (Object)d.getJCOInstance());
            return new Single(objToSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Truncate(Decimal d) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException {
        try {
            JCObject objTruncate = (JCObject)classType.Invoke("Truncate", (Object)d.getJCOInstance());
            return new Decimal(objTruncate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}