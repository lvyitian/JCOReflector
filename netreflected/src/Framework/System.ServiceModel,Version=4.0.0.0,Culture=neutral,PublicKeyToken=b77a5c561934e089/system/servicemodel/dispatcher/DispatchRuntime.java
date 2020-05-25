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

package system.servicemodel.dispatcher;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.InstanceContext;
import system.servicemodel.ConcurrencyMode;
import system.servicemodel.AuditLogLocation;
import system.servicemodel.AuditLevel;
import system.servicemodel.ServiceAuthenticationManager;
import system.servicemodel.ServiceAuthorizationManager;
import system.servicemodel.dispatcher.ChannelDispatcher;
import system.servicemodel.dispatcher.ClientRuntime;
import system.servicemodel.dispatcher.EndpointDispatcher;
import system.threading.SynchronizationContext;
import system.servicemodel.description.PrincipalPermissionMode;
import system.web.security.RoleProvider;
import system.servicemodel.dispatcher.DispatchOperation;


/**
 * The base .NET class managing System.ServiceModel.Dispatcher.DispatchRuntime, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DispatchRuntime extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Dispatcher.DispatchRuntime";
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

    public DispatchRuntime(Object instance) throws Throwable {
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

    public static DispatchRuntime castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DispatchRuntime(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
    public InstanceContext getSingletonInstanceContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SingletonInstanceContext");
            return new InstanceContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSingletonInstanceContext(InstanceContext SingletonInstanceContext) throws Throwable {
        try {
            classInstance.Set("SingletonInstanceContext", (Object)SingletonInstanceContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConcurrencyMode getConcurrencyMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ConcurrencyMode");
            return new ConcurrencyMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConcurrencyMode(ConcurrencyMode ConcurrencyMode) throws Throwable {
        try {
            classInstance.Set("ConcurrencyMode", (Object)ConcurrencyMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnsureOrderedDispatch() throws Throwable {
        try {
            return (boolean)classInstance.Get("EnsureOrderedDispatch");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnsureOrderedDispatch(boolean EnsureOrderedDispatch) throws Throwable {
        try {
            classInstance.Set("EnsureOrderedDispatch", EnsureOrderedDispatch);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuditLogLocation getSecurityAuditLogLocation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityAuditLogLocation");
            return new AuditLogLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecurityAuditLogLocation(AuditLogLocation SecurityAuditLogLocation) throws Throwable {
        try {
            classInstance.Set("SecurityAuditLogLocation", (Object)SecurityAuditLogLocation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSuppressAuditFailure() throws Throwable {
        try {
            return (boolean)classInstance.Get("SuppressAuditFailure");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSuppressAuditFailure(boolean SuppressAuditFailure) throws Throwable {
        try {
            classInstance.Set("SuppressAuditFailure", SuppressAuditFailure);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuditLevel getServiceAuthorizationAuditLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ServiceAuthorizationAuditLevel");
            return new AuditLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServiceAuthorizationAuditLevel(AuditLevel ServiceAuthorizationAuditLevel) throws Throwable {
        try {
            classInstance.Set("ServiceAuthorizationAuditLevel", (Object)ServiceAuthorizationAuditLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuditLevel getMessageAuthenticationAuditLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MessageAuthenticationAuditLevel");
            return new AuditLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMessageAuthenticationAuditLevel(AuditLevel MessageAuthenticationAuditLevel) throws Throwable {
        try {
            classInstance.Set("MessageAuthenticationAuditLevel", (Object)MessageAuthenticationAuditLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceAuthenticationManager getServiceAuthenticationManager() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ServiceAuthenticationManager");
            return new ServiceAuthenticationManager(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServiceAuthenticationManager(ServiceAuthenticationManager ServiceAuthenticationManager) throws Throwable {
        try {
            classInstance.Set("ServiceAuthenticationManager", (Object)ServiceAuthenticationManager.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceAuthorizationManager getServiceAuthorizationManager() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ServiceAuthorizationManager");
            return new ServiceAuthorizationManager(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServiceAuthorizationManager(ServiceAuthorizationManager ServiceAuthorizationManager) throws Throwable {
        try {
            classInstance.Set("ServiceAuthorizationManager", (Object)ServiceAuthorizationManager.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAutomaticInputSessionShutdown() throws Throwable {
        try {
            return (boolean)classInstance.Get("AutomaticInputSessionShutdown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutomaticInputSessionShutdown(boolean AutomaticInputSessionShutdown) throws Throwable {
        try {
            classInstance.Set("AutomaticInputSessionShutdown", AutomaticInputSessionShutdown);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChannelDispatcher getChannelDispatcher() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ChannelDispatcher");
            return new ChannelDispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClientRuntime getCallbackClientRuntime() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CallbackClientRuntime");
            return new ClientRuntime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EndpointDispatcher getEndpointDispatcher() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EndpointDispatcher");
            return new EndpointDispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getImpersonateCallerForAllOperations() throws Throwable {
        try {
            return (boolean)classInstance.Get("ImpersonateCallerForAllOperations");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImpersonateCallerForAllOperations(boolean ImpersonateCallerForAllOperations) throws Throwable {
        try {
            classInstance.Set("ImpersonateCallerForAllOperations", ImpersonateCallerForAllOperations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getImpersonateOnSerializingReply() throws Throwable {
        try {
            return (boolean)classInstance.Get("ImpersonateOnSerializingReply");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImpersonateOnSerializingReply(boolean ImpersonateOnSerializingReply) throws Throwable {
        try {
            classInstance.Set("ImpersonateOnSerializingReply", ImpersonateOnSerializingReply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnoreTransactionMessageProperty() throws Throwable {
        try {
            return (boolean)classInstance.Get("IgnoreTransactionMessageProperty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreTransactionMessageProperty(boolean IgnoreTransactionMessageProperty) throws Throwable {
        try {
            classInstance.Set("IgnoreTransactionMessageProperty", IgnoreTransactionMessageProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReleaseServiceInstanceOnTransactionComplete() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReleaseServiceInstanceOnTransactionComplete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReleaseServiceInstanceOnTransactionComplete(boolean ReleaseServiceInstanceOnTransactionComplete) throws Throwable {
        try {
            classInstance.Set("ReleaseServiceInstanceOnTransactionComplete", ReleaseServiceInstanceOnTransactionComplete);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SynchronizationContext getSynchronizationContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SynchronizationContext");
            return new SynchronizationContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSynchronizationContext(SynchronizationContext SynchronizationContext) throws Throwable {
        try {
            classInstance.Set("SynchronizationContext", (Object)SynchronizationContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrincipalPermissionMode getPrincipalPermissionMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PrincipalPermissionMode");
            return new PrincipalPermissionMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrincipalPermissionMode(PrincipalPermissionMode PrincipalPermissionMode) throws Throwable {
        try {
            classInstance.Set("PrincipalPermissionMode", (Object)PrincipalPermissionMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RoleProvider getRoleProvider() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RoleProvider");
            return new RoleProvider(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRoleProvider(RoleProvider RoleProvider) throws Throwable {
        try {
            classInstance.Set("RoleProvider", (Object)RoleProvider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTransactionAutoCompleteOnSessionClose() throws Throwable {
        try {
            return (boolean)classInstance.Get("TransactionAutoCompleteOnSessionClose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransactionAutoCompleteOnSessionClose(boolean TransactionAutoCompleteOnSessionClose) throws Throwable {
        try {
            classInstance.Set("TransactionAutoCompleteOnSessionClose", TransactionAutoCompleteOnSessionClose);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Type");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setType(NetType Type) throws Throwable {
        try {
            classInstance.Set("Type", (Object)Type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatchOperation getUnhandledDispatchOperation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UnhandledDispatchOperation");
            return new DispatchOperation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnhandledDispatchOperation(DispatchOperation UnhandledDispatchOperation) throws Throwable {
        try {
            classInstance.Set("UnhandledDispatchOperation", (Object)UnhandledDispatchOperation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getValidateMustUnderstand() throws Throwable {
        try {
            return (boolean)classInstance.Get("ValidateMustUnderstand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidateMustUnderstand(boolean ValidateMustUnderstand) throws Throwable {
        try {
            classInstance.Set("ValidateMustUnderstand", ValidateMustUnderstand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPreserveMessage() throws Throwable {
        try {
            return (boolean)classInstance.Get("PreserveMessage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreserveMessage(boolean PreserveMessage) throws Throwable {
        try {
            classInstance.Set("PreserveMessage", PreserveMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}