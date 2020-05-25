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

package system.runtime.serialization.json;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlDictionaryReader;
import system.io.Stream;
import system.xml.XmlDictionaryReaderQuotas;
import system.text.Encoding;
import system.xml.OnXmlDictionaryReaderClose;
import system.xml.XmlDictionaryWriter;


/**
 * The base .NET class managing System.Runtime.Serialization.Json.JsonReaderWriterFactory, System.Runtime.Serialization, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class JsonReaderWriterFactory extends NetObject  {
    public static final String assemblyFullName = "System.Runtime.Serialization, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Runtime.Serialization";
    public static final String className = "System.Runtime.Serialization.Json.JsonReaderWriterFactory";
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

    public JsonReaderWriterFactory(Object instance) throws Throwable {
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

    public static JsonReaderWriterFactory castFrom(IJCOBridgeReflected from) throws Throwable {
        return new JsonReaderWriterFactory(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static XmlDictionaryReader CreateJsonReader(Stream stream, XmlDictionaryReaderQuotas quotas) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", (Object)stream.getJCOInstance(), (Object)quotas.getJCOInstance());
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(byte[] buffer, XmlDictionaryReaderQuotas quotas) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", buffer, (Object)quotas.getJCOInstance());
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(Stream stream, Encoding encoding, XmlDictionaryReaderQuotas quotas, OnXmlDictionaryReaderClose onClose) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", (Object)stream.getJCOInstance(), (Object)encoding.getJCOInstance(), (Object)quotas.getJCOInstance(), onClose);
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(byte[] buffer, int offset, int count, XmlDictionaryReaderQuotas quotas) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", buffer, offset, count, (Object)quotas.getJCOInstance());
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryReader CreateJsonReader(byte[] buffer, int offset, int count, Encoding encoding, XmlDictionaryReaderQuotas quotas, OnXmlDictionaryReaderClose onClose) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            JCObject objCreateJsonReader = (JCObject)classType.Invoke("CreateJsonReader", buffer, offset, count, (Object)encoding.getJCOInstance(), (Object)quotas.getJCOInstance(), onClose);
            return new XmlDictionaryReader(objCreateJsonReader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.InvalidOperationException, system.NotSupportedException, system.ObjectDisposedException {
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", (Object)stream.getJCOInstance());
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream, Encoding encoding) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException {
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", (Object)stream.getJCOInstance(), (Object)encoding.getJCOInstance());
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream, Encoding encoding, boolean ownsStream) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", (Object)stream.getJCOInstance(), (Object)encoding.getJCOInstance(), ownsStream);
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream, Encoding encoding, boolean ownsStream, boolean indent) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", (Object)stream.getJCOInstance(), (Object)encoding.getJCOInstance(), ownsStream, indent);
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlDictionaryWriter CreateJsonWriter(Stream stream, Encoding encoding, boolean ownsStream, boolean indent, java.lang.String indentChars) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            JCObject objCreateJsonWriter = (JCObject)classType.Invoke("CreateJsonWriter", (Object)stream.getJCOInstance(), (Object)encoding.getJCOInstance(), ownsStream, indent, (Object)indentChars);
            return new XmlDictionaryWriter(objCreateJsonWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}