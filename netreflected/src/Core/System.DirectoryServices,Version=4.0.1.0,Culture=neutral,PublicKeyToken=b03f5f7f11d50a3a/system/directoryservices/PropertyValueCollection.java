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

package system.directoryservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.directoryservices.PropertyValueCollection;


/**
 * The base .NET class managing System.DirectoryServices.PropertyValueCollection, System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class PropertyValueCollection extends NetObject  {
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.DirectoryServices";
    public static final String className = "System.DirectoryServices.PropertyValueCollection";
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

    public PropertyValueCollection(Object instance) throws Throwable {
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

    public static PropertyValueCollection castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PropertyValueCollection(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public int Add(NetObject value) throws Throwable {
        try {
            return (int)classInstance.Invoke("Add", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddRange(NetObject[] value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddRange", (Object)toObjectFromArray(value));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddRange(PropertyValueCollection value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddRange", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(NetObject value) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(NetObject[] array, int index) throws Throwable {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(NetObject value) throws Throwable {
        try {
            return (int)classInstance.Invoke("IndexOf", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Insert(int index, NetObject value) throws Throwable {
        try {
            classInstance.Invoke("Insert", index, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(NetObject value) throws Throwable {
        try {
            classInstance.Invoke("Remove", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAt(int index) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getPropertyName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PropertyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Value");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValue(NetObject Value) throws Throwable {
        try {
            classInstance.Set("Value", (Object)Value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCapacity() throws Throwable {
        try {
            return (int)classInstance.Get("Capacity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCapacity(int Capacity) throws Throwable {
        try {
            classInstance.Set("Capacity", Capacity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}