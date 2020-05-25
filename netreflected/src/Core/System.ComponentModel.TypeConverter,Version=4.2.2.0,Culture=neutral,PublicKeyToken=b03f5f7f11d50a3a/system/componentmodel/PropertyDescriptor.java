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

package system.componentmodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.EventHandler;
import system.componentmodel.PropertyDescriptorCollection;
import system.Attribute;
import system.componentmodel.TypeConverter;
import system.componentmodel.DesignerSerializationVisibility;
import system.componentmodel.AttributeCollection;


/**
 * The base .NET class managing System.ComponentModel.PropertyDescriptor, System.ComponentModel.TypeConverter, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class PropertyDescriptor extends NetObject  {
    public static final String assemblyFullName = "System.ComponentModel.TypeConverter, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.ComponentModel.TypeConverter";
    public static final String className = "System.ComponentModel.PropertyDescriptor";
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

    public PropertyDescriptor(Object instance) throws Throwable {
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

    public static PropertyDescriptor castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PropertyDescriptor(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void AddValueChanged(NetObject component, EventHandler handler) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("AddValueChanged", (Object)component.getJCOInstance(), handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptorCollection GetChildProperties() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            JCObject objGetChildProperties = (JCObject)classInstance.Invoke("GetChildProperties");
            return new PropertyDescriptorCollection(objGetChildProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptorCollection GetChildProperties(Attribute[] filter) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            JCObject objGetChildProperties = (JCObject)classInstance.Invoke("GetChildProperties", (Object)toObjectFromArray(filter));
            return new PropertyDescriptorCollection(objGetChildProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptorCollection GetChildProperties(NetObject instance) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            JCObject objGetChildProperties = (JCObject)classInstance.Invoke("GetChildProperties", (Object)instance.getJCOInstance());
            return new PropertyDescriptorCollection(objGetChildProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptorCollection GetChildProperties(NetObject instance, Attribute[] filter) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        try {
            JCObject objGetChildProperties = (JCObject)classInstance.Invoke("GetChildProperties", (Object)instance.getJCOInstance(), (Object)toObjectFromArray(filter));
            return new PropertyDescriptorCollection(objGetChildProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetEditor(NetType editorBaseType) throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            JCObject objGetEditor = (JCObject)classInstance.Invoke("GetEditor", (Object)editorBaseType.getJCOInstance());
            return new NetObject(objGetEditor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveValueChanged(NetObject component, EventHandler handler) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("RemoveValueChanged", (Object)component.getJCOInstance(), handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public NetType getComponentType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ComponentType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeConverter getConverter() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Converter");
            return new TypeConverter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsLocalizable() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsLocalizable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerSerializationVisibility getSerializationVisibility() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SerializationVisibility");
            return new DesignerSerializationVisibility(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getPropertyType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PropertyType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsChangeEvents() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsChangeEvents");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AttributeCollection getAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new AttributeCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCategory() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Category");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBrowsable() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsBrowsable");
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

    public boolean getDesignTimeOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("DesignTimeOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDisplayName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DisplayName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}