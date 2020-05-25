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

package system.reflection;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.PropertyInfo;
import system.reflection.EventInfo;
import system.reflection.MethodInfo;
import system.reflection.FieldInfo;
import system.reflection.InterfaceMapping;
import system.reflection.TypeInfo;


/**
 * The base .NET class managing System.Reflection.RuntimeReflectionExtensions, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class RuntimeReflectionExtensions extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Reflection.RuntimeReflectionExtensions";
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

    public RuntimeReflectionExtensions(Object instance) throws Throwable {
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

    public static RuntimeReflectionExtensions castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RuntimeReflectionExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static PropertyInfo GetRuntimeProperty(NetType type, java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            JCObject objGetRuntimeProperty = (JCObject)classType.Invoke("GetRuntimeProperty", (Object)type.getJCOInstance(), (Object)name);
            return new PropertyInfo(objGetRuntimeProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static EventInfo GetRuntimeEvent(NetType type, java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            JCObject objGetRuntimeEvent = (JCObject)classType.Invoke("GetRuntimeEvent", (Object)type.getJCOInstance(), (Object)name);
            return new EventInfo(objGetRuntimeEvent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MethodInfo GetRuntimeMethod(NetType type, java.lang.String name, NetType[] parameters) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            JCObject objGetRuntimeMethod = (JCObject)classType.Invoke("GetRuntimeMethod", (Object)type.getJCOInstance(), (Object)name, (Object)toObjectFromArray(parameters));
            return new MethodInfo(objGetRuntimeMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FieldInfo GetRuntimeField(NetType type, java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            JCObject objGetRuntimeField = (JCObject)classType.Invoke("GetRuntimeField", (Object)type.getJCOInstance(), (Object)name);
            return new FieldInfo(objGetRuntimeField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MethodInfo GetRuntimeBaseDefinition(MethodInfo method) throws Throwable, system.ArgumentNullException, system.ArgumentException {
        try {
            JCObject objGetRuntimeBaseDefinition = (JCObject)classType.Invoke("GetRuntimeBaseDefinition", (Object)method.getJCOInstance());
            return new MethodInfo(objGetRuntimeBaseDefinition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static InterfaceMapping GetRuntimeInterfaceMap(TypeInfo typeInfo, NetType interfaceType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException {
        try {
            JCObject objGetRuntimeInterfaceMap = (JCObject)classType.Invoke("GetRuntimeInterfaceMap", (Object)typeInfo.getJCOInstance(), (Object)interfaceType.getJCOInstance());
            return new InterfaceMapping(objGetRuntimeInterfaceMap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}