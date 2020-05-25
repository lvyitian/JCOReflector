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

package system.web.services.discovery;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.web.services.discovery.DiscoveryDocument;
import system.web.services.discovery.DiscoveryClientProtocol;


/**
 * The base .NET class managing System.Web.Services.Discovery.DiscoveryDocumentReference, System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DiscoveryDocumentReference extends NetObject  {
    public static final String assemblyFullName = "System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web.Services";
    public static final String className = "System.Web.Services.Discovery.DiscoveryDocumentReference";
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

    public DiscoveryDocumentReference(Object instance) throws Throwable {
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

    public static DiscoveryDocumentReference castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DiscoveryDocumentReference(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DiscoveryDocumentReference() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DiscoveryDocumentReference(java.lang.String href) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)href);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void ResolveAll() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.UriFormatException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.FormatException, system.net.WebException, system.OverflowException {
        try {
            classInstance.Invoke("ResolveAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteDocument(NetObject document, Stream stream) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException, system.MissingMethodException {
        try {
            classInstance.Invoke("WriteDocument", (Object)document.getJCOInstance(), (Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ReadDocument(Stream stream) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.NotSupportedException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException, system.UnauthorizedAccessException, system.io.IOException, system.xml.XmlException, system.MulticastNotSupportedException, system.FormatException, system.OutOfMemoryException, system.OverflowException, system.MissingMethodException {
        try {
            JCObject objReadDocument = (JCObject)classInstance.Invoke("ReadDocument", (Object)stream.getJCOInstance());
            return new NetObject(objReadDocument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Resolve() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.InvalidCastException, system.net.WebException, system.OverflowException {
        try {
            classInstance.Invoke("Resolve");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getRef() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Ref");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRef(java.lang.String Ref) throws Throwable {
        try {
            classInstance.Set("Ref", (Object)Ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultFilename() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultFilename");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DiscoveryDocument getDocument() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Document");
            return new DiscoveryDocument(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Url");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUrl(java.lang.String Url) throws Throwable {
        try {
            classInstance.Set("Url", (Object)Url);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DiscoveryClientProtocol getClientProtocol() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClientProtocol");
            return new DiscoveryClientProtocol(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClientProtocol(DiscoveryClientProtocol ClientProtocol) throws Throwable {
        try {
            classInstance.Set("ClientProtocol", (Object)ClientProtocol.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}