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

package system.net.websockets;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Uri;
import system.collections.specialized.NameValueCollection;
import system.net.CookieCollection;
import system.net.websockets.WebSocket;


/**
 * The base .NET class managing System.Net.WebSockets.WebSocketContext, System.Net.WebSockets, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class WebSocketContext extends NetObject  {
    public static final String assemblyFullName = "System.Net.WebSockets, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Net.WebSockets";
    public static final String className = "System.Net.WebSockets.WebSocketContext";
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

    public WebSocketContext(Object instance) throws Throwable {
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

    public static WebSocketContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WebSocketContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
    public Uri getRequestUri() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RequestUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NameValueCollection getHeaders() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Headers");
            return new NameValueCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOrigin() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Origin");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSecWebSocketVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SecWebSocketVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSecWebSocketKey() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SecWebSocketKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CookieCollection getCookieCollection() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CookieCollection");
            return new CookieCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsAuthenticated() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsAuthenticated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsLocal() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsLocal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSecureConnection() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSecureConnection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebSocket getWebSocket() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WebSocket");
            return new WebSocket(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}