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

package system.windows.media.imaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.imaging.BitmapMetadata;
import system.windows.Freezable;
import system.windows.DependencyProperty;
import system.windows.DependencyPropertyKey;
import system.windows.LocalValueEnumerator;
import system.windows.DependencyObjectType;
import system.windows.threading.Dispatcher;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Media.Imaging.BitmapMetadata, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class BitmapMetadata extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.Imaging.BitmapMetadata";
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

    public BitmapMetadata(Object instance) throws Throwable {
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

    public static BitmapMetadata castFrom(IJCOBridgeReflected from) throws Throwable {
        return new BitmapMetadata(from.getJCOInstance());
    }

    // Constructors section
    
    
    public BitmapMetadata(java.lang.String containerFormat) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)containerFormat);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public BitmapMetadata Clone() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.io.IOException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new BitmapMetadata(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetQuery(java.lang.String query, NetObject value) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.AccessViolationException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException {
        try {
            classInstance.Invoke("SetQuery", (Object)query, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetQuery(java.lang.String query) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.AccessViolationException, system.NotImplementedException, system.NotSupportedException {
        try {
            JCObject objGetQuery = (JCObject)classInstance.Invoke("GetQuery", (Object)query);
            return new NetObject(objGetQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveQuery(java.lang.String query) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("RemoveQuery", (Object)query);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsQuery(java.lang.String query) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("ContainsQuery", (Object)query);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Freezable CloneCurrentValue() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException {
        try {
            JCObject objCloneCurrentValue = (JCObject)classInstance.Invoke("CloneCurrentValue");
            return new Freezable(objCloneCurrentValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Freezable GetAsFrozen() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetAsFrozen = (JCObject)classInstance.Invoke("GetAsFrozen");
            return new Freezable(objGetAsFrozen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Freezable GetCurrentValueAsFrozen() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetCurrentValueAsFrozen = (JCObject)classInstance.Invoke("GetCurrentValueAsFrozen");
            return new Freezable(objGetCurrentValueAsFrozen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Freeze() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Freeze");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.io.IOException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)dp.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(DependencyProperty dp, NetObject value) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetValue", (Object)dp.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCurrentValue(DependencyProperty dp, NetObject value) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetCurrentValue", (Object)dp.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(DependencyPropertyKey key, NetObject value) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetValue", (Object)key.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("ClearValue", (Object)dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearValue(DependencyPropertyKey key) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("ClearValue", (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CoerceValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("CoerceValue", (Object)dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InvalidateProperty(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("InvalidateProperty", (Object)dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ReadLocalValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objReadLocalValue = (JCObject)classInstance.Invoke("ReadLocalValue", (Object)dp.getJCOInstance());
            return new NetObject(objReadLocalValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalValueEnumerator GetLocalValueEnumerator() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objGetLocalValueEnumerator = (JCObject)classInstance.Invoke("GetLocalValueEnumerator");
            return new LocalValueEnumerator(objGetLocalValueEnumerator);
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
    
    
    public java.lang.String getFormat() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Format");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLocation() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Location");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFixedSize() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFixedSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTitle() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Title");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTitle(java.lang.String Title) throws Throwable {
        try {
            classInstance.Set("Title", (Object)Title);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getRating() throws Throwable {
        try {
            return (int)classInstance.Get("Rating");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRating(int Rating) throws Throwable {
        try {
            classInstance.Set("Rating", Rating);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSubject() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Subject");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSubject(java.lang.String Subject) throws Throwable {
        try {
            classInstance.Set("Subject", (Object)Subject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getComment() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Comment");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setComment(java.lang.String Comment) throws Throwable {
        try {
            classInstance.Set("Comment", (Object)Comment);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDateTaken() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DateTaken");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDateTaken(java.lang.String DateTaken) throws Throwable {
        try {
            classInstance.Set("DateTaken", (Object)DateTaken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplicationName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ApplicationName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplicationName(java.lang.String ApplicationName) throws Throwable {
        try {
            classInstance.Set("ApplicationName", (Object)ApplicationName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCopyright() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Copyright");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCopyright(java.lang.String Copyright) throws Throwable {
        try {
            classInstance.Set("Copyright", (Object)Copyright);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCameraManufacturer() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CameraManufacturer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCameraManufacturer(java.lang.String CameraManufacturer) throws Throwable {
        try {
            classInstance.Set("CameraManufacturer", (Object)CameraManufacturer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCameraModel() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CameraModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCameraModel(java.lang.String CameraModel) throws Throwable {
        try {
            classInstance.Set("CameraModel", (Object)CameraModel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanFreeze() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanFreeze");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFrozen() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFrozen");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObjectType getDependencyObjectType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DependencyObjectType");
            return new DependencyObjectType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSealed() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSealed");
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
    
    
    public void addChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Changed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Changed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}