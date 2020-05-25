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

package microsoft.build.tasks.deployment.manifestutilities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.tasks.deployment.manifestutilities.ProxyStub;
import microsoft.build.tasks.deployment.manifestutilities.AssemblyIdentity;
import microsoft.build.tasks.deployment.manifestutilities.AssemblyReferenceCollection;
import microsoft.build.tasks.deployment.manifestutilities.AssemblyReference;
import microsoft.build.tasks.deployment.manifestutilities.FileReferenceCollection;
import system.io.Stream;
import microsoft.build.tasks.deployment.manifestutilities.OutputMessageCollection;
import microsoft.build.tasks.deployment.manifestutilities.FileReference;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Deployment.ManifestUtilities.AssemblyManifest, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class AssemblyManifest extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.Deployment.ManifestUtilities.AssemblyManifest";
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

    public AssemblyManifest(Object instance) throws Throwable {
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

    public static AssemblyManifest castFrom(IJCOBridgeReflected from) throws Throwable {
        return new AssemblyManifest(from.getJCOInstance());
    }

    // Constructors section
    
    
    public AssemblyManifest() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void ResolveFiles(java.lang.String[] searchPaths) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("ResolveFiles", (Object)searchPaths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateFileInfo() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.NullReferenceException, system.xml.xpath.XPathException, system.FormatException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("UpdateFileInfo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateFileInfo(java.lang.String targetFrameworkVersion) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.NullReferenceException, system.xml.xpath.XPathException, system.FormatException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("UpdateFileInfo", (Object)targetFrameworkVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Validate() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("Validate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResolveFiles() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.io.PathTooLongException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("ResolveFiles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public ProxyStub[] getExternalProxyStubs() throws Throwable {
        try {
            ArrayList<ProxyStub> resultingArrayList = new ArrayList<ProxyStub>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ExternalProxyStubs");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ProxyStub(resultingObject));
            }
            ProxyStub[] resultingArray = new ProxyStub[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProxyStub[] getXmlExternalProxyStubs() throws Throwable {
        try {
            ArrayList<ProxyStub> resultingArrayList = new ArrayList<ProxyStub>();
            JCObject resultingObjects = (JCObject)classInstance.Get("XmlExternalProxyStubs");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ProxyStub(resultingObject));
            }
            ProxyStub[] resultingArray = new ProxyStub[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlExternalProxyStubs(ProxyStub[] XmlExternalProxyStubs) throws Throwable {
        try {
            classInstance.Set("XmlExternalProxyStubs", (Object)toObjectFromArray(XmlExternalProxyStubs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyIdentity getAssemblyIdentity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AssemblyIdentity");
            return new AssemblyIdentity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssemblyIdentity(AssemblyIdentity AssemblyIdentity) throws Throwable {
        try {
            classInstance.Set("AssemblyIdentity", (Object)AssemblyIdentity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyReferenceCollection getAssemblyReferences() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AssemblyReferences");
            return new AssemblyReferenceCollection(val);
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

    public AssemblyReference getEntryPoint() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EntryPoint");
            return new AssemblyReference(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEntryPoint(AssemblyReference EntryPoint) throws Throwable {
        try {
            classInstance.Set("EntryPoint", (Object)EntryPoint.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileReferenceCollection getFileReferences() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FileReferences");
            return new FileReferenceCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream getInputStream() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InputStream");
            return new Stream(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInputStream(Stream InputStream) throws Throwable {
        try {
            classInstance.Set("InputStream", (Object)InputStream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OutputMessageCollection getOutputMessages() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OutputMessages");
            return new OutputMessageCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadOnly(boolean ReadOnly) throws Throwable {
        try {
            classInstance.Set("ReadOnly", ReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSourcePath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SourcePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourcePath(java.lang.String SourcePath) throws Throwable {
        try {
            classInstance.Set("SourcePath", (Object)SourcePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyIdentity getXmlAssemblyIdentity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("XmlAssemblyIdentity");
            return new AssemblyIdentity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlAssemblyIdentity(AssemblyIdentity XmlAssemblyIdentity) throws Throwable {
        try {
            classInstance.Set("XmlAssemblyIdentity", (Object)XmlAssemblyIdentity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyReference[] getXmlAssemblyReferences() throws Throwable {
        try {
            ArrayList<AssemblyReference> resultingArrayList = new ArrayList<AssemblyReference>();
            JCObject resultingObjects = (JCObject)classInstance.Get("XmlAssemblyReferences");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new AssemblyReference(resultingObject));
            }
            AssemblyReference[] resultingArray = new AssemblyReference[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlAssemblyReferences(AssemblyReference[] XmlAssemblyReferences) throws Throwable {
        try {
            classInstance.Set("XmlAssemblyReferences", (Object)toObjectFromArray(XmlAssemblyReferences));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlDescription() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlDescription");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlDescription(java.lang.String XmlDescription) throws Throwable {
        try {
            classInstance.Set("XmlDescription", (Object)XmlDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileReference[] getXmlFileReferences() throws Throwable {
        try {
            ArrayList<FileReference> resultingArrayList = new ArrayList<FileReference>();
            JCObject resultingObjects = (JCObject)classInstance.Get("XmlFileReferences");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileReference(resultingObject));
            }
            FileReference[] resultingArray = new FileReference[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlFileReferences(FileReference[] XmlFileReferences) throws Throwable {
        try {
            classInstance.Set("XmlFileReferences", (Object)toObjectFromArray(XmlFileReferences));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlSchema() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlSchema");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlSchema(java.lang.String XmlSchema) throws Throwable {
        try {
            classInstance.Set("XmlSchema", (Object)XmlSchema);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}