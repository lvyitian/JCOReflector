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

package system.web.ui.webcontrols.webparts;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.webcontrols.webparts.PersonalizationStateInfoCollection;
import system.web.ui.webcontrols.webparts.PersonalizationScope;
import system.web.ui.webcontrols.webparts.PersonalizationStateQuery;
import system.collections.specialized.NameValueCollection;
import system.DateTime;
import system.web.ui.webcontrols.webparts.WebPartManager;
import system.web.ui.webcontrols.webparts.PersonalizationState;


/**
 * The base .NET class managing System.Web.UI.WebControls.WebParts.SqlPersonalizationProvider, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SqlPersonalizationProvider extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.WebControls.WebParts.SqlPersonalizationProvider";
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

    public SqlPersonalizationProvider(Object instance) throws Throwable {
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

    public static SqlPersonalizationProvider castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SqlPersonalizationProvider(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SqlPersonalizationProvider() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public int GetCountOfState(PersonalizationScope scope, PersonalizationStateQuery query) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.MemberAccessException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.configuration.provider.ProviderException, system.web.HttpException, system.io.IOException, system.io.PathTooLongException, system.FormatException, system.web.management.SqlExecutionException, system.security.SecurityException, system.InvalidTimeZoneException, system.OverflowException {
        try {
            return (int)classInstance.Invoke("GetCountOfState", (Object)scope.getJCOInstance(), (Object)query.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(java.lang.String name, NameValueCollection configSettings) throws Throwable, system.ArgumentException, system.security.SecurityException, system.ArgumentNullException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.web.HttpException, system.IndexOutOfRangeException, system.configuration.provider.ProviderException, system.web.HttpRequestValidationException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException {
        try {
            classInstance.Invoke("Initialize", (Object)name, (Object)configSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ResetUserState(java.lang.String path, DateTime userInactiveSinceDate) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.configuration.provider.ProviderException, system.web.HttpException, system.io.IOException, system.io.PathTooLongException, system.FormatException, system.web.management.SqlExecutionException, system.security.SecurityException, system.InvalidTimeZoneException, system.OverflowException {
        try {
            return (int)classInstance.Invoke("ResetUserState", (Object)path, (Object)userInactiveSinceDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ResetState(PersonalizationScope scope, java.lang.String[] paths, java.lang.String[] usernames) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NullReferenceException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.MemberAccessException, system.configuration.provider.ProviderException, system.web.HttpException, system.io.IOException, system.io.PathTooLongException, system.FormatException, system.web.management.SqlExecutionException, system.OverflowException {
        try {
            return (int)classInstance.Invoke("ResetState", (Object)scope.getJCOInstance(), (Object)paths, (Object)usernames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PersonalizationScope DetermineInitialScope(WebPartManager webPartManager, PersonalizationState loadedState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.web.HttpException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.OverflowException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException, system.security.SecurityException, system.web.HttpParseException, system.web.HttpCompileException, system.threading.AbandonedMutexException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objDetermineInitialScope = (JCObject)classInstance.Invoke("DetermineInitialScope", (Object)webPartManager.getJCOInstance(), (Object)loadedState.getJCOInstance());
            return new PersonalizationScope(objDetermineInitialScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PersonalizationState LoadPersonalizationState(WebPartManager webPartManager, boolean ignoreCurrentUser) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.web.HttpException, system.web.HttpRequestValidationException, system.security.SecurityException, system.io.EndOfStreamException, system.FormatException, system.io.IOException, system.NotSupportedException {
        try {
            JCObject objLoadPersonalizationState = (JCObject)classInstance.Invoke("LoadPersonalizationState", (Object)webPartManager.getJCOInstance(), ignoreCurrentUser);
            return new PersonalizationState(objLoadPersonalizationState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ResetPersonalizationState(WebPartManager webPartManager) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.web.HttpException, system.web.HttpRequestValidationException {
        try {
            classInstance.Invoke("ResetPersonalizationState", (Object)webPartManager.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SavePersonalizationState(PersonalizationState state) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.web.HttpException, system.web.HttpRequestValidationException, system.security.SecurityException, system.UnauthorizedAccessException {
        try {
            classInstance.Invoke("SavePersonalizationState", (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
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

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
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



	// Instance Events section
    
    
}