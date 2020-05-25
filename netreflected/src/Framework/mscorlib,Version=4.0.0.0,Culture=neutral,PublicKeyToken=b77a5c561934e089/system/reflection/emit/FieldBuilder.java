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

package system.reflection.emit;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.globalization.CultureInfo;
import system.reflection.emit.FieldToken;
import system.reflection.emit.UnmanagedMarshal;
import system.reflection.ConstructorInfo;
import system.reflection.emit.CustomAttributeBuilder;
import system.TypedReference;
import system.reflection.Module;
import system.RuntimeFieldHandle;
import system.reflection.FieldAttributes;
import system.reflection.MemberTypes;


/**
 * The base .NET class managing System.Reflection.Emit.FieldBuilder, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class FieldBuilder extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Reflection.Emit.FieldBuilder";
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

    public FieldBuilder(Object instance) throws Throwable {
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

    public static FieldBuilder castFrom(IJCOBridgeReflected from) throws Throwable {
        return new FieldBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public NetObject GetValue(NetObject obj) throws Throwable, system.NotSupportedException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)obj.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject obj, NetObject val, BindingFlags invokeAttr, Binder binder, CultureInfo culture) throws Throwable, system.NotSupportedException {
        try {
            classInstance.Invoke("SetValue", (Object)obj.getJCOInstance(), (Object)val.getJCOInstance(), (Object)invokeAttr.getJCOInstance(), (Object)binder.getJCOInstance(), (Object)culture.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(boolean inherit) throws Throwable, system.NotSupportedException {
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", inherit);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(NetType attributeType, boolean inherit) throws Throwable, system.NotSupportedException {
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", (Object)attributeType.getJCOInstance(), inherit);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDefined(NetType attributeType, boolean inherit) throws Throwable, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("IsDefined", (Object)attributeType.getJCOInstance(), inherit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldToken GetToken() throws Throwable {
        try {
            JCObject objGetToken = (JCObject)classInstance.Invoke("GetToken");
            return new FieldToken(objGetToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOffset(int iOffset) throws Throwable, system.InvalidOperationException {
        try {
            classInstance.Invoke("SetOffset", iOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetMarshal(UnmanagedMarshal unmanagedMarshal) throws Throwable, system.ArgumentNullException, system.InvalidOperationException {
        try {
            classInstance.Invoke("SetMarshal", (Object)unmanagedMarshal.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetConstant(NetObject defaultValue) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetConstant", (Object)defaultValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(ConstructorInfo con, byte[] binaryAttribute) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotImplementedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.MissingMethodException, system.FormatException {
        try {
            classInstance.Invoke("SetCustomAttribute", (Object)con.getJCOInstance(), binaryAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(CustomAttributeBuilder customBuilder) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.NotImplementedException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.MissingMethodException, system.FormatException {
        try {
            classInstance.Invoke("SetCustomAttribute", (Object)customBuilder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetRequiredCustomModifiers() throws Throwable, system.NotImplementedException {
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetRequiredCustomModifiers");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetOptionalCustomModifiers() throws Throwable, system.NotImplementedException {
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetOptionalCustomModifiers");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValueDirect(TypedReference obj, NetObject value) throws Throwable, system.NotSupportedException {
        try {
            classInstance.Invoke("SetValueDirect", (Object)obj.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValueDirect(TypedReference obj) throws Throwable, system.NotSupportedException {
        try {
            JCObject objGetValueDirect = (JCObject)classInstance.Invoke("GetValueDirect", (Object)obj.getJCOInstance());
            return new NetObject(objGetValueDirect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetRawConstantValue() throws Throwable, system.NotSupportedException {
        try {
            JCObject objGetRawConstantValue = (JCObject)classInstance.Invoke("GetRawConstantValue");
            return new NetObject(objGetRawConstantValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(NetObject obj, NetObject value) throws Throwable {
        try {
            classInstance.Invoke("SetValue", (Object)obj.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Module getModule() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Module");
            return new Module(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDeclaringType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DeclaringType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getReflectedType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReflectedType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getFieldType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FieldType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RuntimeFieldHandle getFieldHandle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FieldHandle");
            return new RuntimeFieldHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldAttributes getAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new FieldAttributes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberTypes getMemberType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MemberType");
            return new MemberTypes(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPublic() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsPublic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPrivate() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsPrivate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFamily() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFamily");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsAssembly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsAssembly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFamilyAndAssembly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFamilyAndAssembly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFamilyOrAssembly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFamilyOrAssembly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsStatic() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsStatic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInitOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsInitOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsLiteral() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsLiteral");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNotSerialized() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsNotSerialized");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSpecialName() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSpecialName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPinvokeImpl() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsPinvokeImpl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSecurityCritical() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSecurityCritical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSecuritySafeCritical() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSecuritySafeCritical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSecurityTransparent() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSecurityTransparent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMetadataToken() throws Throwable {
        try {
            return (int)classInstance.Get("MetadataToken");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}