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

package system.windows.interop;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.interop.HwndSourceParameters;
import system.windows.interop.HwndSource;
import system.runtime.interopservices.HandleRef;
import system.windows.media.Visual;
import system.windows.interop.HwndTarget;
import system.windows.SizeToContent;
import system.windows.input.RestoreFocusMode;
import system.windows.threading.Dispatcher;
import system.EventHandler;
import system.windows.HwndDpiChangedEventHandler;
import system.windows.AutoResizedEventHandler;


/**
 * The base .NET class managing System.Windows.Interop.HwndSource, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class HwndSource extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Interop.HwndSource";
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

    public HwndSource(Object instance) throws Throwable {
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

    public static HwndSource castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HwndSource(from.getJCOInstance());
    }

    // Constructors section
    
    
    public HwndSource(HwndSourceParameters parameters) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.FormatException, system.NotImplementedException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OverflowException, system.AccessViolationException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException, system.threading.ThreadStateException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)parameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public HandleRef CreateHandleRef() throws Throwable {
        try {
            JCObject objCreateHandleRef = (JCObject)classInstance.Invoke("CreateHandleRef");
            return new HandleRef(objCreateHandleRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckAccess() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CheckAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VerifyAccess() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("VerifyAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsDisposed() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDisposed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Visual getRootVisual() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RootVisual");
            return new Visual(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRootVisual(Visual RootVisual) throws Throwable {
        try {
            classInstance.Set("RootVisual", (Object)RootVisual.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HwndTarget getCompositionTarget() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CompositionTarget");
            return new HwndTarget(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SizeToContent getSizeToContent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SizeToContent");
            return new SizeToContent(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSizeToContent(SizeToContent SizeToContent) throws Throwable {
        try {
            classInstance.Set("SizeToContent", (Object)SizeToContent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUsesPerPixelOpacity() throws Throwable {
        try {
            return (boolean)classInstance.Get("UsesPerPixelOpacity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RestoreFocusMode getRestoreFocusMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RestoreFocusMode");
            return new RestoreFocusMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAcquireHwndFocusInMenuMode() throws Throwable {
        try {
            return (boolean)classInstance.Get("AcquireHwndFocusInMenuMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Dispatcher getDispatcher() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Dispatcher");
            return new Dispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getDefaultAcquireHwndFocusInMenuMode() throws Throwable {
        try {
            return (boolean)classType.Get("DefaultAcquireHwndFocusInMenuMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setDefaultAcquireHwndFocusInMenuMode(boolean DefaultAcquireHwndFocusInMenuMode) throws Throwable {
        try {
            classType.Set("DefaultAcquireHwndFocusInMenuMode", DefaultAcquireHwndFocusInMenuMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
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

    public void addSizeToContentChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("SizeToContentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSizeToContentChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("SizeToContentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDpiChanged(HwndDpiChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("DpiChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDpiChanged(HwndDpiChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("DpiChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAutoResized(AutoResizedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AutoResized", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAutoResized(AutoResizedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AutoResized", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addContentRendered(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ContentRendered", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeContentRendered(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ContentRendered", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}