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

package system.windows.data;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.SortDescriptionCollection;
import system.windows.data.GroupDescriptionSelectorCallback;
import system.componentmodel.NewItemPlaceholderPosition;
import system.globalization.CultureInfo;
import system.windows.threading.Dispatcher;
import system.componentmodel.CurrentChangingEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Data.BindingListCollectionView, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class BindingListCollectionView extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Data.BindingListCollectionView";
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

    public BindingListCollectionView(Object instance) throws Throwable {
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

    public static BindingListCollectionView castFrom(IJCOBridgeReflected from) throws Throwable {
        return new BindingListCollectionView(from.getJCOInstance());
    }

    // Constructors section
    
    

    
    // Methods section
    
    
    public boolean PassesFilter(NetObject item) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException {
        try {
            return (boolean)classInstance.Invoke("PassesFilter", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(NetObject item) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToPosition(int position) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToPosition", position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(NetObject item) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (int)classInstance.Invoke("IndexOf", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetItemAt(int index) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetItemAt = (JCObject)classInstance.Invoke("GetItemAt", index);
            return new NetObject(objGetItemAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EditItem(NetObject item) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("EditItem", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DetachFromSourceCollection() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotImplementedException, system.OverflowException {
        try {
            classInstance.Invoke("DetachFromSourceCollection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject AddNew() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objAddNew = (JCObject)classInstance.Invoke("AddNew");
            return new NetObject(objAddNew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CommitNew() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OverflowException, system.NotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("CommitNew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelNew() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OverflowException, system.NotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("CancelNew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAt(int index) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.security.SecurityException, system.io.IOException, system.OverflowException, system.NotSupportedException {
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(NetObject item) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OverflowException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classInstance.Invoke("Remove", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CommitEdit() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OverflowException, system.NotSupportedException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("CommitEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelEdit() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("CancelEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToFirst() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToFirst");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToLast() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToLast");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToNext() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToNext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentToPrevious() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("MoveCurrentToPrevious");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MoveCurrentTo(NetObject item) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("MoveCurrentTo", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Refresh() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Refresh");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckAccess() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CheckAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VerifyAccess() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("VerifyAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public SortDescriptionCollection getSortDescriptions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SortDescriptions");
            return new SortDescriptionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanSort() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanSort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanFilter() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanFilter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCustomFilter() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CustomFilter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCustomFilter(java.lang.String CustomFilter) throws Throwable {
        try {
            classInstance.Set("CustomFilter", (Object)CustomFilter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanCustomFilter() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanCustomFilter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanGroup() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanGroup");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GroupDescriptionSelectorCallback getGroupBySelector() throws Throwable {
        try {
            return (GroupDescriptionSelectorCallback)classInstance.Get("GroupBySelector");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGroupBySelector(GroupDescriptionSelectorCallback GroupBySelector) throws Throwable {
        try {
            classInstance.Set("GroupBySelector", GroupBySelector);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
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

    public boolean getIsDataInGroupOrder() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDataInGroupOrder");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsDataInGroupOrder(boolean IsDataInGroupOrder) throws Throwable {
        try {
            classInstance.Set("IsDataInGroupOrder", IsDataInGroupOrder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NewItemPlaceholderPosition getNewItemPlaceholderPosition() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NewItemPlaceholderPosition");
            return new NewItemPlaceholderPosition(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNewItemPlaceholderPosition(NewItemPlaceholderPosition NewItemPlaceholderPosition) throws Throwable {
        try {
            classInstance.Set("NewItemPlaceholderPosition", (Object)NewItemPlaceholderPosition.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanAddNew() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanAddNew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsAddingNew() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsAddingNew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getCurrentAddItem() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentAddItem");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRemove() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRemove");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanCancelEdit() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanCancelEdit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEditingItem() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsEditingItem");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getCurrentEditItem() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentEditItem");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanChangeLiveSorting() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanChangeLiveSorting");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanChangeLiveFiltering() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanChangeLiveFiltering");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanChangeLiveGrouping() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanChangeLiveGrouping");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CultureInfo getCulture() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Culture");
            return new CultureInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCulture(CultureInfo Culture) throws Throwable {
        try {
            classInstance.Set("Culture", (Object)Culture.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getCurrentItem() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentItem");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCurrentPosition() throws Throwable {
        try {
            return (int)classInstance.Get("CurrentPosition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCurrentAfterLast() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsCurrentAfterLast");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCurrentBeforeFirst() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsCurrentBeforeFirst");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNeedsRefresh() throws Throwable {
        try {
            return (boolean)classInstance.Get("NeedsRefresh");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInUse() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsInUse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Dispatcher getDispatcher() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Dispatcher");
            return new Dispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addCurrentChanging(CurrentChangingEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("CurrentChanging", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentChanging(CurrentChangingEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("CurrentChanging", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCurrentChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("CurrentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("CurrentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}