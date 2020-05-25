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

package system.servicemodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.TimeSpan;
import system.Uri;
import system.servicemodel.DeadLetterQueue;
import system.servicemodel.ReceiveErrorHandling;
import system.servicemodel.channels.MessageVersion;


/**
 * The base .NET class managing System.ServiceModel.MsmqBindingBase, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class MsmqBindingBase extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.MsmqBindingBase";
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

    public MsmqBindingBase(Object instance) throws Throwable {
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

    public static MsmqBindingBase castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MsmqBindingBase(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public boolean ShouldSerializeName() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldSerializeNamespace() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeNamespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
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

    public java.lang.String getScheme() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Scheme");
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

    public TimeSpan getCloseTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CloseTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCloseTimeout(TimeSpan CloseTimeout) throws Throwable {
        try {
            classInstance.Set("CloseTimeout", (Object)CloseTimeout.getJCOInstance());
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

    public java.lang.String getNamespace() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Namespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNamespace(java.lang.String Namespace) throws Throwable {
        try {
            classInstance.Set("Namespace", (Object)Namespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getOpenTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OpenTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOpenTimeout(TimeSpan OpenTimeout) throws Throwable {
        try {
            classInstance.Set("OpenTimeout", (Object)OpenTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getReceiveTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReceiveTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReceiveTimeout(TimeSpan ReceiveTimeout) throws Throwable {
        try {
            classInstance.Set("ReceiveTimeout", (Object)ReceiveTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageVersion getMessageVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MessageVersion");
            return new MessageVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getSendTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SendTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSendTimeout(TimeSpan SendTimeout) throws Throwable {
        try {
            classInstance.Set("SendTimeout", (Object)SendTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}