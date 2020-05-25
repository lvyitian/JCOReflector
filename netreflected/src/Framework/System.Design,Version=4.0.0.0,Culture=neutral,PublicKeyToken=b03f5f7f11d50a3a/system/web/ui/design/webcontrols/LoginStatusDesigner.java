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

package system.web.ui.design.webcontrols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.design.DesignerRegionCollection;
import system.web.ui.design.EditableDesignerRegion;
import system.web.ui.design.DesignerAutoFormat;
import system.componentmodel.design.ComponentChangingEventArgs;
import system.drawing.Rectangle;
import system.web.ui.design.ViewRendering;
import system.componentmodel.design.ComponentChangedEventArgs;
import system.componentmodel.design.DesignerActionListCollection;
import system.web.ui.design.DesignerAutoFormatCollection;
import system.web.ui.design.TemplateGroupCollection;
import system.web.ui.Control;
import system.web.ui.DataBindingCollection;
import system.web.ui.ExpressionBindingCollection;
import system.componentmodel.design.DesignerVerbCollection;


/**
 * The base .NET class managing System.Web.UI.Design.WebControls.LoginStatusDesigner, System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class LoginStatusDesigner extends NetObject  {
    public static final String assemblyFullName = "System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Design";
    public static final String className = "System.Web.UI.Design.WebControls.LoginStatusDesigner";
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

    public LoginStatusDesigner(Object instance) throws Throwable {
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

    public static LoginStatusDesigner castFrom(IJCOBridgeReflected from) throws Throwable {
        return new LoginStatusDesigner(from.getJCOInstance());
    }

    // Constructors section
    
    
    public LoginStatusDesigner() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public java.lang.String GetDesignTimeHtml() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.NullReferenceException, system.TypeLoadException, system.NotImplementedException, system.web.HttpException, system.OverflowException, system.web.HttpRequestValidationException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetDesignTimeHtml");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetDesignTimeHtml(DesignerRegionCollection regions) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.NullReferenceException, system.NotImplementedException, system.web.HttpException, system.OutOfMemoryException, system.OverflowException, system.web.HttpRequestValidationException, system.PlatformNotSupportedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetDesignTimeHtml", (Object)regions.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetEditableDesignerRegionContent(EditableDesignerRegion region) throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetEditableDesignerRegionContent", (Object)region.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPersistInnerHtml() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.NotSupportedException, system.reflection.AmbiguousMatchException, system.web.HttpParseException, system.IndexOutOfRangeException, system.NullReferenceException {
        try {
            return (java.lang.String)classInstance.Invoke("GetPersistInnerHtml");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPersistenceContent() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.web.HttpException, system.ArgumentException, system.web.HttpParseException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetPersistenceContent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnAutoFormatApplied(DesignerAutoFormat appliedAutoFormat) throws Throwable {
        try {
            classInstance.Invoke("OnAutoFormatApplied", (Object)appliedAutoFormat.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnComponentChanging(NetObject sender, ComponentChangingEventArgs ce) throws Throwable {
        try {
            classInstance.Invoke("OnComponentChanging", (Object)sender.getJCOInstance(), (Object)ce.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RaiseResizeEvent() throws Throwable {
        try {
            classInstance.Invoke("RaiseResizeEvent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetEditableDesignerRegionContent(EditableDesignerRegion region, java.lang.String content) throws Throwable {
        try {
            classInstance.Invoke("SetEditableDesignerRegionContent", (Object)region.getJCOInstance(), (Object)content);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateDesignTimeHtml() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.NotSupportedException, system.configuration.ConfigurationException, system.NullReferenceException, system.NotImplementedException, system.web.HttpException, system.OutOfMemoryException, system.OverflowException, system.web.HttpRequestValidationException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("UpdateDesignTimeHtml");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle GetBounds() throws Throwable {
        try {
            JCObject objGetBounds = (JCObject)classInstance.Invoke("GetBounds");
            return new Rectangle(objGetBounds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ViewRendering GetViewRendering() throws Throwable, system.ArgumentNullException, system.web.HttpException, system.OverflowException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            JCObject objGetViewRendering = (JCObject)classInstance.Invoke("GetViewRendering");
            return new ViewRendering(objGetViewRendering);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invalidate() throws Throwable {
        try {
            classInstance.Invoke("Invalidate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invalidate(Rectangle rectangle) throws Throwable {
        try {
            classInstance.Invoke("Invalidate", (Object)rectangle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsPropertyBound(java.lang.String propName) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classInstance.Invoke("IsPropertyBound", (Object)propName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnComponentChanged(NetObject sender, ComponentChangedEventArgs ce) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.security.SecurityException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.IndexOutOfRangeException, system.web.HttpException, system.NotSupportedException, system.MissingMethodException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.reflection.AmbiguousMatchException, system.web.HttpParseException, system.FormatException, system.RankException, system.NullReferenceException, system.threading.ThreadAbortException, system.OverflowException, system.web.HttpRequestValidationException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("OnComponentChanged", (Object)sender.getJCOInstance(), (Object)ce.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClone(NetObject original, NetObject clone) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.reflection.AmbiguousMatchException, system.web.HttpParseException {
        try {
            classInstance.Invoke("RegisterClone", (Object)original.getJCOInstance(), (Object)clone.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnSetParent() throws Throwable {
        try {
            classInstance.Invoke("OnSetParent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public DesignerActionListCollection getActionLists() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ActionLists");
            return new DesignerActionListCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowResize() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowResize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerAutoFormatCollection getAutoFormats() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AutoFormats");
            return new DesignerAutoFormatCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDesignTimeHtmlRequiresLoadComplete() throws Throwable {
        try {
            return (boolean)classInstance.Get("DesignTimeHtmlRequiresLoadComplete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getID() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setID(java.lang.String ID) throws Throwable {
        try {
            classInstance.Set("ID", (Object)ID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDirty() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDirty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsDirty(boolean IsDirty) throws Throwable {
        try {
            classInstance.Set("IsDirty", IsDirty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getViewControlCreated() throws Throwable {
        try {
            return (boolean)classInstance.Get("ViewControlCreated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setViewControlCreated(boolean ViewControlCreated) throws Throwable {
        try {
            classInstance.Set("ViewControlCreated", ViewControlCreated);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadOnly(boolean ReadOnly) throws Throwable {
        try {
            classInstance.Set("ReadOnly", ReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TemplateGroupCollection getTemplateGroups() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TemplateGroups");
            return new TemplateGroupCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control getViewControl() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ViewControl");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setViewControl(Control ViewControl) throws Throwable {
        try {
            classInstance.Set("ViewControl", (Object)ViewControl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataBindingCollection getDataBindings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataBindings");
            return new DataBindingCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ExpressionBindingCollection getExpressions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Expressions");
            return new ExpressionBindingCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShouldCodeSerialize() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShouldCodeSerialize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShouldCodeSerialize(boolean ShouldCodeSerialize) throws Throwable {
        try {
            classInstance.Set("ShouldCodeSerialize", ShouldCodeSerialize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerVerbCollection getVerbs() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Verbs");
            return new DesignerVerbCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}