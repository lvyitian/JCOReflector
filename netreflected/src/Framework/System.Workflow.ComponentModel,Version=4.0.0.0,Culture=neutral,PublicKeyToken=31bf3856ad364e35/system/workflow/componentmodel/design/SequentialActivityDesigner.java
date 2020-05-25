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
import system.workflow.componentmodel.design.HitTestInfo;
import system.drawing.Point;
import system.workflow.componentmodel.design.DesignerNavigationDirection;
import system.workflow.componentmodel.design.ActivityDesigner;
import system.workflow.componentmodel.design.CompositeActivityDesigner;
import system.drawing.Rectangle;
import system.drawing.Image;
import system.drawing.Graphics;
import system.windows.forms.AccessibleObject;
import system.workflow.componentmodel.design.DesignerView;
import system.drawing.Size;
import system.workflow.componentmodel.Activity;
import system.workflow.componentmodel.design.ActivityDesignerTheme;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.SequentialActivityDesigner, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class SequentialActivityDesigner extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.ComponentModel";
    public static final String className = "System.Workflow.ComponentModel.Design.SequentialActivityDesigner";
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

    public SequentialActivityDesigner(Object instance) throws Throwable {
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

    public static SequentialActivityDesigner castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SequentialActivityDesigner(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SequentialActivityDesigner() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public HitTestInfo HitTest(Point point) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.MissingMethodException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.workflow.componentmodel.serialization.WorkflowMarkupSerializationException, system.runtime.interopservices.ExternalException {
        try {
            JCObject objHitTest = (JCObject)classInstance.Invoke("HitTest", (Object)point.getJCOInstance());
            return new HitTestInfo(objHitTest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetNextSelectableObject(NetObject obj, DesignerNavigationDirection direction) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.MissingMethodException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.workflow.componentmodel.serialization.WorkflowMarkupSerializationException, system.runtime.interopservices.ExternalException {
        try {
            JCObject objGetNextSelectableObject = (JCObject)classInstance.Invoke("GetNextSelectableObject", (Object)obj.getJCOInstance(), (Object)direction.getJCOInstance());
            return new NetObject(objGetNextSelectableObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnsureVisibleContainedDesigner(ActivityDesigner containedDesigner) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.NotSupportedException, system.MissingMethodException, system.NotImplementedException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("EnsureVisibleContainedDesigner", (Object)containedDesigner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsContainedDesignerVisible(ActivityDesigner containedDesigner) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("IsContainedDesignerVisible", (Object)containedDesigner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanBeParentedTo(CompositeActivityDesigner parentActivityDesigner) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("CanBeParentedTo", (Object)parentActivityDesigner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EnsureVisible() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotImplementedException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.workflow.componentmodel.serialization.WorkflowMarkupSerializationException, system.NotSupportedException, system.MissingMethodException, system.runtime.interopservices.ExternalException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("EnsureVisible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invalidate(Rectangle rectangle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("Invalidate", (Object)rectangle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Image GetPreviewImage(Graphics compatibleGraphics) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.configuration.ConfigurationErrorsException, system.NullReferenceException, system.InvalidCastException, system.workflow.componentmodel.serialization.WorkflowMarkupSerializationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.runtime.interopservices.ExternalException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.OutOfMemoryException, system.RankException {
        try {
            JCObject objGetPreviewImage = (JCObject)classInstance.Invoke("GetPreviewImage", (Object)compatibleGraphics.getJCOInstance());
            return new Image(objGetPreviewImage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.NullReferenceException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getExpanded() throws Throwable {
        try {
            return (boolean)classInstance.Get("Expanded");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExpanded(boolean Expanded) throws Throwable {
        try {
            classInstance.Set("Expanded", Expanded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanExpandCollapse() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanExpandCollapse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getFirstSelectableObject() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FirstSelectableObject");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getLastSelectableObject() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LastSelectableObject");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessibleObject getAccessibilityObject() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AccessibilityObject");
            return new AccessibleObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerView getActiveView() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ActiveView");
            return new DesignerView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setActiveView(DesignerView ActiveView) throws Throwable {
        try {
            classInstance.Set("ActiveView", (Object)ActiveView.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getMinimumSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MinimumSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEditable() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsEditable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point getLocation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Location");
            return new Point(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLocation(Point Location) throws Throwable {
        try {
            classInstance.Set("Location", (Object)Location.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Activity getActivity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Activity");
            return new Activity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompositeActivityDesigner getParentDesigner() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ParentDesigner");
            return new CompositeActivityDesigner(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSelected() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSelected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPrimarySelection() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsPrimarySelection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsVisible() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsVisible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsLocked() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsLocked");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Size");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSize(Size Size) throws Throwable {
        try {
            classInstance.Set("Size", (Object)Size.getJCOInstance());
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

    public Image getImage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Image");
            return new Image(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImage(Image Image) throws Throwable {
        try {
            classInstance.Set("Image", (Object)Image.getJCOInstance());
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

    public ActivityDesignerTheme getDesignerTheme() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DesignerTheme");
            return new ActivityDesignerTheme(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsRootDesigner() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsRootDesigner");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}