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
import system.reflection.emit.OpCode;
import system.reflection.ConstructorInfo;
import system.Single;
import system.reflection.emit.Label;
import system.reflection.FieldInfo;
import system.reflection.emit.LocalBuilder;
import system.SByte;
import system.reflection.MethodInfo;
import system.reflection.CallingConventions;
import system.runtime.interopservices.CallingConvention;
import system.reflection.emit.SignatureHelper;


/**
 * The base .NET class managing System.Reflection.Emit.ILGenerator, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link NetObject}.
 */
public class ILGenerator extends NetObject  {
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
	public static final String assemblyShortName = "System.Private.CoreLib";
    public static final String className = "System.Reflection.Emit.ILGenerator";
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

    public ILGenerator(Object instance) throws Throwable {
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

    public static ILGenerator castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ILGenerator(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void Emit(OpCode opcode) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, ConstructorInfo con) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)con.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, NetType cls) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)cls.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, long arg) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), arg);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, Single arg) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)arg.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, double arg) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), arg);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, Label label) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)label.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, Label[] labels) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)toObjectFromArray(labels));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, FieldInfo field) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)field.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, java.lang.String str) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)str);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, LocalBuilder local) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)local.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Label BeginExceptionBlock() throws Throwable {
        try {
            JCObject objBeginExceptionBlock = (JCObject)classInstance.Invoke("BeginExceptionBlock");
            return new Label(objBeginExceptionBlock);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndExceptionBlock() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("EndExceptionBlock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginExceptFilterBlock() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("BeginExceptFilterBlock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginCatchBlock(NetType exceptionType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("BeginCatchBlock", (Object)exceptionType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginFaultBlock() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("BeginFaultBlock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginFinallyBlock() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("BeginFinallyBlock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Label DefineLabel() throws Throwable {
        try {
            JCObject objDefineLabel = (JCObject)classInstance.Invoke("DefineLabel");
            return new Label(objDefineLabel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MarkLabel(Label loc) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("MarkLabel", (Object)loc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ThrowException(NetType excType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("ThrowException", (Object)excType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EmitWriteLine(java.lang.String value) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.FormatException, system.TypeLoadException, system.NotImplementedException {
        try {
            classInstance.Invoke("EmitWriteLine", (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EmitWriteLine(LocalBuilder localBuilder) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException {
        try {
            classInstance.Invoke("EmitWriteLine", (Object)localBuilder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EmitWriteLine(FieldInfo fld) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.NotImplementedException {
        try {
            classInstance.Invoke("EmitWriteLine", (Object)fld.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalBuilder DeclareLocal(NetType localType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        try {
            JCObject objDeclareLocal = (JCObject)classInstance.Invoke("DeclareLocal", (Object)localType.getJCOInstance());
            return new LocalBuilder(objDeclareLocal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalBuilder DeclareLocal(NetType localType, boolean pinned) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        try {
            JCObject objDeclareLocal = (JCObject)classInstance.Invoke("DeclareLocal", (Object)localType.getJCOInstance(), pinned);
            return new LocalBuilder(objDeclareLocal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UsingNamespace(java.lang.String usingNamespace) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("UsingNamespace", (Object)usingNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, byte arg) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), arg);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, SByte arg) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)arg.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, short arg) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), arg);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, int arg) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.InvalidOperationException, system.FormatException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), arg);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, MethodInfo meth) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)meth.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EmitCalli(OpCode opcode, CallingConventions callingConvention, NetType returnType, NetType[] parameterTypes, NetType[] optionalParameterTypes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("EmitCalli", (Object)opcode.getJCOInstance(), (Object)callingConvention.getJCOInstance(), (Object)returnType.getJCOInstance(), (Object)toObjectFromArray(parameterTypes), (Object)toObjectFromArray(optionalParameterTypes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EmitCalli(OpCode opcode, CallingConvention unmanagedCallConv, NetType returnType, NetType[] parameterTypes) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("EmitCalli", (Object)opcode.getJCOInstance(), (Object)unmanagedCallConv.getJCOInstance(), (Object)returnType.getJCOInstance(), (Object)toObjectFromArray(parameterTypes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EmitCall(OpCode opcode, MethodInfo methodInfo, NetType[] optionalParameterTypes) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException {
        try {
            classInstance.Invoke("EmitCall", (Object)opcode.getJCOInstance(), (Object)methodInfo.getJCOInstance(), (Object)toObjectFromArray(optionalParameterTypes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Emit(OpCode opcode, SignatureHelper signature) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("Emit", (Object)opcode.getJCOInstance(), (Object)signature.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getILOffset() throws Throwable {
        try {
            return (int)classInstance.Get("ILOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}