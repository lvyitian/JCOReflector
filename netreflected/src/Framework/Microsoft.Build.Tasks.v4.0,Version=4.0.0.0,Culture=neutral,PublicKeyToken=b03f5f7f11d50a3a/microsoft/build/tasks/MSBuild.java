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

package microsoft.build.tasks;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.utilities.TaskLoggingHelper;


/**
 * The base .NET class managing Microsoft.Build.Tasks.MSBuild, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class MSBuild extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.MSBuild";
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

    public MSBuild(Object instance) throws Throwable {
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

    public static MSBuild castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MSBuild(from.getJCOInstance());
    }

    // Constructors section
    
    
    public MSBuild() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Execute() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.text.regularexpressions.RegexMatchTimeoutException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            return (boolean)classInstance.Invoke("Execute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String[] getProperties() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Properties");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexProperties = 0; indexProperties < resultingArrayList.size(); indexProperties++ ) {
				resultingArray[indexProperties] = (java.lang.String)resultingArrayList.get(indexProperties);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setProperties(java.lang.String[] Properties) throws Throwable {
        try {
            classInstance.Set("Properties", (Object)Properties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRemoveProperties() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RemoveProperties");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRemoveProperties(java.lang.String RemoveProperties) throws Throwable {
        try {
            classInstance.Set("RemoveProperties", (Object)RemoveProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getTargets() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Targets");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexTargets = 0; indexTargets < resultingArrayList.size(); indexTargets++ ) {
				resultingArray[indexTargets] = (java.lang.String)resultingArrayList.get(indexTargets);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargets(java.lang.String[] Targets) throws Throwable {
        try {
            classInstance.Set("Targets", (Object)Targets);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRebaseOutputs() throws Throwable {
        try {
            return (boolean)classInstance.Get("RebaseOutputs");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRebaseOutputs(boolean RebaseOutputs) throws Throwable {
        try {
            classInstance.Set("RebaseOutputs", RebaseOutputs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getStopOnFirstFailure() throws Throwable {
        try {
            return (boolean)classInstance.Get("StopOnFirstFailure");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStopOnFirstFailure(boolean StopOnFirstFailure) throws Throwable {
        try {
            classInstance.Set("StopOnFirstFailure", StopOnFirstFailure);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRunEachTargetSeparately() throws Throwable {
        try {
            return (boolean)classInstance.Get("RunEachTargetSeparately");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRunEachTargetSeparately(boolean RunEachTargetSeparately) throws Throwable {
        try {
            classInstance.Set("RunEachTargetSeparately", RunEachTargetSeparately);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getToolsVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ToolsVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setToolsVersion(java.lang.String ToolsVersion) throws Throwable {
        try {
            classInstance.Set("ToolsVersion", (Object)ToolsVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getBuildInParallel() throws Throwable {
        try {
            return (boolean)classInstance.Get("BuildInParallel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBuildInParallel(boolean BuildInParallel) throws Throwable {
        try {
            classInstance.Set("BuildInParallel", BuildInParallel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUnloadProjectsOnCompletion() throws Throwable {
        try {
            return (boolean)classInstance.Get("UnloadProjectsOnCompletion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnloadProjectsOnCompletion(boolean UnloadProjectsOnCompletion) throws Throwable {
        try {
            classInstance.Set("UnloadProjectsOnCompletion", UnloadProjectsOnCompletion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseResultsCache() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseResultsCache");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseResultsCache(boolean UseResultsCache) throws Throwable {
        try {
            classInstance.Set("UseResultsCache", UseResultsCache);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSkipNonexistentProjects() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SkipNonexistentProjects");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSkipNonexistentProjects(java.lang.String SkipNonexistentProjects) throws Throwable {
        try {
            classInstance.Set("SkipNonexistentProjects", (Object)SkipNonexistentProjects);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getTargetAndPropertyListSeparators() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("TargetAndPropertyListSeparators");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexTargetAndPropertyListSeparators = 0; indexTargetAndPropertyListSeparators < resultingArrayList.size(); indexTargetAndPropertyListSeparators++ ) {
				resultingArray[indexTargetAndPropertyListSeparators] = (java.lang.String)resultingArrayList.get(indexTargetAndPropertyListSeparators);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetAndPropertyListSeparators(java.lang.String[] TargetAndPropertyListSeparators) throws Throwable {
        try {
            classInstance.Set("TargetAndPropertyListSeparators", (Object)TargetAndPropertyListSeparators);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TaskLoggingHelper getLog() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Log");
            return new TaskLoggingHelper(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}