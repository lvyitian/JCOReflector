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
import system.xml.XmlNode;
import system.xml.XmlWriter;
import system.xml.xpath.XPathNavigator;
import system.xml.XmlNamespaceManager;
import system.xml.XmlNodeList;
import system.xml.XmlNodeType;
import system.xml.XmlAttributeCollection;
import system.xml.XmlDocument;
import system.xml.XmlElement;


/**
 * The base .NET class managing System.Xml.XmlWhitespace, System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class XmlWhitespace extends NetObject  {
    public static final String assemblyFullName = "System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Private.Xml";
    public static final String className = "System.Xml.XmlWhitespace";
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

    public XmlWhitespace(Object instance) throws Throwable {
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

    public static XmlWhitespace castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlWhitespace(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public XmlNode CloneNode(boolean deep) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            JCObject objCloneNode = (JCObject)classInstance.Invoke("CloneNode", deep);
            return new XmlNode(objCloneNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteTo(XmlWriter w) throws Throwable {
        try {
            classInstance.Invoke("WriteTo", (Object)w.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteContentTo(XmlWriter w) throws Throwable {
        try {
            classInstance.Invoke("WriteContentTo", (Object)w.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String Substring(int offset, int count) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("Substring", offset, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AppendData(java.lang.String strData) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("AppendData", (Object)strData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InsertData(int offset, java.lang.String strData) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("InsertData", offset, (Object)strData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DeleteData(int offset, int count) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("DeleteData", offset, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReplaceData(int offset, int count, java.lang.String strData) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("ReplaceData", offset, count, (Object)strData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XPathNavigator CreateNavigator() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException {
        try {
            JCObject objCreateNavigator = (JCObject)classInstance.Invoke("CreateNavigator");
            return new XPathNavigator(objCreateNavigator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode SelectSingleNode(java.lang.String xpath) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.xpath.XPathException {
        try {
            JCObject objSelectSingleNode = (JCObject)classInstance.Invoke("SelectSingleNode", (Object)xpath);
            return new XmlNode(objSelectSingleNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode SelectSingleNode(java.lang.String xpath, XmlNamespaceManager nsmgr) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.xpath.XPathException {
        try {
            JCObject objSelectSingleNode = (JCObject)classInstance.Invoke("SelectSingleNode", (Object)xpath, (Object)nsmgr.getJCOInstance());
            return new XmlNode(objSelectSingleNode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNodeList SelectNodes(java.lang.String xpath) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.xpath.XPathException {
        try {
            JCObject objSelectNodes = (JCObject)classInstance.Invoke("SelectNodes", (Object)xpath);
            return new XmlNodeList(objSelectNodes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNodeList SelectNodes(java.lang.String xpath, XmlNamespaceManager nsmgr) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.xpath.XPathException {
        try {
            JCObject objSelectNodes = (JCObject)classInstance.Invoke("SelectNodes", (Object)xpath, (Object)nsmgr.getJCOInstance());
            return new XmlNodeList(objSelectNodes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode InsertBefore(XmlNode newChild, XmlNode refChild) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            JCObject objInsertBefore = (JCObject)classInstance.Invoke("InsertBefore", (Object)newChild.getJCOInstance(), (Object)refChild.getJCOInstance());
            return new XmlNode(objInsertBefore);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode InsertAfter(XmlNode newChild, XmlNode refChild) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            JCObject objInsertAfter = (JCObject)classInstance.Invoke("InsertAfter", (Object)newChild.getJCOInstance(), (Object)refChild.getJCOInstance());
            return new XmlNode(objInsertAfter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode ReplaceChild(XmlNode newChild, XmlNode oldChild) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objReplaceChild = (JCObject)classInstance.Invoke("ReplaceChild", (Object)newChild.getJCOInstance(), (Object)oldChild.getJCOInstance());
            return new XmlNode(objReplaceChild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode RemoveChild(XmlNode oldChild) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            JCObject objRemoveChild = (JCObject)classInstance.Invoke("RemoveChild", (Object)oldChild.getJCOInstance());
            return new XmlNode(objRemoveChild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode PrependChild(XmlNode newChild) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objPrependChild = (JCObject)classInstance.Invoke("PrependChild", (Object)newChild.getJCOInstance());
            return new XmlNode(objPrependChild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode AppendChild(XmlNode newChild) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            JCObject objAppendChild = (JCObject)classInstance.Invoke("AppendChild", (Object)newChild.getJCOInstance());
            return new XmlNode(objAppendChild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Normalize() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("Normalize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Supports(java.lang.String feature, java.lang.String version) throws Throwable, system.ArgumentException {
        try {
            return (boolean)classInstance.Invoke("Supports", (Object)feature, (Object)version);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode Clone() throws Throwable {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new XmlNode(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetNamespaceOfPrefix(java.lang.String prefix) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetNamespaceOfPrefix", (Object)prefix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPrefixOfNamespace(java.lang.String namespaceURI) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetPrefixOfNamespace", (Object)namespaceURI);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLocalName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("LocalName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNodeType getNodeType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NodeType");
            return new XmlNodeType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode getParentNode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ParentNode");
            return new XmlNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getValue() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Value");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValue(java.lang.String Value) throws Throwable {
        try {
            classInstance.Set("Value", (Object)Value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode getPreviousText() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PreviousText");
            return new XmlNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getInnerText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("InnerText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInnerText(java.lang.String InnerText) throws Throwable {
        try {
            classInstance.Set("InnerText", (Object)InnerText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getData() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Data");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setData(java.lang.String Data) throws Throwable {
        try {
            classInstance.Set("Data", (Object)Data);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLength() throws Throwable {
        try {
            return (int)classInstance.Get("Length");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode getPreviousSibling() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PreviousSibling");
            return new XmlNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode getNextSibling() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NextSibling");
            return new XmlNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNodeList getChildNodes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ChildNodes");
            return new XmlNodeList(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttributeCollection getAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new XmlAttributeCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlDocument getOwnerDocument() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OwnerDocument");
            return new XmlDocument(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode getFirstChild() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FirstChild");
            return new XmlNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNode getLastChild() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LastChild");
            return new XmlNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasChildNodes() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasChildNodes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNamespaceURI() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("NamespaceURI");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPrefix() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Prefix");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrefix(java.lang.String Prefix) throws Throwable {
        try {
            classInstance.Set("Prefix", (Object)Prefix);
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

    public java.lang.String getOuterXml() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("OuterXml");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getInnerXml() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("InnerXml");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInnerXml(java.lang.String InnerXml) throws Throwable {
        try {
            classInstance.Set("InnerXml", (Object)InnerXml);
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



	// Instance Events section
    
    
}