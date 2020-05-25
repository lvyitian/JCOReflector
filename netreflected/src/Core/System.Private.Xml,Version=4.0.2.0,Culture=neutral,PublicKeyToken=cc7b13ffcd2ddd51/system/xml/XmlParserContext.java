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

package system.xml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlNameTable;
import system.xml.XmlNamespaceManager;
import system.xml.XmlSpace;
import system.text.Encoding;


/**
 * The base .NET class managing System.Xml.XmlParserContext, System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class XmlParserContext extends NetObject  {
    public static final String assemblyFullName = "System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Private.Xml";
    public static final String className = "System.Xml.XmlParserContext";
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

    public XmlParserContext(Object instance) throws Throwable {
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

    public static XmlParserContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlParserContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XmlParserContext(XmlNameTable nt, XmlNamespaceManager nsMgr, java.lang.String xmlLang, XmlSpace xmlSpace) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.xml.XmlException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)nt.getJCOInstance(), (Object)nsMgr.getJCOInstance(), (Object)xmlLang, (Object)xmlSpace.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlParserContext(XmlNameTable nt, XmlNamespaceManager nsMgr, java.lang.String xmlLang, XmlSpace xmlSpace, Encoding enc) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.xml.XmlException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)nt.getJCOInstance(), (Object)nsMgr.getJCOInstance(), (Object)xmlLang, (Object)xmlSpace.getJCOInstance(), (Object)enc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlParserContext(XmlNameTable nt, XmlNamespaceManager nsMgr, java.lang.String docTypeName, java.lang.String pubId, java.lang.String sysId, java.lang.String internalSubset, java.lang.String baseURI, java.lang.String xmlLang, XmlSpace xmlSpace) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.xml.XmlException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)nt.getJCOInstance(), (Object)nsMgr.getJCOInstance(), (Object)docTypeName, (Object)pubId, (Object)sysId, (Object)internalSubset, (Object)baseURI, (Object)xmlLang, (Object)xmlSpace.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlParserContext(XmlNameTable nt, XmlNamespaceManager nsMgr, java.lang.String docTypeName, java.lang.String pubId, java.lang.String sysId, java.lang.String internalSubset, java.lang.String baseURI, java.lang.String xmlLang, XmlSpace xmlSpace, Encoding enc) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.ArrayTypeMismatchException, system.xml.XmlException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)nt.getJCOInstance(), (Object)nsMgr.getJCOInstance(), (Object)docTypeName, (Object)pubId, (Object)sysId, (Object)internalSubset, (Object)baseURI, (Object)xmlLang, (Object)xmlSpace.getJCOInstance(), (Object)enc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public XmlNameTable getNameTable() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NameTable");
            return new XmlNameTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNameTable(XmlNameTable NameTable) throws Throwable {
        try {
            classInstance.Set("NameTable", (Object)NameTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNamespaceManager getNamespaceManager() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NamespaceManager");
            return new XmlNamespaceManager(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNamespaceManager(XmlNamespaceManager NamespaceManager) throws Throwable {
        try {
            classInstance.Set("NamespaceManager", (Object)NamespaceManager.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDocTypeName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DocTypeName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDocTypeName(java.lang.String DocTypeName) throws Throwable {
        try {
            classInstance.Set("DocTypeName", (Object)DocTypeName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPublicId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PublicId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPublicId(java.lang.String PublicId) throws Throwable {
        try {
            classInstance.Set("PublicId", (Object)PublicId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSystemId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SystemId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSystemId(java.lang.String SystemId) throws Throwable {
        try {
            classInstance.Set("SystemId", (Object)SystemId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBaseURI() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("BaseURI");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBaseURI(java.lang.String BaseURI) throws Throwable {
        try {
            classInstance.Set("BaseURI", (Object)BaseURI);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getInternalSubset() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("InternalSubset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInternalSubset(java.lang.String InternalSubset) throws Throwable {
        try {
            classInstance.Set("InternalSubset", (Object)InternalSubset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlLang() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlLang");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlLang(java.lang.String XmlLang) throws Throwable {
        try {
            classInstance.Set("XmlLang", (Object)XmlLang);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSpace getXmlSpace() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("XmlSpace");
            return new XmlSpace(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlSpace(XmlSpace XmlSpace) throws Throwable {
        try {
            classInstance.Set("XmlSpace", (Object)XmlSpace.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoding getEncoding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Encoding");
            return new Encoding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncoding(Encoding Encoding) throws Throwable {
        try {
            classInstance.Set("Encoding", (Object)Encoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}