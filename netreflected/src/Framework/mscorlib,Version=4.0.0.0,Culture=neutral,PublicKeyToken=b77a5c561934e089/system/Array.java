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
import system.Array;


/**
 * The base .NET class managing System.Array, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class Array extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Array";
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

    public Array(Object instance) throws Throwable {
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

    public static Array castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Array(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static Array CreateInstance(NetType elementType, int length) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException {
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", (Object)elementType.getJCOInstance(), length);
            return new Array(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Array CreateInstance(NetType elementType, int length1, int length2, int length3) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException {
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", (Object)elementType.getJCOInstance(), length1, length2, length3);
            return new Array(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Array CreateInstance(NetType elementType, int... lengths) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", (Object)elementType.getJCOInstance(), lengths);
            return new Array(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Array CreateInstance(NetType elementType, long... lengths) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException {
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", (Object)elementType.getJCOInstance(), lengths);
            return new Array(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Array CreateInstance(NetType elementType, int[] lengths, int[] lowerBounds) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", (Object)elementType.getJCOInstance(), lengths, lowerBounds);
            return new Array(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Copy(Array sourceArray, Array destinationArray, int length) throws Throwable, system.ArgumentNullException {
        try {
            classType.Invoke("Copy", (Object)sourceArray.getJCOInstance(), (Object)destinationArray.getJCOInstance(), length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Copy(Array sourceArray, int sourceIndex, Array destinationArray, int destinationIndex, int length) throws Throwable {
        try {
            classType.Invoke("Copy", (Object)sourceArray.getJCOInstance(), sourceIndex, (Object)destinationArray.getJCOInstance(), destinationIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ConstrainedCopy(Array sourceArray, int sourceIndex, Array destinationArray, int destinationIndex, int length) throws Throwable {
        try {
            classType.Invoke("ConstrainedCopy", (Object)sourceArray.getJCOInstance(), sourceIndex, (Object)destinationArray.getJCOInstance(), destinationIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Copy(Array sourceArray, Array destinationArray, long length) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            classType.Invoke("Copy", (Object)sourceArray.getJCOInstance(), (Object)destinationArray.getJCOInstance(), length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Copy(Array sourceArray, long sourceIndex, Array destinationArray, long destinationIndex, long length) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classType.Invoke("Copy", (Object)sourceArray.getJCOInstance(), sourceIndex, (Object)destinationArray.getJCOInstance(), destinationIndex, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(int... indices) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", indices);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(int index) throws Throwable, system.ArgumentException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", index);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(int index1, int index2) throws Throwable, system.ArgumentException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", index1, index2);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(int index1, int index2, int index3) throws Throwable, system.ArgumentException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", index1, index2, index3);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(long index) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", index);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(long index1, long index2) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", index1, index2);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(long index1, long index2, long index3) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", index1, index2, index3);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(long... indices) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", indices);
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject value, int index) throws Throwable, system.ArgumentException {
        try {
            classInstance.Invoke("SetValue", (Object)value.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject value, int index1, int index2) throws Throwable, system.ArgumentException {
        try {
            classInstance.Invoke("SetValue", (Object)value.getJCOInstance(), index1, index2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject value, int index1, int index2, int index3) throws Throwable, system.ArgumentException {
        try {
            classInstance.Invoke("SetValue", (Object)value.getJCOInstance(), index1, index2, index3);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject value, int... indices) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            classInstance.Invoke("SetValue", (Object)value.getJCOInstance(), indices);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject value, long index) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            classInstance.Invoke("SetValue", (Object)value.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject value, long index1, long index2) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            classInstance.Invoke("SetValue", (Object)value.getJCOInstance(), index1, index2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject value, long index1, long index2, long index3) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            classInstance.Invoke("SetValue", (Object)value.getJCOInstance(), index1, index2, index3);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject value, long... indices) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("SetValue", (Object)value.getJCOInstance(), indices);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetLongLength(int dimension) throws Throwable {
        try {
            return (long)classInstance.Invoke("GetLongLength", dimension);
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

    public static int BinarySearch(Array array, NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.RankException, system.InvalidOperationException {
        try {
            return (int)classType.Invoke("BinarySearch", (Object)array.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int BinarySearch(Array array, int index, int length, NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.RankException, system.InvalidOperationException {
        try {
            return (int)classType.Invoke("BinarySearch", (Object)array.getJCOInstance(), index, length, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Array array, int index) throws Throwable, system.ArgumentException {
        try {
            classInstance.Invoke("CopyTo", (Object)array.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Array array, long index) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            classInstance.Invoke("CopyTo", (Object)array.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int IndexOf(Array array, NetObject value) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            return (int)classType.Invoke("IndexOf", (Object)array.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int IndexOf(Array array, NetObject value, int startIndex) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            return (int)classType.Invoke("IndexOf", (Object)array.getJCOInstance(), (Object)value.getJCOInstance(), startIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int IndexOf(Array array, NetObject value, int startIndex, int count) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            return (int)classType.Invoke("IndexOf", (Object)array.getJCOInstance(), (Object)value.getJCOInstance(), startIndex, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int LastIndexOf(Array array, NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.RankException, system.ArgumentException {
        try {
            return (int)classType.Invoke("LastIndexOf", (Object)array.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int LastIndexOf(Array array, NetObject value, int startIndex) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.RankException, system.ArgumentException {
        try {
            return (int)classType.Invoke("LastIndexOf", (Object)array.getJCOInstance(), (Object)value.getJCOInstance(), startIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int LastIndexOf(Array array, NetObject value, int startIndex, int count) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.RankException, system.ArgumentException {
        try {
            return (int)classType.Invoke("LastIndexOf", (Object)array.getJCOInstance(), (Object)value.getJCOInstance(), startIndex, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Reverse(Array array) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.RankException {
        try {
            classType.Invoke("Reverse", (Object)array.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Sort(Array array) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException {
        try {
            classType.Invoke("Sort", (Object)array.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Sort(Array keys, Array items) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException {
        try {
            classType.Invoke("Sort", (Object)keys.getJCOInstance(), (Object)items.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Sort(Array array, int index, int length) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException {
        try {
            classType.Invoke("Sort", (Object)array.getJCOInstance(), index, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Sort(Array keys, Array items, int index, int length) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException {
        try {
            classType.Invoke("Sort", (Object)keys.getJCOInstance(), (Object)items.getJCOInstance(), index, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Array CreateInstance(NetType elementType, int length1, int length2) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException {
        try {
            JCObject objCreateInstance = (JCObject)classType.Invoke("CreateInstance", (Object)elementType.getJCOInstance(), length1, length2);
            return new Array(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize() throws Throwable {
        try {
            classInstance.Invoke("Initialize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Clear(Array array, int index, int length) throws Throwable {
        try {
            classType.Invoke("Clear", (Object)array.getJCOInstance(), index, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetLength(int dimension) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetLength", dimension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetUpperBound(int dimension) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetUpperBound", dimension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetLowerBound(int dimension) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetLowerBound", dimension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Reverse(Array array, int index, int length) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.RankException {
        try {
            classType.Invoke("Reverse", (Object)array.getJCOInstance(), index, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getLength() throws Throwable {
        try {
            return (int)classInstance.Get("Length");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getLongLength() throws Throwable {
        try {
            return (long)classInstance.Get("LongLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getRank() throws Throwable {
        try {
            return (int)classInstance.Get("Rank");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getSyncRoot() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SyncRoot");
            return new NetObject(val);
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

    public boolean getIsFixedSize() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFixedSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSynchronized() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSynchronized");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}