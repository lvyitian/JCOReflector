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
import system.windows.UIElement;
import system.windows.documents.Inline;


/**
 * The base .NET class managing System.Windows.Documents.InlineCollection, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class InlineCollection extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Documents.InlineCollection";
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

    public InlineCollection(Object instance) throws Throwable {
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

    public static InlineCollection castFrom(IJCOBridgeReflected from) throws Throwable {
        return new InlineCollection(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void Add(java.lang.String text) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("Add", (Object)text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(UIElement uiElement) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("Add", (Object)uiElement.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(Inline item) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("Add", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(Inline item) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.MulticastNotSupportedException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Inline[] array, int arrayIndex) throws Throwable {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array), arrayIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Remove(Inline item) throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            return (boolean)classInstance.Invoke("Remove", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InsertAfter(Inline previousSibling, Inline newItem) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("InsertAfter", (Object)previousSibling.getJCOInstance(), (Object)newItem.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InsertBefore(Inline nextSibling, Inline newItem) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("InsertBefore", (Object)nextSibling.getJCOInstance(), (Object)newItem.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Inline getFirstInline() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FirstInline");
            return new Inline(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Inline getLastInline() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LastInline");
            return new Inline(val);
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

    public boolean getIsReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}