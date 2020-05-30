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

package system.xml.xsl;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlReader;
import system.xml.xpath.XPathNavigator;
import system.xml.xsl.XsltArgumentList;
import system.xml.XmlResolver;
import system.security.policy.Evidence;
import system.xml.XmlWriter;
import system.io.Stream;
import system.io.TextWriter;


/**
 * The base .NET class managing System.Xml.Xsl.XslTransform, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XslTransform extends NetObject  {
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xml";
    public static final String className = "System.Xml.Xsl.XslTransform";
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

    public XslTransform(Object instance) throws Throwable {
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

    public static XslTransform castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XslTransform(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XslTransform() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Load(java.lang.String url) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.UriFormatException, system.io.PathTooLongException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.xml.XmlException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.xml.xsl.XsltCompileException, system.RankException, system.xml.xsl.XsltException, system.MissingMethodException, system.security.XmlSyntaxException {
        try {
            classInstance.Invoke("Load", (Object)url);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlReader Transform(XPathNavigator input, XsltArgumentList args, XmlResolver resolver) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.xml.xpath.XPathException, system.NotSupportedException, system.xml.XmlException {
        try {
            JCObject objTransform = (JCObject)classInstance.Invoke("Transform", (Object)input.getJCOInstance(), (Object)args.getJCOInstance(), (Object)resolver.getJCOInstance());
            return new XmlReader(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(XmlReader stylesheet, XmlResolver resolver) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.xml.xsl.XsltCompileException, system.RankException, system.xml.xsl.XsltException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.NullReferenceException {
        try {
            classInstance.Invoke("Load", (Object)stylesheet.getJCOInstance(), (Object)resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(XPathNavigator stylesheet, XmlResolver resolver) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.xml.xsl.XsltCompileException, system.RankException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.xml.xsl.XsltException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.XmlSyntaxException, system.NullReferenceException {
        try {
            classInstance.Invoke("Load", (Object)stylesheet.getJCOInstance(), (Object)resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(XmlReader stylesheet, XmlResolver resolver, Evidence evidence) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.xml.xsl.XsltCompileException, system.RankException, system.xml.xsl.XsltException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.NullReferenceException {
        try {
            classInstance.Invoke("Load", (Object)stylesheet.getJCOInstance(), (Object)resolver.getJCOInstance(), (Object)evidence.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(XPathNavigator stylesheet, XmlResolver resolver, Evidence evidence) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.xml.xsl.XsltCompileException, system.RankException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.xml.xsl.XsltException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.security.XmlSyntaxException, system.NullReferenceException {
        try {
            classInstance.Invoke("Load", (Object)stylesheet.getJCOInstance(), (Object)resolver.getJCOInstance(), (Object)evidence.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(java.lang.String inputfile, java.lang.String outputfile, XmlResolver resolver) throws Throwable, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.xml.xpath.XPathException {
        try {
            classInstance.Invoke("Transform", (Object)inputfile, (Object)outputfile, (Object)resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(XmlReader stylesheet) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.IndexOutOfRangeException, system.FormatException, system.xml.xsl.XsltCompileException, system.RankException, system.xml.xsl.XsltException, system.security.SecurityException, system.NotImplementedException {
        try {
            classInstance.Invoke("Load", (Object)stylesheet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(XPathNavigator stylesheet) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.IndexOutOfRangeException, system.FormatException, system.xml.xsl.XsltCompileException, system.RankException, system.xml.xsl.XsltException, system.security.SecurityException, system.NotImplementedException, system.MissingMethodException {
        try {
            classInstance.Invoke("Load", (Object)stylesheet.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(java.lang.String url, XmlResolver resolver) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.UriFormatException, system.io.PathTooLongException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.xml.XmlException, system.xml.xsl.XsltCompileException, system.RankException, system.xml.xsl.XsltException, system.MissingMethodException, system.security.XmlSyntaxException {
        try {
            classInstance.Invoke("Load", (Object)url, (Object)resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlReader Transform(XPathNavigator input, XsltArgumentList args) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.InvalidOperationException, system.IndexOutOfRangeException, system.xml.xpath.XPathException, system.MissingMethodException, system.reflection.TargetInvocationException, system.xml.XmlException, system.NotImplementedException, system.ObjectDisposedException {
        try {
            JCObject objTransform = (JCObject)classInstance.Invoke("Transform", (Object)input.getJCOInstance(), (Object)args.getJCOInstance());
            return new XmlReader(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(XPathNavigator input, XsltArgumentList args, XmlWriter output, XmlResolver resolver) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.xml.xpath.XPathException, system.NotSupportedException, system.xml.XmlException {
        try {
            classInstance.Invoke("Transform", (Object)input.getJCOInstance(), (Object)args.getJCOInstance(), (Object)output.getJCOInstance(), (Object)resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(XPathNavigator input, XsltArgumentList args, XmlWriter output) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.InvalidOperationException, system.IndexOutOfRangeException, system.xml.xpath.XPathException, system.MissingMethodException, system.reflection.TargetInvocationException, system.xml.XmlException {
        try {
            classInstance.Invoke("Transform", (Object)input.getJCOInstance(), (Object)args.getJCOInstance(), (Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(XPathNavigator input, XsltArgumentList args, Stream output, XmlResolver resolver) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.xml.xpath.XPathException, system.NotSupportedException, system.xml.XmlException, system.FormatException {
        try {
            classInstance.Invoke("Transform", (Object)input.getJCOInstance(), (Object)args.getJCOInstance(), (Object)output.getJCOInstance(), (Object)resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(XPathNavigator input, XsltArgumentList args, Stream output) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.InvalidOperationException, system.IndexOutOfRangeException, system.xml.xpath.XPathException, system.MissingMethodException, system.reflection.TargetInvocationException, system.xml.XmlException, system.NotImplementedException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Transform", (Object)input.getJCOInstance(), (Object)args.getJCOInstance(), (Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(XPathNavigator input, XsltArgumentList args, TextWriter output, XmlResolver resolver) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.xml.xpath.XPathException, system.NotSupportedException, system.xml.XmlException {
        try {
            classInstance.Invoke("Transform", (Object)input.getJCOInstance(), (Object)args.getJCOInstance(), (Object)output.getJCOInstance(), (Object)resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(XPathNavigator input, XsltArgumentList args, TextWriter output) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.xml.xpath.XPathException, system.xml.XmlException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("Transform", (Object)input.getJCOInstance(), (Object)args.getJCOInstance(), (Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(java.lang.String inputfile, java.lang.String outputfile) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.NotImplementedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.security.SecurityException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.xml.xpath.XPathException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            classInstance.Invoke("Transform", (Object)inputfile, (Object)outputfile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public void setXmlResolver(XmlResolver XmlResolver) throws Throwable {
        try {
            classInstance.Set("XmlResolver", (Object)XmlResolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}