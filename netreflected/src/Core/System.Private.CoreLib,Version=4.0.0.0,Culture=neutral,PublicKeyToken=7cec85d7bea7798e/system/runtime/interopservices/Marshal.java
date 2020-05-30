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

package system.runtime.interopservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Guid;
import system.Single;
import system.reflection.MethodInfo;


/**
 * The base .NET class managing System.Runtime.InteropServices.Marshal, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link NetObject}.
 */
public class Marshal extends NetObject  {
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
	public static final String assemblyShortName = "System.Private.CoreLib";
    public static final String className = "System.Runtime.InteropServices.Marshal";
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

    public Marshal(Object instance) throws Throwable {
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

    public static Marshal castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Marshal(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static int GetLastWin32Error() throws Throwable {
        try {
            return (int)classType.Invoke("GetLastWin32Error");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int SizeOf(NetType t) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (int)classType.Invoke("SizeOf", (Object)t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetHRForLastWin32Error() throws Throwable {
        try {
            return (int)classType.Invoke("GetHRForLastWin32Error");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ThrowExceptionForHR(int errorCode) throws Throwable {
        try {
            classType.Invoke("ThrowExceptionForHR", errorCode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ReleaseComObject(NetObject o) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NullReferenceException {
        try {
            return (int)classType.Invoke("ReleaseComObject", (Object)o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetHRForException(NetException e) throws Throwable {
        try {
            return (int)classType.Invoke("GetHRForException", (Object)e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetStartComSlot(NetType t) throws Throwable {
        try {
            return (int)classType.Invoke("GetStartComSlot", (Object)t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsComObject(NetObject o) throws Throwable {
        try {
            return (boolean)classType.Invoke("IsComObject", (Object)o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int FinalReleaseComObject(NetObject o) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (int)classType.Invoke("FinalReleaseComObject", (Object)o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetException GetExceptionForHR(int errorCode) throws Throwable {
        try {
            JCObject objGetExceptionForHR = (JCObject)classType.Invoke("GetExceptionForHR", errorCode);
            return new NetException(objGetExceptionForHR);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Guid GenerateGuidForType(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGenerateGuidForType = (JCObject)classType.Invoke("GenerateGuidForType", (Object)type.getJCOInstance());
            return new Guid(objGenerateGuidForType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GenerateProgIdForType(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.reflection.AmbiguousMatchException {
        try {
            return (java.lang.String)classType.Invoke("GenerateProgIdForType", (Object)type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject BindToMoniker(java.lang.String monikerName) throws Throwable {
        try {
            JCObject objBindToMoniker = (JCObject)classType.Invoke("BindToMoniker", (Object)monikerName);
            return new NetObject(objBindToMoniker);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ChangeWrapperHandleStrength(NetObject otp, boolean fIsWeak) throws Throwable {
        try {
            classType.Invoke("ChangeWrapperHandleStrength", (Object)otp.getJCOInstance(), fIsWeak);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int SizeOf(NetObject structure) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (int)classType.Invoke("SizeOf", (Object)structure.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Prelink(MethodInfo m) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classType.Invoke("Prelink", (Object)m.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void PrelinkAll(NetType c) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classType.Invoke("PrelinkAll", (Object)c.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte ReadByte(NetObject ptr, int ofs) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        try {
            return (byte)classType.Invoke("ReadByte", (Object)ptr.getJCOInstance(), ofs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short ReadInt16(NetObject ptr, int ofs) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        try {
            return (short)classType.Invoke("ReadInt16", (Object)ptr.getJCOInstance(), ofs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ReadInt32(NetObject ptr, int ofs) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        try {
            return (int)classType.Invoke("ReadInt32", (Object)ptr.getJCOInstance(), ofs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long ReadInt64(NetObject ptr, int ofs) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException {
        try {
            return (long)classType.Invoke("ReadInt64", (Object)ptr.getJCOInstance(), ofs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteByte(NetObject ptr, int ofs, byte val) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException, system.ArrayTypeMismatchException {
        try {
            classType.Invoke("WriteByte", (Object)ptr.getJCOInstance(), ofs, val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteInt16(NetObject ptr, int ofs, short val) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        try {
            classType.Invoke("WriteInt16", (Object)ptr.getJCOInstance(), ofs, val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteInt32(NetObject ptr, int ofs, int val) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        try {
            classType.Invoke("WriteInt32", (Object)ptr.getJCOInstance(), ofs, val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteInt64(NetObject ptr, int ofs, long val) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.AccessViolationException, system.OutOfMemoryException, system.runtime.interopservices.MarshalDirectiveException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException {
        try {
            classType.Invoke("WriteInt64", (Object)ptr.getJCOInstance(), ofs, val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetExceptionCode() throws Throwable {
        try {
            return (int)classType.Invoke("GetExceptionCode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetTypeFromCLSID(Guid clsid) throws Throwable {
        try {
            JCObject objGetTypeFromCLSID = (JCObject)classType.Invoke("GetTypeFromCLSID", (Object)clsid.getJCOInstance());
            return new NetType(objGetTypeFromCLSID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean AreComObjectsAvailableForCleanup() throws Throwable {
        try {
            return (boolean)classType.Invoke("AreComObjectsAvailableForCleanup");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetComObjectData(NetObject obj, NetObject key) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException {
        try {
            JCObject objGetComObjectData = (JCObject)classType.Invoke("GetComObjectData", (Object)obj.getJCOInstance(), (Object)key.getJCOInstance());
            return new NetObject(objGetComObjectData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SetComObjectData(NetObject obj, NetObject key, NetObject data) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException {
        try {
            return (boolean)classType.Invoke("SetComObjectData", (Object)obj.getJCOInstance(), (Object)key.getJCOInstance(), (Object)data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CreateWrapperOfType(NetObject o, NetType t) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException {
        try {
            JCObject objCreateWrapperOfType = (JCObject)classType.Invoke("CreateWrapperOfType", (Object)o.getJCOInstance(), (Object)t.getJCOInstance());
            return new NetObject(objCreateWrapperOfType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsTypeVisibleFromCom(NetType t) throws Throwable {
        try {
            return (boolean)classType.Invoke("IsTypeVisibleFromCom", (Object)t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int GetEndComSlot(NetType t) throws Throwable {
        try {
            return (int)classType.Invoke("GetEndComSlot", (Object)t.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}