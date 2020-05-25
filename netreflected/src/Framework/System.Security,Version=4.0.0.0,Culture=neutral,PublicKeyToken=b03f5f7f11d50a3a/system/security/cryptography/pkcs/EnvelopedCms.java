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

package system.security.cryptography.pkcs;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.pkcs.ContentInfo;
import system.security.cryptography.pkcs.SubjectIdentifierType;
import system.security.cryptography.pkcs.AlgorithmIdentifier;
import system.security.cryptography.pkcs.CmsRecipient;
import system.security.cryptography.pkcs.CmsRecipientCollection;
import system.security.cryptography.pkcs.RecipientInfo;
import system.security.cryptography.x509certificates.X509Certificate2Collection;
import system.security.cryptography.CryptographicAttributeObjectCollection;
import system.security.cryptography.pkcs.RecipientInfoCollection;


/**
 * The base .NET class managing System.Security.Cryptography.Pkcs.EnvelopedCms, System.Security, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class EnvelopedCms extends NetObject  {
    public static final String assemblyFullName = "System.Security, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Security";
    public static final String className = "System.Security.Cryptography.Pkcs.EnvelopedCms";
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

    public EnvelopedCms(Object instance) throws Throwable {
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

    public static EnvelopedCms castFrom(IJCOBridgeReflected from) throws Throwable {
        return new EnvelopedCms(from.getJCOInstance());
    }

    // Constructors section
    
    
    public EnvelopedCms() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.security.cryptography.CryptographicException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EnvelopedCms(ContentInfo contentInfo) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)contentInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EnvelopedCms(SubjectIdentifierType recipientIdentifierType, ContentInfo contentInfo) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)recipientIdentifierType.getJCOInstance(), (Object)contentInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EnvelopedCms(ContentInfo contentInfo, AlgorithmIdentifier encryptionAlgorithm) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)contentInfo.getJCOInstance(), (Object)encryptionAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EnvelopedCms(SubjectIdentifierType recipientIdentifierType, ContentInfo contentInfo, AlgorithmIdentifier encryptionAlgorithm) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)recipientIdentifierType.getJCOInstance(), (Object)contentInfo.getJCOInstance(), (Object)encryptionAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public byte[] Encode() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.security.cryptography.CryptographicException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("Encode");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexEncode = 0; indexEncode < resultingArrayList.size(); indexEncode++ ) {
				resultingArray[indexEncode] = (byte)resultingArrayList.get(indexEncode);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decode(byte[] encodedMessage) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.AccessViolationException, system.NotSupportedException {
        try {
            classInstance.Invoke("Decode", encodedMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Encrypt() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.FormatException, system.AccessViolationException, system.OverflowException, system.InvalidTimeZoneException, system.ApplicationException, system.RankException {
        try {
            classInstance.Invoke("Encrypt");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Encrypt(CmsRecipient recipient) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.OverflowException, system.InvalidTimeZoneException, system.ApplicationException, system.OutOfMemoryException, system.RankException {
        try {
            classInstance.Invoke("Encrypt", (Object)recipient.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Encrypt(CmsRecipientCollection recipients) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.security.cryptography.CryptographicException, system.FormatException, system.AccessViolationException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.ApplicationException, system.RankException {
        try {
            classInstance.Invoke("Encrypt", (Object)recipients.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decrypt() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.InvalidOperationException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.AccessViolationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.RankException {
        try {
            classInstance.Invoke("Decrypt");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decrypt(RecipientInfo recipientInfo) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.security.cryptography.CryptographicException, system.security.SecurityException, system.OutOfMemoryException, system.RankException {
        try {
            classInstance.Invoke("Decrypt", (Object)recipientInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decrypt(X509Certificate2Collection extraStore) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.InvalidOperationException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.AccessViolationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.RankException {
        try {
            classInstance.Invoke("Decrypt", (Object)extraStore.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Decrypt(RecipientInfo recipientInfo, X509Certificate2Collection extraStore) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.security.cryptography.CryptographicException, system.security.SecurityException, system.OutOfMemoryException, system.RankException {
        try {
            classInstance.Invoke("Decrypt", (Object)recipientInfo.getJCOInstance(), (Object)extraStore.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getVersion() throws Throwable {
        try {
            return (int)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContentInfo getContentInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContentInfo");
            return new ContentInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AlgorithmIdentifier getContentEncryptionAlgorithm() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContentEncryptionAlgorithm");
            return new AlgorithmIdentifier(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate2Collection getCertificates() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Certificates");
            return new X509Certificate2Collection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CryptographicAttributeObjectCollection getUnprotectedAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UnprotectedAttributes");
            return new CryptographicAttributeObjectCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RecipientInfoCollection getRecipientInfos() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RecipientInfos");
            return new RecipientInfoCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}