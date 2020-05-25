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

package system.net.websockets;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.websockets.WebSocketMessageType;


/**
 * The base .NET class managing System.Net.WebSockets.WebSocketReceiveResult, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class WebSocketReceiveResult extends NetObject  {
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System";
    public static final String className = "System.Net.WebSockets.WebSocketReceiveResult";
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

    public WebSocketReceiveResult(Object instance) throws Throwable {
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

    public static WebSocketReceiveResult castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WebSocketReceiveResult(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WebSocketReceiveResult(int count, WebSocketMessageType messageType, boolean endOfMessage) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(count, (Object)messageType.getJCOInstance(), endOfMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCount(int Count) throws Throwable {
        try {
            classInstance.Set("Count", Count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEndOfMessage() throws Throwable {
        try {
            return (boolean)classInstance.Get("EndOfMessage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEndOfMessage(boolean EndOfMessage) throws Throwable {
        try {
            classInstance.Set("EndOfMessage", EndOfMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebSocketMessageType getMessageType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MessageType");
            return new WebSocketMessageType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMessageType(WebSocketMessageType MessageType) throws Throwable {
        try {
            classInstance.Set("MessageType", (Object)MessageType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCloseStatusDescription() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CloseStatusDescription");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCloseStatusDescription(java.lang.String CloseStatusDescription) throws Throwable {
        try {
            classInstance.Set("CloseStatusDescription", (Object)CloseStatusDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}