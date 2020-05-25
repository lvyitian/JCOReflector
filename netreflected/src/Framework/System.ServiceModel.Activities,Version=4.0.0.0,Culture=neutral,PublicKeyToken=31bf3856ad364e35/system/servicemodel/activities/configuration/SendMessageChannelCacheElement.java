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

package system.servicemodel.activities.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.configuration.ServiceModelExtensionElement;
import system.servicemodel.activities.configuration.FactorySettingsElement;
import system.servicemodel.activities.configuration.ChannelSettingsElement;
import system.configuration.ConfigurationLockCollection;
import system.configuration.ElementInformation;
import system.configuration.Configuration;


/**
 * The base .NET class managing System.ServiceModel.Activities.Configuration.SendMessageChannelCacheElement, System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class SendMessageChannelCacheElement extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.ServiceModel.Activities";
    public static final String className = "System.ServiceModel.Activities.Configuration.SendMessageChannelCacheElement";
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

    public SendMessageChannelCacheElement(Object instance) throws Throwable {
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

    public static SendMessageChannelCacheElement castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SendMessageChannelCacheElement(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SendMessageChannelCacheElement() throws Throwable, system.ArgumentNullException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void CopyFrom(ServiceModelExtensionElement from) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("CopyFrom", (Object)from.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAllowUnsafeCaching() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowUnsafeCaching");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowUnsafeCaching(boolean AllowUnsafeCaching) throws Throwable {
        try {
            classInstance.Set("AllowUnsafeCaching", AllowUnsafeCaching);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FactorySettingsElement getFactorySettings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FactorySettings");
            return new FactorySettingsElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ChannelSettingsElement getChannelSettings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ChannelSettings");
            return new ChannelSettingsElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getBehaviorType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BehaviorType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getConfigurationElementName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ConfigurationElementName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConfigurationElementName(java.lang.String ConfigurationElementName) throws Throwable {
        try {
            classInstance.Set("ConfigurationElementName", (Object)ConfigurationElementName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationLockCollection getLockAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LockAttributes");
            return new ConfigurationLockCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationLockCollection getLockAllAttributesExcept() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LockAllAttributesExcept");
            return new ConfigurationLockCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationLockCollection getLockElements() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LockElements");
            return new ConfigurationLockCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationLockCollection getLockAllElementsExcept() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LockAllElementsExcept");
            return new ConfigurationLockCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLockItem() throws Throwable {
        try {
            return (boolean)classInstance.Get("LockItem");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLockItem(boolean LockItem) throws Throwable {
        try {
            classInstance.Set("LockItem", LockItem);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ElementInformation getElementInformation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ElementInformation");
            return new ElementInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Configuration getCurrentConfiguration() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentConfiguration");
            return new Configuration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}