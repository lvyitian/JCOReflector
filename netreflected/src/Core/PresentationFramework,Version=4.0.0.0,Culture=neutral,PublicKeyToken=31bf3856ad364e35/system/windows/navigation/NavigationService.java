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

package system.windows.navigation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.navigation.NavigationService;
import system.windows.DependencyObject;
import system.windows.navigation.CustomContentState;
import system.windows.navigation.JournalEntry;
import system.Uri;
import system.windows.navigation.NavigationFailedEventHandler;
import system.windows.navigation.NavigatingCancelEventHandler;
import system.windows.navigation.NavigatedEventHandler;
import system.windows.navigation.NavigationProgressEventHandler;
import system.windows.navigation.LoadCompletedEventHandler;
import system.windows.navigation.FragmentNavigationEventHandler;
import system.windows.navigation.NavigationStoppedEventHandler;


/**
 * The base .NET class managing System.Windows.Navigation.NavigationService, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class NavigationService extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Navigation.NavigationService";
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

    public NavigationService(Object instance) throws Throwable {
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

    public static NavigationService castFrom(IJCOBridgeReflected from) throws Throwable {
        return new NavigationService(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static NavigationService GetNavigationService(DependencyObject dependencyObject) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            JCObject objGetNavigationService = (JCObject)classType.Invoke("GetNavigationService", (Object)dependencyObject.getJCOInstance());
            return new NavigationService(objGetNavigationService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddBackEntry(CustomContentState state) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.security.SecurityException, system.io.IOException, system.SystemException, system.NotSupportedException, system.IndexOutOfRangeException, system.UriFormatException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("AddBackEntry", (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JournalEntry RemoveBackEntry() throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException, system.FormatException {
        try {
            JCObject objRemoveBackEntry = (JCObject)classInstance.Invoke("RemoveBackEntry");
            return new JournalEntry(objRemoveBackEntry);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Navigate(Uri source) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidCastException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.net.WebException, system.componentmodel.Win32Exception, system.net.CookieException, system.RankException, system.SystemException, system.UriFormatException, system.MulticastNotSupportedException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        try {
            return (boolean)classInstance.Invoke("Navigate", (Object)source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Navigate(NetObject root) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidCastException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.UriFormatException, system.RankException, system.SystemException, system.MulticastNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        try {
            return (boolean)classInstance.Invoke("Navigate", (Object)root.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Navigate(Uri source, NetObject navigationState) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidCastException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.net.WebException, system.componentmodel.Win32Exception, system.net.CookieException, system.RankException, system.SystemException, system.UriFormatException, system.MulticastNotSupportedException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        try {
            return (boolean)classInstance.Invoke("Navigate", (Object)source.getJCOInstance(), (Object)navigationState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Navigate(Uri source, NetObject navigationState, boolean sandboxExternalContent) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidCastException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.net.WebException, system.componentmodel.Win32Exception, system.net.CookieException, system.RankException, system.SystemException, system.UriFormatException, system.MulticastNotSupportedException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        try {
            return (boolean)classInstance.Invoke("Navigate", (Object)source.getJCOInstance(), (Object)navigationState.getJCOInstance(), sandboxExternalContent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Navigate(NetObject root, NetObject navigationState) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidCastException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.InvalidOperationException, system.UriFormatException, system.RankException, system.SystemException, system.MulticastNotSupportedException, system.componentmodel.Win32Exception, system.OverflowException, system.TimeoutException {
        try {
            return (boolean)classInstance.Invoke("Navigate", (Object)root.getJCOInstance(), (Object)navigationState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GoForward() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.IndexOutOfRangeException, system.RankException, system.NotSupportedException {
        try {
            classInstance.Invoke("GoForward");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GoBack() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.IndexOutOfRangeException, system.RankException, system.NotSupportedException {
        try {
            classInstance.Invoke("GoBack");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StopLoading() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.PlatformNotSupportedException, system.InvalidOperationException, system.NotSupportedException, system.InvalidCastException, system.UriFormatException, system.FormatException, system.RankException {
        try {
            classInstance.Invoke("StopLoading");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Refresh() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.InvalidCastException, system.ObjectDisposedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.net.WebException, system.componentmodel.Win32Exception, system.net.CookieException, system.RankException, system.SystemException, system.UriFormatException, system.MulticastNotSupportedException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.TimeoutException {
        try {
            classInstance.Invoke("Refresh");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Uri getSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Source");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSource(Uri Source) throws Throwable {
        try {
            classInstance.Set("Source", (Object)Source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getCurrentSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentSource");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getContent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Content");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContent(NetObject Content) throws Throwable {
        try {
            classInstance.Set("Content", (Object)Content.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanGoForward() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanGoForward");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanGoBack() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanGoBack");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
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


}