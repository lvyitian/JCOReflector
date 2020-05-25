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
import system.servicemodel.channels.WebSocketTransportSettings;
import system.servicemodel.channels.WebSocketTransportUsage;
import system.TimeSpan;


/**
 * The base .NET class managing System.ServiceModel.Channels.WebSocketTransportSettings, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class WebSocketTransportSettings extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Channels.WebSocketTransportSettings";
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

    public WebSocketTransportSettings(Object instance) throws Throwable {
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

    public static WebSocketTransportSettings castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WebSocketTransportSettings(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WebSocketTransportSettings() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Equals(WebSocketTransportSettings other) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public WebSocketTransportUsage getTransportUsage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TransportUsage");
            return new WebSocketTransportUsage(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransportUsage(WebSocketTransportUsage TransportUsage) throws Throwable {
        try {
            classInstance.Set("TransportUsage", (Object)TransportUsage.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCreateNotificationOnConnection() throws Throwable {
        try {
            return (boolean)classInstance.Get("CreateNotificationOnConnection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCreateNotificationOnConnection(boolean CreateNotificationOnConnection) throws Throwable {
        try {
            classInstance.Set("CreateNotificationOnConnection", CreateNotificationOnConnection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getKeepAliveInterval() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeepAliveInterval");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeepAliveInterval(TimeSpan KeepAliveInterval) throws Throwable {
        try {
            classInstance.Set("KeepAliveInterval", (Object)KeepAliveInterval.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSubProtocol() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SubProtocol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSubProtocol(java.lang.String SubProtocol) throws Throwable {
        try {
            classInstance.Set("SubProtocol", (Object)SubProtocol);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDisablePayloadMasking() throws Throwable {
        try {
            return (boolean)classInstance.Get("DisablePayloadMasking");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisablePayloadMasking(boolean DisablePayloadMasking) throws Throwable {
        try {
            classInstance.Set("DisablePayloadMasking", DisablePayloadMasking);
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



	// Instance Events section
    
    
}