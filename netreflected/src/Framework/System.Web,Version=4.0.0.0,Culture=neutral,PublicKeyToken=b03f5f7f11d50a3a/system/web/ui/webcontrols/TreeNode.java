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
import system.web.ui.webcontrols.TreeNodeCollection;
import system.web.ui.webcontrols.TreeNode;
import system.web.ui.webcontrols.TreeNodeSelectAction;


/**
 * The base .NET class managing System.Web.UI.WebControls.TreeNode, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class TreeNode extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.WebControls.TreeNode";
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

    public TreeNode(Object instance) throws Throwable {
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

    public static TreeNode castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TreeNode(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TreeNode() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode(java.lang.String text, java.lang.String value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)text, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode(java.lang.String text, java.lang.String value, java.lang.String imageUrl) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)text, (Object)value, (Object)imageUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode(java.lang.String text, java.lang.String value, java.lang.String imageUrl, java.lang.String navigateUrl, java.lang.String target) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)text, (Object)value, (Object)imageUrl, (Object)navigateUrl, (Object)target);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void CollapseAll() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.web.HttpRequestValidationException, system.NullReferenceException {
        try {
            classInstance.Invoke("CollapseAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ExpandAll() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.web.HttpRequestValidationException, system.NullReferenceException {
        try {
            classInstance.Invoke("ExpandAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Select() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("Select");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Collapse() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.web.HttpException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.web.HttpRequestValidationException, system.OutOfMemoryException, system.NotSupportedException, system.NullReferenceException, system.FormatException {
        try {
            classInstance.Invoke("Collapse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Expand() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.web.HttpException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.web.HttpRequestValidationException, system.OutOfMemoryException, system.NotSupportedException, system.NullReferenceException, system.FormatException {
        try {
            classInstance.Invoke("Expand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ToggleExpandState() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.web.HttpRequestValidationException, system.OutOfMemoryException, system.NotSupportedException, system.NullReferenceException {
        try {
            classInstance.Invoke("ToggleExpandState");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getChecked() throws Throwable {
        try {
            return (boolean)classInstance.Get("Checked");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setChecked(boolean Checked) throws Throwable {
        try {
            classInstance.Set("Checked", Checked);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDataBound() throws Throwable {
        try {
            return (boolean)classInstance.Get("DataBound");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNodeCollection getChildNodes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ChildNodes");
            return new TreeNodeCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDataPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DataPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDepth() throws Throwable {
        try {
            return (int)classInstance.Get("Depth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getDataItem() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataItem");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getImageToolTip() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ImageToolTip");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageToolTip(java.lang.String ImageToolTip) throws Throwable {
        try {
            classInstance.Set("ImageToolTip", (Object)ImageToolTip);
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

    public java.lang.String getNavigateUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("NavigateUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNavigateUrl(java.lang.String NavigateUrl) throws Throwable {
        try {
            classInstance.Set("NavigateUrl", (Object)NavigateUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNode getParent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new TreeNode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPopulateOnDemand() throws Throwable {
        try {
            return (boolean)classInstance.Get("PopulateOnDemand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPopulateOnDemand(boolean PopulateOnDemand) throws Throwable {
        try {
            classInstance.Set("PopulateOnDemand", PopulateOnDemand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TreeNodeSelectAction getSelectAction() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectAction");
            return new TreeNodeSelectAction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectAction(TreeNodeSelectAction SelectAction) throws Throwable {
        try {
            classInstance.Set("SelectAction", (Object)SelectAction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSelected() throws Throwable {
        try {
            return (boolean)classInstance.Get("Selected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelected(boolean Selected) throws Throwable {
        try {
            classInstance.Set("Selected", Selected);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTarget() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Target");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTarget(java.lang.String Target) throws Throwable {
        try {
            classInstance.Set("Target", (Object)Target);
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

    public java.lang.String getToolTip() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ToolTip");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setToolTip(java.lang.String ToolTip) throws Throwable {
        try {
            classInstance.Set("ToolTip", (Object)ToolTip);
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

    public java.lang.String getValuePath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ValuePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}