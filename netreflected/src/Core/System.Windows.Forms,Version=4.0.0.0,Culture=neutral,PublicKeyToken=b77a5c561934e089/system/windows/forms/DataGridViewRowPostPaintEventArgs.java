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
import system.windows.forms.DataGridViewPaintParts;


/**
 * The base .NET class managing System.Windows.Forms.DataGridViewRowPostPaintEventArgs, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DataGridViewRowPostPaintEventArgs extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.DataGridViewRowPostPaintEventArgs";
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

    public DataGridViewRowPostPaintEventArgs(Object instance) throws Throwable {
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

    public static DataGridViewRowPostPaintEventArgs castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataGridViewRowPostPaintEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataGridViewRowPostPaintEventArgs(DataGridView dataGridView, Graphics graphics, Rectangle clipBounds, Rectangle rowBounds, int rowIndex, DataGridViewElementStates rowState, java.lang.String errorText, DataGridViewCellStyle inheritedRowStyle, boolean isFirstDisplayedRow, boolean isLastVisibleRow) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)dataGridView.getJCOInstance(), (Object)graphics.getJCOInstance(), (Object)clipBounds.getJCOInstance(), (Object)rowBounds.getJCOInstance(), rowIndex, (Object)rowState.getJCOInstance(), (Object)errorText, (Object)inheritedRowStyle.getJCOInstance(), isFirstDisplayedRow, isLastVisibleRow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void DrawFocus(Rectangle bounds, boolean cellsPaintSelectionBackground) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("DrawFocus", (Object)bounds.getJCOInstance(), cellsPaintSelectionBackground);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintCells(Rectangle clipBounds, DataGridViewPaintParts paintParts) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidCastException {
        try {
            classInstance.Invoke("PaintCells", (Object)clipBounds.getJCOInstance(), (Object)paintParts.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintCellsBackground(Rectangle clipBounds, boolean cellsPaintSelectionBackground) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidCastException {
        try {
            classInstance.Invoke("PaintCellsBackground", (Object)clipBounds.getJCOInstance(), cellsPaintSelectionBackground);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintCellsContent(Rectangle clipBounds) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidCastException {
        try {
            classInstance.Invoke("PaintCellsContent", (Object)clipBounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintHeader(boolean paintSelectionBackground) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidCastException {
        try {
            classInstance.Invoke("PaintHeader", paintSelectionBackground);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PaintHeader(DataGridViewPaintParts paintParts) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.componentmodel.Win32Exception, system.InvalidCastException {
        try {
            classInstance.Invoke("PaintHeader", (Object)paintParts.getJCOInstance());
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

    public Rectangle getRowBounds() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RowBounds");
            return new Rectangle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRowBounds(Rectangle RowBounds) throws Throwable {
        try {
            classInstance.Set("RowBounds", (Object)RowBounds.getJCOInstance());
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

    public DataGridViewCellStyle getInheritedRowStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InheritedRowStyle");
            return new DataGridViewCellStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInheritedRowStyle(DataGridViewCellStyle InheritedRowStyle) throws Throwable {
        try {
            classInstance.Set("InheritedRowStyle", (Object)InheritedRowStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFirstDisplayedRow() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFirstDisplayedRow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsFirstDisplayedRow(boolean IsFirstDisplayedRow) throws Throwable {
        try {
            classInstance.Set("IsFirstDisplayedRow", IsFirstDisplayedRow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsLastVisibleRow() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsLastVisibleRow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsLastVisibleRow(boolean IsLastVisibleRow) throws Throwable {
        try {
            classInstance.Set("IsLastVisibleRow", IsLastVisibleRow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}