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

package system.codedom.compiler;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.codedom.compiler.TempFileCollection;
import system.reflection.Assembly;
import system.codedom.compiler.CompilerErrorCollection;
import system.collections.specialized.StringCollection;


/**
 * The base .NET class managing System.CodeDom.Compiler.CompilerResults, System.CodeDom, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class CompilerResults extends NetObject  {
    public static final String assemblyFullName = "System.CodeDom, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.CodeDom";
    public static final String className = "System.CodeDom.Compiler.CompilerResults";
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

    public CompilerResults(Object instance) throws Throwable {
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

    public static CompilerResults castFrom(IJCOBridgeReflected from) throws Throwable {
        return new CompilerResults(from.getJCOInstance());
    }

    // Constructors section
    
    
    public CompilerResults(TempFileCollection tempFiles) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)tempFiles.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public TempFileCollection getTempFiles() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TempFiles");
            return new TempFileCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTempFiles(TempFileCollection TempFiles) throws Throwable {
        try {
            classInstance.Set("TempFiles", (Object)TempFiles.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly getCompiledAssembly() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CompiledAssembly");
            return new Assembly(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCompiledAssembly(Assembly CompiledAssembly) throws Throwable {
        try {
            classInstance.Set("CompiledAssembly", (Object)CompiledAssembly.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompilerErrorCollection getErrors() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Errors");
            return new CompilerErrorCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringCollection getOutput() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Output");
            return new StringCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPathToAssembly() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PathToAssembly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPathToAssembly(java.lang.String PathToAssembly) throws Throwable {
        try {
            classInstance.Set("PathToAssembly", (Object)PathToAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNativeCompilerReturnValue() throws Throwable {
        try {
            return (int)classInstance.Get("NativeCompilerReturnValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNativeCompilerReturnValue(int NativeCompilerReturnValue) throws Throwable {
        try {
            classInstance.Set("NativeCompilerReturnValue", NativeCompilerReturnValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}