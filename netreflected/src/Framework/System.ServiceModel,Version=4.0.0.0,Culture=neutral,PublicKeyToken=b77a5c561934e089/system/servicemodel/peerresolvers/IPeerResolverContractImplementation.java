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
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.servicemodel.peerresolvers;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.peerresolvers.RefreshResponseInfo;
import system.servicemodel.peerresolvers.RefreshInfo;
import system.servicemodel.peerresolvers.RegisterResponseInfo;
import system.servicemodel.peerresolvers.RegisterInfo;
import system.servicemodel.peerresolvers.UpdateInfo;
import system.servicemodel.peerresolvers.ResolveResponseInfo;
import system.servicemodel.peerresolvers.ResolveInfo;
import system.servicemodel.peerresolvers.ServiceSettingsResponseInfo;
import system.servicemodel.peerresolvers.UnregisterInfo;


/**
 * The base .NET class managing System.ServiceModel.PeerResolvers.IPeerResolverContract, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.PeerResolvers.IPeerResolverContract" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.PeerResolvers.IPeerResolverContract</a>
 */
public class IPeerResolverContractImplementation extends NetObject implements IPeerResolverContract {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.PeerResolvers.IPeerResolverContract
     */
    public static final String className = "System.ServiceModel.PeerResolvers.IPeerResolverContract";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public IPeerResolverContractImplementation(Object instance) throws Throwable {
        super(instance);
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
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IPeerResolverContract}, a cast assert is made to check if types are compatible.
     */
    public static IPeerResolverContract ToIPeerResolverContract(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IPeerResolverContractImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public RefreshResponseInfo Refresh(RefreshInfo refreshInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRefresh = (JCObject)classInstance.Invoke("Refresh", refreshInfo == null ? null : refreshInfo.getJCOInstance());
            return new RefreshResponseInfo(objRefresh);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegisterResponseInfo Register(RegisterInfo registerInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRegister = (JCObject)classInstance.Invoke("Register", registerInfo == null ? null : registerInfo.getJCOInstance());
            return new RegisterResponseInfo(objRegister);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegisterResponseInfo Update(UpdateInfo updateInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objUpdate = (JCObject)classInstance.Invoke("Update", updateInfo == null ? null : updateInfo.getJCOInstance());
            return new RegisterResponseInfo(objUpdate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ResolveResponseInfo Resolve(ResolveInfo resolveInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objResolve = (JCObject)classInstance.Invoke("Resolve", resolveInfo == null ? null : resolveInfo.getJCOInstance());
            return new ResolveResponseInfo(objResolve);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceSettingsResponseInfo GetServiceSettings() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetServiceSettings = (JCObject)classInstance.Invoke("GetServiceSettings");
            return new ServiceSettingsResponseInfo(objGetServiceSettings);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Unregister(UnregisterInfo unregisterInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Unregister", unregisterInfo == null ? null : unregisterInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}