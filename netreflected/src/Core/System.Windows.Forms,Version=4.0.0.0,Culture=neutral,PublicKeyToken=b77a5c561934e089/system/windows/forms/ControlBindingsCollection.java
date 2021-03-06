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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.BindingsCollection;
import system.windows.forms.IBindableComponent;
import system.windows.forms.IBindableComponentImplementation;
import system.windows.forms.DataSourceUpdateMode;
import system.IFormatProvider;
import system.IFormatProviderImplementation;
import system.windows.forms.Control;


/**
 * The base .NET class managing System.Windows.Forms.ControlBindingsCollection, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ControlBindingsCollection" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ControlBindingsCollection</a>
 */
public class ControlBindingsCollection extends BindingsCollection  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.ControlBindingsCollection
     */
    public static final String className = "System.Windows.Forms.ControlBindingsCollection";
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

    public ControlBindingsCollection(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ControlBindingsCollection}, a cast assert is made to check if types are compatible.
     */
    public static ControlBindingsCollection cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ControlBindingsCollection(from.getJCOInstance());
    }

    // Constructors section
    
    public ControlBindingsCollection() throws Throwable {
    }

    public ControlBindingsCollection(IBindableComponent control) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(control == null ? null : control.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public system.windows.forms.Binding Add(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MulticastNotSupportedException, system.TypeLoadException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember);
            return new system.windows.forms.Binding(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.windows.forms.Binding Add(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MulticastNotSupportedException, system.TypeLoadException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled);
            return new system.windows.forms.Binding(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.windows.forms.Binding Add(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled, DataSourceUpdateMode updateMode) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MulticastNotSupportedException, system.TypeLoadException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled, updateMode == null ? null : updateMode.getJCOInstance());
            return new system.windows.forms.Binding(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.windows.forms.Binding Add(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled, DataSourceUpdateMode updateMode, NetObject nullValue) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MulticastNotSupportedException, system.TypeLoadException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled, updateMode == null ? null : updateMode.getJCOInstance(), nullValue == null ? null : nullValue.getJCOInstance());
            return new system.windows.forms.Binding(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.windows.forms.Binding Add(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled, DataSourceUpdateMode updateMode, NetObject nullValue, java.lang.String formatString) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MulticastNotSupportedException, system.TypeLoadException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled, updateMode == null ? null : updateMode.getJCOInstance(), nullValue == null ? null : nullValue.getJCOInstance(), formatString);
            return new system.windows.forms.Binding(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.windows.forms.Binding Add(java.lang.String propertyName, NetObject dataSource, java.lang.String dataMember, boolean formattingEnabled, DataSourceUpdateMode updateMode, NetObject nullValue, java.lang.String formatString, IFormatProvider formatInfo) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.ArrayTypeMismatchException, system.MulticastNotSupportedException, system.RankException, system.TypeLoadException, system.MissingMethodException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", propertyName, dataSource == null ? null : dataSource.getJCOInstance(), dataMember, formattingEnabled, updateMode == null ? null : updateMode.getJCOInstance(), nullValue == null ? null : nullValue.getJCOInstance(), formatString, formatInfo == null ? null : formatInfo.getJCOInstance());
            return new system.windows.forms.Binding(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddNewControlBindingsCollection(system.windows.forms.Binding binding) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Add", binding == null ? null : binding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearNewControlBindingsCollection() throws Throwable, system.ArgumentNullException, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveNewControlBindingsCollection(system.windows.forms.Binding binding) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Remove", binding == null ? null : binding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAtNewControlBindingsCollection(int index) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public Control getControl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Control");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataSourceUpdateMode getDefaultDataSourceUpdateMode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultDataSourceUpdateMode");
            return new DataSourceUpdateMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultDataSourceUpdateMode(DataSourceUpdateMode DefaultDataSourceUpdateMode) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DefaultDataSourceUpdateMode", DefaultDataSourceUpdateMode == null ? null : DefaultDataSourceUpdateMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IBindableComponent getBindableComponent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BindableComponent");
            return new IBindableComponentImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}