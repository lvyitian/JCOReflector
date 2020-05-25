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

package system.windows.documents;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.DependencyProperty;
import system.windows.documents.TextPointer;
import system.io.Stream;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Documents.TextSelection, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class TextSelection extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Documents.TextSelection";
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

    public TextSelection(Object instance) throws Throwable {
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

    public static TextSelection castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TextSelection(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public NetObject GetPropertyValue(DependencyProperty formattingProperty) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            JCObject objGetPropertyValue = (JCObject)classInstance.Invoke("GetPropertyValue", (Object)formattingProperty.getJCOInstance());
            return new NetObject(objGetPropertyValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(TextPointer textPointer) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)textPointer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Select(TextPointer position1, TextPointer position2) throws Throwable {
        try {
            classInstance.Invoke("Select", (Object)position1.getJCOInstance(), (Object)position2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyPropertyValue(DependencyProperty formattingProperty, NetObject value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("ApplyPropertyValue", (Object)formattingProperty.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanSave(java.lang.String dataFormat) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CanSave", (Object)dataFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanLoad(java.lang.String dataFormat) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException {
        try {
            return (boolean)classInstance.Invoke("CanLoad", (Object)dataFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream, java.lang.String dataFormat) throws Throwable {
        try {
            classInstance.Invoke("Save", (Object)stream.getJCOInstance(), (Object)dataFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream, java.lang.String dataFormat, boolean preserveTextElements) throws Throwable {
        try {
            classInstance.Invoke("Save", (Object)stream.getJCOInstance(), (Object)dataFormat, preserveTextElements);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Load(Stream stream, java.lang.String dataFormat) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.NotSupportedException, system.io.FileFormatException, system.xml.XmlException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.windows.markup.XamlParseException, system.UriFormatException, system.NullReferenceException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Load", (Object)stream.getJCOInstance(), (Object)dataFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearAllProperties() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("ClearAllProperties");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public TextPointer getStart() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Start");
            return new TextPointer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextPointer getEnd() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("End");
            return new TextPointer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEmpty() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Text");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setText(java.lang.String Text) throws Throwable {
        try {
            classInstance.Set("Text", (Object)Text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Changed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Changed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}