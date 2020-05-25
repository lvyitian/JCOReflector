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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.PropertyDescriptor;
import system.runtime.remoting.ObjRef;
import system.windows.forms.HorizontalAlignment;
import system.windows.forms.AccessibleObject;
import system.windows.forms.DataGridTableStyle;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Forms.DataGridBoolColumn, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DataGridBoolColumn extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.DataGridBoolColumn";
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

    public DataGridBoolColumn(Object instance) throws Throwable {
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

    public static DataGridBoolColumn castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataGridBoolColumn(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataGridBoolColumn() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridBoolColumn(PropertyDescriptor prop) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)prop.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridBoolColumn(PropertyDescriptor prop, boolean isDefault) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)prop.getJCOInstance(), isDefault);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void ResetHeaderText() throws Throwable, system.NullReferenceException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("ResetHeaderText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", (Object)requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public NetObject getTrueValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TrueValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrueValue(NetObject TrueValue) throws Throwable {
        try {
            classInstance.Set("TrueValue", (Object)TrueValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getFalseValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FalseValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFalseValue(NetObject FalseValue) throws Throwable {
        try {
            classInstance.Set("FalseValue", (Object)FalseValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getNullValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NullValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNullValue(NetObject NullValue) throws Throwable {
        try {
            classInstance.Set("NullValue", (Object)NullValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowNull() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowNull");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowNull(boolean AllowNull) throws Throwable {
        try {
            classInstance.Set("AllowNull", AllowNull);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HorizontalAlignment getAlignment() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Alignment");
            return new HorizontalAlignment(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAlignment(HorizontalAlignment Alignment) throws Throwable {
        try {
            classInstance.Set("Alignment", (Object)Alignment.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleObject getHeaderAccessibleObject() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HeaderAccessibleObject");
            return new AccessibleObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptor getPropertyDescriptor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PropertyDescriptor");
            return new PropertyDescriptor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPropertyDescriptor(PropertyDescriptor PropertyDescriptor) throws Throwable {
        try {
            classInstance.Set("PropertyDescriptor", (Object)PropertyDescriptor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridTableStyle getDataGridTableStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataGridTableStyle");
            return new DataGridTableStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHeaderText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HeaderText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaderText(java.lang.String HeaderText) throws Throwable {
        try {
            classInstance.Set("HeaderText", (Object)HeaderText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMappingName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MappingName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMappingName(java.lang.String MappingName) throws Throwable {
        try {
            classInstance.Set("MappingName", (Object)MappingName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNullText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("NullText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNullText(java.lang.String NullText) throws Throwable {
        try {
            classInstance.Set("NullText", (Object)NullText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadOnly(boolean ReadOnly) throws Throwable {
        try {
            classInstance.Set("ReadOnly", ReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getWidth() throws Throwable {
        try {
            return (int)classInstance.Get("Width");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWidth(int Width) throws Throwable {
        try {
            classInstance.Set("Width", Width);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addTrueValueChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("TrueValueChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTrueValueChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("TrueValueChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addFalseValueChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("FalseValueChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFalseValueChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("FalseValueChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAllowNullChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AllowNullChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAllowNullChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AllowNullChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAlignmentChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AlignmentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAlignmentChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AlignmentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPropertyDescriptorChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PropertyDescriptorChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePropertyDescriptorChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PropertyDescriptorChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addFontChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("FontChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFontChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("FontChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addHeaderTextChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("HeaderTextChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeHeaderTextChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("HeaderTextChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMappingNameChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("MappingNameChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMappingNameChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("MappingNameChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNullTextChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("NullTextChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNullTextChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("NullTextChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addReadOnlyChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ReadOnlyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeReadOnlyChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ReadOnlyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addWidthChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("WidthChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeWidthChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("WidthChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}