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

package system.web.services.description;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.services.description.ServiceDescriptionFormatExtensionCollection;
import system.web.services.description.InputBinding;
import system.web.services.description.OutputBinding;
import system.web.services.description.FaultBindingCollection;
import system.xml.XmlElement;
import system.xml.XmlAttribute;
import system.xml.serialization.XmlSerializerNamespaces;


/**
 * The base .NET class managing System.Web.Services.Description.OperationBinding, System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class OperationBinding extends NetObject  {
    public static final String assemblyFullName = "System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web.Services";
    public static final String className = "System.Web.Services.Description.OperationBinding";
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

    public OperationBinding(Object instance) throws Throwable {
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

    public static OperationBinding castFrom(IJCOBridgeReflected from) throws Throwable {
        return new OperationBinding(from.getJCOInstance());
    }

    // Constructors section
    
    
    public OperationBinding() throws Throwable {
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
    
    
    public system.web.services.description.Binding getBinding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Binding");
            return new system.web.services.description.Binding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceDescriptionFormatExtensionCollection getExtensions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Extensions");
            return new ServiceDescriptionFormatExtensionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InputBinding getInput() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Input");
            return new InputBinding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInput(InputBinding Input) throws Throwable {
        try {
            classInstance.Set("Input", (Object)Input.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public OutputBinding getOutput() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Output");
            return new OutputBinding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOutput(OutputBinding Output) throws Throwable {
        try {
            classInstance.Set("Output", (Object)Output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FaultBindingCollection getFaults() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Faults");
            return new FaultBindingCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDocumentation() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Documentation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDocumentation(java.lang.String Documentation) throws Throwable {
        try {
            classInstance.Set("Documentation", (Object)Documentation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlElement getDocumentationElement() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DocumentationElement");
            return new XmlElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDocumentationElement(XmlElement DocumentationElement) throws Throwable {
        try {
            classInstance.Set("DocumentationElement", (Object)DocumentationElement.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlAttribute[] getExtensibleAttributes() throws Throwable {
        try {
            ArrayList<XmlAttribute> resultingArrayList = new ArrayList<XmlAttribute>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ExtensibleAttributes");
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

    public void setExtensibleAttributes(XmlAttribute[] ExtensibleAttributes) throws Throwable {
        try {
            classInstance.Set("ExtensibleAttributes", (Object)toObjectFromArray(ExtensibleAttributes));
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