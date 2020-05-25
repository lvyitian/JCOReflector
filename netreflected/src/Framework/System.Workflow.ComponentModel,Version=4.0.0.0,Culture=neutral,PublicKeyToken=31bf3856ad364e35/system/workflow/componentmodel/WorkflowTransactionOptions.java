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

package system.workflow.componentmodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.DependencyProperty;
import system.workflow.componentmodel.ActivityBind;
import system.workflow.componentmodel.DependencyObject;
import system.TimeSpan;
import system.transactions.IsolationLevel;


/**
 * The base .NET class managing System.Workflow.ComponentModel.WorkflowTransactionOptions, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WorkflowTransactionOptions extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.ComponentModel";
    public static final String className = "System.Workflow.ComponentModel.WorkflowTransactionOptions";
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

    public WorkflowTransactionOptions(Object instance) throws Throwable {
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

    public static WorkflowTransactionOptions castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WorkflowTransactionOptions(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WorkflowTransactionOptions() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
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
    
    
    public TimeSpan getTimeoutDuration() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TimeoutDuration");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeoutDuration(TimeSpan TimeoutDuration) throws Throwable {
        try {
            classInstance.Set("TimeoutDuration", (Object)TimeoutDuration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IsolationLevel getIsolationLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IsolationLevel");
            return new IsolationLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsolationLevel(IsolationLevel IsolationLevel) throws Throwable {
        try {
            classInstance.Set("IsolationLevel", (Object)IsolationLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}