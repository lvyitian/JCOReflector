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

package system.workflow.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.design.CompositeActivityDesigner;
import system.windows.forms.AccessibleObject;
import system.windows.forms.AccessibleNavigation;
import system.windows.forms.AccessibleSelection;
import system.windows.forms.automation.AutomationNotificationKind;
import system.windows.forms.automation.AutomationNotificationProcessing;
import system.runtime.remoting.ObjRef;
import system.windows.forms.AccessibleStates;
import system.drawing.Rectangle;
import system.windows.forms.AccessibleRole;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.CompositeDesignerAccessibleObject, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class CompositeDesignerAccessibleObject extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.ComponentModel";
    public static final String className = "System.Workflow.ComponentModel.Design.CompositeDesignerAccessibleObject";
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

    public CompositeDesignerAccessibleObject(Object instance) throws Throwable {
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

    public static CompositeDesignerAccessibleObject castFrom(IJCOBridgeReflected from) throws Throwable {
        return new CompositeDesignerAccessibleObject(from.getJCOInstance());
    }

    // Constructors section
    
    
    public CompositeDesignerAccessibleObject(CompositeActivityDesigner activityDesigner) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)activityDesigner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public AccessibleObject GetChild(int index) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetChild = (JCObject)classInstance.Invoke("GetChild", index);
            return new AccessibleObject(objGetChild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetChildCount() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetChildCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DoDefaultAction() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("DoDefaultAction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleObject Navigate(AccessibleNavigation navdir) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException {
        try {
            JCObject objNavigate = (JCObject)classInstance.Invoke("Navigate", (Object)navdir.getJCOInstance());
            return new AccessibleObject(objNavigate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Select(AccessibleSelection flags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("Select", (Object)flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleObject GetFocused() throws Throwable {
        try {
            JCObject objGetFocused = (JCObject)classInstance.Invoke("GetFocused");
            return new AccessibleObject(objGetFocused);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleObject GetSelected() throws Throwable {
        try {
            JCObject objGetSelected = (JCObject)classInstance.Invoke("GetSelected");
            return new AccessibleObject(objGetSelected);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleObject HitTest(int x, int y) throws Throwable {
        try {
            JCObject objHitTest = (JCObject)classInstance.Invoke("HitTest", x, y);
            return new AccessibleObject(objHitTest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RaiseAutomationNotification(AutomationNotificationKind notificationKind, AutomationNotificationProcessing notificationProcessing, java.lang.String notificationText) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("RaiseAutomationNotification", (Object)notificationKind.getJCOInstance(), (Object)notificationProcessing.getJCOInstance(), (Object)notificationText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RaiseLiveRegionChanged() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("RaiseLiveRegionChanged");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", (Object)requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public AccessibleStates getState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new AccessibleStates(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getBounds() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Bounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefaultAction() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DefaultAction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHelp() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Help");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleObject getParent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new AccessibleObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleRole getRole() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Role");
            return new AccessibleRole(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getKeyboardShortcut() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("KeyboardShortcut");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getValue() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Value");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValue(java.lang.String Value) throws Throwable {
        try {
            classInstance.Set("Value", (Object)Value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}