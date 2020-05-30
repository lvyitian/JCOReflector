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

package system.web.ui;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.PostBackOptions;
import system.web.ui.Control;


/**
 * The base .NET class managing System.Web.UI.ClientScriptManager, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ClientScriptManager extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.ClientScriptManager";
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

    public ClientScriptManager(Object instance) throws Throwable {
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

    public static ClientScriptManager castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ClientScriptManager(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void RegisterForEventValidation(PostBackOptions options) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationException, system.web.HttpException, system.NotImplementedException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("RegisterForEventValidation", (Object)options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterForEventValidation(java.lang.String uniqueId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.web.HttpException {
        try {
            classInstance.Invoke("RegisterForEventValidation", (Object)uniqueId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterForEventValidation(java.lang.String uniqueId, java.lang.String argument) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.web.HttpException {
        try {
            classInstance.Invoke("RegisterForEventValidation", (Object)uniqueId, (Object)argument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateEvent(java.lang.String uniqueId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.web.HttpException {
        try {
            classInstance.Invoke("ValidateEvent", (Object)uniqueId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCallbackEventReference(Control control, java.lang.String argument, java.lang.String clientCallback, java.lang.String context) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.configuration.ConfigurationException, system.web.HttpException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpRequestValidationException, system.UriFormatException, system.OutOfMemoryException, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetCallbackEventReference", (Object)control.getJCOInstance(), (Object)argument, (Object)clientCallback, (Object)context);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCallbackEventReference(Control control, java.lang.String argument, java.lang.String clientCallback, java.lang.String context, boolean useAsync) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.NotSupportedException, system.configuration.ConfigurationException, system.web.HttpException, system.InvalidOperationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.FormatException, system.web.HttpRequestValidationException, system.UriFormatException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetCallbackEventReference", (Object)control.getJCOInstance(), (Object)argument, (Object)clientCallback, (Object)context, useAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackEventReference(Control control, java.lang.String argument) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.provider.ProviderException, system.NullReferenceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackEventReference", (Object)control.getJCOInstance(), (Object)argument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackEventReference(Control control, java.lang.String argument, boolean registerForEventValidation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.provider.ProviderException, system.NullReferenceException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackEventReference", (Object)control.getJCOInstance(), (Object)argument, registerForEventValidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackEventReference(PostBackOptions options) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.configuration.ConfigurationException, system.web.HttpException, system.IndexOutOfRangeException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackEventReference", (Object)options.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetWebResourceUrl(NetType type, java.lang.String resourceName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetWebResourceUrl", (Object)type.getJCOInstance(), (Object)resourceName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsClientScriptBlockRegistered(java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsClientScriptBlockRegistered", (Object)key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsClientScriptBlockRegistered(NetType type, java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsClientScriptBlockRegistered", (Object)type.getJCOInstance(), (Object)key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsClientScriptIncludeRegistered(java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsClientScriptIncludeRegistered", (Object)key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsClientScriptIncludeRegistered(NetType type, java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsClientScriptIncludeRegistered", (Object)type.getJCOInstance(), (Object)key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsStartupScriptRegistered(java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsStartupScriptRegistered", (Object)key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsStartupScriptRegistered(NetType type, java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsStartupScriptRegistered", (Object)type.getJCOInstance(), (Object)key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsOnSubmitStatementRegistered(java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("IsOnSubmitStatementRegistered", (Object)key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsOnSubmitStatementRegistered(NetType type, java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("IsOnSubmitStatementRegistered", (Object)type.getJCOInstance(), (Object)key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterArrayDeclaration(java.lang.String arrayName, java.lang.String arrayValue) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("RegisterArrayDeclaration", (Object)arrayName, (Object)arrayValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterExpandoAttribute(java.lang.String controlId, java.lang.String attributeName, java.lang.String attributeValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("RegisterExpandoAttribute", (Object)controlId, (Object)attributeName, (Object)attributeValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptBlock(NetType type, java.lang.String key, java.lang.String script) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("RegisterClientScriptBlock", (Object)type.getJCOInstance(), (Object)key, (Object)script);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptBlock(NetType type, java.lang.String key, java.lang.String script, boolean addScriptTags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("RegisterClientScriptBlock", (Object)type.getJCOInstance(), (Object)key, (Object)script, addScriptTags);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptInclude(java.lang.String key, java.lang.String url) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.threading.ThreadAbortException, system.web.HttpException {
        try {
            classInstance.Invoke("RegisterClientScriptInclude", (Object)key, (Object)url);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptInclude(NetType type, java.lang.String key, java.lang.String url) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.ThreadAbortException, system.web.HttpException, system.NullReferenceException {
        try {
            classInstance.Invoke("RegisterClientScriptInclude", (Object)type.getJCOInstance(), (Object)key, (Object)url);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterClientScriptResource(NetType type, java.lang.String resourceName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.InvalidOperationException, system.NotImplementedException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classInstance.Invoke("RegisterClientScriptResource", (Object)type.getJCOInstance(), (Object)resourceName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterOnSubmitStatement(NetType type, java.lang.String key, java.lang.String script) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("RegisterOnSubmitStatement", (Object)type.getJCOInstance(), (Object)key, (Object)script);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterStartupScript(NetType type, java.lang.String key, java.lang.String script) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("RegisterStartupScript", (Object)type.getJCOInstance(), (Object)key, (Object)script);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterStartupScript(NetType type, java.lang.String key, java.lang.String script, boolean addScriptTags) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("RegisterStartupScript", (Object)type.getJCOInstance(), (Object)key, (Object)script, addScriptTags);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackClientHyperlink(Control control, java.lang.String argument) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.NullReferenceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackClientHyperlink", (Object)control.getJCOInstance(), (Object)argument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackClientHyperlink(Control control, java.lang.String argument, boolean registerForEventValidation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.web.HttpException, system.NullReferenceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackClientHyperlink", (Object)control.getJCOInstance(), (Object)argument, registerForEventValidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateEvent(java.lang.String uniqueId, java.lang.String argument) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException {
        try {
            classInstance.Invoke("ValidateEvent", (Object)uniqueId, (Object)argument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCallbackEventReference(Control control, java.lang.String argument, java.lang.String clientCallback, java.lang.String context, java.lang.String clientErrorCallback, boolean useAsync) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException, system.InvalidOperationException, system.NotSupportedException, system.configuration.ConfigurationException, system.web.HttpException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.FormatException, system.threading.ThreadAbortException, system.web.HttpRequestValidationException, system.UriFormatException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetCallbackEventReference", (Object)control.getJCOInstance(), (Object)argument, (Object)clientCallback, (Object)context, (Object)clientErrorCallback, useAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetCallbackEventReference(java.lang.String target, java.lang.String argument, java.lang.String clientCallback, java.lang.String context, java.lang.String clientErrorCallback, boolean useAsync) throws Throwable, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.web.HttpException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.provider.ProviderException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.FormatException, system.UriFormatException, system.OutOfMemoryException, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetCallbackEventReference", (Object)target, (Object)argument, (Object)clientCallback, (Object)context, (Object)clientErrorCallback, useAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPostBackEventReference(PostBackOptions options, boolean registerForEventValidation) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.NotSupportedException, system.configuration.ConfigurationException, system.web.HttpException, system.InvalidOperationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("GetPostBackEventReference", (Object)options.getJCOInstance(), registerForEventValidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterExpandoAttribute(java.lang.String controlId, java.lang.String attributeName, java.lang.String attributeValue, boolean encode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("RegisterExpandoAttribute", (Object)controlId, (Object)attributeName, (Object)attributeValue, encode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterHiddenField(java.lang.String hiddenFieldName, java.lang.String hiddenFieldInitialValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("RegisterHiddenField", (Object)hiddenFieldName, (Object)hiddenFieldInitialValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}