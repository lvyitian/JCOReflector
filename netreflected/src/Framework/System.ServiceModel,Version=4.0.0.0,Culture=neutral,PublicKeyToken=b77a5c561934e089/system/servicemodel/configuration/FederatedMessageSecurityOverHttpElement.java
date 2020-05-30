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
import system.servicemodel.security.SecurityAlgorithmSuite;
import system.servicemodel.configuration.ClaimTypeElementCollection;
import system.identitymodel.tokens.SecurityKeyType;
import system.servicemodel.configuration.IssuedTokenParametersEndpointAddressElement;
import system.servicemodel.configuration.EndpointAddressElementBase;
import system.servicemodel.configuration.XmlElementElementCollection;
import system.configuration.ConfigurationLockCollection;
import system.configuration.ElementInformation;
import system.configuration.Configuration;


/**
 * The base .NET class managing System.ServiceModel.Configuration.FederatedMessageSecurityOverHttpElement, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class FederatedMessageSecurityOverHttpElement extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Configuration.FederatedMessageSecurityOverHttpElement";
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

    public FederatedMessageSecurityOverHttpElement(Object instance) throws Throwable {
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

    public static FederatedMessageSecurityOverHttpElement castFrom(IJCOBridgeReflected from) throws Throwable {
        return new FederatedMessageSecurityOverHttpElement(from.getJCOInstance());
    }

    // Constructors section
    
    
    public FederatedMessageSecurityOverHttpElement() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.collections.generic.KeyNotFoundException {
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
    
    
    public SecurityAlgorithmSuite getAlgorithmSuite() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AlgorithmSuite");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAlgorithmSuite(SecurityAlgorithmSuite AlgorithmSuite) throws Throwable {
        try {
            classInstance.Set("AlgorithmSuite", (Object)AlgorithmSuite.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClaimTypeElementCollection getClaimTypeRequirements() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClaimTypeRequirements");
            return new ClaimTypeElementCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEstablishSecurityContext() throws Throwable {
        try {
            return (boolean)classInstance.Get("EstablishSecurityContext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEstablishSecurityContext(boolean EstablishSecurityContext) throws Throwable {
        try {
            classInstance.Set("EstablishSecurityContext", EstablishSecurityContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityKeyType getIssuedKeyType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IssuedKeyType");
            return new SecurityKeyType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIssuedKeyType(SecurityKeyType IssuedKeyType) throws Throwable {
        try {
            classInstance.Set("IssuedKeyType", (Object)IssuedKeyType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getIssuedTokenType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("IssuedTokenType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIssuedTokenType(java.lang.String IssuedTokenType) throws Throwable {
        try {
            classInstance.Set("IssuedTokenType", (Object)IssuedTokenType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IssuedTokenParametersEndpointAddressElement getIssuer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Issuer");
            return new IssuedTokenParametersEndpointAddressElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EndpointAddressElementBase getIssuerMetadata() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IssuerMetadata");
            return new EndpointAddressElementBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNegotiateServiceCredential() throws Throwable {
        try {
            return (boolean)classInstance.Get("NegotiateServiceCredential");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNegotiateServiceCredential(boolean NegotiateServiceCredential) throws Throwable {
        try {
            classInstance.Set("NegotiateServiceCredential", NegotiateServiceCredential);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElementElementCollection getTokenRequestParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TokenRequestParameters");
            return new XmlElementElementCollection(val);
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