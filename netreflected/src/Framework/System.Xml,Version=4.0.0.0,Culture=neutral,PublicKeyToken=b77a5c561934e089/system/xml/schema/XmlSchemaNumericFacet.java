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
import system.xml.schema.XmlSchemaAnnotation;
import system.xml.XmlAttribute;
import system.xml.schema.XmlSchemaObject;
import system.xml.serialization.XmlSerializerNamespaces;


/**
 * The base .NET class managing System.Xml.Schema.XmlSchemaNumericFacet, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XmlSchemaNumericFacet extends NetObject  {
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xml";
    public static final String className = "System.Xml.Schema.XmlSchemaNumericFacet";
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

    public XmlSchemaNumericFacet(Object instance) throws Throwable {
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

    public static XmlSchemaNumericFacet castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlSchemaNumericFacet(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
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

    public boolean getIsFixed() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFixed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsFixed(boolean IsFixed) throws Throwable {
        try {
            classInstance.Set("IsFixed", IsFixed);
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

    public XmlSchemaAnnotation getAnnotation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Annotation");
            return new XmlSchemaAnnotation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAnnotation(XmlSchemaAnnotation Annotation) throws Throwable {
        try {
            classInstance.Set("Annotation", (Object)Annotation.getJCOInstance());
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