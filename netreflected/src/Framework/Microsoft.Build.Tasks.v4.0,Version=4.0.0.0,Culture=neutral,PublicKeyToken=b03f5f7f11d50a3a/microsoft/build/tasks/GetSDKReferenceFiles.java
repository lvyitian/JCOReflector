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
 * The base .NET class managing Microsoft.Build.Tasks.GetSDKReferenceFiles, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class GetSDKReferenceFiles extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.GetSDKReferenceFiles";
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

    public GetSDKReferenceFiles(Object instance) throws Throwable {
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

    public static GetSDKReferenceFiles castFrom(IJCOBridgeReflected from) throws Throwable {
        return new GetSDKReferenceFiles(from.getJCOInstance());
    }

    // Constructors section
    
    
    public GetSDKReferenceFiles() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Execute() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.UriFormatException, system.OperationCanceledException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.text.regularexpressions.RegexMatchTimeoutException {
        try {
            return (boolean)classInstance.Invoke("Execute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getCacheFileFolderPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CacheFileFolderPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCacheFileFolderPath(java.lang.String CacheFileFolderPath) throws Throwable {
        try {
            classInstance.Set("CacheFileFolderPath", (Object)CacheFileFolderPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getReferenceExtensions() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ReferenceExtensions");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexReferenceExtensions = 0; indexReferenceExtensions < resultingArrayList.size(); indexReferenceExtensions++ ) {
				resultingArray[indexReferenceExtensions] = (java.lang.String)resultingArrayList.get(indexReferenceExtensions);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReferenceExtensions(java.lang.String[] ReferenceExtensions) throws Throwable {
        try {
            classInstance.Set("ReferenceExtensions", (Object)ReferenceExtensions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLogReferencesList() throws Throwable {
        try {
            return (boolean)classInstance.Get("LogReferencesList");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogReferencesList(boolean LogReferencesList) throws Throwable {
        try {
            classInstance.Set("LogReferencesList", LogReferencesList);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLogRedistFilesList() throws Throwable {
        try {
            return (boolean)classInstance.Get("LogRedistFilesList");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogRedistFilesList(boolean LogRedistFilesList) throws Throwable {
        try {
            classInstance.Set("LogRedistFilesList", LogRedistFilesList);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLogRedistConflictWithinSDKAsWarning() throws Throwable {
        try {
            return (boolean)classInstance.Get("LogRedistConflictWithinSDKAsWarning");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogRedistConflictWithinSDKAsWarning(boolean LogRedistConflictWithinSDKAsWarning) throws Throwable {
        try {
            classInstance.Set("LogRedistConflictWithinSDKAsWarning", LogRedistConflictWithinSDKAsWarning);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLogRedistConflictBetweenSDKsAsWarning() throws Throwable {
        try {
            return (boolean)classInstance.Get("LogRedistConflictBetweenSDKsAsWarning");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogRedistConflictBetweenSDKsAsWarning(boolean LogRedistConflictBetweenSDKsAsWarning) throws Throwable {
        try {
            classInstance.Set("LogRedistConflictBetweenSDKsAsWarning", LogRedistConflictBetweenSDKsAsWarning);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLogReferenceConflictWithinSDKAsWarning() throws Throwable {
        try {
            return (boolean)classInstance.Get("LogReferenceConflictWithinSDKAsWarning");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogReferenceConflictWithinSDKAsWarning(boolean LogReferenceConflictWithinSDKAsWarning) throws Throwable {
        try {
            classInstance.Set("LogReferenceConflictWithinSDKAsWarning", LogReferenceConflictWithinSDKAsWarning);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLogReferenceConflictBetweenSDKsAsWarning() throws Throwable {
        try {
            return (boolean)classInstance.Get("LogReferenceConflictBetweenSDKsAsWarning");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogReferenceConflictBetweenSDKsAsWarning(boolean LogReferenceConflictBetweenSDKsAsWarning) throws Throwable {
        try {
            classInstance.Set("LogReferenceConflictBetweenSDKsAsWarning", LogReferenceConflictBetweenSDKsAsWarning);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLogCacheFileExceptions() throws Throwable {
        try {
            return (boolean)classInstance.Get("LogCacheFileExceptions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogCacheFileExceptions(boolean LogCacheFileExceptions) throws Throwable {
        try {
            classInstance.Set("LogCacheFileExceptions", LogCacheFileExceptions);
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