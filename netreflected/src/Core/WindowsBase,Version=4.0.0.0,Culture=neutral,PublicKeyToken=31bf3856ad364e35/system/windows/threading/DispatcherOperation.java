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

package system.windows.threading;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.threading.DispatcherOperationStatus;
import system.TimeSpan;
import system.runtime.compilerservices.TaskAwaiter;
import system.windows.threading.Dispatcher;
import system.windows.threading.DispatcherPriority;
import system.threading.tasks.Task;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Threading.DispatcherOperation, WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class DispatcherOperation extends NetObject  {
    public static final String assemblyFullName = "WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "WindowsBase";
    public static final String className = "System.Windows.Threading.DispatcherOperation";
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

    public DispatcherOperation(Object instance) throws Throwable {
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

    public static DispatcherOperation castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DispatcherOperation(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public DispatcherOperationStatus Wait() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.security.SecurityException, system.NullReferenceException, system.threading.WaitHandleCannotBeOpenedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException, system.threading.tasks.TaskSchedulerException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        try {
            JCObject objWait = (JCObject)classInstance.Invoke("Wait");
            return new DispatcherOperationStatus(objWait);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Abort() throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.InvalidCastException {
        try {
            return (boolean)classInstance.Invoke("Abort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherOperationStatus Wait(TimeSpan timeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.NotSupportedException, system.MulticastNotSupportedException, system.PlatformNotSupportedException, system.security.SecurityException, system.io.IOException, system.IndexOutOfRangeException, system.NullReferenceException, system.threading.WaitHandleCannotBeOpenedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException, system.threading.tasks.TaskSchedulerException, system.OperationCanceledException, system.threading.tasks.TaskCanceledException, system.AggregateException {
        try {
            JCObject objWait = (JCObject)classInstance.Invoke("Wait", (Object)timeout.getJCOInstance());
            return new DispatcherOperationStatus(objWait);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TaskAwaiter GetAwaiter() throws Throwable {
        try {
            JCObject objGetAwaiter = (JCObject)classInstance.Invoke("GetAwaiter");
            return new TaskAwaiter(objGetAwaiter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Dispatcher getDispatcher() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Dispatcher");
            return new Dispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherPriority getPriority() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Priority");
            return new DispatcherPriority(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPriority(DispatcherPriority Priority) throws Throwable {
        try {
            classInstance.Set("Priority", (Object)Priority.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherOperationStatus getStatus() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Status");
            return new DispatcherOperationStatus(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task getTask() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Task");
            return new Task(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getResult() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Result");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addAborted(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Aborted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAborted(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Aborted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Completed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Completed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}