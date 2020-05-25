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

package microsoft.build.framework.xamltypes;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.framework.xamltypes.DataSource;
import microsoft.build.framework.xamltypes.Rule;


/**
 * The base .NET class managing Microsoft.Build.Framework.XamlTypes.BoolProperty, Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class BoolProperty extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Framework";
    public static final String className = "Microsoft.Build.Framework.XamlTypes.BoolProperty";
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

    public BoolProperty(Object instance) throws Throwable {
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

    public static BoolProperty castFrom(IJCOBridgeReflected from) throws Throwable {
        return new BoolProperty(from.getJCOInstance());
    }

    // Constructors section
    
    
    public BoolProperty() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void BeginInit() throws Throwable {
        try {
            classInstance.Invoke("BeginInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndInit() throws Throwable {
        try {
            classInstance.Invoke("EndInit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getReverseSwitch() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ReverseSwitch");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReverseSwitch(java.lang.String ReverseSwitch) throws Throwable {
        try {
            classInstance.Set("ReverseSwitch", (Object)ReverseSwitch);
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

    public java.lang.String getDisplayName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DisplayName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayName(java.lang.String DisplayName) throws Throwable {
        try {
            classInstance.Set("DisplayName", (Object)DisplayName);
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

    public void setDescription(java.lang.String Description) throws Throwable {
        try {
            classInstance.Set("Description", (Object)Description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getF1Keyword() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("F1Keyword");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setF1Keyword(java.lang.String F1Keyword) throws Throwable {
        try {
            classInstance.Set("F1Keyword", (Object)F1Keyword);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHelpUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HelpUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHelpUrl(java.lang.String HelpUrl) throws Throwable {
        try {
            classInstance.Set("HelpUrl", (Object)HelpUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHelpFile() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HelpFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHelpFile(java.lang.String HelpFile) throws Throwable {
        try {
            classInstance.Set("HelpFile", (Object)HelpFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getHelpContext() throws Throwable {
        try {
            return (int)classInstance.Get("HelpContext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHelpContext(int HelpContext) throws Throwable {
        try {
            classInstance.Set("HelpContext", HelpContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCategory() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Category");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCategory(java.lang.String Category) throws Throwable {
        try {
            classInstance.Set("Category", (Object)Category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSubcategory() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Subcategory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSubcategory(java.lang.String Subcategory) throws Throwable {
        try {
            classInstance.Set("Subcategory", (Object)Subcategory);
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

    public boolean getMultipleValuesAllowed() throws Throwable {
        try {
            return (boolean)classInstance.Get("MultipleValuesAllowed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMultipleValuesAllowed(boolean MultipleValuesAllowed) throws Throwable {
        try {
            classInstance.Set("MultipleValuesAllowed", MultipleValuesAllowed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSwitch() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Switch");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSwitch(java.lang.String Switch) throws Throwable {
        try {
            classInstance.Set("Switch", (Object)Switch);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSwitchPrefix() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SwitchPrefix");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSwitchPrefix(java.lang.String SwitchPrefix) throws Throwable {
        try {
            classInstance.Set("SwitchPrefix", (Object)SwitchPrefix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSeparator() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Separator");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSeparator(java.lang.String Separator) throws Throwable {
        try {
            classInstance.Set("Separator", (Object)Separator);
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

    public boolean getIncludeInCommandLine() throws Throwable {
        try {
            return (boolean)classInstance.Get("IncludeInCommandLine");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIncludeInCommandLine(boolean IncludeInCommandLine) throws Throwable {
        try {
            classInstance.Set("IncludeInCommandLine", IncludeInCommandLine);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsRequired() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsRequired");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsRequired(boolean IsRequired) throws Throwable {
        try {
            classInstance.Set("IsRequired", IsRequired);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDefault() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Default");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefault(java.lang.String Default) throws Throwable {
        try {
            classInstance.Set("Default", (Object)Default);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataSource getDataSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataSource");
            return new DataSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataSource(DataSource DataSource) throws Throwable {
        try {
            classInstance.Set("DataSource", (Object)DataSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rule getContainingRule() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContainingRule");
            return new Rule(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContainingRule(Rule ContainingRule) throws Throwable {
        try {
            classInstance.Set("ContainingRule", (Object)ContainingRule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}