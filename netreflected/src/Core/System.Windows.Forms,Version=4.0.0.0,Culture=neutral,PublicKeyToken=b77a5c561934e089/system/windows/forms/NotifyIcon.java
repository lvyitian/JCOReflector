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
import system.windows.forms.ToolTipIcon;
import system.windows.forms.ContextMenuStrip;
import system.drawing.Icon;
import system.EventHandler;
import system.windows.forms.MouseEventHandler;


/**
 * The base .NET class managing System.Windows.Forms.NotifyIcon, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class NotifyIcon extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.NotifyIcon";
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

    public NotifyIcon(Object instance) throws Throwable {
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

    public static NotifyIcon castFrom(IJCOBridgeReflected from) throws Throwable {
        return new NotifyIcon(from.getJCOInstance());
    }

    // Constructors section
    
    
    public NotifyIcon() throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void ShowBalloonTip(int timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("ShowBalloonTip", timeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowBalloonTip(int timeout, java.lang.String tipTitle, java.lang.String tipText, ToolTipIcon tipIcon) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("ShowBalloonTip", timeout, (Object)tipTitle, (Object)tipText, (Object)tipIcon.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getBalloonTipText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("BalloonTipText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBalloonTipText(java.lang.String BalloonTipText) throws Throwable {
        try {
            classInstance.Set("BalloonTipText", (Object)BalloonTipText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolTipIcon getBalloonTipIcon() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BalloonTipIcon");
            return new ToolTipIcon(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBalloonTipIcon(ToolTipIcon BalloonTipIcon) throws Throwable {
        try {
            classInstance.Set("BalloonTipIcon", (Object)BalloonTipIcon.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBalloonTipTitle() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("BalloonTipTitle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBalloonTipTitle(java.lang.String BalloonTipTitle) throws Throwable {
        try {
            classInstance.Set("BalloonTipTitle", (Object)BalloonTipTitle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenuStrip getContextMenuStrip() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContextMenuStrip");
            return new ContextMenuStrip(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContextMenuStrip(ContextMenuStrip ContextMenuStrip) throws Throwable {
        try {
            classInstance.Set("ContextMenuStrip", (Object)ContextMenuStrip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Icon getIcon() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Icon");
            return new Icon(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIcon(Icon Icon) throws Throwable {
        try {
            classInstance.Set("Icon", (Object)Icon.getJCOInstance());
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

    public boolean getVisible() throws Throwable {
        try {
            return (boolean)classInstance.Get("Visible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVisible(boolean Visible) throws Throwable {
        try {
            classInstance.Set("Visible", Visible);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTag() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Tag");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTag(NetObject Tag) throws Throwable {
        try {
            classInstance.Set("Tag", (Object)Tag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addBalloonTipClicked(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("BalloonTipClicked", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBalloonTipClicked(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("BalloonTipClicked", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addBalloonTipClosed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("BalloonTipClosed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBalloonTipClosed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("BalloonTipClosed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addBalloonTipShown(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("BalloonTipShown", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBalloonTipShown(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("BalloonTipShown", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addClick(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Click", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeClick(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Click", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDoubleClick(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("DoubleClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDoubleClick(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("DoubleClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMouseClick(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("MouseClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMouseClick(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("MouseClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMouseDoubleClick(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("MouseDoubleClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMouseDoubleClick(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("MouseDoubleClick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMouseDown(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("MouseDown", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMouseDown(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("MouseDown", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMouseMove(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("MouseMove", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMouseMove(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("MouseMove", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addMouseUp(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("MouseUp", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMouseUp(MouseEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("MouseUp", handler);
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