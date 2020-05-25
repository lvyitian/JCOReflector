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

package system.servicemodel.channels;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.channels.BindingElement;
import system.servicemodel.channels.MessageEncoderFactory;
import system.servicemodel.channels.CompressionFormat;
import system.servicemodel.channels.MessageVersion;
import system.xml.XmlDictionaryReaderQuotas;


/**
 * The base .NET class managing System.ServiceModel.Channels.BinaryMessageEncodingBindingElement, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class BinaryMessageEncodingBindingElement extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Channels.BinaryMessageEncodingBindingElement";
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

    public BinaryMessageEncodingBindingElement(Object instance) throws Throwable {
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

    public static BinaryMessageEncodingBindingElement castFrom(IJCOBridgeReflected from) throws Throwable {
        return new BinaryMessageEncodingBindingElement(from.getJCOInstance());
    }

    // Constructors section
    
    
    public BinaryMessageEncodingBindingElement() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public BindingElement Clone() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new BindingElement(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageEncoderFactory CreateMessageEncoderFactory() throws Throwable, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException {
        try {
            JCObject objCreateMessageEncoderFactory = (JCObject)classInstance.Invoke("CreateMessageEncoderFactory");
            return new MessageEncoderFactory(objCreateMessageEncoderFactory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldSerializeMessageVersion() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeMessageVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShouldSerializeReaderQuotas() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeReaderQuotas");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public CompressionFormat getCompressionFormat() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CompressionFormat");
            return new CompressionFormat(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCompressionFormat(CompressionFormat CompressionFormat) throws Throwable {
        try {
            classInstance.Set("CompressionFormat", (Object)CompressionFormat.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageVersion getMessageVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MessageVersion");
            return new MessageVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMessageVersion(MessageVersion MessageVersion) throws Throwable {
        try {
            classInstance.Set("MessageVersion", (Object)MessageVersion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxReadPoolSize() throws Throwable {
        try {
            return (int)classInstance.Get("MaxReadPoolSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxReadPoolSize(int MaxReadPoolSize) throws Throwable {
        try {
            classInstance.Set("MaxReadPoolSize", MaxReadPoolSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxWritePoolSize() throws Throwable {
        try {
            return (int)classInstance.Get("MaxWritePoolSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxWritePoolSize(int MaxWritePoolSize) throws Throwable {
        try {
            classInstance.Set("MaxWritePoolSize", MaxWritePoolSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlDictionaryReaderQuotas getReaderQuotas() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReaderQuotas");
            return new XmlDictionaryReaderQuotas(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReaderQuotas(XmlDictionaryReaderQuotas ReaderQuotas) throws Throwable {
        try {
            classInstance.Set("ReaderQuotas", (Object)ReaderQuotas.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxSessionSize() throws Throwable {
        try {
            return (int)classInstance.Get("MaxSessionSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxSessionSize(int MaxSessionSize) throws Throwable {
        try {
            classInstance.Set("MaxSessionSize", MaxSessionSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}