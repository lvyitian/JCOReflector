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

package system.xaml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xaml.XamlSchemaContext;
import system.xaml.XamlObjectWriterSettings;
import system.xaml.XamlType;
import system.xaml.XamlMember;
import system.xaml.NamespaceDeclaration;


/**
 * The base .NET class managing System.Xaml.XamlObjectWriter, System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XamlObjectWriter extends NetObject  {
    public static final String assemblyFullName = "System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xaml";
    public static final String className = "System.Xaml.XamlObjectWriter";
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

    public XamlObjectWriter(Object instance) throws Throwable {
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

    public static XamlObjectWriter castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XamlObjectWriter(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XamlObjectWriter(XamlSchemaContext schemaContext) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.xaml.XamlException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)schemaContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlObjectWriter(XamlSchemaContext schemaContext, XamlObjectWriterSettings settings) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.xaml.XamlException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)schemaContext.getJCOInstance(), (Object)settings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Clear() throws Throwable, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteGetObject() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.threading.AbandonedMutexException, system.xaml.XamlException, system.IndexOutOfRangeException, system.NotSupportedException, system.xaml.XamlSchemaException, system.OutOfMemoryException, system.xaml.XamlObjectWriterException, system.xaml.XamlInternalException, system.xaml.XamlParseException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("WriteGetObject");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartObject(XamlType xamlType) throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.threading.AbandonedMutexException, system.xaml.XamlException, system.collections.generic.KeyNotFoundException, system.xaml.XamlSchemaException, system.IndexOutOfRangeException, system.NotSupportedException, system.xaml.XamlParseException {
        try {
            classInstance.Invoke("WriteStartObject", (Object)xamlType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteEndObject() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.xaml.XamlException, system.IndexOutOfRangeException, system.NotSupportedException, system.xaml.XamlSchemaException, system.OutOfMemoryException, system.xaml.XamlObjectWriterException, system.xaml.XamlInternalException, system.xaml.XamlParseException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("WriteEndObject");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteStartMember(XamlMember property) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.threading.AbandonedMutexException, system.xaml.XamlException, system.NotSupportedException, system.xaml.XamlSchemaException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.xaml.XamlObjectWriterException, system.xaml.XamlInternalException, system.xaml.XamlParseException {
        try {
            classInstance.Invoke("WriteStartMember", (Object)property.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteEndMember() throws Throwable, system.ObjectDisposedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.threading.AbandonedMutexException, system.xaml.XamlException, system.NotSupportedException, system.xaml.XamlSchemaException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.xaml.XamlObjectWriterException, system.xaml.XamlInternalException, system.reflection.AmbiguousMatchException {
        try {
            classInstance.Invoke("WriteEndMember");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteValue(NetObject value) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.xaml.XamlException, system.IndexOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.xaml.XamlSchemaException {
        try {
            classInstance.Invoke("WriteValue", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteNamespace(NamespaceDeclaration namespaceDeclaration) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.threading.AbandonedMutexException, system.xaml.XamlException {
        try {
            classInstance.Invoke("WriteNamespace", (Object)namespaceDeclaration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetLineInfo(int lineNumber, int linePosition) throws Throwable, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.xaml.XamlInternalException, system.xaml.XamlException {
        try {
            classInstance.Invoke("SetLineInfo", lineNumber, linePosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public NetObject getResult() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Result");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlSchemaContext getSchemaContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SchemaContext");
            return new XamlSchemaContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShouldProvideLineInfo() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShouldProvideLineInfo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}