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
import system.security.cryptography.DSAParameters;
import system.security.cryptography.HashAlgorithmName;
import system.io.Stream;
import system.security.cryptography.KeySizes;


/**
 * The base .NET class managing System.Security.Cryptography.DSACng, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DSACng extends NetObject  {
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Core";
    public static final String className = "System.Security.Cryptography.DSACng";
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

    public DSACng(Object instance) throws Throwable {
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

    public static DSACng castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DSACng(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DSACng() throws Throwable, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DSACng(int keySize) throws Throwable, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(keySize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DSACng(CngKey key) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.cryptography.CryptographicException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.NullReferenceException, system.MissingMethodException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public byte[] CreateSignature(byte[] rgbHash) throws Throwable, system.ArgumentNullException, system.security.cryptography.CryptographicException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NotSupportedException, system.PlatformNotSupportedException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("CreateSignature", rgbHash);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCreateSignature = 0; indexCreateSignature < resultingArrayList.size(); indexCreateSignature++ ) {
				resultingArray[indexCreateSignature] = (byte)resultingArrayList.get(indexCreateSignature);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean VerifySignature(byte[] rgbHash, byte[] rgbSignature) throws Throwable, system.ArgumentNullException, system.security.cryptography.CryptographicException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NotSupportedException, system.PlatformNotSupportedException, system.RankException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            return (boolean)classInstance.Invoke("VerifySignature", rgbHash, rgbSignature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DSAParameters ExportParameters(boolean includePrivateParameters) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.security.cryptography.CryptographicException, system.ArgumentException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NotSupportedException, system.PlatformNotSupportedException, system.RankException, system.io.EndOfStreamException {
        try {
            JCObject objExportParameters = (JCObject)classInstance.Invoke("ExportParameters", includePrivateParameters);
            return new DSAParameters(objExportParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ImportParameters(DSAParameters parameters) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.NullReferenceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("ImportParameters", (Object)parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] SignData(byte[] data, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("SignData", data, (Object)hashAlgorithm.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexSignData = 0; indexSignData < resultingArrayList.size(); indexSignData++ ) {
				resultingArray[indexSignData] = (byte)resultingArrayList.get(indexSignData);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] SignData(byte[] data, int offset, int count, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("SignData", data, offset, count, (Object)hashAlgorithm.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexSignData = 0; indexSignData < resultingArrayList.size(); indexSignData++ ) {
				resultingArray[indexSignData] = (byte)resultingArrayList.get(indexSignData);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] SignData(Stream data, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("SignData", (Object)data.getJCOInstance(), (Object)hashAlgorithm.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexSignData = 0; indexSignData < resultingArrayList.size(); indexSignData++ ) {
				resultingArray[indexSignData] = (byte)resultingArrayList.get(indexSignData);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean VerifyData(byte[] data, byte[] signature, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("VerifyData", data, signature, (Object)hashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean VerifyData(byte[] data, int offset, int count, byte[] signature, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("VerifyData", data, offset, count, signature, (Object)hashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean VerifyData(Stream data, byte[] signature, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("VerifyData", (Object)data.getJCOInstance(), signature, (Object)hashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void FromXmlString(java.lang.String xmlString) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.security.XmlSyntaxException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.NotSupportedException, system.NullReferenceException, system.security.cryptography.CryptographicException {
        try {
            classInstance.Invoke("FromXmlString", (Object)xmlString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToXmlString(boolean includePrivateParameters) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("ToXmlString", includePrivateParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
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

    public java.lang.String getSignatureAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SignatureAlgorithm");
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



	// Instance Events section
    
    
}