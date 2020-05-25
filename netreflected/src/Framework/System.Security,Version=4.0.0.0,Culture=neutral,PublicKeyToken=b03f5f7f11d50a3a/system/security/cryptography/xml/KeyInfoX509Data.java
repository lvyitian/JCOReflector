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

package system.security.cryptography.xml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.x509certificates.X509Certificate;
import system.security.cryptography.x509certificates.X509IncludeOption;
import system.xml.XmlElement;


/**
 * The base .NET class managing System.Security.Cryptography.Xml.KeyInfoX509Data, System.Security, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class KeyInfoX509Data extends NetObject  {
    public static final String assemblyFullName = "System.Security, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Security";
    public static final String className = "System.Security.Cryptography.Xml.KeyInfoX509Data";
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

    public KeyInfoX509Data(Object instance) throws Throwable {
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

    public static KeyInfoX509Data castFrom(IJCOBridgeReflected from) throws Throwable {
        return new KeyInfoX509Data(from.getJCOInstance());
    }

    // Constructors section
    
    
    public KeyInfoX509Data() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyInfoX509Data(byte[] rgbCert) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(rgbCert);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyInfoX509Data(X509Certificate cert) throws Throwable, system.ArgumentNullException, system.AccessViolationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)cert.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyInfoX509Data(X509Certificate cert, X509IncludeOption includeOption) throws Throwable, system.ArgumentNullException, system.AccessViolationException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.security.cryptography.CryptographicException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.security.SecurityException, system.ApplicationException, system.NotSupportedException, system.NullReferenceException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)cert.getJCOInstance(), (Object)includeOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void AddCertificate(X509Certificate certificate) throws Throwable, system.ArgumentNullException, system.AccessViolationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("AddCertificate", (Object)certificate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSubjectKeyId(byte[] subjectKeyId) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("AddSubjectKeyId", subjectKeyId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSubjectKeyId(java.lang.String subjectKeyId) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("AddSubjectKeyId", (Object)subjectKeyId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSubjectName(java.lang.String subjectName) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("AddSubjectName", (Object)subjectName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddIssuerSerial(java.lang.String issuerName, java.lang.String serialNumber) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.RankException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddIssuerSerial", (Object)issuerName, (Object)serialNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement GetXml() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NullReferenceException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            JCObject objGetXml = (JCObject)classInstance.Invoke("GetXml");
            return new XmlElement(objGetXml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadXml(XmlElement element) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.xml.xpath.XPathException, system.security.cryptography.CryptographicException, system.FormatException, system.OutOfMemoryException, system.AccessViolationException {
        try {
            classInstance.Invoke("LoadXml", (Object)element.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public NetArrayList getCertificates() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Certificates");
            return new NetArrayList(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetArrayList getSubjectKeyIds() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SubjectKeyIds");
            return new NetArrayList(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetArrayList getSubjectNames() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SubjectNames");
            return new NetArrayList(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetArrayList getIssuerSerials() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IssuerSerials");
            return new NetArrayList(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getCRL() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("CRL");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexCRL = 0; indexCRL < resultingArrayList.size(); indexCRL++ ) {
				resultingArray[indexCRL] = (byte)resultingArrayList.get(indexCRL);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCRL(byte[] CRL) throws Throwable {
        try {
            classInstance.Set("CRL", CRL);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}