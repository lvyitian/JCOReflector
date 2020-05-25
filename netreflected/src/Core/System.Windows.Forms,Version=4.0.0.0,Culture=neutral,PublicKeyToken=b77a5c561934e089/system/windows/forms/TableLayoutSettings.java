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
import system.windows.forms.TableLayoutPanelCellPosition;
import system.windows.forms.layout.LayoutEngine;
import system.windows.forms.TableLayoutRowStyleCollection;
import system.windows.forms.TableLayoutColumnStyleCollection;
import system.windows.forms.TableLayoutPanelGrowStyle;


/**
 * The base .NET class managing System.Windows.Forms.TableLayoutSettings, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TableLayoutSettings extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.TableLayoutSettings";
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

    public TableLayoutSettings(Object instance) throws Throwable {
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

    public static TableLayoutSettings castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TableLayoutSettings(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public int GetColumnSpan(NetObject control) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (int)classInstance.Invoke("GetColumnSpan", (Object)control.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetColumnSpan(NetObject control, int value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("SetColumnSpan", (Object)control.getJCOInstance(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetRowSpan(NetObject control) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (int)classInstance.Invoke("GetRowSpan", (Object)control.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetRowSpan(NetObject control, int value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("SetRowSpan", (Object)control.getJCOInstance(), value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetRow(NetObject control) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (int)classInstance.Invoke("GetRow", (Object)control.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetRow(NetObject control, int row) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("SetRow", (Object)control.getJCOInstance(), row);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TableLayoutPanelCellPosition GetCellPosition(NetObject control) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            JCObject objGetCellPosition = (JCObject)classInstance.Invoke("GetCellPosition", (Object)control.getJCOInstance());
            return new TableLayoutPanelCellPosition(objGetCellPosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetColumn(NetObject control) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (int)classInstance.Invoke("GetColumn", (Object)control.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCellPosition(NetObject control, TableLayoutPanelCellPosition cellPosition) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("SetCellPosition", (Object)control.getJCOInstance(), (Object)cellPosition.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetColumn(NetObject control, int column) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("SetColumn", (Object)control.getJCOInstance(), column);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public LayoutEngine getLayoutEngine() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LayoutEngine");
            return new LayoutEngine(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getColumnCount() throws Throwable {
        try {
            return (int)classInstance.Get("ColumnCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setColumnCount(int ColumnCount) throws Throwable {
        try {
            classInstance.Set("ColumnCount", ColumnCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getRowCount() throws Throwable {
        try {
            return (int)classInstance.Get("RowCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRowCount(int RowCount) throws Throwable {
        try {
            classInstance.Set("RowCount", RowCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TableLayoutRowStyleCollection getRowStyles() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RowStyles");
            return new TableLayoutRowStyleCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TableLayoutColumnStyleCollection getColumnStyles() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ColumnStyles");
            return new TableLayoutColumnStyleCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TableLayoutPanelGrowStyle getGrowStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("GrowStyle");
            return new TableLayoutPanelGrowStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGrowStyle(TableLayoutPanelGrowStyle GrowStyle) throws Throwable {
        try {
            classInstance.Set("GrowStyle", (Object)GrowStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}