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

package system.servicemodel.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.channels.BindingElement;
import system.servicemodel.configuration.ServiceModelExtensionElement;
import system.Uri;
import system.servicemodel.DeadLetterQueue;
import system.servicemodel.ReceiveErrorHandling;
import system.TimeSpan;
import system.servicemodel.configuration.MsmqTransportSecurityElement;
import system.configuration.ConfigurationLockCollection;
import system.configuration.ElementInformation;
import system.configuration.Configuration;


/**
 * The base .NET class managing System.ServiceModel.Configuration.MsmqElementBase, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class MsmqElementBase extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Configuration.MsmqElementBase";
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

    public MsmqElementBase(Object instance) throws Throwable {
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

    public static MsmqElementBase castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MsmqElementBase(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void ApplyConfiguration(BindingElement bindingElement) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException {
        try {
            classInstance.Invoke("ApplyConfiguration", (Object)bindingElement.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyFrom(ServiceModelExtensionElement from) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationException, system.NullReferenceException {
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
    
    
    public Uri getCustomDeadLetterQueue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CustomDeadLetterQueue");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCustomDeadLetterQueue(Uri CustomDeadLetterQueue) throws Throwable {
        try {
            classInstance.Set("CustomDeadLetterQueue", (Object)CustomDeadLetterQueue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DeadLetterQueue getDeadLetterQueue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DeadLetterQueue");
            return new DeadLetterQueue(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeadLetterQueue(DeadLetterQueue DeadLetterQueue) throws Throwable {
        try {
            classInstance.Set("DeadLetterQueue", (Object)DeadLetterQueue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDurable() throws Throwable {
        try {
            return (boolean)classInstance.Get("Durable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDurable(boolean Durable) throws Throwable {
        try {
            classInstance.Set("Durable", Durable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExactlyOnce() throws Throwable {
        try {
            return (boolean)classInstance.Get("ExactlyOnce");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExactlyOnce(boolean ExactlyOnce) throws Throwable {
        try {
            classInstance.Set("ExactlyOnce", ExactlyOnce);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxRetryCycles() throws Throwable {
        try {
            return (int)classInstance.Get("MaxRetryCycles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxRetryCycles(int MaxRetryCycles) throws Throwable {
        try {
            classInstance.Set("MaxRetryCycles", MaxRetryCycles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReceiveContextEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReceiveContextEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReceiveContextEnabled(boolean ReceiveContextEnabled) throws Throwable {
        try {
            classInstance.Set("ReceiveContextEnabled", ReceiveContextEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReceiveErrorHandling getReceiveErrorHandling() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReceiveErrorHandling");
            return new ReceiveErrorHandling(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReceiveErrorHandling(ReceiveErrorHandling ReceiveErrorHandling) throws Throwable {
        try {
            classInstance.Set("ReceiveErrorHandling", (Object)ReceiveErrorHandling.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getReceiveRetryCount() throws Throwable {
        try {
            return (int)classInstance.Get("ReceiveRetryCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReceiveRetryCount(int ReceiveRetryCount) throws Throwable {
        try {
            classInstance.Set("ReceiveRetryCount", ReceiveRetryCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getRetryCycleDelay() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RetryCycleDelay");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRetryCycleDelay(TimeSpan RetryCycleDelay) throws Throwable {
        try {
            classInstance.Set("RetryCycleDelay", (Object)RetryCycleDelay.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MsmqTransportSecurityElement getMsmqTransportSecurity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MsmqTransportSecurity");
            return new MsmqTransportSecurityElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getTimeToLive() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TimeToLive");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeToLive(TimeSpan TimeToLive) throws Throwable {
        try {
            classInstance.Set("TimeToLive", (Object)TimeToLive.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseSourceJournal() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseSourceJournal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseSourceJournal(boolean UseSourceJournal) throws Throwable {
        try {
            classInstance.Set("UseSourceJournal", UseSourceJournal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseMsmqTracing() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseMsmqTracing");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseMsmqTracing(boolean UseMsmqTracing) throws Throwable {
        try {
            classInstance.Set("UseMsmqTracing", UseMsmqTracing);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getValidityDuration() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValidityDuration");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidityDuration(TimeSpan ValidityDuration) throws Throwable {
        try {
            classInstance.Set("ValidityDuration", (Object)ValidityDuration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getManualAddressing() throws Throwable {
        try {
            return (boolean)classInstance.Get("ManualAddressing");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setManualAddressing(boolean ManualAddressing) throws Throwable {
        try {
            classInstance.Set("ManualAddressing", ManualAddressing);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getMaxBufferPoolSize() throws Throwable {
        try {
            return (long)classInstance.Get("MaxBufferPoolSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxBufferPoolSize(long MaxBufferPoolSize) throws Throwable {
        try {
            classInstance.Set("MaxBufferPoolSize", MaxBufferPoolSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getMaxReceivedMessageSize() throws Throwable {
        try {
            return (long)classInstance.Get("MaxReceivedMessageSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxReceivedMessageSize(long MaxReceivedMessageSize) throws Throwable {
        try {
            classInstance.Set("MaxReceivedMessageSize", MaxReceivedMessageSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getBindingElementType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BindingElementType");
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