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
import system.web.ui.ControlBuilder;
import system.web.ui.ObjectPersistData;
import system.codedom.CodeCompileUnit;
import system.codedom.CodeTypeDeclaration;
import system.codedom.CodeMemberMethod;
import system.web.ui.TemplateParser;


/**
 * The base .NET class managing System.Web.UI.WebControls.LiteralControlBuilder, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class LiteralControlBuilder extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.WebControls.LiteralControlBuilder";
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

    public LiteralControlBuilder(Object instance) throws Throwable {
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

    public static LiteralControlBuilder castFrom(IJCOBridgeReflected from) throws Throwable {
        return new LiteralControlBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    
    public LiteralControlBuilder() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean AllowWhitespaceLiterals() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("AllowWhitespaceLiterals");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AppendLiteralString(java.lang.String s) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.web.HttpException, system.threading.ThreadAbortException, system.OverflowException, system.text.regularexpressions.RegexMatchTimeoutException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.security.SecurityException, system.web.HttpParseException, system.InvalidCastException, system.NullReferenceException, system.TypeLoadException {
        try {
            classInstance.Invoke("AppendLiteralString", (Object)s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AppendSubBuilder(ControlBuilder subBuilder) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.web.HttpException {
        try {
            classInstance.Invoke("AppendSubBuilder", (Object)subBuilder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject BuildObject() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.security.SecurityException, system.ObjectDisposedException, system.NotSupportedException, system.MissingMethodException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.NullReferenceException, system.TypeLoadException, system.web.HttpException, system.MulticastNotSupportedException {
        try {
            JCObject objBuildObject = (JCObject)classInstance.Invoke("BuildObject");
            return new NetObject(objBuildObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CloseControl() throws Throwable {
        try {
            classInstance.Invoke("CloseControl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectPersistData GetObjectPersistData() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.NotSupportedException, system.MissingMethodException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.reflection.AmbiguousMatchException, system.web.HttpParseException, system.FormatException {
        try {
            JCObject objGetObjectPersistData = (JCObject)classInstance.Invoke("GetObjectPersistData");
            return new ObjectPersistData(objGetObjectPersistData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HasBody() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("HasBody");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HtmlDecodeLiterals() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("HtmlDecodeLiterals");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean NeedsTagInnerText() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("NeedsTagInnerText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnAppendToParentBuilder(ControlBuilder parentBuilder) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.web.HttpException, system.FormatException, system.reflection.AmbiguousMatchException, system.OverflowException, system.text.regularexpressions.RegexMatchTimeoutException, system.TypeLoadException, system.OutOfMemoryException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.web.HttpParseException {
        try {
            classInstance.Invoke("OnAppendToParentBuilder", (Object)parentBuilder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetResourceKey() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetResourceKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetTagInnerText(java.lang.String text) throws Throwable {
        try {
            classInstance.Invoke("SetTagInnerText", (Object)text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ProcessGeneratedCode(CodeCompileUnit codeCompileUnit, CodeTypeDeclaration baseType, CodeTypeDeclaration derivedType, CodeMemberMethod buildMethod, CodeMemberMethod dataBindingMethod) throws Throwable {
        try {
            classInstance.Invoke("ProcessGeneratedCode", (Object)codeCompileUnit.getJCOInstance(), (Object)baseType.getJCOInstance(), (Object)derivedType.getJCOInstance(), (Object)buildMethod.getJCOInstance(), (Object)dataBindingMethod.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetResourceKey(java.lang.String resourceKey) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.web.HttpException {
        try {
            classInstance.Invoke("SetResourceKey", (Object)resourceKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public NetType getBindingContainerType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BindingContainerType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ControlBuilder getBindingContainerBuilder() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BindingContainerBuilder");
            return new ControlBuilder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getItemType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ItemType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getControlType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ControlType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDeclareType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DeclareType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasAspCode() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasAspCode");
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

    public boolean getLocalize() throws Throwable {
        try {
            return (boolean)classInstance.Get("Localize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getNamingContainerType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NamingContainerType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetArrayList getSubBuilders() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SubBuilders");
            return new NetArrayList(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTagName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TagName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPageVirtualPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PageVirtualPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}