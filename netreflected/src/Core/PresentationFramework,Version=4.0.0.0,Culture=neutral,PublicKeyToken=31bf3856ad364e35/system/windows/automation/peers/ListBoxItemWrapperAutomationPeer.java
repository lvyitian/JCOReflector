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

package system.windows.automation.peers;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.controls.ListBoxItem;
import system.windows.automation.peers.PatternInterface;
import system.windows.automation.peers.AutomationEvents;
import system.windows.automation.AutomationProperty;
import system.windows.automation.AsyncContentLoadedEventArgs;
import system.windows.Rect;
import system.windows.automation.peers.AutomationOrientation;
import system.windows.automation.peers.AutomationControlType;
import system.windows.automation.peers.AutomationPeer;
import system.windows.Point;
import system.windows.automation.AutomationLiveSetting;
import system.windows.UIElement;
import system.windows.threading.Dispatcher;


/**
 * The base .NET class managing System.Windows.Automation.Peers.ListBoxItemWrapperAutomationPeer, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ListBoxItemWrapperAutomationPeer extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Automation.Peers.ListBoxItemWrapperAutomationPeer";
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

    public ListBoxItemWrapperAutomationPeer(Object instance) throws Throwable {
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

    public static ListBoxItemWrapperAutomationPeer castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ListBoxItemWrapperAutomationPeer(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ListBoxItemWrapperAutomationPeer(ListBoxItem owner) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)owner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public NetObject GetPattern(PatternInterface patternInterface) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException {
        try {
            JCObject objGetPattern = (JCObject)classInstance.Invoke("GetPattern", (Object)patternInterface.getJCOInstance());
            return new NetObject(objGetPattern);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InvalidatePeer() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.InvalidCastException, system.threading.LockRecursionException, system.threading.SynchronizationLockException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("InvalidatePeer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RaiseAutomationEvent(AutomationEvents eventId) throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.ObjectDisposedException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("RaiseAutomationEvent", (Object)eventId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RaisePropertyChangedEvent(AutomationProperty property, NetObject oldValue, NetObject newValue) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("RaisePropertyChangedEvent", (Object)property.getJCOInstance(), (Object)oldValue.getJCOInstance(), (Object)newValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RaiseAsyncContentLoadedEvent(AsyncContentLoadedEventArgs args) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("RaiseAsyncContentLoadedEvent", (Object)args.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rect GetBoundingRectangle() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objGetBoundingRectangle = (JCObject)classInstance.Invoke("GetBoundingRectangle");
            return new Rect(objGetBoundingRectangle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsOffscreen() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsOffscreen");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AutomationOrientation GetOrientation() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objGetOrientation = (JCObject)classInstance.Invoke("GetOrientation");
            return new AutomationOrientation(objGetOrientation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetItemType() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetItemType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetClassName() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetClassName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetItemStatus() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetItemStatus");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsRequiredForForm() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsRequiredForForm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsKeyboardFocusable() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsKeyboardFocusable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HasKeyboardFocus() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("HasKeyboardFocus");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEnabled() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsPassword() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsPassword");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAutomationId() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetAutomationId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetName() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AutomationControlType GetAutomationControlType() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objGetAutomationControlType = (JCObject)classInstance.Invoke("GetAutomationControlType");
            return new AutomationControlType(objGetAutomationControlType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetLocalizedControlType() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetLocalizedControlType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsContentElement() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsContentElement");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsControlElement() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsControlElement");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AutomationPeer GetLabeledBy() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objGetLabeledBy = (JCObject)classInstance.Invoke("GetLabeledBy");
            return new AutomationPeer(objGetLabeledBy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetHelpText() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetHelpText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAcceleratorKey() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetAcceleratorKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAccessKey() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetAccessKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point GetClickablePoint() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objGetClickablePoint = (JCObject)classInstance.Invoke("GetClickablePoint");
            return new Point(objGetClickablePoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetFocus() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("SetFocus");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AutomationLiveSetting GetLiveSetting() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            JCObject objGetLiveSetting = (JCObject)classInstance.Invoke("GetLiveSetting");
            return new AutomationLiveSetting(objGetLiveSetting);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetSizeOfSet() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (int)classInstance.Invoke("GetSizeOfSet");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetPositionInSet() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            return (int)classInstance.Invoke("GetPositionInSet");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AutomationPeer GetParent() throws Throwable {
        try {
            JCObject objGetParent = (JCObject)classInstance.Invoke("GetParent");
            return new AutomationPeer(objGetParent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AutomationPeer GetPeerFromPoint(Point point) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetPeerFromPoint = (JCObject)classInstance.Invoke("GetPeerFromPoint", (Object)point.getJCOInstance());
            return new AutomationPeer(objGetPeerFromPoint);
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
    
    
    public UIElement getOwner() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Owner");
            return new UIElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AutomationPeer getEventsSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EventsSource");
            return new AutomationPeer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEventsSource(AutomationPeer EventsSource) throws Throwable {
        try {
            classInstance.Set("EventsSource", (Object)EventsSource.getJCOInstance());
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



	// Instance Events section
    
    
}