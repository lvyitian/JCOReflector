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

package system.servicemodel.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.x509certificates.StoreLocation;
import system.security.cryptography.x509certificates.StoreName;
import system.security.cryptography.x509certificates.X509FindType;
import system.security.cryptography.x509certificates.X509Certificate2;


/**
 * The base .NET class managing System.ServiceModel.Security.X509CertificateInitiatorClientCredential, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class X509CertificateInitiatorClientCredential extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Security.X509CertificateInitiatorClientCredential";
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

    public X509CertificateInitiatorClientCredential(Object instance) throws Throwable {
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

    public static X509CertificateInitiatorClientCredential castFrom(IJCOBridgeReflected from) throws Throwable {
        return new X509CertificateInitiatorClientCredential(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void SetCertificate(java.lang.String subjectName, StoreLocation storeLocation, StoreName storeName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.security.cryptography.CryptographicException, system.security.SecurityException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.RankException, system.AccessViolationException {
        try {
            classInstance.Invoke("SetCertificate", (Object)subjectName, (Object)storeLocation.getJCOInstance(), (Object)storeName.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCertificate(StoreLocation storeLocation, StoreName storeName, X509FindType findType, NetObject findValue) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.security.cryptography.CryptographicException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.RankException, system.AccessViolationException {
        try {
            classInstance.Invoke("SetCertificate", (Object)storeLocation.getJCOInstance(), (Object)storeName.getJCOInstance(), (Object)findType.getJCOInstance(), (Object)findValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public X509Certificate2 getCertificate() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Certificate");
            return new X509Certificate2(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCertificate(X509Certificate2 Certificate) throws Throwable {
        try {
            classInstance.Set("Certificate", (Object)Certificate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}