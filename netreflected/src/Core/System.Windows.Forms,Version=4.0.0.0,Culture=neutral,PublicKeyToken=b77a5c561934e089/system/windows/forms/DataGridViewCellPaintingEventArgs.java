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
import system.windows.forms.DataGridView;
import system.drawing.Graphics;
import system.drawing.Rectangle;
import system.windows.forms.DataGridViewElementStates;
import system.windows.forms.DataGridViewCellStyle;
import system.windows.forms.DataGridViewAdvancedBorderStyle;
import system.windows.forms.DataGridViewPaintParts;


/**
 * The base .NET class managing System.Windows.Forms.DataGridViewCellPaintingEventArgs, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DataGridViewCellPaintingEventArgs extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.DataGridViewCellPaintingEventArgs";
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

    public DataGridViewCellPaintingEventArgs(Object instance) throws Throwable {
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

    public static DataGridViewCellPaintingEventArgs castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataGridViewCellPaintingEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataGridViewCellPaintingEventArgs(DataGridView dataGridView, Graphics graphics, Rectangle clipBounds, Rectangle cellBounds, int rowIndex, int columnIndex, DataGridViewElementStates cellState, NetObject value, NetObject formattedValue, java.lang.String errorText, DataGridViewCellStyle cellStyle, DataGridViewAdvancedBorderStyle advancedBorderStyle, DataGridViewPaintParts paintParts) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)dataGridView.getJCOInstance(), (Object)graphics.getJCOInstance(), (Object)clipBounds.getJCOInstance(), (Object)cellBounds.getJCOInstance(), rowIndex, columnIndex, (Object)cellState.getJCOInstance(), (Object)value.getJCOInstance(), (Object)formattedValue.getJCOInstance(), (Object)errorText, (Object)cellStyle.getJCOInstance(), (Object)advancedBorderStyle.getJCOInstance(), (Object)paintParts.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Paint(Rectangle clipBounds, DataGridViewPaintParts paintParts) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("Paint", (Object)clipBounds.getJCOInstance(), (Object)paintParts.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintBackground(Rectangle clipBounds, boolean cellsPaintSelectionBackground) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("PaintBackground", (Object)clipBounds.getJCOInstance(), cellsPaintSelectionBackground);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintContent(Rectangle clipBounds) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("PaintContent", (Object)clipBounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Graphics getGraphics() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Graphics");
            return new Graphics(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGraphics(Graphics Graphics) throws Throwable {
        try {
            classInstance.Set("Graphics", (Object)Graphics.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewAdvancedBorderStyle getAdvancedBorderStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AdvancedBorderStyle");
            return new DataGridViewAdvancedBorderStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAdvancedBorderStyle(DataGridViewAdvancedBorderStyle AdvancedBorderStyle) throws Throwable {
        try {
            classInstance.Set("AdvancedBorderStyle", (Object)AdvancedBorderStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getCellBounds() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CellBounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCellBounds(Rectangle CellBounds) throws Throwable {
        try {
            classInstance.Set("CellBounds", (Object)CellBounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rectangle getClipBounds() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClipBounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClipBounds(Rectangle ClipBounds) throws Throwable {
        try {
            classInstance.Set("ClipBounds", (Object)ClipBounds.getJCOInstance());
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

    public void setRowIndex(int RowIndex) throws Throwable {
        try {
            classInstance.Set("RowIndex", RowIndex);
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

    public void setColumnIndex(int ColumnIndex) throws Throwable {
        try {
            classInstance.Set("ColumnIndex", ColumnIndex);
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

    public NetObject getFormattedValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FormattedValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFormattedValue(NetObject FormattedValue) throws Throwable {
        try {
            classInstance.Set("FormattedValue", (Object)FormattedValue.getJCOInstance());
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

    public DataGridViewCellStyle getCellStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CellStyle");
            return new DataGridViewCellStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCellStyle(DataGridViewCellStyle CellStyle) throws Throwable {
        try {
            classInstance.Set("CellStyle", (Object)CellStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataGridViewPaintParts getPaintParts() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PaintParts");
            return new DataGridViewPaintParts(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPaintParts(DataGridViewPaintParts PaintParts) throws Throwable {
        try {
            classInstance.Set("PaintParts", (Object)PaintParts.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHandled() throws Throwable {
        try {
            return (boolean)classInstance.Get("Handled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHandled(boolean Handled) throws Throwable {
        try {
            classInstance.Set("Handled", Handled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}