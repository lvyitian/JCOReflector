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

package system.workflow.componentmodel.compiler;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.compiler.WorkflowCompilerParameters;
import system.collections.specialized.StringCollection;
import system.codedom.compiler.TempFileCollection;
import system.security.policy.Evidence;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Compiler.WorkflowCompilerParameters, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WorkflowCompilerParameters extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.ComponentModel";
    public static final String className = "System.Workflow.ComponentModel.Compiler.WorkflowCompilerParameters";
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

    public WorkflowCompilerParameters(Object instance) throws Throwable {
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

    public static WorkflowCompilerParameters castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WorkflowCompilerParameters(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WorkflowCompilerParameters() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowCompilerParameters(java.lang.String[] assemblyNames) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)assemblyNames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowCompilerParameters(java.lang.String[] assemblyNames, java.lang.String outputName) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)assemblyNames, (Object)outputName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowCompilerParameters(java.lang.String[] assemblyNames, java.lang.String outputName, boolean includeDebugInformation) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)assemblyNames, (Object)outputName, includeDebugInformation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowCompilerParameters(WorkflowCompilerParameters parameters) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public java.lang.String getCompilerOptions() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CompilerOptions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCompilerOptions(java.lang.String CompilerOptions) throws Throwable {
        try {
            classInstance.Set("CompilerOptions", (Object)CompilerOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGenerateCodeCompileUnitOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("GenerateCodeCompileUnitOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGenerateCodeCompileUnitOnly(boolean GenerateCodeCompileUnitOnly) throws Throwable {
        try {
            classInstance.Set("GenerateCodeCompileUnitOnly", GenerateCodeCompileUnitOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLanguageToUse() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("LanguageToUse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLanguageToUse(java.lang.String LanguageToUse) throws Throwable {
        try {
            classInstance.Set("LanguageToUse", (Object)LanguageToUse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringCollection getLibraryPaths() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LibraryPaths");
            return new StringCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCoreAssemblyFileName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CoreAssemblyFileName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCoreAssemblyFileName(java.lang.String CoreAssemblyFileName) throws Throwable {
        try {
            classInstance.Set("CoreAssemblyFileName", (Object)CoreAssemblyFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGenerateExecutable() throws Throwable {
        try {
            return (boolean)classInstance.Get("GenerateExecutable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGenerateExecutable(boolean GenerateExecutable) throws Throwable {
        try {
            classInstance.Set("GenerateExecutable", GenerateExecutable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGenerateInMemory() throws Throwable {
        try {
            return (boolean)classInstance.Get("GenerateInMemory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGenerateInMemory(boolean GenerateInMemory) throws Throwable {
        try {
            classInstance.Set("GenerateInMemory", GenerateInMemory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringCollection getReferencedAssemblies() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReferencedAssemblies");
            return new StringCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMainClass() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MainClass");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMainClass(java.lang.String MainClass) throws Throwable {
        try {
            classInstance.Set("MainClass", (Object)MainClass);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOutputAssembly() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("OutputAssembly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOutputAssembly(java.lang.String OutputAssembly) throws Throwable {
        try {
            classInstance.Set("OutputAssembly", (Object)OutputAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

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

    public boolean getIncludeDebugInformation() throws Throwable {
        try {
            return (boolean)classInstance.Get("IncludeDebugInformation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIncludeDebugInformation(boolean IncludeDebugInformation) throws Throwable {
        try {
            classInstance.Set("IncludeDebugInformation", IncludeDebugInformation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTreatWarningsAsErrors() throws Throwable {
        try {
            return (boolean)classInstance.Get("TreatWarningsAsErrors");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTreatWarningsAsErrors(boolean TreatWarningsAsErrors) throws Throwable {
        try {
            classInstance.Set("TreatWarningsAsErrors", TreatWarningsAsErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getWarningLevel() throws Throwable {
        try {
            return (int)classInstance.Get("WarningLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWarningLevel(int WarningLevel) throws Throwable {
        try {
            classInstance.Set("WarningLevel", WarningLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWin32Resource() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Win32Resource");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWin32Resource(java.lang.String Win32Resource) throws Throwable {
        try {
            classInstance.Set("Win32Resource", (Object)Win32Resource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringCollection getEmbeddedResources() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EmbeddedResources");
            return new StringCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringCollection getLinkedResources() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LinkedResources");
            return new StringCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Evidence getEvidence() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Evidence");
            return new Evidence(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEvidence(Evidence Evidence) throws Throwable {
        try {
            classInstance.Set("Evidence", (Object)Evidence.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}