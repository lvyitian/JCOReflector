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
import system.xml.XmlNameTable;
import system.xml.schema.XmlSchemaSet;
import system.xml.schema.XmlSchemaInfo;
import system.xml.schema.XmlValueGetter;
import system.xml.schema.XmlSchema;
import system.xml.schema.XmlSchemaObject;
import system.xml.schema.XmlSchemaParticle;
import system.xml.schema.XmlSchemaAttribute;
import system.xml.XmlResolver;
import system.Uri;
import system.xml.schema.ValidationEventHandler;


/**
 * The base .NET class managing System.Xml.Schema.XmlSchemaValidator, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XmlSchemaValidator extends NetObject  {
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xml";
    public static final String className = "System.Xml.Schema.XmlSchemaValidator";
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

    public XmlSchemaValidator(Object instance) throws Throwable {
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

    public static XmlSchemaValidator castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlSchemaValidator(from.getJCOInstance());
    }

    // Constructors section
    
    

    
    // Methods section
    
    
    public void Initialize() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classInstance.Invoke("Initialize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateElement(java.lang.String localName, java.lang.String namespaceUri, XmlSchemaInfo schemaInfo) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.XmlException, system.NotSupportedException, system.xml.schema.XmlSchemaException, system.RankException, system.FormatException {
        try {
            classInstance.Invoke("ValidateElement", (Object)localName, (Object)namespaceUri, (Object)schemaInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateElement(java.lang.String localName, java.lang.String namespaceUri, XmlSchemaInfo schemaInfo, java.lang.String xsiType, java.lang.String xsiNil, java.lang.String xsiSchemaLocation, java.lang.String xsiNoNamespaceSchemaLocation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.xml.XmlException, system.UriFormatException, system.io.PathTooLongException, system.NotSupportedException, system.OutOfMemoryException, system.FormatException, system.xml.schema.XmlSchemaException, system.RankException {
        try {
            classInstance.Invoke("ValidateElement", (Object)localName, (Object)namespaceUri, (Object)schemaInfo.getJCOInstance(), (Object)xsiType, (Object)xsiNil, (Object)xsiSchemaLocation, (Object)xsiNoNamespaceSchemaLocation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ValidateAttribute(java.lang.String localName, java.lang.String namespaceUri, java.lang.String attributeValue, XmlSchemaInfo schemaInfo) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.schema.XmlSchemaException, system.xml.XmlException, system.FormatException, system.RankException {
        try {
            JCObject objValidateAttribute = (JCObject)classInstance.Invoke("ValidateAttribute", (Object)localName, (Object)namespaceUri, (Object)attributeValue, (Object)schemaInfo.getJCOInstance());
            return new NetObject(objValidateAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ValidateAttribute(java.lang.String localName, java.lang.String namespaceUri, XmlValueGetter attributeValue, XmlSchemaInfo schemaInfo) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.schema.XmlSchemaException, system.xml.XmlException, system.FormatException, system.RankException {
        try {
            JCObject objValidateAttribute = (JCObject)classInstance.Invoke("ValidateAttribute", (Object)localName, (Object)namespaceUri, attributeValue, (Object)schemaInfo.getJCOInstance());
            return new NetObject(objValidateAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateEndOfAttributes(XmlSchemaInfo schemaInfo) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("ValidateEndOfAttributes", (Object)schemaInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateText(java.lang.String elementValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("ValidateText", (Object)elementValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateText(XmlValueGetter elementValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("ValidateText", elementValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateWhitespace(java.lang.String elementValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("ValidateWhitespace", (Object)elementValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateWhitespace(XmlValueGetter elementValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("ValidateWhitespace", elementValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ValidateEndElement(XmlSchemaInfo schemaInfo) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException {
        try {
            JCObject objValidateEndElement = (JCObject)classInstance.Invoke("ValidateEndElement", (Object)schemaInfo.getJCOInstance());
            return new NetObject(objValidateEndElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ValidateEndElement(XmlSchemaInfo schemaInfo, NetObject typedValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.NullReferenceException, system.IndexOutOfRangeException {
        try {
            JCObject objValidateEndElement = (JCObject)classInstance.Invoke("ValidateEndElement", (Object)schemaInfo.getJCOInstance(), (Object)typedValue.getJCOInstance());
            return new NetObject(objValidateEndElement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndValidation() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classInstance.Invoke("EndValidation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddSchema(XmlSchema schema) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.RankException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationException, system.NotSupportedException, system.FormatException, system.xml.schema.XmlSchemaException, system.xml.XmlException {
        try {
            classInstance.Invoke("AddSchema", (Object)schema.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(XmlSchemaObject partialValidationType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classInstance.Invoke("Initialize", (Object)partialValidationType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetUnspecifiedDefaultAttributes(NetArrayList defaultAttributes) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("GetUnspecifiedDefaultAttributes", (Object)defaultAttributes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SkipToEndElement(XmlSchemaInfo schemaInfo) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classInstance.Invoke("SkipToEndElement", (Object)schemaInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaParticle[] GetExpectedParticles() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.NotSupportedException {
        try {
            ArrayList<XmlSchemaParticle> resultingArrayList = new ArrayList<XmlSchemaParticle>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetExpectedParticles");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new XmlSchemaParticle(resultingObject));
            }
            XmlSchemaParticle[] resultingArray = new XmlSchemaParticle[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaAttribute[] GetExpectedAttributes() throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException {
        try {
            ArrayList<XmlSchemaAttribute> resultingArrayList = new ArrayList<XmlSchemaAttribute>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetExpectedAttributes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new XmlSchemaAttribute(resultingObject));
            }
            XmlSchemaAttribute[] resultingArray = new XmlSchemaAttribute[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
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

    public Uri getSourceUri() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SourceUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceUri(Uri SourceUri) throws Throwable {
        try {
            classInstance.Set("SourceUri", (Object)SourceUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getValidationEventSender() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValidationEventSender");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidationEventSender(NetObject ValidationEventSender) throws Throwable {
        try {
            classInstance.Set("ValidationEventSender", (Object)ValidationEventSender.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addValidationEventHandler(ValidationEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ValidationEventHandler", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeValidationEventHandler(ValidationEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ValidationEventHandler", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}