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

package system.diagnostics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.configuration.install.ComponentInstaller;
import system.runtime.remoting.ObjRef;
import system.diagnostics.PerformanceCounterCategoryType;
import system.diagnostics.CounterCreationDataCollection;
import system.configuration.install.UninstallAction;
import system.configuration.install.InstallContext;
import system.configuration.install.InstallerCollection;
import system.configuration.install.Installer;
import system.configuration.install.InstallEventHandler;
import system.EventHandler;


/**
 * The base .NET class managing System.Diagnostics.PerformanceCounterInstaller, System.Configuration.Install, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class PerformanceCounterInstaller extends NetObject  {
    public static final String assemblyFullName = "System.Configuration.Install, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Configuration.Install";
    public static final String className = "System.Diagnostics.PerformanceCounterInstaller";
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

    public PerformanceCounterInstaller(Object instance) throws Throwable {
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

    public static PerformanceCounterInstaller castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PerformanceCounterInstaller(from.getJCOInstance());
    }

    // Constructors section
    
    
    public PerformanceCounterInstaller() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean IsEquivalentInstaller(ComponentInstaller otherInstaller) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsEquivalentInstaller", (Object)otherInstaller.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", (Object)requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getCategoryName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CategoryName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCategoryName(java.lang.String CategoryName) throws Throwable {
        try {
            classInstance.Set("CategoryName", (Object)CategoryName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCategoryHelp() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CategoryHelp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCategoryHelp(java.lang.String CategoryHelp) throws Throwable {
        try {
            classInstance.Set("CategoryHelp", (Object)CategoryHelp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PerformanceCounterCategoryType getCategoryType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CategoryType");
            return new PerformanceCounterCategoryType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCategoryType(PerformanceCounterCategoryType CategoryType) throws Throwable {
        try {
            classInstance.Set("CategoryType", (Object)CategoryType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CounterCreationDataCollection getCounters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Counters");
            return new CounterCreationDataCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UninstallAction getUninstallAction() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UninstallAction");
            return new UninstallAction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUninstallAction(UninstallAction UninstallAction) throws Throwable {
        try {
            classInstance.Set("UninstallAction", (Object)UninstallAction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InstallContext getContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Context");
            return new InstallContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContext(InstallContext Context) throws Throwable {
        try {
            classInstance.Set("Context", (Object)Context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHelpText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HelpText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InstallerCollection getInstallers() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Installers");
            return new InstallerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Installer getParent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new Installer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setParent(Installer Parent) throws Throwable {
        try {
            classInstance.Set("Parent", (Object)Parent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addCommitted(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Committed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCommitted(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Committed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAfterInstall(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AfterInstall", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAfterInstall(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AfterInstall", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAfterRollback(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AfterRollback", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAfterRollback(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AfterRollback", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAfterUninstall(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AfterUninstall", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAfterUninstall(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AfterUninstall", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCommitting(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Committing", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCommitting(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Committing", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addBeforeInstall(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("BeforeInstall", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBeforeInstall(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("BeforeInstall", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addBeforeRollback(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("BeforeRollback", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBeforeRollback(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("BeforeRollback", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addBeforeUninstall(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("BeforeUninstall", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeBeforeUninstall(InstallEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("BeforeUninstall", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}