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
import system.security.cryptography.CspParameters;
import system.security.cryptography.DSAParameters;
import system.io.Stream;
import system.security.cryptography.HashAlgorithmName;
import system.security.cryptography.CspKeyContainerInfo;
import system.security.cryptography.KeySizes;


/**
 * The base .NET class managing System.Security.Cryptography.DSACryptoServiceProvider, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DSACryptoServiceProvider extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Security.Cryptography.DSACryptoServiceProvider";
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

    public DSACryptoServiceProvider(Object instance) throws Throwable {
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

    public static DSACryptoServiceProvider castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DSACryptoServiceProvider(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DSACryptoServiceProvider() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.RankException, system.ObjectDisposedException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DSACryptoServiceProvider(int dwKeySize) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.cryptography.CryptographicException, system.RankException, system.ObjectDisposedException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(dwKeySize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DSACryptoServiceProvider(CspParameters parameters) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.RankException, system.ObjectDisposedException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DSACryptoServiceProvider(int dwKeySize, CspParameters parameters) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.InvalidOperationException, system.security.cryptography.CryptographicException, system.RankException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(dwKeySize, (Object)parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public DSAParameters ExportParameters(boolean includePrivateParameters) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException {
        try {
            JCObject objExportParameters = (JCObject)classInstance.Invoke("ExportParameters", includePrivateParameters);
            return new DSAParameters(objExportParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] ExportCspBlob(boolean includePrivateParameters) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ExportCspBlob", includePrivateParameters);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexExportCspBlob = 0; indexExportCspBlob < resultingArrayList.size(); indexExportCspBlob++ ) {
				resultingArray[indexExportCspBlob] = (byte)resultingArrayList.get(indexExportCspBlob);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ImportParameters(DSAParameters parameters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("ImportParameters", (Object)parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ImportCspBlob(byte[] keyBlob) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("ImportCspBlob", keyBlob);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] SignData(Stream inputStream) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.ApplicationException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("SignData", (Object)inputStream.getJCOInstance());
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

    public byte[] SignData(byte[] buffer) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.ApplicationException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("SignData", buffer);
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

    public byte[] SignData(byte[] buffer, int offset, int count) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.RankException, system.InvalidOperationException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.ApplicationException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("SignData", buffer, offset, count);
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

    public boolean VerifyData(byte[] rgbData, byte[] rgbSignature) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ApplicationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.cryptography.CryptographicException, system.RankException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException {
        try {
            return (boolean)classInstance.Invoke("VerifyData", rgbData, rgbSignature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] CreateSignature(byte[] rgbHash) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.ApplicationException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException {
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

    public boolean VerifySignature(byte[] rgbHash, byte[] rgbSignature) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ApplicationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.cryptography.CryptographicException, system.RankException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("VerifySignature", rgbHash, rgbSignature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] SignHash(byte[] rgbHash, java.lang.String str) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.security.cryptography.CryptographicException, system.RankException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.NotSupportedException, system.IndexOutOfRangeException, system.security.SecurityException, system.ApplicationException, system.globalization.CultureNotFoundException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("SignHash", rgbHash, (Object)str);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexSignHash = 0; indexSignHash < resultingArrayList.size(); indexSignHash++ ) {
				resultingArray[indexSignHash] = (byte)resultingArrayList.get(indexSignHash);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean VerifyHash(byte[] rgbHash, java.lang.String str, byte[] rgbSignature) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.ApplicationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.cryptography.CryptographicException, system.RankException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("VerifyHash", rgbHash, (Object)str, rgbSignature);
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
    
    
    public boolean getPublicOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("PublicOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CspKeyContainerInfo getCspKeyContainerInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CspKeyContainerInfo");
            return new CspKeyContainerInfo(val);
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

    public boolean getPersistKeyInCsp() throws Throwable {
        try {
            return (boolean)classInstance.Get("PersistKeyInCsp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPersistKeyInCsp(boolean PersistKeyInCsp) throws Throwable {
        try {
            classInstance.Set("PersistKeyInCsp", PersistKeyInCsp);
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

    public static boolean getUseMachineKeyStore() throws Throwable {
        try {
            return (boolean)classType.Get("UseMachineKeyStore");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setUseMachineKeyStore(boolean UseMachineKeyStore) throws Throwable {
        try {
            classType.Set("UseMachineKeyStore", UseMachineKeyStore);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}