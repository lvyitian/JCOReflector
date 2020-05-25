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
import system.web.ui.Control;
import system.web.ui.webcontrols.DataControlFieldCell;
import system.web.ui.webcontrols.DataControlCellType;
import system.web.ui.webcontrols.DataControlRowState;
import system.web.ui.webcontrols.ButtonType;
import system.web.ui.webcontrols.Style;
import system.web.ui.webcontrols.TableItemStyle;


/**
 * The base .NET class managing System.Web.UI.WebControls.ButtonField, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ButtonField extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.WebControls.ButtonField";
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

    public ButtonField(Object instance) throws Throwable {
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

    public static ButtonField castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ButtonField(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ButtonField() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Initialize(boolean sortingEnabled, Control control) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Initialize", sortingEnabled, (Object)control.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateSupportsCallback() throws Throwable {
        try {
            classInstance.Invoke("ValidateSupportsCallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InitializeCell(DataControlFieldCell cell, DataControlCellType cellType, DataControlRowState rowState, int rowIndex) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("InitializeCell", (Object)cell.getJCOInstance(), (Object)cellType.getJCOInstance(), (Object)rowState.getJCOInstance(), rowIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getCommandName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CommandName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommandName(java.lang.String CommandName) throws Throwable {
        try {
            classInstance.Set("CommandName", (Object)CommandName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDataTextField() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DataTextField");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataTextField(java.lang.String DataTextField) throws Throwable {
        try {
            classInstance.Set("DataTextField", (Object)DataTextField);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDataTextFormatString() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DataTextFormatString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataTextFormatString(java.lang.String DataTextFormatString) throws Throwable {
        try {
            classInstance.Set("DataTextFormatString", (Object)DataTextFormatString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getImageUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ImageUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageUrl(java.lang.String ImageUrl) throws Throwable {
        try {
            classInstance.Set("ImageUrl", (Object)ImageUrl);
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

    public ButtonType getButtonType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ButtonType");
            return new ButtonType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setButtonType(ButtonType ButtonType) throws Throwable {
        try {
            classInstance.Set("ButtonType", (Object)ButtonType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCausesValidation() throws Throwable {
        try {
            return (boolean)classInstance.Get("CausesValidation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCausesValidation(boolean CausesValidation) throws Throwable {
        try {
            classInstance.Set("CausesValidation", CausesValidation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowHeader() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowHeader");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowHeader(boolean ShowHeader) throws Throwable {
        try {
            classInstance.Set("ShowHeader", ShowHeader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getValidationGroup() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ValidationGroup");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidationGroup(java.lang.String ValidationGroup) throws Throwable {
        try {
            classInstance.Set("ValidationGroup", (Object)ValidationGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAccessibleHeaderText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("AccessibleHeaderText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAccessibleHeaderText(java.lang.String AccessibleHeaderText) throws Throwable {
        try {
            classInstance.Set("AccessibleHeaderText", (Object)AccessibleHeaderText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Style getControlStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ControlStyle");
            return new Style(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TableItemStyle getFooterStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FooterStyle");
            return new TableItemStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFooterText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FooterText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFooterText(java.lang.String FooterText) throws Throwable {
        try {
            classInstance.Set("FooterText", (Object)FooterText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHeaderImageUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HeaderImageUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaderImageUrl(java.lang.String HeaderImageUrl) throws Throwable {
        try {
            classInstance.Set("HeaderImageUrl", (Object)HeaderImageUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TableItemStyle getHeaderStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HeaderStyle");
            return new TableItemStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHeaderText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HeaderText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaderText(java.lang.String HeaderText) throws Throwable {
        try {
            classInstance.Set("HeaderText", (Object)HeaderText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getInsertVisible() throws Throwable {
        try {
            return (boolean)classInstance.Get("InsertVisible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInsertVisible(boolean InsertVisible) throws Throwable {
        try {
            classInstance.Set("InsertVisible", InsertVisible);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TableItemStyle getItemStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ItemStyle");
            return new TableItemStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSortExpression() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SortExpression");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSortExpression(java.lang.String SortExpression) throws Throwable {
        try {
            classInstance.Set("SortExpression", (Object)SortExpression);
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



	// Instance Events section
    
    
}