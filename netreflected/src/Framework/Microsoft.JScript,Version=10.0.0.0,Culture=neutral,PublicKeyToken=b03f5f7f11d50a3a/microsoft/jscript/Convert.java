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
import microsoft.jscript.AST;
import system.Single;
import system.TypeCode;
import microsoft.jscript.vsa.VsaEngine;
import system.RuntimeTypeHandle;


/**
 * The base .NET class managing Microsoft.JScript.Convert, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Convert extends NetObject  {
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.JScript";
    public static final String className = "Microsoft.JScript.Convert";
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

    public Convert(Object instance) throws Throwable {
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

    public static Convert castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Convert(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Convert() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static boolean IsBadIndex(AST ast) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidCastException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NullReferenceException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.FormatException, system.OverflowException, system.IndexOutOfRangeException, system.security.SecurityException, system.reflection.TargetInvocationException, microsoft.jscript.vsa.JSVsaException, microsoft.jscript.EndOfFile {
        try {
            return (boolean)classType.Invoke("IsBadIndex", (Object)ast.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double CheckIfDoubleIsInteger(double d) throws Throwable, microsoft.jscript.JScriptException {
        try {
            return (double)classType.Invoke("CheckIfDoubleIsInteger", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single CheckIfSingleIsInteger(Single s) throws Throwable, microsoft.jscript.JScriptException {
        try {
            JCObject objCheckIfSingleIsInteger = (JCObject)classType.Invoke("CheckIfSingleIsInteger", (Object)s.getJCOInstance());
            return new Single(objCheckIfSingleIsInteger);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Coerce(NetObject value, NetObject type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.NotImplementedException, system.NullReferenceException, system.InvalidOperationException, microsoft.jscript.vsa.JSVsaException, microsoft.jscript.EndOfFile, system.ArgumentOutOfRangeException, microsoft.jscript.JScriptException, system.NotSupportedException, system.OutOfMemoryException {
        try {
            JCObject objCoerce = (JCObject)classType.Invoke("Coerce", (Object)value.getJCOInstance(), (Object)type.getJCOInstance());
            return new NetObject(objCoerce);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Coerce2(NetObject value, TypeCode target, boolean truncationPermitted) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, microsoft.jscript.JScriptException, system.IndexOutOfRangeException, system.MissingMethodException, system.ArgumentException, system.NullReferenceException, system.FormatException, system.OverflowException, system.ArithmeticException, system.globalization.CultureNotFoundException, system.OutOfMemoryException {
        try {
            JCObject objCoerce2 = (JCObject)classType.Invoke("Coerce2", (Object)value.getJCOInstance(), (Object)target.getJCOInstance(), truncationPermitted);
            return new NetObject(objCoerce2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ThrowTypeMismatch(NetObject val) throws Throwable, microsoft.jscript.vsa.JSVsaException, microsoft.jscript.JScriptException {
        try {
            classType.Invoke("ThrowTypeMismatch", (Object)val.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ToBoolean(double d) throws Throwable {
        try {
            return (boolean)classType.Invoke("ToBoolean", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ToBoolean(NetObject value) throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        try {
            return (boolean)classType.Invoke("ToBoolean", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean ToBoolean(NetObject value, boolean explicitConversion) throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        try {
            return (boolean)classType.Invoke("ToBoolean", (Object)value.getJCOInstance(), explicitConversion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject ToForInObject(NetObject value, VsaEngine engine) throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        try {
            JCObject objToForInObject = (JCObject)classType.Invoke("ToForInObject", (Object)value.getJCOInstance(), (Object)engine.getJCOInstance());
            return new NetObject(objToForInObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ToInt32(NetObject value) throws Throwable, system.ArithmeticException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, microsoft.jscript.JScriptException, microsoft.jscript.EndOfFile, system.ArgumentNullException, system.MissingMethodException, system.FormatException {
        try {
            return (int)classType.Invoke("ToInt32", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double ToNumber(NetObject value) throws Throwable, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, microsoft.jscript.JScriptException, microsoft.jscript.EndOfFile, system.ArgumentNullException, system.MissingMethodException, system.OverflowException, system.FormatException, system.ArithmeticException {
        try {
            return (double)classType.Invoke("ToNumber", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double ToNumber(java.lang.String str) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.FormatException, system.OverflowException, system.ArithmeticException, microsoft.jscript.JScriptException, system.IndexOutOfRangeException, system.NotImplementedException, system.MissingMethodException {
        try {
            return (double)classType.Invoke("ToNumber", (Object)str);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject ToNativeArray(NetObject value, RuntimeTypeHandle handle) throws Throwable, microsoft.jscript.JScriptException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.InvalidCastException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.NotImplementedException, system.MissingMethodException, system.FormatException, system.OverflowException, system.reflection.TargetInvocationException, microsoft.jscript.vsa.JSVsaException, microsoft.jscript.EndOfFile {
        try {
            JCObject objToNativeArray = (JCObject)classType.Invoke("ToNativeArray", (Object)value.getJCOInstance(), (Object)handle.getJCOInstance());
            return new NetObject(objToNativeArray);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject ToObject(NetObject value, VsaEngine engine) throws Throwable, system.ArgumentNullException, system.NotImplementedException, microsoft.jscript.JScriptException {
        try {
            JCObject objToObject = (JCObject)classType.Invoke("ToObject", (Object)value.getJCOInstance(), (Object)engine.getJCOInstance());
            return new NetObject(objToObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject ToObject2(NetObject value, VsaEngine engine) throws Throwable, system.ArgumentNullException, system.NotImplementedException, microsoft.jscript.JScriptException {
        try {
            JCObject objToObject2 = (JCObject)classType.Invoke("ToObject2", (Object)value.getJCOInstance(), (Object)engine.getJCOInstance());
            return new NetObject(objToObject2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ToString(NetObject value, boolean explicitOK) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.NotImplementedException, microsoft.jscript.JScriptException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classType.Invoke("ToString", (Object)value.getJCOInstance(), explicitOK);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject CoerceT(NetObject value, NetType t, boolean explicitOK) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidCastException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NullReferenceException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.ArithmeticException, system.OverflowException, system.OutOfMemoryException, system.TypeInitializationException, system.security.SecurityException, system.reflection.TargetInvocationException, microsoft.jscript.vsa.JSVsaException {
        try {
            JCObject objCoerceT = (JCObject)classType.Invoke("CoerceT", (Object)value.getJCOInstance(), (Object)t.getJCOInstance(), explicitOK);
            return new NetObject(objCoerceT);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ToString(boolean b) throws Throwable {
        try {
            return (java.lang.String)classType.Invoke("ToString", b);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String ToString(double d) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.FormatException, system.OverflowException {
        try {
            return (java.lang.String)classType.Invoke("ToString", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}