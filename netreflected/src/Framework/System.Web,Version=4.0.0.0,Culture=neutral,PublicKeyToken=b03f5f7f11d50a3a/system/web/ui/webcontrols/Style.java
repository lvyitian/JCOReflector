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
import system.web.ui.StateBag;
import system.web.ui.HtmlTextWriter;
import system.web.ui.webcontrols.WebControl;
import system.web.ui.webcontrols.Style;
import system.web.ui.CssStyleCollection;
import system.runtime.remoting.ObjRef;
import system.drawing.Color;
import system.web.ui.webcontrols.Unit;
import system.web.ui.webcontrols.BorderStyle;
import system.web.ui.webcontrols.FontInfo;
import system.EventHandler;


/**
 * The base .NET class managing System.Web.UI.WebControls.Style, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Style extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.WebControls.Style";
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

    public Style(Object instance) throws Throwable {
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

    public static Style castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Style(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Style() throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Style(StateBag bag) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)bag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void AddAttributesToRender(HtmlTextWriter writer) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.NullReferenceException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.threading.ThreadAbortException {
        try {
            classInstance.Invoke("AddAttributesToRender", (Object)writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddAttributesToRender(HtmlTextWriter writer, WebControl owner) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NullReferenceException, system.text.regularexpressions.RegexMatchTimeoutException, system.OutOfMemoryException, system.FormatException, system.web.HttpException {
        try {
            classInstance.Invoke("AddAttributesToRender", (Object)writer.getJCOInstance(), (Object)owner.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyFrom(Style s) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.NullReferenceException {
        try {
            classInstance.Invoke("CopyFrom", (Object)s.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MergeWith(Style s) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.NullReferenceException {
        try {
            classInstance.Invoke("MergeWith", (Object)s.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset() throws Throwable {
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetDirty() throws Throwable {
        try {
            classInstance.Invoke("SetDirty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
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
    
    
    public Color getBackColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BackColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBackColor(Color BackColor) throws Throwable {
        try {
            classInstance.Set("BackColor", (Object)BackColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBorderColor(Color BorderColor) throws Throwable {
        try {
            classInstance.Set("BorderColor", (Object)BorderColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Unit getBorderWidth() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BorderWidth");
            return new Unit(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBorderWidth(Unit BorderWidth) throws Throwable {
        try {
            classInstance.Set("BorderWidth", (Object)BorderWidth.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BorderStyle getBorderStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BorderStyle");
            return new BorderStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBorderStyle(BorderStyle BorderStyle) throws Throwable {
        try {
            classInstance.Set("BorderStyle", (Object)BorderStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCssClass() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CssClass");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCssClass(java.lang.String CssClass) throws Throwable {
        try {
            classInstance.Set("CssClass", (Object)CssClass);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FontInfo getFont() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Font");
            return new FontInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getForeColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ForeColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setForeColor(Color ForeColor) throws Throwable {
        try {
            classInstance.Set("ForeColor", (Object)ForeColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Unit getHeight() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Height");
            return new Unit(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeight(Unit Height) throws Throwable {
        try {
            classInstance.Set("Height", (Object)Height.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEmpty() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRegisteredCssClass() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RegisteredCssClass");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Unit getWidth() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Width");
            return new Unit(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWidth(Unit Width) throws Throwable {
        try {
            classInstance.Set("Width", (Object)Width.getJCOInstance());
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


}