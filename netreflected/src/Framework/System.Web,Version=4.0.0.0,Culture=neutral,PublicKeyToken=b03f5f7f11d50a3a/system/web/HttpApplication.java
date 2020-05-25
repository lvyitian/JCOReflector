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
import system.web.HttpContext;
import system.web.HttpRequest;
import system.web.HttpResponse;
import system.web.sessionstate.HttpSessionState;
import system.web.HttpApplicationState;
import system.web.HttpServerUtility;
import system.web.HttpModuleCollection;
import system.EventHandler;


/**
 * The base .NET class managing System.Web.HttpApplication, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class HttpApplication extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.HttpApplication";
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

    public HttpApplication(Object instance) throws Throwable {
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

    public static HttpApplication castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HttpApplication(from.getJCOInstance());
    }

    // Constructors section
    
    
    public HttpApplication() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void CompleteRequest() throws Throwable {
        try {
            classInstance.Invoke("CompleteRequest");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetOutputCacheProviderName(HttpContext context) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.web.HttpException, system.IndexOutOfRangeException, system.configuration.provider.ProviderException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.configuration.ConfigurationException {
        try {
            return (java.lang.String)classInstance.Invoke("GetOutputCacheProviderName", (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetVaryByCustomString(HttpContext context, java.lang.String custom) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.web.HttpException, system.web.HttpRequestValidationException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.NullReferenceException {
        try {
            return (java.lang.String)classInstance.Invoke("GetVaryByCustomString", (Object)context.getJCOInstance(), (Object)custom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterModule(NetType moduleType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.web.HttpException, system.InvalidOperationException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException, system.NotSupportedException, system.NullReferenceException, system.configuration.ConfigurationErrorsException {
        try {
            classType.Invoke("RegisterModule", (Object)moduleType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public HttpContext getContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Context");
            return new HttpContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpRequest getRequest() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Request");
            return new HttpRequest(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpResponse getResponse() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Response");
            return new HttpResponse(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpSessionState getSession() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Session");
            return new HttpSessionState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpApplicationState getApplication() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Application");
            return new HttpApplicationState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpServerUtility getServer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Server");
            return new HttpServerUtility(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpModuleCollection getModules() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Modules");
            return new HttpModuleCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addBeginRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("BeginRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBeginRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("BeginRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAuthenticateRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AuthenticateRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAuthenticateRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AuthenticateRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPostAuthenticateRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PostAuthenticateRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePostAuthenticateRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PostAuthenticateRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAuthorizeRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AuthorizeRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAuthorizeRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AuthorizeRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPostAuthorizeRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PostAuthorizeRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePostAuthorizeRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PostAuthorizeRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addResolveRequestCache(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ResolveRequestCache", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeResolveRequestCache(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ResolveRequestCache", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPostResolveRequestCache(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PostResolveRequestCache", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePostResolveRequestCache(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PostResolveRequestCache", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMapRequestHandler(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("MapRequestHandler", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMapRequestHandler(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("MapRequestHandler", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPostMapRequestHandler(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PostMapRequestHandler", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePostMapRequestHandler(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PostMapRequestHandler", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAcquireRequestState(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AcquireRequestState", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAcquireRequestState(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AcquireRequestState", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPostAcquireRequestState(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PostAcquireRequestState", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePostAcquireRequestState(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PostAcquireRequestState", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPreRequestHandlerExecute(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PreRequestHandlerExecute", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePreRequestHandlerExecute(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PreRequestHandlerExecute", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPostRequestHandlerExecute(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PostRequestHandlerExecute", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePostRequestHandlerExecute(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PostRequestHandlerExecute", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addReleaseRequestState(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ReleaseRequestState", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeReleaseRequestState(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ReleaseRequestState", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPostReleaseRequestState(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PostReleaseRequestState", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePostReleaseRequestState(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PostReleaseRequestState", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUpdateRequestCache(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("UpdateRequestCache", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUpdateRequestCache(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("UpdateRequestCache", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPostUpdateRequestCache(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PostUpdateRequestCache", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePostUpdateRequestCache(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PostUpdateRequestCache", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addLogRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("LogRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeLogRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("LogRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPostLogRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PostLogRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePostLogRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PostLogRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addEndRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("EndRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeEndRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("EndRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addError(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Error", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeError(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Error", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addRequestCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("RequestCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeRequestCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("RequestCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPreSendRequestHeaders(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PreSendRequestHeaders", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePreSendRequestHeaders(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PreSendRequestHeaders", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPreSendRequestContent(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PreSendRequestContent", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePreSendRequestContent(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PreSendRequestContent", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}