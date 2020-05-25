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

package system.windows;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.resources.StreamResourceInfo;
import system.Uri;
import system.windows.Window;
import system.windows.WindowCollection;
import system.windows.ShutdownMode;
import system.windows.ResourceDictionary;
import system.windows.threading.Dispatcher;
import system.windows.Application;
import system.reflection.Assembly;
import system.windows.StartupEventHandler;
import system.windows.ExitEventHandler;
import system.EventHandler;
import system.windows.SessionEndingCancelEventHandler;
import system.windows.threading.DispatcherUnhandledExceptionEventHandler;
import system.windows.navigation.NavigatingCancelEventHandler;
import system.windows.navigation.NavigatedEventHandler;
import system.windows.navigation.NavigationProgressEventHandler;
import system.windows.navigation.NavigationFailedEventHandler;
import system.windows.navigation.LoadCompletedEventHandler;
import system.windows.navigation.NavigationStoppedEventHandler;
import system.windows.navigation.FragmentNavigationEventHandler;


/**
 * The base .NET class managing System.Windows.Application, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class Application extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Application";
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

    public Application(Object instance) throws Throwable {
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

    public static Application castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Application(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Application() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.OutOfMemoryException, system.OverflowException, system.TimeoutException, system.security.SecurityException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.NotSupportedException, system.MulticastNotSupportedException, system.UriFormatException, system.ObjectDisposedException, system.io.IOException, system.collections.generic.KeyNotFoundException, system.NotImplementedException, system.reflection.AmbiguousMatchException, system.xaml.XamlException, system.windows.markup.XamlParseException, system.SystemException, system.net.WebException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Shutdown() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.RankException, system.componentmodel.Win32Exception, system.security.SecurityException, system.OverflowException, system.TimeoutException {
        try {
            classInstance.Invoke("Shutdown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Shutdown(int exitCode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.diagnostics.tracing.EventSourceException, system.OutOfMemoryException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.security.SecurityException, system.OverflowException, system.TimeoutException {
        try {
            classInstance.Invoke("Shutdown", exitCode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject FindResource(NetObject resourceKey) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.xaml.XamlParseException, system.collections.generic.KeyNotFoundException, system.xaml.XamlException, system.NotImplementedException, system.security.SecurityException, system.windows.markup.XamlParseException, system.MulticastNotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException, system.net.WebException, system.InvalidCastException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.FormatException, system.windows.ResourceReferenceKeyNotFoundException {
        try {
            JCObject objFindResource = (JCObject)classInstance.Invoke("FindResource", (Object)resourceKey.getJCOInstance());
            return new NetObject(objFindResource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StreamResourceInfo GetContentStream(Uri uriContent) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.NotSupportedException, system.UriFormatException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.collections.generic.KeyNotFoundException {
        try {
            JCObject objGetContentStream = (JCObject)classType.Invoke("GetContentStream", (Object)uriContent.getJCOInstance());
            return new StreamResourceInfo(objGetContentStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StreamResourceInfo GetRemoteStream(Uri uriRemote) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.UriFormatException, system.OutOfMemoryException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.NotSupportedException, system.UnauthorizedAccessException, system.io.IOException, system.collections.generic.KeyNotFoundException {
        try {
            JCObject objGetRemoteStream = (JCObject)classType.Invoke("GetRemoteStream", (Object)uriRemote.getJCOInstance());
            return new StreamResourceInfo(objGetRemoteStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetCookie(Uri uri) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.componentmodel.Win32Exception {
        try {
            return (java.lang.String)classType.Invoke("GetCookie", (Object)uri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCookie(Uri uri, java.lang.String value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.componentmodel.Win32Exception {
        try {
            classType.Invoke("SetCookie", (Object)uri.getJCOInstance(), (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Run() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidCastException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.OutOfMemoryException, system.OverflowException, system.TimeoutException {
        try {
            return (int)classInstance.Invoke("Run");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Run(Window window) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.InvalidCastException, system.ArgumentOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.security.SecurityException, system.componentmodel.Win32Exception {
        try {
            return (int)classInstance.Invoke("Run", (Object)window.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject TryFindResource(NetObject resourceKey) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.xaml.XamlParseException, system.collections.generic.KeyNotFoundException, system.xaml.XamlException, system.NotImplementedException, system.security.SecurityException, system.windows.markup.XamlParseException, system.MulticastNotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException, system.net.WebException, system.InvalidCastException, system.reflection.AmbiguousMatchException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.FormatException {
        try {
            JCObject objTryFindResource = (JCObject)classInstance.Invoke("TryFindResource", (Object)resourceKey.getJCOInstance());
            return new NetObject(objTryFindResource);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LoadComponent(NetObject component, Uri resourceLocator) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.OverflowException, system.collections.generic.KeyNotFoundException, system.InvalidCastException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.threading.ThreadAbortException, system.io.EndOfStreamException, system.reflection.AmbiguousMatchException, system.xaml.XamlException, system.windows.markup.XamlParseException {
        try {
            classType.Invoke("LoadComponent", (Object)component.getJCOInstance(), (Object)resourceLocator.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject LoadComponent(Uri resourceLocator) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.UriFormatException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.security.SecurityException, system.NotSupportedException, system.UnauthorizedAccessException, system.io.IOException, system.collections.generic.KeyNotFoundException, system.InvalidCastException, system.configuration.ConfigurationErrorsException, system.threading.ThreadAbortException, system.reflection.AmbiguousMatchException, system.xaml.XamlException, system.windows.markup.XamlParseException, system.xml.XmlException, system.OverflowException {
        try {
            JCObject objLoadComponent = (JCObject)classType.Invoke("LoadComponent", (Object)resourceLocator.getJCOInstance());
            return new NetObject(objLoadComponent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StreamResourceInfo GetResourceStream(Uri uriResource) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.NotSupportedException, system.UriFormatException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.collections.generic.KeyNotFoundException {
        try {
            JCObject objGetResourceStream = (JCObject)classType.Invoke("GetResourceStream", (Object)uriResource.getJCOInstance());
            return new StreamResourceInfo(objGetResourceStream);
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
    
    
    public WindowCollection getWindows() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Windows");
            return new WindowCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Window getMainWindow() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MainWindow");
            return new Window(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMainWindow(Window MainWindow) throws Throwable {
        try {
            classInstance.Set("MainWindow", (Object)MainWindow.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ShutdownMode getShutdownMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ShutdownMode");
            return new ShutdownMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShutdownMode(ShutdownMode ShutdownMode) throws Throwable {
        try {
            classInstance.Set("ShutdownMode", (Object)ShutdownMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ResourceDictionary getResources() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Resources");
            return new ResourceDictionary(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResources(ResourceDictionary Resources) throws Throwable {
        try {
            classInstance.Set("Resources", (Object)Resources.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getStartupUri() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StartupUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStartupUri(Uri StartupUri) throws Throwable {
        try {
            classInstance.Set("StartupUri", (Object)StartupUri.getJCOInstance());
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

    public static Application getCurrent() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Current");
            return new Application(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Assembly getResourceAssembly() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ResourceAssembly");
            return new Assembly(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setResourceAssembly(Assembly ResourceAssembly) throws Throwable {
        try {
            classType.Set("ResourceAssembly", (Object)ResourceAssembly.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addStartup(StartupEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Startup", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeStartup(StartupEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Startup", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addExit(ExitEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Exit", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeExit(ExitEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Exit", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addActivated(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Activated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeActivated(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Activated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDeactivated(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Deactivated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDeactivated(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Deactivated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addSessionEnding(SessionEndingCancelEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("SessionEnding", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeSessionEnding(SessionEndingCancelEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("SessionEnding", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDispatcherUnhandledException(DispatcherUnhandledExceptionEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("DispatcherUnhandledException", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDispatcherUnhandledException(DispatcherUnhandledExceptionEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("DispatcherUnhandledException", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigating(NavigatingCancelEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Navigating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigating(NavigatingCancelEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Navigating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigated(NavigatedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Navigated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigated(NavigatedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Navigated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigationProgress(NavigationProgressEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("NavigationProgress", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigationProgress(NavigationProgressEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("NavigationProgress", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigationFailed(NavigationFailedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("NavigationFailed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigationFailed(NavigationFailedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("NavigationFailed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addLoadCompleted(LoadCompletedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("LoadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeLoadCompleted(LoadCompletedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("LoadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addNavigationStopped(NavigationStoppedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("NavigationStopped", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNavigationStopped(NavigationStoppedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("NavigationStopped", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addFragmentNavigation(FragmentNavigationEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("FragmentNavigation", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeFragmentNavigation(FragmentNavigationEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("FragmentNavigation", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}