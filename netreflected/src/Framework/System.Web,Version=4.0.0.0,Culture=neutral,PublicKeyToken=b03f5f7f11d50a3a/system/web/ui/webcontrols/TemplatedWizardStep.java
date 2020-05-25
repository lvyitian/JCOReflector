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

package system.web.ui.webcontrols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.routing.RouteValueDictionary;
import system.web.ui.Page;
import system.web.ui.HtmlTextWriter;
import system.web.ui.Control;
import system.web.ui.RenderMethod;
import system.web.ui.webcontrols.WizardStepType;
import system.web.ui.webcontrols.Wizard;
import system.web.ui.ClientIDMode;
import system.web.ui.ViewStateMode;
import system.Version;
import system.web.ui.TemplateControl;
import system.web.ui.ControlCollection;
import system.web.ui.ValidateRequestMode;
import system.EventHandler;


/**
 * The base .NET class managing System.Web.UI.WebControls.TemplatedWizardStep, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class TemplatedWizardStep extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.WebControls.TemplatedWizardStep";
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

    public TemplatedWizardStep(Object instance) throws Throwable {
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

    public static TemplatedWizardStep castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TemplatedWizardStep(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TemplatedWizardStep() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public java.lang.String GetRouteUrl(RouteValueDictionary routeParameters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.threading.LockRecursionException {
        try {
            return (java.lang.String)classInstance.Invoke("GetRouteUrl", (Object)routeParameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetRouteUrl(java.lang.String routeName, RouteValueDictionary routeParameters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.web.HttpException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetRouteUrl", (Object)routeName, (Object)routeParameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyStyleSheetSkin(Page page) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("ApplyStyleSheetSkin", (Object)page.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DataBind() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        try {
            classInstance.Invoke("DataBind");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Focus() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.configuration.provider.ProviderException, system.NullReferenceException {
        try {
            classInstance.Invoke("Focus");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RenderControl(HtmlTextWriter writer) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.TypeLoadException, system.configuration.provider.ProviderException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.OverflowException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("RenderControl", (Object)writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ResolveUrl(java.lang.String relativeUrl) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.web.HttpException, system.ArgumentException, system.web.HttpRequestValidationException {
        try {
            return (java.lang.String)classInstance.Invoke("ResolveUrl", (Object)relativeUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ResolveClientUrl(java.lang.String relativeUrl) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.web.HttpException, system.OutOfMemoryException, system.threading.ThreadAbortException, system.web.HttpRequestValidationException, system.configuration.ConfigurationErrorsException, system.security.SecurityException, system.MemberAccessException, system.UriFormatException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            return (java.lang.String)classInstance.Invoke("ResolveClientUrl", (Object)relativeUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control FindControl(java.lang.String id) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.provider.ProviderException, system.NullReferenceException {
        try {
            JCObject objFindControl = (JCObject)classInstance.Invoke("FindControl", (Object)id);
            return new Control(objFindControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HasControls() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("HasControls");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetTraceData(NetObject traceDataKey, NetObject traceDataValue) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        try {
            classInstance.Invoke("SetTraceData", (Object)traceDataKey.getJCOInstance(), (Object)traceDataValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetTraceData(NetObject tracedObject, NetObject traceDataKey, NetObject traceDataValue) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException {
        try {
            classInstance.Invoke("SetTraceData", (Object)tracedObject.getJCOInstance(), (Object)traceDataKey.getJCOInstance(), (Object)traceDataValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetRouteUrl(NetObject routeParameters) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NotSupportedException, system.RankException, system.NullReferenceException, system.web.HttpException, system.ObjectDisposedException, system.threading.LockRecursionException, system.NotImplementedException, system.globalization.CultureNotFoundException {
        try {
            return (java.lang.String)classInstance.Invoke("GetRouteUrl", (Object)routeParameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetRouteUrl(java.lang.String routeName, NetObject routeParameters) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NotSupportedException, system.RankException, system.NullReferenceException, system.web.HttpException, system.ObjectDisposedException, system.threading.LockRecursionException, system.NotImplementedException, system.globalization.CultureNotFoundException {
        try {
            return (java.lang.String)classInstance.Invoke("GetRouteUrl", (Object)routeName, (Object)routeParameters.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetUniqueIDRelativeTo(Control control) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.web.HttpException {
        try {
            return (java.lang.String)classInstance.Invoke("GetUniqueIDRelativeTo", (Object)control.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetRenderMethodDelegate(RenderMethod renderMethod) throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("SetRenderMethodDelegate", renderMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Control getContentTemplateContainer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContentTemplateContainer");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContentTemplateContainer(Control ContentTemplateContainer) throws Throwable {
        try {
            classInstance.Set("ContentTemplateContainer", (Object)ContentTemplateContainer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control getCustomNavigationTemplateContainer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CustomNavigationTemplateContainer");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCustomNavigationTemplateContainer(Control CustomNavigationTemplateContainer) throws Throwable {
        try {
            classInstance.Set("CustomNavigationTemplateContainer", (Object)CustomNavigationTemplateContainer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSkinID() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SkinID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSkinID(java.lang.String SkinID) throws Throwable {
        try {
            classInstance.Set("SkinID", (Object)SkinID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowReturn() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowReturn");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowReturn(boolean AllowReturn) throws Throwable {
        try {
            classInstance.Set("AllowReturn", AllowReturn);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnableTheming() throws Throwable {
        try {
            return (boolean)classInstance.Get("EnableTheming");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnableTheming(boolean EnableTheming) throws Throwable {
        try {
            classInstance.Set("EnableTheming", EnableTheming);
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

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WizardStepType getStepType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StepType");
            return new WizardStepType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStepType(WizardStepType StepType) throws Throwable {
        try {
            classInstance.Set("StepType", (Object)StepType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTitle() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Title");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTitle(java.lang.String Title) throws Throwable {
        try {
            classInstance.Set("Title", (Object)Title);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Wizard getWizard() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Wizard");
            return new Wizard(val);
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

    public ClientIDMode getClientIDMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClientIDMode");
            return new ClientIDMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClientIDMode(ClientIDMode ClientIDMode) throws Throwable {
        try {
            classInstance.Set("ClientIDMode", (Object)ClientIDMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getClientID() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ClientID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnableViewState() throws Throwable {
        try {
            return (boolean)classInstance.Get("EnableViewState");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnableViewState(boolean EnableViewState) throws Throwable {
        try {
            classInstance.Set("EnableViewState", EnableViewState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ViewStateMode getViewStateMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ViewStateMode");
            return new ViewStateMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setViewStateMode(ViewStateMode ViewStateMode) throws Throwable {
        try {
            classInstance.Set("ViewStateMode", (Object)ViewStateMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control getNamingContainer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NamingContainer");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control getBindingContainer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BindingContainer");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control getDataItemContainer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataItemContainer");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control getDataKeysContainer() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataKeysContainer");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Page getPage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Page");
            return new Page(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPage(Page Page) throws Throwable {
        try {
            classInstance.Set("Page", (Object)Page.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version getRenderingCompatibility() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RenderingCompatibility");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRenderingCompatibility(Version RenderingCompatibility) throws Throwable {
        try {
            classInstance.Set("RenderingCompatibility", (Object)RenderingCompatibility.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TemplateControl getTemplateControl() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TemplateControl");
            return new TemplateControl(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTemplateControl(TemplateControl TemplateControl) throws Throwable {
        try {
            classInstance.Set("TemplateControl", (Object)TemplateControl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Control getParent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new Control(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTemplateSourceDirectory() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TemplateSourceDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAppRelativeTemplateSourceDirectory() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("AppRelativeTemplateSourceDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAppRelativeTemplateSourceDirectory(java.lang.String AppRelativeTemplateSourceDirectory) throws Throwable {
        try {
            classInstance.Set("AppRelativeTemplateSourceDirectory", (Object)AppRelativeTemplateSourceDirectory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUniqueID() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("UniqueID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ControlCollection getControls() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Controls");
            return new ControlCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValidateRequestMode getValidateRequestMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValidateRequestMode");
            return new ValidateRequestMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidateRequestMode(ValidateRequestMode ValidateRequestMode) throws Throwable {
        try {
            classInstance.Set("ValidateRequestMode", (Object)ValidateRequestMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addActivate(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Activate", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeActivate(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Activate", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDeactivate(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Deactivate", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDeactivate(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Deactivate", handler);
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

    public void addDataBinding(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("DataBinding", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDataBinding(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("DataBinding", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addInit(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Init", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeInit(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Init", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addLoad(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Load", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeLoad(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Load", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPreRender(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PreRender", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePreRender(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PreRender", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addUnload(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Unload", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeUnload(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Unload", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}