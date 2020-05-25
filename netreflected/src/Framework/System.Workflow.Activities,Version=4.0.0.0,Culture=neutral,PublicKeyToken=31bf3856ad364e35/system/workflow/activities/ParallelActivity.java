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

package system.workflow.activities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.DependencyProperty;
import system.workflow.componentmodel.Activity;
import system.io.Stream;
import system.workflow.componentmodel.ActivityBind;
import system.workflow.componentmodel.DependencyObject;
import system.workflow.componentmodel.ActivityCollection;
import system.workflow.componentmodel.CompositeActivity;
import system.workflow.componentmodel.ActivityExecutionStatus;
import system.workflow.componentmodel.ActivityExecutionResult;


/**
 * The base .NET class managing System.Workflow.Activities.ParallelActivity, System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ParallelActivity extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.Activities";
    public static final String className = "System.Workflow.Activities.ParallelActivity";
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

    public ParallelActivity(Object instance) throws Throwable {
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

    public static ParallelActivity castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ParallelActivity(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ParallelActivity() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.NotImplementedException, system.RankException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParallelActivity(java.lang.String name) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.NotImplementedException, system.RankException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public Activity GetActivityByName(java.lang.String activityQualifiedName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException {
        try {
            JCObject objGetActivityByName = (JCObject)classInstance.Invoke("GetActivityByName", (Object)activityQualifiedName);
            return new Activity(objGetActivityByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Activity GetActivityByName(java.lang.String activityQualifiedName, boolean withinThisActivityOnly) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetActivityByName = (JCObject)classInstance.Invoke("GetActivityByName", (Object)activityQualifiedName, withinThisActivityOnly);
            return new Activity(objGetActivityByName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Activity Clone() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MulticastNotSupportedException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new Activity(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidCastException {
        try {
            classInstance.Invoke("Save", (Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetBinding(DependencyProperty dependencyProperty, ActivityBind bind) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("SetBinding", (Object)dependencyProperty.getJCOInstance(), (Object)bind.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityBind GetBinding(DependencyProperty dependencyProperty) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objGetBinding = (JCObject)classInstance.Invoke("GetBinding", (Object)dependencyProperty.getJCOInstance());
            return new ActivityBind(objGetBinding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(DependencyProperty dependencyProperty) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidCastException, system.IndexOutOfRangeException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)dependencyProperty.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValueBase(DependencyProperty dependencyProperty) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.InvalidCastException, system.IndexOutOfRangeException, system.NotImplementedException {
        try {
            JCObject objGetValueBase = (JCObject)classInstance.Invoke("GetValueBase", (Object)dependencyProperty.getJCOInstance());
            return new NetObject(objGetValueBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValueBase(DependencyProperty dependencyProperty, NetObject value) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidCastException {
        try {
            classInstance.Invoke("SetValueBase", (Object)dependencyProperty.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(DependencyProperty dependencyProperty, NetObject value) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidCastException {
        try {
            classInstance.Invoke("SetValue", (Object)dependencyProperty.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean RemoveProperty(DependencyProperty dependencyProperty) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (boolean)classInstance.Invoke("RemoveProperty", (Object)dependencyProperty.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddHandler(DependencyProperty dependencyEvent, NetObject value) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddHandler", (Object)dependencyEvent.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveHandler(DependencyProperty dependencyEvent, NetObject value) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.RankException {
        try {
            classInstance.Invoke("RemoveHandler", (Object)dependencyEvent.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsBindingSet(DependencyProperty dependencyProperty) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            return (boolean)classInstance.Invoke("IsBindingSet", (Object)dependencyProperty.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MetaEquals(DependencyObject dependencyObject) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("MetaEquals", (Object)dependencyObject.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public ActivityCollection getActivities() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Activities");
            return new ActivityCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompositeActivity getParent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new CompositeActivity(val);
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

    public boolean getEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("Enabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnabled(boolean Enabled) throws Throwable {
        try {
            classInstance.Set("Enabled", Enabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getQualifiedName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("QualifiedName");
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

    public ActivityExecutionStatus getExecutionStatus() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ExecutionStatus");
            return new ActivityExecutionStatus(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityExecutionResult getExecutionResult() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ExecutionResult");
            return new ActivityExecutionResult(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDynamicActivity() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDynamicActivity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    

}