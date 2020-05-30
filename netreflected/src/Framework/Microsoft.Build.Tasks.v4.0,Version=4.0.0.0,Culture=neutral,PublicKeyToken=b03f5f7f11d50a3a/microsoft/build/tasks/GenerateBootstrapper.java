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
 * The base .NET class managing Microsoft.Build.Tasks.GenerateBootstrapper, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class GenerateBootstrapper extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.GenerateBootstrapper";
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

    public GenerateBootstrapper(Object instance) throws Throwable {
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

    public static GenerateBootstrapper castFrom(IJCOBridgeReflected from) throws Throwable {
        return new GenerateBootstrapper(from.getJCOInstance());
    }

    // Constructors section
    
    
    public GenerateBootstrapper() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Execute() throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ArgumentException, system.ObjectDisposedException, system.OutOfMemoryException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.InvalidOperationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.xml.xpath.XPathException, system.xml.schema.XmlSchemaException, system.FormatException, system.OverflowException, system.InvalidCastException, system.NotImplementedException, system.UriFormatException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classInstance.Invoke("Execute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getApplicationName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ApplicationName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplicationName(java.lang.String ApplicationName) throws Throwable {
        try {
            classInstance.Set("ApplicationName", (Object)ApplicationName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplicationFile() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ApplicationFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplicationFile(java.lang.String ApplicationFile) throws Throwable {
        try {
            classInstance.Set("ApplicationFile", (Object)ApplicationFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getApplicationRequiresElevation() throws Throwable {
        try {
            return (boolean)classInstance.Get("ApplicationRequiresElevation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplicationRequiresElevation(boolean ApplicationRequiresElevation) throws Throwable {
        try {
            classInstance.Set("ApplicationRequiresElevation", ApplicationRequiresElevation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplicationUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ApplicationUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplicationUrl(java.lang.String ApplicationUrl) throws Throwable {
        try {
            classInstance.Set("ApplicationUrl", (Object)ApplicationUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getComponentsLocation() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ComponentsLocation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setComponentsLocation(java.lang.String ComponentsLocation) throws Throwable {
        try {
            classInstance.Set("ComponentsLocation", (Object)ComponentsLocation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getComponentsUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ComponentsUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setComponentsUrl(java.lang.String ComponentsUrl) throws Throwable {
        try {
            classInstance.Set("ComponentsUrl", (Object)ComponentsUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCopyComponents() throws Throwable {
        try {
            return (boolean)classInstance.Get("CopyComponents");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCopyComponents(boolean CopyComponents) throws Throwable {
        try {
            classInstance.Set("CopyComponents", CopyComponents);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCulture() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Culture");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCulture(java.lang.String Culture) throws Throwable {
        try {
            classInstance.Set("Culture", (Object)Culture);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFallbackCulture() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FallbackCulture");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFallbackCulture(java.lang.String FallbackCulture) throws Throwable {
        try {
            classInstance.Set("FallbackCulture", (Object)FallbackCulture);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOutputPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("OutputPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOutputPath(java.lang.String OutputPath) throws Throwable {
        try {
            classInstance.Set("OutputPath", (Object)OutputPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Path");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPath(java.lang.String Path) throws Throwable {
        try {
            classInstance.Set("Path", (Object)Path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSupportUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SupportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSupportUrl(java.lang.String SupportUrl) throws Throwable {
        try {
            classInstance.Set("SupportUrl", (Object)SupportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVisualStudioVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("VisualStudioVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVisualStudioVersion(java.lang.String VisualStudioVersion) throws Throwable {
        try {
            classInstance.Set("VisualStudioVersion", (Object)VisualStudioVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getValidate() throws Throwable {
        try {
            return (boolean)classInstance.Get("Validate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidate(boolean Validate) throws Throwable {
        try {
            classInstance.Set("Validate", Validate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBootstrapperKeyFile() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("BootstrapperKeyFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBootstrapperKeyFile(java.lang.String BootstrapperKeyFile) throws Throwable {
        try {
            classInstance.Set("BootstrapperKeyFile", (Object)BootstrapperKeyFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getBootstrapperComponentFiles() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("BootstrapperComponentFiles");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexBootstrapperComponentFiles = 0; indexBootstrapperComponentFiles < resultingArrayList.size(); indexBootstrapperComponentFiles++ ) {
				resultingArray[indexBootstrapperComponentFiles] = (java.lang.String)resultingArrayList.get(indexBootstrapperComponentFiles);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBootstrapperComponentFiles(java.lang.String[] BootstrapperComponentFiles) throws Throwable {
        try {
            classInstance.Set("BootstrapperComponentFiles", (Object)BootstrapperComponentFiles);
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