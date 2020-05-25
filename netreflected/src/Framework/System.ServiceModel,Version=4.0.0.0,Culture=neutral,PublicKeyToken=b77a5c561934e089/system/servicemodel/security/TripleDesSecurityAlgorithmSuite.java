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


/**
 * The base .NET class managing System.ServiceModel.Security.TripleDesSecurityAlgorithmSuite, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TripleDesSecurityAlgorithmSuite extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Security.TripleDesSecurityAlgorithmSuite";
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

    public TripleDesSecurityAlgorithmSuite(Object instance) throws Throwable {
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

    public static TripleDesSecurityAlgorithmSuite castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TripleDesSecurityAlgorithmSuite(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TripleDesSecurityAlgorithmSuite() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean IsSymmetricKeyLengthSupported(int length) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsSymmetricKeyLengthSupported", length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAsymmetricKeyLengthSupported(int length) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsAsymmetricKeyLengthSupported", length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsCanonicalizationAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsCanonicalizationAlgorithmSupported", (Object)algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDigestAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsDigestAlgorithmSupported", (Object)algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEncryptionAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsEncryptionAlgorithmSupported", (Object)algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSymmetricKeyWrapAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsSymmetricKeyWrapAlgorithmSupported", (Object)algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAsymmetricKeyWrapAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsAsymmetricKeyWrapAlgorithmSupported", (Object)algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSymmetricSignatureAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsSymmetricSignatureAlgorithmSupported", (Object)algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAsymmetricSignatureAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsAsymmetricSignatureAlgorithmSupported", (Object)algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEncryptionKeyDerivationAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsEncryptionKeyDerivationAlgorithmSupported", (Object)algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSignatureKeyDerivationAlgorithmSupported(java.lang.String algorithm) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsSignatureKeyDerivationAlgorithmSupported", (Object)algorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getDefaultCanonicalizationAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultCanonicalizationAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultDigestAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultDigestAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultEncryptionAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultEncryptionAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDefaultEncryptionKeyDerivationLength() throws Throwable {
        try {
            return (int)classInstance.Get("DefaultEncryptionKeyDerivationLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultSymmetricKeyWrapAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultSymmetricKeyWrapAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultAsymmetricKeyWrapAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultAsymmetricKeyWrapAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultSymmetricSignatureAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultSymmetricSignatureAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultAsymmetricSignatureAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultAsymmetricSignatureAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDefaultSignatureKeyDerivationLength() throws Throwable {
        try {
            return (int)classInstance.Get("DefaultSignatureKeyDerivationLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDefaultSymmetricKeyLength() throws Throwable {
        try {
            return (int)classInstance.Get("DefaultSymmetricKeyLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}