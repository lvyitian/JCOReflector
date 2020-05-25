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
import system.servicemodel.HostNameComparisonMode;
import system.TimeSpan;
import system.servicemodel.TransferMode;


/**
 * The base .NET class managing System.ServiceModel.Channels.ConnectionOrientedTransportBindingElement, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ConnectionOrientedTransportBindingElement extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Channels.ConnectionOrientedTransportBindingElement";
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

    public ConnectionOrientedTransportBindingElement(Object instance) throws Throwable {
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

    public static ConnectionOrientedTransportBindingElement castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ConnectionOrientedTransportBindingElement(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public boolean ShouldSerializeMaxPendingAccepts() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeMaxPendingAccepts");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldSerializeMaxPendingConnections() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeMaxPendingConnections");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getConnectionBufferSize() throws Throwable {
        try {
            return (int)classInstance.Get("ConnectionBufferSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConnectionBufferSize(int ConnectionBufferSize) throws Throwable {
        try {
            classInstance.Set("ConnectionBufferSize", ConnectionBufferSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HostNameComparisonMode getHostNameComparisonMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HostNameComparisonMode");
            return new HostNameComparisonMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHostNameComparisonMode(HostNameComparisonMode HostNameComparisonMode) throws Throwable {
        try {
            classInstance.Set("HostNameComparisonMode", (Object)HostNameComparisonMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxBufferSize() throws Throwable {
        try {
            return (int)classInstance.Get("MaxBufferSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxBufferSize(int MaxBufferSize) throws Throwable {
        try {
            classInstance.Set("MaxBufferSize", MaxBufferSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxPendingConnections() throws Throwable {
        try {
            return (int)classInstance.Get("MaxPendingConnections");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxPendingConnections(int MaxPendingConnections) throws Throwable {
        try {
            classInstance.Set("MaxPendingConnections", MaxPendingConnections);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getChannelInitializationTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ChannelInitializationTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setChannelInitializationTimeout(TimeSpan ChannelInitializationTimeout) throws Throwable {
        try {
            classInstance.Set("ChannelInitializationTimeout", (Object)ChannelInitializationTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getMaxOutputDelay() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MaxOutputDelay");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxOutputDelay(TimeSpan MaxOutputDelay) throws Throwable {
        try {
            classInstance.Set("MaxOutputDelay", (Object)MaxOutputDelay.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxPendingAccepts() throws Throwable {
        try {
            return (int)classInstance.Get("MaxPendingAccepts");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxPendingAccepts(int MaxPendingAccepts) throws Throwable {
        try {
            classInstance.Set("MaxPendingAccepts", MaxPendingAccepts);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TransferMode getTransferMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TransferMode");
            return new TransferMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransferMode(TransferMode TransferMode) throws Throwable {
        try {
            classInstance.Set("TransferMode", (Object)TransferMode.getJCOInstance());
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

    public java.lang.String getScheme() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Scheme");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}