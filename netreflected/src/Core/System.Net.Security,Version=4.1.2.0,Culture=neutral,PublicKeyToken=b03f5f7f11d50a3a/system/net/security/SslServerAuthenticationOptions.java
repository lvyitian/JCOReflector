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
import system.net.security.RemoteCertificateValidationCallback;
import system.net.security.ServerCertificateSelectionCallback;
import system.security.cryptography.x509certificates.X509Certificate;
import system.security.authentication.SslProtocols;
import system.security.cryptography.x509certificates.X509RevocationMode;
import system.net.security.EncryptionPolicy;
import system.net.security.CipherSuitesPolicy;


/**
 * The base .NET class managing System.Net.Security.SslServerAuthenticationOptions, System.Net.Security, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SslServerAuthenticationOptions extends NetObject  {
    public static final String assemblyFullName = "System.Net.Security, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Net.Security";
    public static final String className = "System.Net.Security.SslServerAuthenticationOptions";
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

    public SslServerAuthenticationOptions(Object instance) throws Throwable {
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

    public static SslServerAuthenticationOptions castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SslServerAuthenticationOptions(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SslServerAuthenticationOptions() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public boolean getAllowRenegotiation() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowRenegotiation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowRenegotiation(boolean AllowRenegotiation) throws Throwable {
        try {
            classInstance.Set("AllowRenegotiation", AllowRenegotiation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getClientCertificateRequired() throws Throwable {
        try {
            return (boolean)classInstance.Get("ClientCertificateRequired");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClientCertificateRequired(boolean ClientCertificateRequired) throws Throwable {
        try {
            classInstance.Set("ClientCertificateRequired", ClientCertificateRequired);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RemoteCertificateValidationCallback getRemoteCertificateValidationCallback() throws Throwable {
        try {
            return (RemoteCertificateValidationCallback)classInstance.Get("RemoteCertificateValidationCallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRemoteCertificateValidationCallback(RemoteCertificateValidationCallback RemoteCertificateValidationCallback) throws Throwable {
        try {
            classInstance.Set("RemoteCertificateValidationCallback", RemoteCertificateValidationCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServerCertificateSelectionCallback getServerCertificateSelectionCallback() throws Throwable {
        try {
            return (ServerCertificateSelectionCallback)classInstance.Get("ServerCertificateSelectionCallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServerCertificateSelectionCallback(ServerCertificateSelectionCallback ServerCertificateSelectionCallback) throws Throwable {
        try {
            classInstance.Set("ServerCertificateSelectionCallback", ServerCertificateSelectionCallback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate getServerCertificate() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ServerCertificate");
            return new X509Certificate(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServerCertificate(X509Certificate ServerCertificate) throws Throwable {
        try {
            classInstance.Set("ServerCertificate", (Object)ServerCertificate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SslProtocols getEnabledSslProtocols() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EnabledSslProtocols");
            return new SslProtocols(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnabledSslProtocols(SslProtocols EnabledSslProtocols) throws Throwable {
        try {
            classInstance.Set("EnabledSslProtocols", (Object)EnabledSslProtocols.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509RevocationMode getCertificateRevocationCheckMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CertificateRevocationCheckMode");
            return new X509RevocationMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCertificateRevocationCheckMode(X509RevocationMode CertificateRevocationCheckMode) throws Throwable {
        try {
            classInstance.Set("CertificateRevocationCheckMode", (Object)CertificateRevocationCheckMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncryptionPolicy getEncryptionPolicy() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EncryptionPolicy");
            return new EncryptionPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncryptionPolicy(EncryptionPolicy EncryptionPolicy) throws Throwable {
        try {
            classInstance.Set("EncryptionPolicy", (Object)EncryptionPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CipherSuitesPolicy getCipherSuitesPolicy() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CipherSuitesPolicy");
            return new CipherSuitesPolicy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCipherSuitesPolicy(CipherSuitesPolicy CipherSuitesPolicy) throws Throwable {
        try {
            classInstance.Set("CipherSuitesPolicy", (Object)CipherSuitesPolicy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}