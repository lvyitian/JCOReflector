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

package system.runtime.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlDictionaryString;
import system.runtime.serialization.DataContractResolver;


/**
 * The base .NET class managing System.Runtime.Serialization.DataContractSerializerSettings, System.Private.DataContractSerialization, Version=4.1.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DataContractSerializerSettings extends NetObject  {
    public static final String assemblyFullName = "System.Private.DataContractSerialization, Version=4.1.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Private.DataContractSerialization";
    public static final String className = "System.Runtime.Serialization.DataContractSerializerSettings";
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

    public DataContractSerializerSettings(Object instance) throws Throwable {
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

    public static DataContractSerializerSettings castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataContractSerializerSettings(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataContractSerializerSettings() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public XmlDictionaryString getRootName() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RootName");
            return new XmlDictionaryString(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRootName(XmlDictionaryString RootName) throws Throwable {
        try {
            classInstance.Set("RootName", (Object)RootName.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlDictionaryString getRootNamespace() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RootNamespace");
            return new XmlDictionaryString(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRootNamespace(XmlDictionaryString RootNamespace) throws Throwable {
        try {
            classInstance.Set("RootNamespace", (Object)RootNamespace.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxItemsInObjectGraph() throws Throwable {
        try {
            return (int)classInstance.Get("MaxItemsInObjectGraph");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxItemsInObjectGraph(int MaxItemsInObjectGraph) throws Throwable {
        try {
            classInstance.Set("MaxItemsInObjectGraph", MaxItemsInObjectGraph);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnoreExtensionDataObject() throws Throwable {
        try {
            return (boolean)classInstance.Get("IgnoreExtensionDataObject");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreExtensionDataObject(boolean IgnoreExtensionDataObject) throws Throwable {
        try {
            classInstance.Set("IgnoreExtensionDataObject", IgnoreExtensionDataObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPreserveObjectReferences() throws Throwable {
        try {
            return (boolean)classInstance.Get("PreserveObjectReferences");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPreserveObjectReferences(boolean PreserveObjectReferences) throws Throwable {
        try {
            classInstance.Set("PreserveObjectReferences", PreserveObjectReferences);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataContractResolver getDataContractResolver() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataContractResolver");
            return new DataContractResolver(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataContractResolver(DataContractResolver DataContractResolver) throws Throwable {
        try {
            classInstance.Set("DataContractResolver", (Object)DataContractResolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSerializeReadOnlyTypes() throws Throwable {
        try {
            return (boolean)classInstance.Get("SerializeReadOnlyTypes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSerializeReadOnlyTypes(boolean SerializeReadOnlyTypes) throws Throwable {
        try {
            classInstance.Set("SerializeReadOnlyTypes", SerializeReadOnlyTypes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}