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
import system.xml.serialization.SoapAttributeOverrides;
import system.xml.serialization.XmlTypeMapping;
import system.xml.serialization.XmlMembersMapping;
import system.xml.serialization.XmlReflectionMember;
import system.xml.serialization.XmlMappingAccess;


/**
 * The base .NET class managing System.Xml.Serialization.SoapReflectionImporter, System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SoapReflectionImporter extends NetObject  {
    public static final String assemblyFullName = "System.Xml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xml";
    public static final String className = "System.Xml.Serialization.SoapReflectionImporter";
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

    public SoapReflectionImporter(Object instance) throws Throwable {
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

    public static SoapReflectionImporter castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SoapReflectionImporter(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SoapReflectionImporter() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SoapReflectionImporter(java.lang.String defaultNamespace) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)defaultNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SoapReflectionImporter(SoapAttributeOverrides attributeOverrides) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)attributeOverrides.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SoapReflectionImporter(SoapAttributeOverrides attributeOverrides, java.lang.String defaultNamespace) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)attributeOverrides.getJCOInstance(), (Object)defaultNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void IncludeType(NetType type) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.OverflowException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.InvalidOperationException, system.security.SecurityException, system.NotImplementedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("IncludeType", (Object)type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportTypeMapping(NetType type) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.NotImplementedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objImportTypeMapping = (JCObject)classInstance.Invoke("ImportTypeMapping", (Object)type.getJCOInstance());
            return new XmlTypeMapping(objImportTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlTypeMapping ImportTypeMapping(NetType type, java.lang.String defaultNamespace) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objImportTypeMapping = (JCObject)classInstance.Invoke("ImportTypeMapping", (Object)type.getJCOInstance(), (Object)defaultNamespace);
            return new XmlTypeMapping(objImportTypeMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException, system.FormatException {
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", (Object)elementName, (Object)ns, (Object)toObjectFromArray(members));
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement, boolean writeAccessors) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException, system.FormatException {
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", (Object)elementName, (Object)ns, (Object)toObjectFromArray(members), hasWrapperElement, writeAccessors);
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement, boolean writeAccessors, boolean validate) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.FormatException, system.NotImplementedException {
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", (Object)elementName, (Object)ns, (Object)toObjectFromArray(members), hasWrapperElement, writeAccessors, validate);
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlMembersMapping ImportMembersMapping(java.lang.String elementName, java.lang.String ns, XmlReflectionMember[] members, boolean hasWrapperElement, boolean writeAccessors, boolean validate, XmlMappingAccess access) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.security.SecurityException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.FormatException, system.OverflowException, system.NotImplementedException {
        try {
            JCObject objImportMembersMapping = (JCObject)classInstance.Invoke("ImportMembersMapping", (Object)elementName, (Object)ns, (Object)toObjectFromArray(members), hasWrapperElement, writeAccessors, validate, (Object)access.getJCOInstance());
            return new XmlMembersMapping(objImportMembersMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}