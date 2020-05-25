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

package system.web;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.HttpCacheability;
import system.DateTime;
import system.TimeSpan;
import system.web.HttpCacheRevalidation;
import system.web.HttpCacheVaryByContentEncodings;
import system.web.HttpCacheVaryByHeaders;
import system.web.HttpCacheVaryByParams;


/**
 * The base .NET class managing System.Web.HttpCachePolicy, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class HttpCachePolicy extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.HttpCachePolicy";
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

    public HttpCachePolicy(Object instance) throws Throwable {
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

    public static HttpCachePolicy castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HttpCachePolicy(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public boolean IsModified() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsModified");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetNoServerCaching() throws Throwable {
        try {
            classInstance.Invoke("SetNoServerCaching");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetNoServerCaching() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetNoServerCaching");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetVaryByCustom(java.lang.String custom) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("SetVaryByCustom", (Object)custom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetVaryByCustom() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetVaryByCustom");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCacheExtensions() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetCacheExtensions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetNoTransforms() throws Throwable {
        try {
            classInstance.Invoke("SetNoTransforms");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetNoTransforms() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetNoTransforms");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetIgnoreRangeRequests() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetIgnoreRangeRequests");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCacheability(HttpCacheability cacheability) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("SetCacheability", (Object)cacheability.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpCacheability GetCacheability() throws Throwable {
        try {
            JCObject objGetCacheability = (JCObject)classInstance.Invoke("GetCacheability");
            return new HttpCacheability(objGetCacheability);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetNoStore() throws Throwable {
        try {
            classInstance.Invoke("SetNoStore");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetNoStore() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetNoStore");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetExpires(DateTime date) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.NotSupportedException, system.OverflowException {
        try {
            classInstance.Invoke("SetExpires", (Object)date.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetExpires() throws Throwable {
        try {
            JCObject objGetExpires = (JCObject)classInstance.Invoke("GetExpires");
            return new DateTime(objGetExpires);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetMaxAge(TimeSpan delta) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("SetMaxAge", (Object)delta.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan GetMaxAge() throws Throwable {
        try {
            JCObject objGetMaxAge = (JCObject)classInstance.Invoke("GetMaxAge");
            return new TimeSpan(objGetMaxAge);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetProxyMaxAge(TimeSpan delta) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("SetProxyMaxAge", (Object)delta.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan GetProxyMaxAge() throws Throwable {
        try {
            JCObject objGetProxyMaxAge = (JCObject)classInstance.Invoke("GetProxyMaxAge");
            return new TimeSpan(objGetProxyMaxAge);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSlidingExpiration(boolean slide) throws Throwable {
        try {
            classInstance.Invoke("SetSlidingExpiration", slide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HasSlidingExpiration() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("HasSlidingExpiration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValidUntilExpires(boolean validUntilExpires) throws Throwable {
        try {
            classInstance.Invoke("SetValidUntilExpires", validUntilExpires);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValidUntilExpires() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsValidUntilExpires");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAllowResponseInBrowserHistory(boolean allow) throws Throwable {
        try {
            classInstance.Invoke("SetAllowResponseInBrowserHistory", allow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetRevalidation(HttpCacheRevalidation revalidation) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("SetRevalidation", (Object)revalidation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpCacheRevalidation GetRevalidation() throws Throwable {
        try {
            JCObject objGetRevalidation = (JCObject)classInstance.Invoke("GetRevalidation");
            return new HttpCacheRevalidation(objGetRevalidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetETag(java.lang.String etag) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("SetETag", (Object)etag);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetETag() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetETag");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetLastModified(DateTime date) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidTimeZoneException, system.NotSupportedException, system.OverflowException {
        try {
            classInstance.Invoke("SetLastModified", (Object)date.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetUtcLastModified() throws Throwable {
        try {
            JCObject objGetUtcLastModified = (JCObject)classInstance.Invoke("GetUtcLastModified");
            return new DateTime(objGetUtcLastModified);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetLastModifiedFromFileDependencies() throws Throwable {
        try {
            classInstance.Invoke("SetLastModifiedFromFileDependencies");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetLastModifiedFromFileDependencies() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetLastModifiedFromFileDependencies");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetETagFromFileDependencies() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("SetETagFromFileDependencies");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetETagFromFileDependencies() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetETagFromFileDependencies");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOmitVaryStar(boolean omit) throws Throwable {
        try {
            classInstance.Invoke("SetOmitVaryStar", omit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetOmitVaryStar() throws Throwable {
        try {
            return (int)classInstance.Invoke("GetOmitVaryStar");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AppendCacheExtension(java.lang.String extension) throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("AppendCacheExtension", (Object)extension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCacheability(HttpCacheability cacheability, java.lang.String field) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetCacheability", (Object)cacheability.getJCOInstance(), (Object)field);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public HttpCacheVaryByContentEncodings getVaryByContentEncodings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("VaryByContentEncodings");
            return new HttpCacheVaryByContentEncodings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpCacheVaryByHeaders getVaryByHeaders() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("VaryByHeaders");
            return new HttpCacheVaryByHeaders(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpCacheVaryByParams getVaryByParams() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("VaryByParams");
            return new HttpCacheVaryByParams(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getUtcTimestampCreated() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UtcTimestampCreated");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUtcTimestampCreated(DateTime UtcTimestampCreated) throws Throwable {
        try {
            classInstance.Set("UtcTimestampCreated", (Object)UtcTimestampCreated.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}