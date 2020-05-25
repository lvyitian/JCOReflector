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

package system.runtime.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.TypeCode;
import system.SByte;
import system.UInt16;
import system.UInt32;
import system.UInt64;
import system.Single;
import system.Decimal;
import system.DateTime;


/**
 * The base .NET class managing System.Runtime.Serialization.FormatterConverter, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class FormatterConverter extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Runtime.Serialization.FormatterConverter";
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

    public FormatterConverter(Object instance) throws Throwable {
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

    public static FormatterConverter castFrom(IJCOBridgeReflected from) throws Throwable {
        return new FormatterConverter(from.getJCOInstance());
    }

    // Constructors section
    
    
    public FormatterConverter() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public NetObject Convert(NetObject value, NetType type) throws Throwable, system.ArgumentNullException, system.InvalidCastException {
        try {
            JCObject objConvert = (JCObject)classInstance.Invoke("Convert", (Object)value.getJCOInstance(), (Object)type.getJCOInstance());
            return new NetObject(objConvert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Convert(NetObject value, TypeCode typeCode) throws Throwable, system.ArgumentNullException, system.InvalidCastException, system.ArgumentException {
        try {
            JCObject objConvert = (JCObject)classInstance.Invoke("Convert", (Object)value.getJCOInstance(), (Object)typeCode.getJCOInstance());
            return new NetObject(objConvert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ToBoolean(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("ToBoolean", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char ToChar(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            return (char)classInstance.Invoke("ToChar", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SByte ToSByte(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objToSByte = (JCObject)classInstance.Invoke("ToSByte", (Object)value.getJCOInstance());
            return new SByte(objToSByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte ToByte(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            return (byte)classInstance.Invoke("ToByte", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short ToInt16(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            return (short)classInstance.Invoke("ToInt16", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 ToUInt16(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objToUInt16 = (JCObject)classInstance.Invoke("ToUInt16", (Object)value.getJCOInstance());
            return new UInt16(objToUInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ToInt32(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            return (int)classInstance.Invoke("ToInt32", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt32 ToUInt32(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objToUInt32 = (JCObject)classInstance.Invoke("ToUInt32", (Object)value.getJCOInstance());
            return new UInt32(objToUInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long ToInt64(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            return (long)classInstance.Invoke("ToInt64", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 ToUInt64(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objToUInt64 = (JCObject)classInstance.Invoke("ToUInt64", (Object)value.getJCOInstance());
            return new UInt64(objToUInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single ToSingle(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objToSingle = (JCObject)classInstance.Invoke("ToSingle", (Object)value.getJCOInstance());
            return new Single(objToSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double ToDouble(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            return (double)classInstance.Invoke("ToDouble", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal ToDecimal(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objToDecimal = (JCObject)classInstance.Invoke("ToDecimal", (Object)value.getJCOInstance());
            return new Decimal(objToDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime ToDateTime(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objToDateTime = (JCObject)classInstance.Invoke("ToDateTime", (Object)value.getJCOInstance());
            return new DateTime(objToDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(NetObject value) throws Throwable, system.ArgumentNullException {
        try {
            return (java.lang.String)classInstance.Invoke("ToString", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}