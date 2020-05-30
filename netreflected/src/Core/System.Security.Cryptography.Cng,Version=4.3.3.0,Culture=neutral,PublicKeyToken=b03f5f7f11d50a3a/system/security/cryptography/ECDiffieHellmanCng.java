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

package system.security.cryptography;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.CngKey;
import system.security.cryptography.ECCurve;
import system.security.cryptography.ECDiffieHellmanPublicKey;
import microsoft.win32.safehandles.SafeNCryptSecretHandle;
import system.security.cryptography.ECKeyXmlFormat;
import system.security.cryptography.HashAlgorithmName;
import system.security.cryptography.ECParameters;
import system.security.cryptography.CngAlgorithm;
import system.security.cryptography.ECDiffieHellmanKeyDerivationFunction;
import system.security.cryptography.KeySizes;


/**
 * The base .NET class managing System.Security.Cryptography.ECDiffieHellmanCng, System.Security.Cryptography.Cng, Version=4.3.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ECDiffieHellmanCng extends NetObject  {
    public static final String assemblyFullName = "System.Security.Cryptography.Cng, Version=4.3.3.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Security.Cryptography.Cng";
    public static final String className = "System.Security.Cryptography.ECDiffieHellmanCng";
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

    public ECDiffieHellmanCng(Object instance) throws Throwable {
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

    public static ECDiffieHellmanCng castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ECDiffieHellmanCng(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ECDiffieHellmanCng(CngKey key) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECDiffieHellmanCng() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECDiffieHellmanCng(int keySize) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(keySize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECDiffieHellmanCng(ECCurve curve) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)curve.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public byte[] DeriveKeyMaterial(ECDiffieHellmanPublicKey otherPartyPublicKey) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyMaterial", (Object)otherPartyPublicKey.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyMaterial = 0; indexDeriveKeyMaterial < resultingArrayList.size(); indexDeriveKeyMaterial++ ) {
				resultingArray[indexDeriveKeyMaterial] = (byte)resultingArrayList.get(indexDeriveKeyMaterial);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyMaterial(CngKey otherPartyPublicKey) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyMaterial", (Object)otherPartyPublicKey.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyMaterial = 0; indexDeriveKeyMaterial < resultingArrayList.size(); indexDeriveKeyMaterial++ ) {
				resultingArray[indexDeriveKeyMaterial] = (byte)resultingArrayList.get(indexDeriveKeyMaterial);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SafeNCryptSecretHandle DeriveSecretAgreementHandle(ECDiffieHellmanPublicKey otherPartyPublicKey) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            JCObject objDeriveSecretAgreementHandle = (JCObject)classInstance.Invoke("DeriveSecretAgreementHandle", (Object)otherPartyPublicKey.getJCOInstance());
            return new SafeNCryptSecretHandle(objDeriveSecretAgreementHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SafeNCryptSecretHandle DeriveSecretAgreementHandle(CngKey otherPartyPublicKey) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        try {
            JCObject objDeriveSecretAgreementHandle = (JCObject)classInstance.Invoke("DeriveSecretAgreementHandle", (Object)otherPartyPublicKey.getJCOInstance());
            return new SafeNCryptSecretHandle(objDeriveSecretAgreementHandle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GenerateKey(ECCurve curve) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            classInstance.Invoke("GenerateKey", (Object)curve.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void FromXmlString(java.lang.String xml, ECKeyXmlFormat format) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("FromXmlString", (Object)xml, (Object)format.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToXmlString(ECKeyXmlFormat format) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("ToXmlString", (Object)format.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHash(ECDiffieHellmanPublicKey otherPartyPublicKey, HashAlgorithmName hashAlgorithm, byte[] secretPrepend, byte[] secretAppend) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHash", (Object)otherPartyPublicKey.getJCOInstance(), (Object)hashAlgorithm.getJCOInstance(), secretPrepend, secretAppend);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHash = 0; indexDeriveKeyFromHash < resultingArrayList.size(); indexDeriveKeyFromHash++ ) {
				resultingArray[indexDeriveKeyFromHash] = (byte)resultingArrayList.get(indexDeriveKeyFromHash);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHmac(ECDiffieHellmanPublicKey otherPartyPublicKey, HashAlgorithmName hashAlgorithm, byte[] hmacKey, byte[] secretPrepend, byte[] secretAppend) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHmac", (Object)otherPartyPublicKey.getJCOInstance(), (Object)hashAlgorithm.getJCOInstance(), hmacKey, secretPrepend, secretAppend);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHmac = 0; indexDeriveKeyFromHmac < resultingArrayList.size(); indexDeriveKeyFromHmac++ ) {
				resultingArray[indexDeriveKeyFromHmac] = (byte)resultingArrayList.get(indexDeriveKeyFromHmac);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyTls(ECDiffieHellmanPublicKey otherPartyPublicKey, byte[] prfLabel, byte[] prfSeed) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyTls", (Object)otherPartyPublicKey.getJCOInstance(), prfLabel, prfSeed);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyTls = 0; indexDeriveKeyTls < resultingArrayList.size(); indexDeriveKeyTls++ ) {
				resultingArray[indexDeriveKeyTls] = (byte)resultingArrayList.get(indexDeriveKeyTls);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ImportParameters(ECParameters parameters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            classInstance.Invoke("ImportParameters", (Object)parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECParameters ExportExplicitParameters(boolean includePrivateParameters) throws Throwable, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        try {
            JCObject objExportExplicitParameters = (JCObject)classInstance.Invoke("ExportExplicitParameters", includePrivateParameters);
            return new ECParameters(objExportExplicitParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECParameters ExportParameters(boolean includePrivateParameters) throws Throwable, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        try {
            JCObject objExportParameters = (JCObject)classInstance.Invoke("ExportParameters", includePrivateParameters);
            return new ECParameters(objExportParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHash(ECDiffieHellmanPublicKey otherPartyPublicKey, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHash", (Object)otherPartyPublicKey.getJCOInstance(), (Object)hashAlgorithm.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHash = 0; indexDeriveKeyFromHash < resultingArrayList.size(); indexDeriveKeyFromHash++ ) {
				resultingArray[indexDeriveKeyFromHash] = (byte)resultingArrayList.get(indexDeriveKeyFromHash);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DeriveKeyFromHmac(ECDiffieHellmanPublicKey otherPartyPublicKey, HashAlgorithmName hashAlgorithm, byte[] hmacKey) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DeriveKeyFromHmac", (Object)otherPartyPublicKey.getJCOInstance(), (Object)hashAlgorithm.getJCOInstance(), hmacKey);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDeriveKeyFromHmac = 0; indexDeriveKeyFromHmac < resultingArrayList.size(); indexDeriveKeyFromHmac++ ) {
				resultingArray[indexDeriveKeyFromHmac] = (byte)resultingArrayList.get(indexDeriveKeyFromHmac);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] ExportECPrivateKey() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.ArrayTypeMismatchException, system.NotSupportedException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ExportECPrivateKey");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexExportECPrivateKey = 0; indexExportECPrivateKey < resultingArrayList.size(); indexExportECPrivateKey++ ) {
				resultingArray[indexExportECPrivateKey] = (byte)resultingArrayList.get(indexExportECPrivateKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void FromXmlString(java.lang.String xmlString) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        try {
            classInstance.Invoke("FromXmlString", (Object)xmlString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToXmlString(boolean includePrivateParameters) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("ToXmlString", includePrivateParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] ExportPkcs8PrivateKey() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ExportPkcs8PrivateKey");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexExportPkcs8PrivateKey = 0; indexExportPkcs8PrivateKey < resultingArrayList.size(); indexExportPkcs8PrivateKey++ ) {
				resultingArray[indexExportPkcs8PrivateKey] = (byte)resultingArrayList.get(indexExportPkcs8PrivateKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] ExportSubjectPublicKeyInfo() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotImplementedException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ExportSubjectPublicKeyInfo");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexExportSubjectPublicKeyInfo = 0; indexExportSubjectPublicKeyInfo < resultingArrayList.size(); indexExportSubjectPublicKeyInfo++ ) {
				resultingArray[indexExportSubjectPublicKeyInfo] = (byte)resultingArrayList.get(indexExportSubjectPublicKeyInfo);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public CngAlgorithm getHashAlgorithm() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HashAlgorithm");
            return new CngAlgorithm(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHashAlgorithm(CngAlgorithm HashAlgorithm) throws Throwable {
        try {
            classInstance.Set("HashAlgorithm", (Object)HashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECDiffieHellmanKeyDerivationFunction getKeyDerivationFunction() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyDerivationFunction");
            return new ECDiffieHellmanKeyDerivationFunction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyDerivationFunction(ECDiffieHellmanKeyDerivationFunction KeyDerivationFunction) throws Throwable {
        try {
            classInstance.Set("KeyDerivationFunction", (Object)KeyDerivationFunction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getHmacKey() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("HmacKey");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexHmacKey = 0; indexHmacKey < resultingArrayList.size(); indexHmacKey++ ) {
				resultingArray[indexHmacKey] = (byte)resultingArrayList.get(indexHmacKey);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHmacKey(byte[] HmacKey) throws Throwable {
        try {
            classInstance.Set("HmacKey", HmacKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getLabel() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Label");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexLabel = 0; indexLabel < resultingArrayList.size(); indexLabel++ ) {
				resultingArray[indexLabel] = (byte)resultingArrayList.get(indexLabel);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLabel(byte[] Label) throws Throwable {
        try {
            classInstance.Set("Label", Label);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSecretAppend() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SecretAppend");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSecretAppend = 0; indexSecretAppend < resultingArrayList.size(); indexSecretAppend++ ) {
				resultingArray[indexSecretAppend] = (byte)resultingArrayList.get(indexSecretAppend);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecretAppend(byte[] SecretAppend) throws Throwable {
        try {
            classInstance.Set("SecretAppend", SecretAppend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSecretPrepend() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SecretPrepend");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSecretPrepend = 0; indexSecretPrepend < resultingArrayList.size(); indexSecretPrepend++ ) {
				resultingArray[indexSecretPrepend] = (byte)resultingArrayList.get(indexSecretPrepend);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecretPrepend(byte[] SecretPrepend) throws Throwable {
        try {
            classInstance.Set("SecretPrepend", SecretPrepend);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSeed() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Seed");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSeed = 0; indexSeed < resultingArrayList.size(); indexSeed++ ) {
				resultingArray[indexSeed] = (byte)resultingArrayList.get(indexSeed);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSeed(byte[] Seed) throws Throwable {
        try {
            classInstance.Set("Seed", Seed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseSecretAgreementAsHmacKey() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseSecretAgreementAsHmacKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ECDiffieHellmanPublicKey getPublicKey() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PublicKey");
            return new ECDiffieHellmanPublicKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CngKey getKey() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Key");
            return new CngKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKey(CngKey Key) throws Throwable {
        try {
            classInstance.Set("Key", (Object)Key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getKeySize() throws Throwable {
        try {
            return (int)classInstance.Get("KeySize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeySize(int KeySize) throws Throwable {
        try {
            classInstance.Set("KeySize", KeySize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeySizes[] getLegalKeySizes() throws Throwable {
        try {
            ArrayList<KeySizes> resultingArrayList = new ArrayList<KeySizes>();
            JCObject resultingObjects = (JCObject)classInstance.Get("LegalKeySizes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new KeySizes(resultingObject));
            }
            KeySizes[] resultingArray = new KeySizes[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getKeyExchangeAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("KeyExchangeAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSignatureAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SignatureAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}