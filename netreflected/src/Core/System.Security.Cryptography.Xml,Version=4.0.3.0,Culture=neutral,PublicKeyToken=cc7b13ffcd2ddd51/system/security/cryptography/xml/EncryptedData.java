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
import system.xml.XmlElement;
import system.security.cryptography.xml.EncryptionProperty;
import system.security.cryptography.xml.KeyInfo;
import system.security.cryptography.xml.EncryptionMethod;
import system.security.cryptography.xml.EncryptionPropertyCollection;
import system.security.cryptography.xml.CipherData;


/**
 * The base .NET class managing System.Security.Cryptography.Xml.EncryptedData, System.Security.Cryptography.Xml, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class EncryptedData extends NetObject  {
    public static final String assemblyFullName = "System.Security.Cryptography.Xml, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Security.Cryptography.Xml";
    public static final String className = "System.Security.Cryptography.Xml.EncryptedData";
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

    public EncryptedData(Object instance) throws Throwable {
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

    public static EncryptedData castFrom(IJCOBridgeReflected from) throws Throwable {
        return new EncryptedData(from.getJCOInstance());
    }

    // Constructors section
    
    
    public EncryptedData() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void LoadXml(XmlElement value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.xpath.XPathException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.security.cryptography.CryptographicException, system.TypeLoadException {
        try {
            classInstance.Invoke("LoadXml", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement GetXml() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.xml.XmlException, system.security.cryptography.CryptographicException, system.OutOfMemoryException {
        try {
            JCObject objGetXml = (JCObject)classInstance.Invoke("GetXml");
            return new XmlElement(objGetXml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddProperty(EncryptionProperty ep) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("AddProperty", (Object)ep.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setId(java.lang.String Id) throws Throwable {
        try {
            classInstance.Set("Id", (Object)Id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Type");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setType(java.lang.String Type) throws Throwable {
        try {
            classInstance.Set("Type", (Object)Type);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMimeType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MimeType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMimeType(java.lang.String MimeType) throws Throwable {
        try {
            classInstance.Set("MimeType", (Object)MimeType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getEncoding() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Encoding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncoding(java.lang.String Encoding) throws Throwable {
        try {
            classInstance.Set("Encoding", (Object)Encoding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeyInfo getKeyInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyInfo");
            return new KeyInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyInfo(KeyInfo KeyInfo) throws Throwable {
        try {
            classInstance.Set("KeyInfo", (Object)KeyInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncryptionMethod getEncryptionMethod() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EncryptionMethod");
            return new EncryptionMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncryptionMethod(EncryptionMethod EncryptionMethod) throws Throwable {
        try {
            classInstance.Set("EncryptionMethod", (Object)EncryptionMethod.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncryptionPropertyCollection getEncryptionProperties() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EncryptionProperties");
            return new EncryptionPropertyCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CipherData getCipherData() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CipherData");
            return new CipherData(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCipherData(CipherData CipherData) throws Throwable {
        try {
            classInstance.Set("CipherData", (Object)CipherData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}