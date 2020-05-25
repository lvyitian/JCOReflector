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
import system.io.Stream;
import system.net.WebResponse;
import system.net.WebRequest;
import system.net.cache.RequestCachePolicy;
import system.net.WebHeaderCollection;
import system.Uri;
import system.net.security.AuthenticationLevel;
import system.security.principal.TokenImpersonationLevel;


/**
 * The base .NET class managing System.IO.Packaging.PackWebRequest, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class PackWebRequest extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.IO.Packaging.PackWebRequest";
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

    public PackWebRequest(Object instance) throws Throwable {
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

    public static PackWebRequest castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PackWebRequest(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public Stream GetRequestStream() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetRequestStream = (JCObject)classInstance.Invoke("GetRequestStream");
            return new Stream(objGetRequestStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebResponse GetResponse() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.net.WebException, system.PlatformNotSupportedException, system.UriFormatException, system.FormatException, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.net.CookieException, system.threading.WaitHandleCannotBeOpenedException, system.threading.AbandonedMutexException, system.io.IOException {
        try {
            JCObject objGetResponse = (JCObject)classInstance.Invoke("GetResponse");
            return new WebResponse(objGetResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebRequest GetInnerRequest() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.UriFormatException, system.FormatException, system.NotSupportedException, system.net.WebException, system.componentmodel.Win32Exception, system.net.CookieException {
        try {
            JCObject objGetInnerRequest = (JCObject)classInstance.Invoke("GetInnerRequest");
            return new WebRequest(objGetInnerRequest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public RequestCachePolicy getCachePolicy() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CachePolicy");
            return new RequestCachePolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCachePolicy(RequestCachePolicy CachePolicy) throws Throwable {
        try {
            classInstance.Set("CachePolicy", (Object)CachePolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getConnectionGroupName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ConnectionGroupName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnectionGroupName(java.lang.String ConnectionGroupName) throws Throwable {
        try {
            classInstance.Set("ConnectionGroupName", (Object)ConnectionGroupName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getContentLength() throws Throwable {
        try {
            return (long)classInstance.Get("ContentLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContentLength(long ContentLength) throws Throwable {
        try {
            classInstance.Set("ContentLength", ContentLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getContentType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ContentType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContentType(java.lang.String ContentType) throws Throwable {
        try {
            classInstance.Set("ContentType", (Object)ContentType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebHeaderCollection getHeaders() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Headers");
            return new WebHeaderCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaders(WebHeaderCollection Headers) throws Throwable {
        try {
            classInstance.Set("Headers", (Object)Headers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMethod() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Method");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMethod(java.lang.String Method) throws Throwable {
        try {
            classInstance.Set("Method", (Object)Method);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPreAuthenticate() throws Throwable {
        try {
            return (boolean)classInstance.Get("PreAuthenticate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreAuthenticate(boolean PreAuthenticate) throws Throwable {
        try {
            classInstance.Set("PreAuthenticate", PreAuthenticate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getRequestUri() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RequestUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTimeout() throws Throwable {
        try {
            return (int)classInstance.Get("Timeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeout(int Timeout) throws Throwable {
        try {
            classInstance.Set("Timeout", Timeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseDefaultCredentials() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseDefaultCredentials");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseDefaultCredentials(boolean UseDefaultCredentials) throws Throwable {
        try {
            classInstance.Set("UseDefaultCredentials", UseDefaultCredentials);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthenticationLevel getAuthenticationLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AuthenticationLevel");
            return new AuthenticationLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAuthenticationLevel(AuthenticationLevel AuthenticationLevel) throws Throwable {
        try {
            classInstance.Set("AuthenticationLevel", (Object)AuthenticationLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TokenImpersonationLevel getImpersonationLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ImpersonationLevel");
            return new TokenImpersonationLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImpersonationLevel(TokenImpersonationLevel ImpersonationLevel) throws Throwable {
        try {
            classInstance.Set("ImpersonationLevel", (Object)ImpersonationLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}