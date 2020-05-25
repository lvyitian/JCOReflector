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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DataGridViewAutoSizeColumnMode;
import system.windows.forms.DataGridViewCell;
import system.windows.forms.DataGridViewCellStyle;
import system.windows.forms.FlatStyle;
import system.windows.forms.ContextMenuStrip;
import system.Single;
import system.windows.forms.DataGridViewColumnHeaderCell;
import system.windows.forms.DataGridViewTriState;
import system.windows.forms.DataGridViewColumnSortMode;
import system.windows.forms.DataGridViewElementStates;
import system.windows.forms.DataGridView;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Forms.DataGridViewCheckBoxColumn, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DataGridViewCheckBoxColumn extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.DataGridViewCheckBoxColumn";
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

    public DataGridViewCheckBoxColumn(Object instance) throws Throwable {
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

    public static DataGridViewCheckBoxColumn castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataGridViewCheckBoxColumn(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataGridViewCheckBoxColumn() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewCheckBoxColumn(boolean threeState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.NotSupportedException, system.ArithmeticException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(threeState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public NetObject Clone() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetPreferredWidth(DataGridViewAutoSizeColumnMode autoSizeColumnMode, boolean fixedHeight) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.NotSupportedException {
        try {
            return (int)classInstance.Invoke("GetPreferredWidth", (Object)autoSizeColumnMode.getJCOInstance(), fixedHeight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.MulticastNotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public DataGridViewCell getCellTemplate() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CellTemplate");
            return new DataGridViewCell(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCellTemplate(DataGridViewCell CellTemplate) throws Throwable {
        try {
            classInstance.Set("CellTemplate", (Object)CellTemplate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewCellStyle getDefaultCellStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultCellStyle");
            return new DataGridViewCellStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultCellStyle(DataGridViewCellStyle DefaultCellStyle) throws Throwable {
        try {
            classInstance.Set("DefaultCellStyle", (Object)DefaultCellStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getFalseValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FalseValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFalseValue(NetObject FalseValue) throws Throwable {
        try {
            classInstance.Set("FalseValue", (Object)FalseValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FlatStyle getFlatStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FlatStyle");
            return new FlatStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFlatStyle(FlatStyle FlatStyle) throws Throwable {
        try {
            classInstance.Set("FlatStyle", (Object)FlatStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getIndeterminateValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IndeterminateValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIndeterminateValue(NetObject IndeterminateValue) throws Throwable {
        try {
            classInstance.Set("IndeterminateValue", (Object)IndeterminateValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getThreeState() throws Throwable {
        try {
            return (boolean)classInstance.Get("ThreeState");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setThreeState(boolean ThreeState) throws Throwable {
        try {
            classInstance.Set("ThreeState", ThreeState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTrueValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TrueValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrueValue(NetObject TrueValue) throws Throwable {
        try {
            classInstance.Set("TrueValue", (Object)TrueValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewAutoSizeColumnMode getAutoSizeMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AutoSizeMode");
            return new DataGridViewAutoSizeColumnMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoSizeMode(DataGridViewAutoSizeColumnMode AutoSizeMode) throws Throwable {
        try {
            classInstance.Set("AutoSizeMode", (Object)AutoSizeMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getCellType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CellType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenuStrip getContextMenuStrip() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContextMenuStrip");
            return new ContextMenuStrip(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContextMenuStrip(ContextMenuStrip ContextMenuStrip) throws Throwable {
        try {
            classInstance.Set("ContextMenuStrip", (Object)ContextMenuStrip.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDataPropertyName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DataPropertyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataPropertyName(java.lang.String DataPropertyName) throws Throwable {
        try {
            classInstance.Set("DataPropertyName", (Object)DataPropertyName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDisplayIndex() throws Throwable {
        try {
            return (int)classInstance.Get("DisplayIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayIndex(int DisplayIndex) throws Throwable {
        try {
            classInstance.Set("DisplayIndex", DisplayIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDividerWidth() throws Throwable {
        try {
            return (int)classInstance.Get("DividerWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDividerWidth(int DividerWidth) throws Throwable {
        try {
            classInstance.Set("DividerWidth", DividerWidth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single getFillWeight() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FillWeight");
            return new Single(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFillWeight(Single FillWeight) throws Throwable {
        try {
            classInstance.Set("FillWeight", (Object)FillWeight.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFrozen() throws Throwable {
        try {
            return (boolean)classInstance.Get("Frozen");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFrozen(boolean Frozen) throws Throwable {
        try {
            classInstance.Set("Frozen", Frozen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewColumnHeaderCell getHeaderCell() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HeaderCell");
            return new DataGridViewColumnHeaderCell(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeaderCell(DataGridViewColumnHeaderCell HeaderCell) throws Throwable {
        try {
            classInstance.Set("HeaderCell", (Object)HeaderCell.getJCOInstance());
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

    public DataGridViewAutoSizeColumnMode getInheritedAutoSizeMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InheritedAutoSizeMode");
            return new DataGridViewAutoSizeColumnMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewCellStyle getInheritedStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InheritedStyle");
            return new DataGridViewCellStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDataBound() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDataBound");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMinimumWidth() throws Throwable {
        try {
            return (int)classInstance.Get("MinimumWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinimumWidth(int MinimumWidth) throws Throwable {
        try {
            classInstance.Set("MinimumWidth", MinimumWidth);
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

    public DataGridViewTriState getResizable() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Resizable");
            return new DataGridViewTriState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResizable(DataGridViewTriState Resizable) throws Throwable {
        try {
            classInstance.Set("Resizable", (Object)Resizable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewColumnSortMode getSortMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SortMode");
            return new DataGridViewColumnSortMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSortMode(DataGridViewColumnSortMode SortMode) throws Throwable {
        try {
            classInstance.Set("SortMode", (Object)SortMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getToolTipText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ToolTipText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setToolTipText(java.lang.String ToolTipText) throws Throwable {
        try {
            classInstance.Set("ToolTipText", (Object)ToolTipText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getValueType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValueType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValueType(NetType ValueType) throws Throwable {
        try {
            classInstance.Set("ValueType", (Object)ValueType.getJCOInstance());
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

    public int getWidth() throws Throwable {
        try {
            return (int)classInstance.Get("Width");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWidth(int Width) throws Throwable {
        try {
            classInstance.Set("Width", Width);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDefaultHeaderCellType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultHeaderCellType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultHeaderCellType(NetType DefaultHeaderCellType) throws Throwable {
        try {
            classInstance.Set("DefaultHeaderCellType", (Object)DefaultHeaderCellType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDisplayed() throws Throwable {
        try {
            return (boolean)classInstance.Get("Displayed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayed(boolean Displayed) throws Throwable {
        try {
            classInstance.Set("Displayed", Displayed);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasDefaultCellStyle() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasDefaultCellStyle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getIndex() throws Throwable {
        try {
            return (int)classInstance.Get("Index");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIndex(int Index) throws Throwable {
        try {
            classInstance.Set("Index", Index);
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

    public NetObject getTag() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Tag");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTag(NetObject Tag) throws Throwable {
        try {
            classInstance.Set("Tag", (Object)Tag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewElementStates getState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new DataGridViewElementStates(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setState(DataGridViewElementStates State) throws Throwable {
        try {
            classInstance.Set("State", (Object)State.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridView getDataGridView() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataGridView");
            return new DataGridView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataGridView(DataGridView DataGridView) throws Throwable {
        try {
            classInstance.Set("DataGridView", (Object)DataGridView.getJCOInstance());
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