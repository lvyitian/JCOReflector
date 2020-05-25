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
import system.windows.MessageBoxResult;
import system.windows.MessageBoxButton;
import system.windows.MessageBoxImage;
import system.windows.MessageBoxOptions;
import system.windows.Window;


/**
 * The base .NET class managing System.Windows.MessageBox, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class MessageBox extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.MessageBox";
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

    public MessageBox(Object instance) throws Throwable {
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

    public static MessageBox castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MessageBox(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon, MessageBoxResult defaultResult, MessageBoxOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)messageBoxText, (Object)caption, (Object)button.getJCOInstance(), (Object)icon.getJCOInstance(), (Object)defaultResult.getJCOInstance(), (Object)options.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon, MessageBoxResult defaultResult) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)messageBoxText, (Object)caption, (Object)button.getJCOInstance(), (Object)icon.getJCOInstance(), (Object)defaultResult.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)messageBoxText, (Object)caption, (Object)button.getJCOInstance(), (Object)icon.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)messageBoxText, (Object)caption, (Object)button.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText, java.lang.String caption) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)messageBoxText, (Object)caption);
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(java.lang.String messageBoxText) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)messageBoxText);
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon, MessageBoxResult defaultResult, MessageBoxOptions options) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)owner.getJCOInstance(), (Object)messageBoxText, (Object)caption, (Object)button.getJCOInstance(), (Object)icon.getJCOInstance(), (Object)defaultResult.getJCOInstance(), (Object)options.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon, MessageBoxResult defaultResult) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)owner.getJCOInstance(), (Object)messageBoxText, (Object)caption, (Object)button.getJCOInstance(), (Object)icon.getJCOInstance(), (Object)defaultResult.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button, MessageBoxImage icon) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)owner.getJCOInstance(), (Object)messageBoxText, (Object)caption, (Object)button.getJCOInstance(), (Object)icon.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption, MessageBoxButton button) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)owner.getJCOInstance(), (Object)messageBoxText, (Object)caption, (Object)button.getJCOInstance());
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText, java.lang.String caption) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)owner.getJCOInstance(), (Object)messageBoxText, (Object)caption);
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static MessageBoxResult Show(Window owner, java.lang.String messageBoxText) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShow = (JCObject)classType.Invoke("Show", (Object)owner.getJCOInstance(), (Object)messageBoxText);
            return new MessageBoxResult(objShow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}