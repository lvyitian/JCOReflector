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
import system.TimeSpan;
import system.configuration.ConfigurationLockCollection;
import system.configuration.ElementInformation;
import system.configuration.Configuration;


/**
 * The base .NET class managing System.ServiceModel.Configuration.LocalServiceSecuritySettingsElement, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class LocalServiceSecuritySettingsElement extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Configuration.LocalServiceSecuritySettingsElement";
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

    public LocalServiceSecuritySettingsElement(Object instance) throws Throwable {
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

    public static LocalServiceSecuritySettingsElement castFrom(IJCOBridgeReflected from) throws Throwable {
        return new LocalServiceSecuritySettingsElement(from.getJCOInstance());
    }

    // Constructors section
    
    
    public LocalServiceSecuritySettingsElement() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.collections.generic.KeyNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean IsReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getDetectReplays() throws Throwable {
        try {
            return (boolean)classInstance.Get("DetectReplays");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDetectReplays(boolean DetectReplays) throws Throwable {
        try {
            classInstance.Set("DetectReplays", DetectReplays);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getIssuedCookieLifetime() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IssuedCookieLifetime");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIssuedCookieLifetime(TimeSpan IssuedCookieLifetime) throws Throwable {
        try {
            classInstance.Set("IssuedCookieLifetime", (Object)IssuedCookieLifetime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxStatefulNegotiations() throws Throwable {
        try {
            return (int)classInstance.Get("MaxStatefulNegotiations");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxStatefulNegotiations(int MaxStatefulNegotiations) throws Throwable {
        try {
            classInstance.Set("MaxStatefulNegotiations", MaxStatefulNegotiations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getReplayCacheSize() throws Throwable {
        try {
            return (int)classInstance.Get("ReplayCacheSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReplayCacheSize(int ReplayCacheSize) throws Throwable {
        try {
            classInstance.Set("ReplayCacheSize", ReplayCacheSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getMaxClockSkew() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MaxClockSkew");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxClockSkew(TimeSpan MaxClockSkew) throws Throwable {
        try {
            classInstance.Set("MaxClockSkew", (Object)MaxClockSkew.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getNegotiationTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NegotiationTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNegotiationTimeout(TimeSpan NegotiationTimeout) throws Throwable {
        try {
            classInstance.Set("NegotiationTimeout", (Object)NegotiationTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getReplayWindow() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReplayWindow");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReplayWindow(TimeSpan ReplayWindow) throws Throwable {
        try {
            classInstance.Set("ReplayWindow", (Object)ReplayWindow.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getInactivityTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InactivityTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInactivityTimeout(TimeSpan InactivityTimeout) throws Throwable {
        try {
            classInstance.Set("InactivityTimeout", (Object)InactivityTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getSessionKeyRenewalInterval() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SessionKeyRenewalInterval");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSessionKeyRenewalInterval(TimeSpan SessionKeyRenewalInterval) throws Throwable {
        try {
            classInstance.Set("SessionKeyRenewalInterval", (Object)SessionKeyRenewalInterval.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getSessionKeyRolloverInterval() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SessionKeyRolloverInterval");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSessionKeyRolloverInterval(TimeSpan SessionKeyRolloverInterval) throws Throwable {
        try {
            classInstance.Set("SessionKeyRolloverInterval", (Object)SessionKeyRolloverInterval.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReconnectTransportOnFailure() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReconnectTransportOnFailure");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReconnectTransportOnFailure(boolean ReconnectTransportOnFailure) throws Throwable {
        try {
            classInstance.Set("ReconnectTransportOnFailure", ReconnectTransportOnFailure);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxPendingSessions() throws Throwable {
        try {
            return (int)classInstance.Get("MaxPendingSessions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxPendingSessions(int MaxPendingSessions) throws Throwable {
        try {
            classInstance.Set("MaxPendingSessions", MaxPendingSessions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxCachedCookies() throws Throwable {
        try {
            return (int)classInstance.Get("MaxCachedCookies");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxCachedCookies(int MaxCachedCookies) throws Throwable {
        try {
            classInstance.Set("MaxCachedCookies", MaxCachedCookies);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getTimestampValidityDuration() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TimestampValidityDuration");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimestampValidityDuration(TimeSpan TimestampValidityDuration) throws Throwable {
        try {
            classInstance.Set("TimestampValidityDuration", (Object)TimestampValidityDuration.getJCOInstance());
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