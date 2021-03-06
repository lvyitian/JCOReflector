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
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.xml.xpath;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.linq.XNode;
import system.xml.IXmlNamespaceResolver;
import system.xml.IXmlNamespaceResolverImplementation;
import system.xml.linq.XElement;
import system.xml.xpath.XPathNavigator;
import system.xml.XmlNameTable;


/**
 * The base .NET class managing System.Xml.XPath.Extensions, System.Xml.Linq, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.XPath.Extensions" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.XPath.Extensions</a>
 */
public class Extensions extends NetObject  {
    /**
     * Fully assembly qualified name: System.Xml.Linq, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Xml.Linq, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Xml.Linq
     */
    public static final String assemblyShortName = "System.Xml.Linq";
    /**
     * Qualified class name: System.Xml.XPath.Extensions
     */
    public static final String className = "System.Xml.XPath.Extensions";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public Extensions(Object instance) throws Throwable {
        super(instance);
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Extensions}, a cast assert is made to check if types are compatible.
     */
    public static Extensions cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Extensions(from.getJCOInstance());
    }

    // Constructors section
    
    public Extensions() throws Throwable {
    }

    
    // Methods section
    
    public static NetObject XPathEvaluate(XNode node, java.lang.String expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.xpath.XPathException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objXPathEvaluate = (JCObject)classType.Invoke("XPathEvaluate", node == null ? null : node.getJCOInstance(), expression);
            return new NetObject(objXPathEvaluate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject XPathEvaluate(XNode node, java.lang.String expression, IXmlNamespaceResolver resolver) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.xml.xpath.XPathException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objXPathEvaluate = (JCObject)classType.Invoke("XPathEvaluate", node == null ? null : node.getJCOInstance(), expression, resolver == null ? null : resolver.getJCOInstance());
            return new NetObject(objXPathEvaluate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XElement XPathSelectElement(XNode node, java.lang.String expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.xpath.XPathException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objXPathSelectElement = (JCObject)classType.Invoke("XPathSelectElement", node == null ? null : node.getJCOInstance(), expression);
            return new XElement(objXPathSelectElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XElement XPathSelectElement(XNode node, java.lang.String expression, IXmlNamespaceResolver resolver) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xml.xpath.XPathException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objXPathSelectElement = (JCObject)classType.Invoke("XPathSelectElement", node == null ? null : node.getJCOInstance(), expression, resolver == null ? null : resolver.getJCOInstance());
            return new XElement(objXPathSelectElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XPathNavigator CreateNavigator(XNode node) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateNavigator = (JCObject)classType.Invoke("CreateNavigator", node == null ? null : node.getJCOInstance());
            return new XPathNavigator(objCreateNavigator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XPathNavigator CreateNavigator(XNode node, XmlNameTable nameTable) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateNavigator = (JCObject)classType.Invoke("CreateNavigator", node == null ? null : node.getJCOInstance(), nameTable == null ? null : nameTable.getJCOInstance());
            return new XPathNavigator(objCreateNavigator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}