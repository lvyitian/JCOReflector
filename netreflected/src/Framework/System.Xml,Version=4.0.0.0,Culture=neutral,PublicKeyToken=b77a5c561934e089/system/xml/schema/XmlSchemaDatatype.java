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

package system.xml.schema;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.schema.XmlSchemaDatatype;
import system.xml.IXmlNamespaceResolver;
import system.xml.IXmlNamespaceResolverImplementation;
import system.xml.XmlNameTable;
import system.xml.schema.XmlSchemaDatatypeVariety;
import system.xml.schema.XmlTypeCode;
import system.xml.XmlTokenizedType;


/**
 * The base .NET class managing System.Xml.Schema.XmlSchemaDatatype, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Schema.XmlSchemaDatatype" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Xml.Schema.XmlSchemaDatatype</a>
 */
public class XmlSchemaDatatype extends NetObject  {
    /**
     * Fully assembly qualified name: System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Xml
     */
    public static final String assemblyShortName = "System.Xml";
    /**
     * Qualified class name: System.Xml.Schema.XmlSchemaDatatype
     */
    public static final String className = "System.Xml.Schema.XmlSchemaDatatype";
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

    public XmlSchemaDatatype(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link XmlSchemaDatatype}, a cast assert is made to check if types are compatible.
     */
    public static XmlSchemaDatatype cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XmlSchemaDatatype(from.getJCOInstance());
    }

    // Constructors section
    
    public XmlSchemaDatatype() throws Throwable {
    }

    
    // Methods section
    
    public boolean IsDerivedFrom(XmlSchemaDatatype datatype) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDerivedFrom", datatype == null ? null : datatype.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ChangeType(NetObject value, NetType targetType) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeType = (JCObject)classInstance.Invoke("ChangeType", value == null ? null : value.getJCOInstance(), targetType == null ? null : targetType.getJCOInstance());
            return new NetObject(objChangeType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ChangeType(NetObject value, NetType targetType, IXmlNamespaceResolver namespaceResolver) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objChangeType = (JCObject)classInstance.Invoke("ChangeType", value == null ? null : value.getJCOInstance(), targetType == null ? null : targetType.getJCOInstance(), namespaceResolver == null ? null : namespaceResolver.getJCOInstance());
            return new NetObject(objChangeType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ParseValue(java.lang.String s, XmlNameTable nameTable, IXmlNamespaceResolver nsmgr) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objParseValue = (JCObject)classInstance.Invoke("ParseValue", s, nameTable == null ? null : nameTable.getJCOInstance(), nsmgr == null ? null : nsmgr.getJCOInstance());
            return new NetObject(objParseValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public NetType getValueType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ValueType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaDatatypeVariety getVariety() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Variety");
            return new XmlSchemaDatatypeVariety(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeCode getTypeCode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TypeCode");
            return new XmlTypeCode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTokenizedType getTokenizedType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TokenizedType");
            return new XmlTokenizedType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}