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

package system.xaml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlReader;
import system.xml.XmlWriter;
import system.xaml.XamlWriter;
import system.io.Stream;
import system.io.TextReader;
import system.io.TextWriter;


/**
 * The base .NET class managing System.Xaml.XamlServices, System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XamlServices extends NetObject  {
    public static final String assemblyFullName = "System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xaml";
    public static final String className = "System.Xaml.XamlServices";
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

    public XamlServices(Object instance) throws Throwable {
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

    public static XamlServices castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XamlServices(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static NetObject Load(XmlReader xmlReader) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.xaml.XamlSchemaException, system.IndexOutOfRangeException, system.xml.XmlException, system.security.SecurityException, system.UriFormatException, system.MulticastNotSupportedException, system.threading.ThreadAbortException, system.xaml.XamlException {
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", (Object)xmlReader.getJCOInstance());
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(XmlWriter writer, NetObject instance) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotImplementedException, system.MulticastNotSupportedException, system.threading.ThreadAbortException, system.InvalidOperationException, system.IndexOutOfRangeException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException, system.collections.generic.KeyNotFoundException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classType.Invoke("Save", (Object)writer.getJCOInstance(), (Object)instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(XamlWriter writer, NetObject instance) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.IndexOutOfRangeException, system.xaml.XamlObjectReaderException, system.NotSupportedException, system.xaml.XamlSchemaException, system.collections.generic.KeyNotFoundException, system.NotImplementedException, system.globalization.CultureNotFoundException {
        try {
            classType.Invoke("Save", (Object)writer.getJCOInstance(), (Object)instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Parse(java.lang.String xaml) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.FormatException, system.xml.schema.XmlSchemaException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.xaml.XamlSchemaException, system.threading.ThreadAbortException, system.xaml.XamlException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)xaml);
            return new NetObject(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Load(java.lang.String fileName) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.IndexOutOfRangeException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.AggregateException, system.FormatException, system.xml.schema.XmlSchemaException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.xaml.XamlSchemaException, system.xaml.XamlException {
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", (Object)fileName);
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Load(Stream stream) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.FormatException, system.xml.schema.XmlSchemaException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.xaml.XamlSchemaException, system.threading.ThreadAbortException, system.xaml.XamlException {
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", (Object)stream.getJCOInstance());
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Load(TextReader textReader) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.xml.XmlException, system.ArgumentOutOfRangeException, system.FormatException, system.xml.schema.XmlSchemaException, system.globalization.CultureNotFoundException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.xaml.XamlSchemaException, system.threading.ThreadAbortException, system.xaml.XamlException {
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", (Object)textReader.getJCOInstance());
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String Save(NetObject instance) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.XmlException, system.NotImplementedException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException {
        try {
            return (java.lang.String)classType.Invoke("Save", (Object)instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(java.lang.String fileName, NetObject instance) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.xml.XmlException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.MulticastNotSupportedException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException {
        try {
            classType.Invoke("Save", (Object)fileName, (Object)instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(Stream stream, NetObject instance) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.XmlException, system.NotSupportedException, system.NotImplementedException, system.MulticastNotSupportedException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException, system.globalization.CultureNotFoundException {
        try {
            classType.Invoke("Save", (Object)stream.getJCOInstance(), (Object)instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Save(TextWriter writer, NetObject instance) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.XmlException, system.NotImplementedException, system.NotSupportedException, system.MulticastNotSupportedException, system.xaml.XamlObjectReaderException, system.xaml.XamlSchemaException, system.globalization.CultureNotFoundException {
        try {
            classType.Invoke("Save", (Object)writer.getJCOInstance(), (Object)instance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}