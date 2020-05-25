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

package system.web.ui.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.design.ControlDesigner;
import system.web.ui.webcontrols.Style;


/**
 * The base .NET class managing System.Web.UI.Design.TemplateDefinition, System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class TemplateDefinition extends NetObject  {
    public static final String assemblyFullName = "System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Design";
    public static final String className = "System.Web.UI.Design.TemplateDefinition";
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

    public TemplateDefinition(Object instance) throws Throwable {
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

    public static TemplateDefinition castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TemplateDefinition(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TemplateDefinition(ControlDesigner designer, java.lang.String name, NetObject templatedObject, java.lang.String templatePropertyName) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)designer.getJCOInstance(), (Object)name, (Object)templatedObject.getJCOInstance(), (Object)templatePropertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TemplateDefinition(ControlDesigner designer, java.lang.String name, NetObject templatedObject, java.lang.String templatePropertyName, Style style) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)designer.getJCOInstance(), (Object)name, (Object)templatedObject.getJCOInstance(), (Object)templatePropertyName, (Object)style.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TemplateDefinition(ControlDesigner designer, java.lang.String name, NetObject templatedObject, java.lang.String templatePropertyName, boolean serverControlsOnly) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)designer.getJCOInstance(), (Object)name, (Object)templatedObject.getJCOInstance(), (Object)templatePropertyName, serverControlsOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TemplateDefinition(ControlDesigner designer, java.lang.String name, NetObject templatedObject, java.lang.String templatePropertyName, Style style, boolean serverControlsOnly) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)designer.getJCOInstance(), (Object)name, (Object)templatedObject.getJCOInstance(), (Object)templatePropertyName, (Object)style.getJCOInstance(), serverControlsOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public boolean getAllowEditing() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowEditing");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getContent() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Content");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContent(java.lang.String Content) throws Throwable {
        try {
            classInstance.Set("Content", (Object)Content);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getServerControlsOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ServerControlsOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsDataBinding() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsDataBinding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSupportsDataBinding(boolean SupportsDataBinding) throws Throwable {
        try {
            classInstance.Set("SupportsDataBinding", SupportsDataBinding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Style getStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Style");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTemplatedObject() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TemplatedObject");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTemplatePropertyName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TemplatePropertyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ControlDesigner getDesigner() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Designer");
            return new ControlDesigner(val);
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



	// Instance Events section
    
    
}