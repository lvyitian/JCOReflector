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

package system.xml.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.serialization.XmlSerializer;
import system.xml.serialization.XmlSerializationReader;
import system.xml.serialization.XmlSerializationWriter;
import system.collections.Hashtable;


/**
 * The base .NET class managing System.Xml.Serialization.XmlSerializerImplementation, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XmlSerializerImplementation extends NetObject  {
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xml";
    public static final String className = "System.Xml.Serialization.XmlSerializerImplementation";
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

    public XmlSerializerImplementation(Object instance) throws Throwable {
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

    public static XmlSerializerImplementation castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlSerializerImplementation(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public boolean CanSerialize(NetType type) throws Throwable, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("CanSerialize", (Object)type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializer GetSerializer(NetType type) throws Throwable, system.NotSupportedException {
        try {
            JCObject objGetSerializer = (JCObject)classInstance.Invoke("GetSerializer", (Object)type.getJCOInstance());
            return new XmlSerializer(objGetSerializer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public XmlSerializationReader getReader() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Reader");
            return new XmlSerializationReader(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSerializationWriter getWriter() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Writer");
            return new XmlSerializationWriter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Hashtable getReadMethods() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReadMethods");
            return new Hashtable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Hashtable getWriteMethods() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WriteMethods");
            return new Hashtable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Hashtable getTypedSerializers() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TypedSerializers");
            return new Hashtable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}