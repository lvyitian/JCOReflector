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
 * The base .NET class managing Microsoft.Build.Tasks.GenerateDeploymentManifest, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class GenerateDeploymentManifest extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.GenerateDeploymentManifest";
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

    public GenerateDeploymentManifest(Object instance) throws Throwable {
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

    public static GenerateDeploymentManifest castFrom(IJCOBridgeReflected from) throws Throwable {
        return new GenerateDeploymentManifest(from.getJCOInstance());
    }

    // Constructors section
    
    
    public GenerateDeploymentManifest() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Execute() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.OutOfMemoryException, system.FormatException, system.xml.XmlException, system.xml.xpath.XPathException, system.collections.generic.KeyNotFoundException, system.RankException {
        try {
            return (boolean)classInstance.Invoke("Execute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getCreateDesktopShortcut() throws Throwable {
        try {
            return (boolean)classInstance.Get("CreateDesktopShortcut");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCreateDesktopShortcut(boolean CreateDesktopShortcut) throws Throwable {
        try {
            classInstance.Set("CreateDesktopShortcut", CreateDesktopShortcut);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDeploymentUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DeploymentUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeploymentUrl(java.lang.String DeploymentUrl) throws Throwable {
        try {
            classInstance.Set("DeploymentUrl", (Object)DeploymentUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDisallowUrlActivation() throws Throwable {
        try {
            return (boolean)classInstance.Get("DisallowUrlActivation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisallowUrlActivation(boolean DisallowUrlActivation) throws Throwable {
        try {
            classInstance.Set("DisallowUrlActivation", DisallowUrlActivation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorReportUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ErrorReportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorReportUrl(java.lang.String ErrorReportUrl) throws Throwable {
        try {
            classInstance.Set("ErrorReportUrl", (Object)ErrorReportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getInstall() throws Throwable {
        try {
            return (boolean)classInstance.Get("Install");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstall(boolean Install) throws Throwable {
        try {
            classInstance.Set("Install", Install);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMinimumRequiredVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MinimumRequiredVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinimumRequiredVersion(java.lang.String MinimumRequiredVersion) throws Throwable {
        try {
            classInstance.Set("MinimumRequiredVersion", (Object)MinimumRequiredVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getMapFileExtensions() throws Throwable {
        try {
            return (boolean)classInstance.Get("MapFileExtensions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMapFileExtensions(boolean MapFileExtensions) throws Throwable {
        try {
            classInstance.Set("MapFileExtensions", MapFileExtensions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getProduct() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Product");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setProduct(java.lang.String Product) throws Throwable {
        try {
            classInstance.Set("Product", (Object)Product);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPublisher() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Publisher");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPublisher(java.lang.String Publisher) throws Throwable {
        try {
            classInstance.Set("Publisher", (Object)Publisher);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSuiteName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SuiteName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSuiteName(java.lang.String SuiteName) throws Throwable {
        try {
            classInstance.Set("SuiteName", (Object)SuiteName);
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

    public boolean getTrustUrlParameters() throws Throwable {
        try {
            return (boolean)classInstance.Get("TrustUrlParameters");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrustUrlParameters(boolean TrustUrlParameters) throws Throwable {
        try {
            classInstance.Set("TrustUrlParameters", TrustUrlParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUpdateEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("UpdateEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdateEnabled(boolean UpdateEnabled) throws Throwable {
        try {
            classInstance.Set("UpdateEnabled", UpdateEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getUpdateInterval() throws Throwable {
        try {
            return (int)classInstance.Get("UpdateInterval");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdateInterval(int UpdateInterval) throws Throwable {
        try {
            classInstance.Set("UpdateInterval", UpdateInterval);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUpdateMode() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("UpdateMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdateMode(java.lang.String UpdateMode) throws Throwable {
        try {
            classInstance.Set("UpdateMode", (Object)UpdateMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUpdateUnit() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("UpdateUnit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUpdateUnit(java.lang.String UpdateUnit) throws Throwable {
        try {
            classInstance.Set("UpdateUnit", (Object)UpdateUnit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAssemblyName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("AssemblyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssemblyName(java.lang.String AssemblyName) throws Throwable {
        try {
            classInstance.Set("AssemblyName", (Object)AssemblyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAssemblyVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("AssemblyVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssemblyVersion(java.lang.String AssemblyVersion) throws Throwable {
        try {
            classInstance.Set("AssemblyVersion", (Object)AssemblyVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDescription(java.lang.String Description) throws Throwable {
        try {
            classInstance.Set("Description", (Object)Description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxTargetPath() throws Throwable {
        try {
            return (int)classInstance.Get("MaxTargetPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxTargetPath(int MaxTargetPath) throws Throwable {
        try {
            classInstance.Set("MaxTargetPath", MaxTargetPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPlatform() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Platform");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPlatform(java.lang.String Platform) throws Throwable {
        try {
            classInstance.Set("Platform", (Object)Platform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetCulture() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TargetCulture");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetCulture(java.lang.String TargetCulture) throws Throwable {
        try {
            classInstance.Set("TargetCulture", (Object)TargetCulture);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetFrameworkVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TargetFrameworkVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetFrameworkVersion(java.lang.String TargetFrameworkVersion) throws Throwable {
        try {
            classInstance.Set("TargetFrameworkVersion", (Object)TargetFrameworkVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetFrameworkMoniker() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TargetFrameworkMoniker");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetFrameworkMoniker(java.lang.String TargetFrameworkMoniker) throws Throwable {
        try {
            classInstance.Set("TargetFrameworkMoniker", (Object)TargetFrameworkMoniker);
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