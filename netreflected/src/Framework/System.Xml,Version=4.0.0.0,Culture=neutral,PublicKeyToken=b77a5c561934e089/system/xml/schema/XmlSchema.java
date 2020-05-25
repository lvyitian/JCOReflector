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

package system.xml.schema;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.schema.XmlSchema;
import system.io.TextReader;
import system.xml.schema.ValidationEventHandler;
import system.io.Stream;
import system.xml.XmlReader;
import system.xml.XmlNamespaceManager;
import system.io.TextWriter;
import system.xml.XmlWriter;
import system.xml.XmlResolver;
import system.xml.schema.XmlSchemaForm;
import system.xml.schema.XmlSchemaDerivationMethod;
import system.xml.schema.XmlSchemaObjectCollection;
import system.xml.schema.XmlSchemaObjectTable;
import system.xml.XmlAttribute;
import system.xml.schema.XmlSchemaObject;
import system.xml.serialization.XmlSerializerNamespaces;


/**
 * The base .NET class managing System.Xml.Schema.XmlSchema, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XmlSchema extends NetObject  {
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xml";
    public static final String className = "System.Xml.Schema.XmlSchema";
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

    public XmlSchema(Object instance) throws Throwable {
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

    public static XmlSchema castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlSchema(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XmlSchema() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static XmlSchema Read(TextReader reader, ValidationEventHandler validationEventHandler) throws Throwable, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.resources.MissingManifestResourceException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.UriFormatException, system.NullReferenceException, system.xml.XmlException {
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", (Object)reader.getJCOInstance(), validationEventHandler);
            return new XmlSchema(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSchema Read(Stream stream, ValidationEventHandler validationEventHandler) throws Throwable, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentNullException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.resources.MissingManifestResourceException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.UriFormatException, system.NullReferenceException, system.xml.XmlException {
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", (Object)stream.getJCOInstance(), validationEventHandler);
            return new XmlSchema(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlSchema Read(XmlReader reader, ValidationEventHandler validationEventHandler) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.globalization.CultureNotFoundException, system.xml.schema.XmlSchemaException, system.security.SecurityException, system.UriFormatException, system.OutOfMemoryException, system.xml.XmlException {
        try {
            JCObject objRead = (JCObject)classType.Invoke("Read", (Object)reader.getJCOInstance(), validationEventHandler);
            return new XmlSchema(objRead);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Stream stream) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.threading.ThreadAbortException, system.configuration.ConfigurationErrorsException, system.security.SecurityException, system.componentmodel.InvalidEnumArgumentException, system.io.FileNotFoundException, system.UnauthorizedAccessException, system.MissingMethodException {
        try {
            classInstance.Invoke("Write", (Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Stream stream, XmlNamespaceManager namespaceManager) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.threading.ThreadAbortException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.security.SecurityException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.collections.generic.KeyNotFoundException, system.UnauthorizedAccessException, system.UriFormatException, system.MissingMethodException {
        try {
            classInstance.Invoke("Write", (Object)stream.getJCOInstance(), (Object)namespaceManager.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(TextWriter writer) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.threading.ThreadAbortException, system.configuration.ConfigurationErrorsException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.FormatException, system.io.FileNotFoundException, system.UnauthorizedAccessException, system.MissingMethodException {
        try {
            classInstance.Invoke("Write", (Object)writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(TextWriter writer, XmlNamespaceManager namespaceManager) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.threading.ThreadAbortException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.collections.generic.KeyNotFoundException, system.UnauthorizedAccessException, system.FormatException, system.UriFormatException, system.MissingMethodException {
        try {
            classInstance.Invoke("Write", (Object)writer.getJCOInstance(), (Object)namespaceManager.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(XmlWriter writer) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.collections.generic.KeyNotFoundException, system.UnauthorizedAccessException, system.FormatException, system.UriFormatException, system.MissingMethodException {
        try {
            classInstance.Invoke("Write", (Object)writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Compile(ValidationEventHandler validationEventHandler, XmlResolver resolver) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.xml.schema.XmlSchemaException, system.NotSupportedException, system.NotImplementedException, system.IndexOutOfRangeException, system.NullReferenceException, system.xml.XmlException {
        try {
            classInstance.Invoke("Compile", validationEventHandler, (Object)resolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(XmlWriter writer, XmlNamespaceManager namespaceManager) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.security.SecurityException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.RankException, system.io.FileNotFoundException, system.TypeLoadException, system.UnauthorizedAccessException, system.UriFormatException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("Write", (Object)writer.getJCOInstance(), (Object)namespaceManager.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Compile(ValidationEventHandler validationEventHandler) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationException, system.IndexOutOfRangeException, system.FormatException, system.xml.schema.XmlSchemaException, system.NotImplementedException, system.NullReferenceException, system.xml.XmlException {
        try {
            classInstance.Invoke("Compile", validationEventHandler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public XmlSchemaForm getAttributeFormDefault() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AttributeFormDefault");
            return new XmlSchemaForm(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAttributeFormDefault(XmlSchemaForm AttributeFormDefault) throws Throwable {
        try {
            classInstance.Set("AttributeFormDefault", (Object)AttributeFormDefault.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaDerivationMethod getBlockDefault() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BlockDefault");
            return new XmlSchemaDerivationMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBlockDefault(XmlSchemaDerivationMethod BlockDefault) throws Throwable {
        try {
            classInstance.Set("BlockDefault", (Object)BlockDefault.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaDerivationMethod getFinalDefault() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FinalDefault");
            return new XmlSchemaDerivationMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFinalDefault(XmlSchemaDerivationMethod FinalDefault) throws Throwable {
        try {
            classInstance.Set("FinalDefault", (Object)FinalDefault.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaForm getElementFormDefault() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ElementFormDefault");
            return new XmlSchemaForm(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setElementFormDefault(XmlSchemaForm ElementFormDefault) throws Throwable {
        try {
            classInstance.Set("ElementFormDefault", (Object)ElementFormDefault.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetNamespace() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TargetNamespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetNamespace(java.lang.String TargetNamespace) throws Throwable {
        try {
            classInstance.Set("TargetNamespace", (Object)TargetNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVersion(java.lang.String Version) throws Throwable {
        try {
            classInstance.Set("Version", (Object)Version);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaObjectCollection getIncludes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Includes");
            return new XmlSchemaObjectCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaObjectCollection getItems() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Items");
            return new XmlSchemaObjectCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCompiled() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsCompiled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaObjectTable getAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new XmlSchemaObjectTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaObjectTable getAttributeGroups() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AttributeGroups");
            return new XmlSchemaObjectTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaObjectTable getSchemaTypes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SchemaTypes");
            return new XmlSchemaObjectTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaObjectTable getElements() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Elements");
            return new XmlSchemaObjectTable(val);
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

    public XmlAttribute[] getUnhandledAttributes() throws Throwable {
        try {
            ArrayList<XmlAttribute> resultingArrayList = new ArrayList<XmlAttribute>();
            JCObject resultingObjects = (JCObject)classInstance.Get("UnhandledAttributes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new XmlAttribute(resultingObject));
            }
            XmlAttribute[] resultingArray = new XmlAttribute[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUnhandledAttributes(XmlAttribute[] UnhandledAttributes) throws Throwable {
        try {
            classInstance.Set("UnhandledAttributes", (Object)toObjectFromArray(UnhandledAttributes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaObjectTable getGroups() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Groups");
            return new XmlSchemaObjectTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaObjectTable getNotations() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Notations");
            return new XmlSchemaObjectTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLineNumber() throws Throwable {
        try {
            return (int)classInstance.Get("LineNumber");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLineNumber(int LineNumber) throws Throwable {
        try {
            classInstance.Set("LineNumber", LineNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLinePosition() throws Throwable {
        try {
            return (int)classInstance.Get("LinePosition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLinePosition(int LinePosition) throws Throwable {
        try {
            classInstance.Set("LinePosition", LinePosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSourceUri() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SourceUri");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceUri(java.lang.String SourceUri) throws Throwable {
        try {
            classInstance.Set("SourceUri", (Object)SourceUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaObject getParent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new XmlSchemaObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setParent(XmlSchemaObject Parent) throws Throwable {
        try {
            classInstance.Set("Parent", (Object)Parent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializerNamespaces getNamespaces() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Namespaces");
            return new XmlSerializerNamespaces(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNamespaces(XmlSerializerNamespaces Namespaces) throws Throwable {
        try {
            classInstance.Set("Namespaces", (Object)Namespaces.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}