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

package microsoft.jscript;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.FieldInfo;
import system.reflection.MemberInfo;
import system.reflection.BindingFlags;
import system.reflection.MethodInfo;
import microsoft.jscript.ScriptObject;
import system.reflection.PropertyInfo;
import system.reflection.Binder;
import system.reflection.ParameterModifier;
import system.globalization.CultureInfo;


/**
 * The base .NET class managing Microsoft.JScript.BooleanObject, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class BooleanObject extends NetObject  {
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.JScript";
    public static final String className = "Microsoft.JScript.BooleanObject";
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

    public BooleanObject(Object instance) throws Throwable {
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

    public static BooleanObject castFrom(IJCOBridgeReflected from) throws Throwable {
        return new BooleanObject(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public FieldInfo AddField(java.lang.String name) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objAddField = (JCObject)classInstance.Invoke("AddField", (Object)name);
            return new FieldInfo(objAddField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberInfo[] GetMember(java.lang.String name, BindingFlags bindingAttr) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.NotImplementedException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.MissingMethodException, microsoft.jscript.vsa.JSVsaException {
        try {
            ArrayList<MemberInfo> resultingArrayList = new ArrayList<MemberInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetMember", (Object)name, (Object)bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new MemberInfo(resultingObject));
            }
            MemberInfo[] resultingArray = new MemberInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetMemberValue2(java.lang.String name, NetObject value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("SetMemberValue2", (Object)name, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemberInfo[] GetMembers(BindingFlags bindingAttr) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotImplementedException {
        try {
            ArrayList<MemberInfo> resultingArrayList = new ArrayList<MemberInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetMembers", (Object)bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new MemberInfo(resultingObject));
            }
            MemberInfo[] resultingArray = new MemberInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldInfo GetField(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        try {
            JCObject objGetField = (JCObject)classInstance.Invoke("GetField", (Object)name, (Object)bindingAttr.getJCOInstance());
            return new FieldInfo(objGetField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo GetMethod(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        try {
            JCObject objGetMethod = (JCObject)classInstance.Invoke("GetMethod", (Object)name, (Object)bindingAttr.getJCOInstance());
            return new MethodInfo(objGetMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScriptObject GetParent() throws Throwable {
        try {
            JCObject objGetParent = (JCObject)classInstance.Invoke("GetParent");
            return new ScriptObject(objGetParent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyInfo GetProperty(java.lang.String name, BindingFlags bindingAttr) throws Throwable {
        try {
            JCObject objGetProperty = (JCObject)classInstance.Invoke("GetProperty", (Object)name, (Object)bindingAttr.getJCOInstance());
            return new PropertyInfo(objGetProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldInfo[] GetFields(BindingFlags bindingAttr) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException {
        try {
            ArrayList<FieldInfo> resultingArrayList = new ArrayList<FieldInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFields", (Object)bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FieldInfo(resultingObject));
            }
            FieldInfo[] resultingArray = new FieldInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo GetMethod(java.lang.String name, BindingFlags bindingAttr, Binder binder, NetType[] types, ParameterModifier[] modifiers) throws Throwable {
        try {
            JCObject objGetMethod = (JCObject)classInstance.Invoke("GetMethod", (Object)name, (Object)bindingAttr.getJCOInstance(), (Object)binder.getJCOInstance(), (Object)toObjectFromArray(types), (Object)toObjectFromArray(modifiers));
            return new MethodInfo(objGetMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo[] GetMethods(BindingFlags bindingAttr) throws Throwable {
        try {
            ArrayList<MethodInfo> resultingArrayList = new ArrayList<MethodInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetMethods", (Object)bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new MethodInfo(resultingObject));
            }
            MethodInfo[] resultingArray = new MethodInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyInfo GetProperty(java.lang.String name, BindingFlags bindingAttr, Binder binder, NetType returnType, NetType[] types, ParameterModifier[] modifiers) throws Throwable {
        try {
            JCObject objGetProperty = (JCObject)classInstance.Invoke("GetProperty", (Object)name, (Object)bindingAttr.getJCOInstance(), (Object)binder.getJCOInstance(), (Object)returnType.getJCOInstance(), (Object)toObjectFromArray(types), (Object)toObjectFromArray(modifiers));
            return new PropertyInfo(objGetProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyInfo[] GetProperties(BindingFlags bindingAttr) throws Throwable {
        try {
            ArrayList<PropertyInfo> resultingArrayList = new ArrayList<PropertyInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetProperties", (Object)bindingAttr.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new PropertyInfo(resultingObject));
            }
            PropertyInfo[] resultingArray = new PropertyInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InvokeMember(java.lang.String name, BindingFlags invokeAttr, Binder binder, NetObject target, NetObject[] args, ParameterModifier[] modifiers, CultureInfo locale, java.lang.String[] namedParameters) throws Throwable, system.reflection.TargetException, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, microsoft.jscript.JScriptException, system.OverflowException, system.IndexOutOfRangeException, system.ArithmeticException, system.reflection.AmbiguousMatchException, system.MissingMemberException, system.InvalidCastException, system.security.SecurityException, system.MissingFieldException {
        try {
            JCObject objInvokeMember = (JCObject)classInstance.Invoke("InvokeMember", (Object)name, (Object)invokeAttr.getJCOInstance(), (Object)binder.getJCOInstance(), (Object)target.getJCOInstance(), (Object)toObjectFromArray(args), (Object)toObjectFromArray(modifiers), (Object)locale.getJCOInstance(), (Object)namedParameters);
            return new NetObject(objInvokeMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public NetType getUnderlyingSystemType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UnderlyingSystemType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}