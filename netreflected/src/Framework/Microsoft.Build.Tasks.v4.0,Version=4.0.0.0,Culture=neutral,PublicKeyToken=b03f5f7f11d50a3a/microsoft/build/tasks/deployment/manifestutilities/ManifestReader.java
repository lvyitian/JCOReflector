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
import microsoft.build.tasks.deployment.manifestutilities.Manifest;
import system.io.Stream;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Deployment.ManifestUtilities.ManifestReader, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ManifestReader extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.Deployment.ManifestUtilities.ManifestReader";
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

    public ManifestReader(Object instance) throws Throwable {
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

    public static ManifestReader castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ManifestReader(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static Manifest ReadManifest(Stream input, boolean preserveStream) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.xml.XmlException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.io.IOException, system.security.SecurityException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.TypeLoadException, system.threading.ThreadAbortException, system.configuration.ConfigurationErrorsException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.UnauthorizedAccessException, system.MissingMethodException, system.xml.xpath.XPathException {
        try {
            JCObject objReadManifest = (JCObject)classType.Invoke("ReadManifest", (Object)input.getJCOInstance(), preserveStream);
            return new Manifest(objReadManifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Manifest ReadManifest(java.lang.String path, boolean preserveStream) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NullReferenceException, system.security.SecurityException, system.FormatException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotImplementedException, system.xml.XmlException, system.xml.xpath.XPathException {
        try {
            JCObject objReadManifest = (JCObject)classType.Invoke("ReadManifest", (Object)path, preserveStream);
            return new Manifest(objReadManifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Manifest ReadManifest(java.lang.String manifestType, java.lang.String path, boolean preserveStream) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.security.SecurityException, system.io.IOException, system.OutOfMemoryException, system.NotImplementedException, system.xml.XmlException, system.TypeLoadException, system.io.FileNotFoundException, system.MissingMethodException, system.xml.xpath.XPathException {
        try {
            JCObject objReadManifest = (JCObject)classType.Invoke("ReadManifest", (Object)manifestType, (Object)path, preserveStream);
            return new Manifest(objReadManifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Manifest ReadManifest(java.lang.String manifestType, Stream input, boolean preserveStream) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotImplementedException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.xml.XmlException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.xml.xsl.XsltException, system.TypeLoadException, system.threading.ThreadAbortException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.OverflowException, system.MissingMethodException, system.xml.xpath.XPathException {
        try {
            JCObject objReadManifest = (JCObject)classType.Invoke("ReadManifest", (Object)manifestType, (Object)input.getJCOInstance(), preserveStream);
            return new Manifest(objReadManifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}