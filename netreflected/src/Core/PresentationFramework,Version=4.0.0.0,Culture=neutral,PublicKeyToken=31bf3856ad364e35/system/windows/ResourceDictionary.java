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

package system.windows;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.collections.DictionaryEntry;
import system.windows.DeferrableContent;
import system.Uri;


/**
 * The base .NET class managing System.Windows.ResourceDictionary, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ResourceDictionary extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.ResourceDictionary";
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

    public ResourceDictionary(Object instance) throws Throwable {
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

    public static ResourceDictionary castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ResourceDictionary(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ResourceDictionary() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Contains(NetObject key) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.componentmodel.InvalidEnumArgumentException {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(DictionaryEntry[] array, int arrayIndex) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.OutOfMemoryException, system.xaml.XamlParseException, system.xaml.XamlException, system.NotImplementedException, system.collections.generic.KeyNotFoundException, system.io.IOException, system.windows.markup.XamlParseException {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array), arrayIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterName(java.lang.String name, NetObject scopedElement) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            classInstance.Invoke("RegisterName", (Object)name, (Object)scopedElement.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UnregisterName(java.lang.String name) throws Throwable {
        try {
            classInstance.Invoke("UnregisterName", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject FindName(java.lang.String name) throws Throwable {
        try {
            JCObject objFindName = (JCObject)classInstance.Invoke("FindName", (Object)name);
            return new NetObject(objFindName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(NetObject key, NetObject value) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("Add", (Object)key.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(NetObject key) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.InvalidCastException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("Remove", (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginInit() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("BeginInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndInit() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("EndInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public DeferrableContent getDeferrableContent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DeferrableContent");
            return new DeferrableContent(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeferrableContent(DeferrableContent DeferrableContent) throws Throwable {
        try {
            classInstance.Set("DeferrableContent", (Object)DeferrableContent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Source");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSource(Uri Source) throws Throwable {
        try {
            classInstance.Set("Source", (Object)Source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFixedSize() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFixedSize");
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

    public void setIsReadOnly(boolean IsReadOnly) throws Throwable {
        try {
            classInstance.Set("IsReadOnly", IsReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getInvalidatesImplicitDataTemplateResources() throws Throwable {
        try {
            return (boolean)classInstance.Get("InvalidatesImplicitDataTemplateResources");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInvalidatesImplicitDataTemplateResources(boolean InvalidatesImplicitDataTemplateResources) throws Throwable {
        try {
            classInstance.Set("InvalidatesImplicitDataTemplateResources", InvalidatesImplicitDataTemplateResources);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}