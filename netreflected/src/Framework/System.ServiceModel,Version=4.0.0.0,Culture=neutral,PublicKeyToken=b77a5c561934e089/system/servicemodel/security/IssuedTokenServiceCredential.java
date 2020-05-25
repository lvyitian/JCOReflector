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
import system.identitymodel.selectors.AudienceUriMode;
import system.identitymodel.tokens.SamlSerializer;
import system.servicemodel.security.X509CertificateValidationMode;
import system.security.cryptography.x509certificates.X509RevocationMode;
import system.security.cryptography.x509certificates.StoreLocation;
import system.identitymodel.selectors.X509CertificateValidator;


/**
 * The base .NET class managing System.ServiceModel.Security.IssuedTokenServiceCredential, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class IssuedTokenServiceCredential extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Security.IssuedTokenServiceCredential";
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

    public IssuedTokenServiceCredential(Object instance) throws Throwable {
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

    public static IssuedTokenServiceCredential castFrom(IJCOBridgeReflected from) throws Throwable {
        return new IssuedTokenServiceCredential(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
    public AudienceUriMode getAudienceUriMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AudienceUriMode");
            return new AudienceUriMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAudienceUriMode(AudienceUriMode AudienceUriMode) throws Throwable {
        try {
            classInstance.Set("AudienceUriMode", (Object)AudienceUriMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlSerializer getSamlSerializer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SamlSerializer");
            return new SamlSerializer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSamlSerializer(SamlSerializer SamlSerializer) throws Throwable {
        try {
            classInstance.Set("SamlSerializer", (Object)SamlSerializer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509CertificateValidationMode getCertificateValidationMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CertificateValidationMode");
            return new X509CertificateValidationMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCertificateValidationMode(X509CertificateValidationMode CertificateValidationMode) throws Throwable {
        try {
            classInstance.Set("CertificateValidationMode", (Object)CertificateValidationMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509RevocationMode getRevocationMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RevocationMode");
            return new X509RevocationMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRevocationMode(X509RevocationMode RevocationMode) throws Throwable {
        try {
            classInstance.Set("RevocationMode", (Object)RevocationMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StoreLocation getTrustedStoreLocation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TrustedStoreLocation");
            return new StoreLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrustedStoreLocation(StoreLocation TrustedStoreLocation) throws Throwable {
        try {
            classInstance.Set("TrustedStoreLocation", (Object)TrustedStoreLocation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509CertificateValidator getCustomCertificateValidator() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CustomCertificateValidator");
            return new X509CertificateValidator(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCustomCertificateValidator(X509CertificateValidator CustomCertificateValidator) throws Throwable {
        try {
            classInstance.Set("CustomCertificateValidator", (Object)CustomCertificateValidator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowUntrustedRsaIssuers() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowUntrustedRsaIssuers");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowUntrustedRsaIssuers(boolean AllowUntrustedRsaIssuers) throws Throwable {
        try {
            classInstance.Set("AllowUntrustedRsaIssuers", AllowUntrustedRsaIssuers);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}