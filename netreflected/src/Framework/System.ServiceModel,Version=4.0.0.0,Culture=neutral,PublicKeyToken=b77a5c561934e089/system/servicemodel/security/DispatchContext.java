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

package system.servicemodel.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.claims.ClaimsPrincipal;
import system.identitymodel.protocols.wstrust.WSTrustMessage;
import system.identitymodel.protocols.wstrust.RequestSecurityTokenResponse;
import system.identitymodel.SecurityTokenService;


/**
 * The base .NET class managing System.ServiceModel.Security.DispatchContext, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DispatchContext extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Security.DispatchContext";
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

    public DispatchContext(Object instance) throws Throwable {
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

    public static DispatchContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DispatchContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DispatchContext() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public ClaimsPrincipal getPrincipal() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Principal");
            return new ClaimsPrincipal(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrincipal(ClaimsPrincipal Principal) throws Throwable {
        try {
            classInstance.Set("Principal", (Object)Principal.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRequestAction() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RequestAction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequestAction(java.lang.String RequestAction) throws Throwable {
        try {
            classInstance.Set("RequestAction", (Object)RequestAction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WSTrustMessage getRequestMessage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RequestMessage");
            return new WSTrustMessage(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequestMessage(WSTrustMessage RequestMessage) throws Throwable {
        try {
            classInstance.Set("RequestMessage", (Object)RequestMessage.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getResponseAction() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ResponseAction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResponseAction(java.lang.String ResponseAction) throws Throwable {
        try {
            classInstance.Set("ResponseAction", (Object)ResponseAction);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RequestSecurityTokenResponse getResponseMessage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ResponseMessage");
            return new RequestSecurityTokenResponse(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResponseMessage(RequestSecurityTokenResponse ResponseMessage) throws Throwable {
        try {
            classInstance.Set("ResponseMessage", (Object)ResponseMessage.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityTokenService getSecurityTokenService() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityTokenService");
            return new SecurityTokenService(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecurityTokenService(SecurityTokenService SecurityTokenService) throws Throwable {
        try {
            classInstance.Set("SecurityTokenService", (Object)SecurityTokenService.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTrustNamespace() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TrustNamespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrustNamespace(java.lang.String TrustNamespace) throws Throwable {
        try {
            classInstance.Set("TrustNamespace", (Object)TrustNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}