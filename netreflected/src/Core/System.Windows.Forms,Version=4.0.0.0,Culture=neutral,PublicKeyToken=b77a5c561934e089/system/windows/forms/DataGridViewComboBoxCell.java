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
import system.windows.forms.DataGridViewCellStyle;
import system.windows.forms.KeyEventArgs;
import system.componentmodel.TypeConverter;
import system.drawing.Rectangle;
import system.windows.forms.DataGridViewDataErrorContexts;
import system.windows.forms.ContextMenuStrip;
import system.windows.forms.DataGridViewElementStates;
import system.windows.forms.DataGridViewAdvancedBorderStyle;
import system.windows.forms.DataGridViewComboBoxDisplayStyle;
import system.windows.forms.FlatStyle;
import system.windows.forms.AccessibleObject;
import system.windows.forms.DataGridViewColumn;
import system.windows.forms.DataGridViewRow;
import system.drawing.Size;
import system.windows.forms.DataGridView;


/**
 * The base .NET class managing System.Windows.Forms.DataGridViewComboBoxCell, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DataGridViewComboBoxCell extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.DataGridViewComboBoxCell";
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

    public DataGridViewComboBoxCell(Object instance) throws Throwable {
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

    public static DataGridViewComboBoxCell castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataGridViewComboBoxCell(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataGridViewComboBoxCell() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public NetObject Clone() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.InvalidEnumArgumentException, system.ArgumentOutOfRangeException, system.MulticastNotSupportedException, system.RankException, system.threading.ThreadStateException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.InvalidCastException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DetachEditingControl() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.RankException, system.TypeLoadException, system.InvalidCastException, system.componentmodel.Win32Exception, system.OutOfMemoryException {
        try {
            classInstance.Invoke("DetachEditingControl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InitializeEditingControl(int rowIndex, NetObject initialFormattedValue, DataGridViewCellStyle dataGridViewCellStyle) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.threading.ThreadStateException, system.InvalidCastException, system.RankException {
        try {
            classInstance.Invoke("InitializeEditingControl", rowIndex, (Object)initialFormattedValue.getJCOInstance(), (Object)dataGridViewCellStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean KeyEntersEditMode(KeyEventArgs e) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            return (boolean)classInstance.Invoke("KeyEntersEditMode", (Object)e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ParseFormattedValue(NetObject formattedValue, DataGridViewCellStyle cellStyle, TypeConverter formattedValueTypeConverter, TypeConverter valueTypeConverter) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.FormatException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException {
        try {
            JCObject objParseFormattedValue = (JCObject)classInstance.Invoke("ParseFormattedValue", (Object)formattedValue.getJCOInstance(), (Object)cellStyle.getJCOInstance(), (Object)formattedValueTypeConverter.getJCOInstance(), (Object)valueTypeConverter.getJCOInstance());
            return new NetObject(objParseFormattedValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PositionEditingControl(boolean setLocation, boolean setSize, Rectangle cellBounds, Rectangle cellClip, DataGridViewCellStyle cellStyle, boolean singleVerticalBorderAdded, boolean singleHorizontalBorderAdded, boolean isFirstDisplayedColumn, boolean isFirstDisplayedRow) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("PositionEditingControl", setLocation, setSize, (Object)cellBounds.getJCOInstance(), (Object)cellClip.getJCOInstance(), (Object)cellStyle.getJCOInstance(), singleVerticalBorderAdded, singleHorizontalBorderAdded, isFirstDisplayedColumn, isFirstDisplayedRow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle PositionEditingPanel(Rectangle cellBounds, Rectangle cellClip, DataGridViewCellStyle cellStyle, boolean singleVerticalBorderAdded, boolean singleHorizontalBorderAdded, boolean isFirstDisplayedColumn, boolean isFirstDisplayedRow) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            JCObject objPositionEditingPanel = (JCObject)classInstance.Invoke("PositionEditingPanel", (Object)cellBounds.getJCOInstance(), (Object)cellClip.getJCOInstance(), (Object)cellStyle.getJCOInstance(), singleVerticalBorderAdded, singleHorizontalBorderAdded, isFirstDisplayedColumn, isFirstDisplayedRow);
            return new Rectangle(objPositionEditingPanel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.MulticastNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle GetContentBounds(int rowIndex) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException {
        try {
            JCObject objGetContentBounds = (JCObject)classInstance.Invoke("GetContentBounds", rowIndex);
            return new Rectangle(objGetContentBounds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetEditedFormattedValue(int rowIndex, DataGridViewDataErrorContexts context) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.Win32Exception, system.InvalidCastException {
        try {
            JCObject objGetEditedFormattedValue = (JCObject)classInstance.Invoke("GetEditedFormattedValue", rowIndex, (Object)context.getJCOInstance());
            return new NetObject(objGetEditedFormattedValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ContextMenuStrip GetInheritedContextMenuStrip(int rowIndex) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetInheritedContextMenuStrip = (JCObject)classInstance.Invoke("GetInheritedContextMenuStrip", rowIndex);
            return new ContextMenuStrip(objGetInheritedContextMenuStrip);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewElementStates GetInheritedState(int rowIndex) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        try {
            JCObject objGetInheritedState = (JCObject)classInstance.Invoke("GetInheritedState", rowIndex);
            return new DataGridViewElementStates(objGetInheritedState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewCellStyle GetInheritedStyle(DataGridViewCellStyle inheritedCellStyle, int rowIndex, boolean includeColors) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objGetInheritedStyle = (JCObject)classInstance.Invoke("GetInheritedStyle", (Object)inheritedCellStyle.getJCOInstance(), rowIndex, includeColors);
            return new DataGridViewCellStyle(objGetInheritedStyle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewAdvancedBorderStyle AdjustCellBorderStyle(DataGridViewAdvancedBorderStyle dataGridViewAdvancedBorderStyleInput, DataGridViewAdvancedBorderStyle dataGridViewAdvancedBorderStylePlaceholder, boolean singleVerticalBorderAdded, boolean singleHorizontalBorderAdded, boolean isFirstDisplayedColumn, boolean isFirstDisplayedRow) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.ArithmeticException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objAdjustCellBorderStyle = (JCObject)classInstance.Invoke("AdjustCellBorderStyle", (Object)dataGridViewAdvancedBorderStyleInput.getJCOInstance(), (Object)dataGridViewAdvancedBorderStylePlaceholder.getJCOInstance(), singleVerticalBorderAdded, singleHorizontalBorderAdded, isFirstDisplayedColumn, isFirstDisplayedRow);
            return new DataGridViewAdvancedBorderStyle(objAdjustCellBorderStyle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAutoComplete() throws Throwable {
        try {
            return (boolean)classInstance.Get("AutoComplete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoComplete(boolean AutoComplete) throws Throwable {
        try {
            classInstance.Set("AutoComplete", AutoComplete);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getDataSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataSource");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDataSource(NetObject DataSource) throws Throwable {
        try {
            classInstance.Set("DataSource", (Object)DataSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDisplayMember() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DisplayMember");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayMember(java.lang.String DisplayMember) throws Throwable {
        try {
            classInstance.Set("DisplayMember", (Object)DisplayMember);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewComboBoxDisplayStyle getDisplayStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DisplayStyle");
            return new DataGridViewComboBoxDisplayStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayStyle(DataGridViewComboBoxDisplayStyle DisplayStyle) throws Throwable {
        try {
            classInstance.Set("DisplayStyle", (Object)DisplayStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDisplayStyleForCurrentCellOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("DisplayStyleForCurrentCellOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayStyleForCurrentCellOnly(boolean DisplayStyleForCurrentCellOnly) throws Throwable {
        try {
            classInstance.Set("DisplayStyleForCurrentCellOnly", DisplayStyleForCurrentCellOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDropDownWidth() throws Throwable {
        try {
            return (int)classInstance.Get("DropDownWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDropDownWidth(int DropDownWidth) throws Throwable {
        try {
            classInstance.Set("DropDownWidth", DropDownWidth);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getEditType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EditType");
            return new NetType(val);
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

    public NetType getFormattedValueType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FormattedValueType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxDropDownItems() throws Throwable {
        try {
            return (int)classInstance.Get("MaxDropDownItems");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxDropDownItems(int MaxDropDownItems) throws Throwable {
        try {
            classInstance.Set("MaxDropDownItems", MaxDropDownItems);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSorted() throws Throwable {
        try {
            return (boolean)classInstance.Get("Sorted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSorted(boolean Sorted) throws Throwable {
        try {
            classInstance.Set("Sorted", Sorted);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getValueMember() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ValueMember");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValueMember(java.lang.String ValueMember) throws Throwable {
        try {
            classInstance.Set("ValueMember", (Object)ValueMember);
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

    public AccessibleObject getAccessibilityObject() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AccessibilityObject");
            return new AccessibleObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getColumnIndex() throws Throwable {
        try {
            return (int)classInstance.Get("ColumnIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getContentBounds() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContentBounds");
            return new Rectangle(val);
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

    public NetObject getDefaultNewRowValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultNewRowValue");
            return new NetObject(val);
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

    public NetObject getEditedFormattedValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EditedFormattedValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getErrorIconBounds() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ErrorIconBounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ErrorText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorText(java.lang.String ErrorText) throws Throwable {
        try {
            classInstance.Set("ErrorText", (Object)ErrorText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getFormattedValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FormattedValue");
            return new NetObject(val);
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

    public boolean getHasStyle() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasStyle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewElementStates getInheritedState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InheritedState");
            return new DataGridViewElementStates(val);
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

    public boolean getIsInEditMode() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsInEditMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewColumn getOwningColumn() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OwningColumn");
            return new DataGridViewColumn(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOwningColumn(DataGridViewColumn OwningColumn) throws Throwable {
        try {
            classInstance.Set("OwningColumn", (Object)OwningColumn.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewRow getOwningRow() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OwningRow");
            return new DataGridViewRow(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOwningRow(DataGridViewRow OwningRow) throws Throwable {
        try {
            classInstance.Set("OwningRow", (Object)OwningRow.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getPreferredSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PreferredSize");
            return new Size(val);
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

    public boolean getResizable() throws Throwable {
        try {
            return (boolean)classInstance.Get("Resizable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getRowIndex() throws Throwable {
        try {
            return (int)classInstance.Get("RowIndex");
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

    public Size getSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Size");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewCellStyle getStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Style");
            return new DataGridViewCellStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStyle(DataGridViewCellStyle Style) throws Throwable {
        try {
            classInstance.Set("Style", (Object)Style.getJCOInstance());
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

    public NetObject getValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Value");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValue(NetObject Value) throws Throwable {
        try {
            classInstance.Set("Value", (Object)Value.getJCOInstance());
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
    
    
}