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

package system.servicemodel.channels;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.channels.CustomBinding;
import system.servicemodel.channels.BindingParameterCollection;
import system.Uri;
import system.servicemodel.description.ListenUriMode;
import system.servicemodel.channels.BindingContext;
import system.servicemodel.channels.BindingElementCollection;


/**
 * The base .NET class managing System.ServiceModel.Channels.BindingContext, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class BindingContext extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Channels.BindingContext";
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

    public BindingContext(Object instance) throws Throwable {
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

    public static BindingContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new BindingContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    public BindingContext(CustomBinding binding, BindingParameterCollection parameters) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)binding.getJCOInstance(), (Object)parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingContext(CustomBinding binding, BindingParameterCollection parameters, Uri listenUriBaseAddress, java.lang.String listenUriRelativeAddress, ListenUriMode listenUriMode) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)binding.getJCOInstance(), (Object)parameters.getJCOInstance(), (Object)listenUriBaseAddress.getJCOInstance(), (Object)listenUriRelativeAddress, (Object)listenUriMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public BindingContext Clone() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new BindingContext(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public CustomBinding getBinding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Binding");
            return new CustomBinding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingParameterCollection getBindingParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BindingParameters");
            return new BindingParameterCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getListenUriBaseAddress() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ListenUriBaseAddress");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setListenUriBaseAddress(Uri ListenUriBaseAddress) throws Throwable {
        try {
            classInstance.Set("ListenUriBaseAddress", (Object)ListenUriBaseAddress.getJCOInstance());
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

    public java.lang.String getListenUriRelativeAddress() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ListenUriRelativeAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setListenUriRelativeAddress(java.lang.String ListenUriRelativeAddress) throws Throwable {
        try {
            classInstance.Set("ListenUriRelativeAddress", (Object)ListenUriRelativeAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingElementCollection getRemainingBindingElements() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RemainingBindingElements");
            return new BindingElementCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}