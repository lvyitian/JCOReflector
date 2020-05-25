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

package system.net.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.x509certificates.X509Certificate;
import system.security.cryptography.x509certificates.X509Chain;
import system.net.security.SslPolicyErrors;
import system.net.security.IRemoteCertificateValidationCallback;

/**
 * The base .NET class managing System.Net.Security.RemoteCertificateValidationCallback, System.Net.Security, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link JCDelegate}. Implements {@link IJCEventEmit}, {@link IJCOBridgeReflected}
 */
public class RemoteCertificateValidationCallback extends JCDelegate implements IJCEventEmit, IJCOBridgeReflected {
    public static final String assemblyFullName = "System.Net.Security, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Net.Security";
    public static final String className = "System.Net.Security.RemoteCertificateValidationCallback";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    IRemoteCertificateValidationCallback callerInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
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
        return this;
    }

    public JCType getJCOType() {
        return classType;
    }

    public final Object EventRaised(Object... argsFromJCOBridge) {
        try
        {
            NetObject sender = new NetObject(argsFromJCOBridge[0]);
            X509Certificate certificate = new X509Certificate(argsFromJCOBridge[1]);
            X509Chain chain = new X509Chain(argsFromJCOBridge[2]);
            SslPolicyErrors sslPolicyErrors = new SslPolicyErrors(argsFromJCOBridge[3]);


            Object retVal = null;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(sender, certificate, chain, sslPolicyErrors);
            } else {
                retVal = Invoke(sender, certificate, chain, sslPolicyErrors);
            }
            return retVal;
        }
        catch (Throwable throwableFromJCEvent)
        {
            if (JCOBridgeInstance.getDebug())
                throwableFromJCEvent.printStackTrace();
            return false;
        }
    }

    public final Object DelegateInvoked(Object... argsFromJCOBridge) {
        try
        {
            NetObject sender = new NetObject(argsFromJCOBridge[0]);
            X509Certificate certificate = new X509Certificate(argsFromJCOBridge[1]);
            X509Chain chain = new X509Chain(argsFromJCOBridge[2]);
            SslPolicyErrors sslPolicyErrors = new SslPolicyErrors(argsFromJCOBridge[3]);


            Object retVal = null;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(sender, certificate, chain, sslPolicyErrors);
            } else {
                retVal = Invoke(sender, certificate, chain, sslPolicyErrors);
            }
            return retVal;
        }
        catch (Throwable throwableFromJCEvent)
        {
            if (JCOBridgeInstance.getDebug())
                throwableFromJCEvent.printStackTrace();
            return false;
        }
    }

    public RemoteCertificateValidationCallback() {
        super(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public RemoteCertificateValidationCallback(IRemoteCertificateValidationCallback instance) {
        super(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }

    public boolean Invoke(NetObject sender, X509Certificate certificate, X509Chain chain, SslPolicyErrors sslPolicyErrors) {
        return false;
    }
}