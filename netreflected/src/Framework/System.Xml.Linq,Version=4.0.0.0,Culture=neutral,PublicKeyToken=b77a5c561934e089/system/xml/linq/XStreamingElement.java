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

package system.xml.linq;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.linq.XName;
import system.io.Stream;
import system.io.TextWriter;
import system.xml.linq.SaveOptions;
import system.xml.XmlWriter;


/**
 * The base .NET class managing System.Xml.Linq.XStreamingElement, System.Xml.Linq, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XStreamingElement extends NetObject  {
    public static final String assemblyFullName = "System.Xml.Linq, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xml.Linq";
    public static final String className = "System.Xml.Linq.XStreamingElement";
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

    public XStreamingElement(Object instance) throws Throwable {
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

    public static XStreamingElement castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XStreamingElement(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XStreamingElement(XName name) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)name.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XStreamingElement(XName name, NetObject content) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)name.getJCOInstance(), (Object)content.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XStreamingElement(XName name, NetObject... content) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)name.getJCOInstance(), (Object[])toObjectFromArray(content));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Add(NetObject... content) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("Add", (Object[])toObjectFromArray(content));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(java.lang.String fileName) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.NullReferenceException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("Save", (Object)fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.NotImplementedException {
        try {
            classInstance.Invoke("Save", (Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(TextWriter textWriter) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.NotImplementedException, system.NotSupportedException, system.ArgumentException, system.InvalidOperationException {
        try {
            classInstance.Invoke("Save", (Object)textWriter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(SaveOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.xml.XmlException, system.NotImplementedException, system.NotSupportedException, system.ArgumentException, system.OverflowException {
        try {
            return (java.lang.String)classInstance.Invoke("ToString", (Object)options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(NetObject content) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("Add", (Object)content.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(java.lang.String fileName, SaveOptions options) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.xml.XmlException, system.ArgumentException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.ObjectDisposedException, system.NotImplementedException, system.OverflowException {
        try {
            classInstance.Invoke("Save", (Object)fileName, (Object)options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream, SaveOptions options) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.xml.XmlException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.NotSupportedException, system.NotImplementedException, system.OverflowException {
        try {
            classInstance.Invoke("Save", (Object)stream.getJCOInstance(), (Object)options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(TextWriter textWriter, SaveOptions options) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.xml.XmlException, system.NotImplementedException, system.NotSupportedException, system.ObjectDisposedException, system.ArgumentException, system.OverflowException {
        try {
            classInstance.Invoke("Save", (Object)textWriter.getJCOInstance(), (Object)options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(XmlWriter writer) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("Save", (Object)writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteTo(XmlWriter writer) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OverflowException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classInstance.Invoke("WriteTo", (Object)writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public XName getName() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Name");
            return new XName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(XName Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}