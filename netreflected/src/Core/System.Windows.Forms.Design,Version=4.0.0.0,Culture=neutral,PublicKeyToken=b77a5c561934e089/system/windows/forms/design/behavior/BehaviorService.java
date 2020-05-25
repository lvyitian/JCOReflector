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

package system.windows.forms.design.behavior;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.Region;
import system.drawing.Point;
import system.windows.forms.Control;
import system.drawing.Rectangle;
import system.windows.forms.design.behavior.Behavior;
import system.windows.forms.design.behavior.BehaviorServiceAdornerCollection;
import system.drawing.Graphics;
import system.windows.forms.design.behavior.BehaviorDragDropEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Forms.Design.Behavior.BehaviorService, System.Windows.Forms.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class BehaviorService extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms.Design";
    public static final String className = "System.Windows.Forms.Design.Behavior.BehaviorService";
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

    public BehaviorService(Object instance) throws Throwable {
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

    public static BehaviorService castFrom(IJCOBridgeReflected from) throws Throwable {
        return new BehaviorService(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void Invalidate(Region r) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.FormatException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classInstance.Invoke("Invalidate", (Object)r.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point AdornerWindowPointToScreen(Point p) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.PlatformNotSupportedException {
        try {
            JCObject objAdornerWindowPointToScreen = (JCObject)classInstance.Invoke("AdornerWindowPointToScreen", (Object)p.getJCOInstance());
            return new Point(objAdornerWindowPointToScreen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point AdornerWindowToScreen() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        try {
            JCObject objAdornerWindowToScreen = (JCObject)classInstance.Invoke("AdornerWindowToScreen");
            return new Point(objAdornerWindowToScreen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point ControlToAdornerWindow(Control c) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.PlatformNotSupportedException {
        try {
            JCObject objControlToAdornerWindow = (JCObject)classInstance.Invoke("ControlToAdornerWindow", (Object)c.getJCOInstance());
            return new Point(objControlToAdornerWindow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle ControlRectInAdornerWindow(Control c) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        try {
            JCObject objControlRectInAdornerWindow = (JCObject)classInstance.Invoke("ControlRectInAdornerWindow", (Object)c.getJCOInstance());
            return new Rectangle(objControlRectInAdornerWindow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Behavior GetNextBehavior(Behavior behavior) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetNextBehavior = (JCObject)classInstance.Invoke("GetNextBehavior", (Object)behavior.getJCOInstance());
            return new Behavior(objGetNextBehavior);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invalidate() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classInstance.Invoke("Invalidate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invalidate(Rectangle rect) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.NullReferenceException, system.FormatException {
        try {
            classInstance.Invoke("Invalidate", (Object)rect.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SyncSelection() throws Throwable {
        try {
            classInstance.Invoke("SyncSelection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Behavior PopBehavior(Behavior behavior) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.RankException, system.FormatException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.NotImplementedException {
        try {
            JCObject objPopBehavior = (JCObject)classInstance.Invoke("PopBehavior", (Object)behavior.getJCOInstance());
            return new Behavior(objPopBehavior);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PushBehavior(Behavior behavior) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotImplementedException {
        try {
            classInstance.Invoke("PushBehavior", (Object)behavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PushCaptureBehavior(Behavior behavior) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotImplementedException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        try {
            classInstance.Invoke("PushCaptureBehavior", (Object)behavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point ScreenToAdornerWindow(Point p) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.PlatformNotSupportedException {
        try {
            JCObject objScreenToAdornerWindow = (JCObject)classInstance.Invoke("ScreenToAdornerWindow", (Object)p.getJCOInstance());
            return new Point(objScreenToAdornerWindow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public BehaviorServiceAdornerCollection getAdorners() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Adorners");
            return new BehaviorServiceAdornerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Graphics getAdornerWindowGraphics() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AdornerWindowGraphics");
            return new Graphics(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Behavior getCurrentBehavior() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentBehavior");
            return new Behavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addBeginDrag(BehaviorDragDropEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("BeginDrag", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBeginDrag(BehaviorDragDropEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("BeginDrag", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addEndDrag(BehaviorDragDropEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("EndDrag", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeEndDrag(BehaviorDragDropEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("EndDrag", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addSynchronize(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Synchronize", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSynchronize(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Synchronize", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}