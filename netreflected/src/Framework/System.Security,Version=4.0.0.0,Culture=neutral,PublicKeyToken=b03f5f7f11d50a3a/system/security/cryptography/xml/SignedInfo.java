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
import system.Array;
import system.security.cryptography.xml.Reference;
import system.xml.XmlElement;
import system.security.cryptography.xml.Transform;


/**
 * The base .NET class managing System.Security.Cryptography.Xml.SignedInfo, System.Security, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SignedInfo extends NetObject  {
    public static final String assemblyFullName = "System.Security, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Security";
    public static final String className = "System.Security.Cryptography.Xml.SignedInfo";
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

    public SignedInfo(Object instance) throws Throwable {
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

    public static SignedInfo castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SignedInfo(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SignedInfo() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void CopyTo(Array array, int index) throws Throwable, system.NotSupportedException {
        try {
            classInstance.Invoke("CopyTo", (Object)array.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddReference(Reference reference) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("AddReference", (Object)reference.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement GetXml() throws Throwable, system.ArgumentOutOfRangeException, system.NullReferenceException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.xml.XmlException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ApplicationException, system.NotSupportedException, system.TypeLoadException, system.security.cryptography.CryptographicException, system.security.cryptography.CryptographicUnexpectedOperationException, system.OutOfMemoryException {
        try {
            JCObject objGetXml = (JCObject)classInstance.Invoke("GetXml");
            return new XmlElement(objGetXml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadXml(XmlElement value) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.security.cryptography.CryptographicException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.xml.xpath.XPathException, system.ApplicationException {
        try {
            classInstance.Invoke("LoadXml", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSynchronized() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSynchronized");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getSyncRoot() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SyncRoot");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

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

    public java.lang.String getCanonicalizationMethod() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CanonicalizationMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCanonicalizationMethod(java.lang.String CanonicalizationMethod) throws Throwable {
        try {
            classInstance.Set("CanonicalizationMethod", (Object)CanonicalizationMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Transform getCanonicalizationMethodObject() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CanonicalizationMethodObject");
            return new Transform(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSignatureMethod() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SignatureMethod");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSignatureMethod(java.lang.String SignatureMethod) throws Throwable {
        try {
            classInstance.Set("SignatureMethod", (Object)SignatureMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSignatureLength() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SignatureLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSignatureLength(java.lang.String SignatureLength) throws Throwable {
        try {
            classInstance.Set("SignatureLength", (Object)SignatureLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetArrayList getReferences() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("References");
            return new NetArrayList(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}