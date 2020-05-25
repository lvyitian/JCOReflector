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

package system.servicemodel.description;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.EndpointAddress;
import system.servicemodel.description.ContractDescription;
import system.Uri;
import system.servicemodel.description.ListenUriMode;


/**
 * The base .NET class managing System.ServiceModel.Description.ServiceMetadataEndpoint, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ServiceMetadataEndpoint extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Description.ServiceMetadataEndpoint";
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

    public ServiceMetadataEndpoint(Object instance) throws Throwable {
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

    public static ServiceMetadataEndpoint castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ServiceMetadataEndpoint(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ServiceMetadataEndpoint() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceMetadataEndpoint(EndpointAddress address) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)address.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceMetadataEndpoint(system.servicemodel.channels.Binding binding, EndpointAddress address) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)binding.getJCOInstance(), (Object)address.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public EndpointAddress getAddress() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Address");
            return new EndpointAddress(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAddress(EndpointAddress Address) throws Throwable {
        try {
            classInstance.Set("Address", (Object)Address.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.servicemodel.channels.Binding getBinding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Binding");
            return new system.servicemodel.channels.Binding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBinding(system.servicemodel.channels.Binding Binding) throws Throwable {
        try {
            classInstance.Set("Binding", (Object)Binding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContractDescription getContract() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Contract");
            return new ContractDescription(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContract(ContractDescription Contract) throws Throwable {
        try {
            classInstance.Set("Contract", (Object)Contract.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSystemEndpoint() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSystemEndpoint");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsSystemEndpoint(boolean IsSystemEndpoint) throws Throwable {
        try {
            classInstance.Set("IsSystemEndpoint", IsSystemEndpoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getListenUri() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ListenUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setListenUri(Uri ListenUri) throws Throwable {
        try {
            classInstance.Set("ListenUri", (Object)ListenUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ListenUriMode getListenUriMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ListenUriMode");
            return new ListenUriMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setListenUriMode(ListenUriMode ListenUriMode) throws Throwable {
        try {
            classInstance.Set("ListenUriMode", (Object)ListenUriMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}