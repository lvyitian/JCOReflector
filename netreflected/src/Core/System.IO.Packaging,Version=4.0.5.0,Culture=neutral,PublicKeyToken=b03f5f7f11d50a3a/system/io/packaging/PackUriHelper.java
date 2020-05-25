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

package system.io.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Uri;


/**
 * The base .NET class managing System.IO.Packaging.PackUriHelper, System.IO.Packaging, Version=4.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class PackUriHelper extends NetObject  {
    public static final String assemblyFullName = "System.IO.Packaging, Version=4.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.IO.Packaging";
    public static final String className = "System.IO.Packaging.PackUriHelper";
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

    public PackUriHelper(Object instance) throws Throwable {
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

    public static PackUriHelper castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PackUriHelper(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static Uri CreatePartUri(Uri partUri) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        try {
            JCObject objCreatePartUri = (JCObject)classType.Invoke("CreatePartUri", (Object)partUri.getJCOInstance());
            return new Uri(objCreatePartUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri ResolvePartUri(Uri sourcePartUri, Uri targetUri) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            JCObject objResolvePartUri = (JCObject)classType.Invoke("ResolvePartUri", (Object)sourcePartUri.getJCOInstance(), (Object)targetUri.getJCOInstance());
            return new Uri(objResolvePartUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri GetRelativeUri(Uri sourcePartUri, Uri targetPartUri) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            JCObject objGetRelativeUri = (JCObject)classType.Invoke("GetRelativeUri", (Object)sourcePartUri.getJCOInstance(), (Object)targetPartUri.getJCOInstance());
            return new Uri(objGetRelativeUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri GetNormalizedPartUri(Uri partUri) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            JCObject objGetNormalizedPartUri = (JCObject)classType.Invoke("GetNormalizedPartUri", (Object)partUri.getJCOInstance());
            return new Uri(objGetNormalizedPartUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ComparePartUri(Uri firstPartUri, Uri secondPartUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            return (int)classType.Invoke("ComparePartUri", (Object)firstPartUri.getJCOInstance(), (Object)secondPartUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsRelationshipPartUri(Uri partUri) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            return (boolean)classType.Invoke("IsRelationshipPartUri", (Object)partUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri GetRelationshipPartUri(Uri partUri) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            JCObject objGetRelationshipPartUri = (JCObject)classType.Invoke("GetRelationshipPartUri", (Object)partUri.getJCOInstance());
            return new Uri(objGetRelationshipPartUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri GetSourcePartUriFromRelationshipPartUri(Uri relationshipPartUri) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            JCObject objGetSourcePartUriFromRelationshipPartUri = (JCObject)classType.Invoke("GetSourcePartUriFromRelationshipPartUri", (Object)relationshipPartUri.getJCOInstance());
            return new Uri(objGetSourcePartUriFromRelationshipPartUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri Create(Uri packageUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)packageUri.getJCOInstance());
            return new Uri(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri Create(Uri packageUri, Uri partUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)packageUri.getJCOInstance(), (Object)partUri.getJCOInstance());
            return new Uri(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri Create(Uri packageUri, Uri partUri, java.lang.String fragment) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UriFormatException, system.FormatException, system.OutOfMemoryException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)packageUri.getJCOInstance(), (Object)partUri.getJCOInstance(), (Object)fragment);
            return new Uri(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri GetPackageUri(Uri packUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UriFormatException, system.FormatException {
        try {
            JCObject objGetPackageUri = (JCObject)classType.Invoke("GetPackageUri", (Object)packUri.getJCOInstance());
            return new Uri(objGetPackageUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Uri GetPartUri(Uri packUri) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UriFormatException, system.FormatException {
        try {
            JCObject objGetPartUri = (JCObject)classType.Invoke("GetPartUri", (Object)packUri.getJCOInstance());
            return new Uri(objGetPartUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int ComparePackUri(Uri firstPackUri, Uri secondPackUri) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.UriFormatException, system.FormatException {
        try {
            return (int)classType.Invoke("ComparePackUri", (Object)firstPackUri.getJCOInstance(), (Object)secondPackUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}