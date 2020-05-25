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

package system.data;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.DataView;
import system.data.DataRelation;
import system.data.DataRowVersion;
import system.data.DataRow;
import system.componentmodel.PropertyChangedEventHandler;


/**
 * The base .NET class managing System.Data.DataRowView, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DataRowView extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.DataRowView";
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

    public DataRowView(Object instance) throws Throwable {
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

    public static DataRowView castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataRowView(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public DataView CreateChildView(DataRelation relation, boolean followParent) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            JCObject objCreateChildView = (JCObject)classInstance.Invoke("CreateChildView", (Object)relation.getJCOInstance(), followParent);
            return new DataView(objCreateChildView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataView CreateChildView(DataRelation relation) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException {
        try {
            JCObject objCreateChildView = (JCObject)classInstance.Invoke("CreateChildView", (Object)relation.getJCOInstance());
            return new DataView(objCreateChildView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataView CreateChildView(java.lang.String relationName, boolean followParent) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.MulticastNotSupportedException, system.NotSupportedException {
        try {
            JCObject objCreateChildView = (JCObject)classInstance.Invoke("CreateChildView", (Object)relationName, followParent);
            return new DataView(objCreateChildView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataView CreateChildView(java.lang.String relationName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            JCObject objCreateChildView = (JCObject)classInstance.Invoke("CreateChildView", (Object)relationName);
            return new DataView(objCreateChildView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginEdit() throws Throwable {
        try {
            classInstance.Invoke("BeginEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelEdit() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("CancelEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndEdit() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("EndEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public DataView getDataView() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DataView");
            return new DataView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRowVersion getRowVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RowVersion");
            return new DataRowVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRow getRow() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Row");
            return new DataRow(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNew() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsNew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEdit() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addPropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}