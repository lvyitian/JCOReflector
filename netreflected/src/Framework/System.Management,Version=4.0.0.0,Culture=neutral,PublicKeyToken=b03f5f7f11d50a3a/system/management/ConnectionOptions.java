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

package system.management;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.management.ImpersonationLevel;
import system.management.AuthenticationLevel;
import system.management.ManagementNamedValueCollection;
import system.TimeSpan;
import system.security.SecureString;


/**
 * The base .NET class managing System.Management.ConnectionOptions, System.Management, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ConnectionOptions extends NetObject  {
    public static final String assemblyFullName = "System.Management, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Management";
    public static final String className = "System.Management.ConnectionOptions";
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

    public ConnectionOptions(Object instance) throws Throwable {
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

    public static ConnectionOptions castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ConnectionOptions(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ConnectionOptions() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.ObjectDisposedException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConnectionOptions(java.lang.String locale, java.lang.String username, java.lang.String password, java.lang.String authority, ImpersonationLevel impersonation, AuthenticationLevel authentication, boolean enablePrivileges, ManagementNamedValueCollection context, TimeSpan timeout) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MulticastNotSupportedException, system.OutOfMemoryException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)locale, (Object)username, (Object)password, (Object)authority, (Object)impersonation.getJCOInstance(), (Object)authentication.getJCOInstance(), enablePrivileges, (Object)context.getJCOInstance(), (Object)timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConnectionOptions(java.lang.String locale, java.lang.String username, SecureString password, java.lang.String authority, ImpersonationLevel impersonation, AuthenticationLevel authentication, boolean enablePrivileges, ManagementNamedValueCollection context, TimeSpan timeout) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentException, system.MulticastNotSupportedException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)locale, (Object)username, (Object)password.getJCOInstance(), (Object)authority, (Object)impersonation.getJCOInstance(), (Object)authentication.getJCOInstance(), enablePrivileges, (Object)context.getJCOInstance(), (Object)timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public NetObject Clone() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.MulticastNotSupportedException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getLocale() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Locale");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLocale(java.lang.String Locale) throws Throwable {
        try {
            classInstance.Set("Locale", (Object)Locale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUsername() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Username");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUsername(java.lang.String Username) throws Throwable {
        try {
            classInstance.Set("Username", (Object)Username);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPassword(java.lang.String Password) throws Throwable {
        try {
            classInstance.Set("Password", (Object)Password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecurePassword(SecureString SecurePassword) throws Throwable {
        try {
            classInstance.Set("SecurePassword", (Object)SecurePassword.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAuthority() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Authority");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAuthority(java.lang.String Authority) throws Throwable {
        try {
            classInstance.Set("Authority", (Object)Authority);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ImpersonationLevel getImpersonation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Impersonation");
            return new ImpersonationLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImpersonation(ImpersonationLevel Impersonation) throws Throwable {
        try {
            classInstance.Set("Impersonation", (Object)Impersonation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthenticationLevel getAuthentication() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Authentication");
            return new AuthenticationLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAuthentication(AuthenticationLevel Authentication) throws Throwable {
        try {
            classInstance.Set("Authentication", (Object)Authentication.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnablePrivileges() throws Throwable {
        try {
            return (boolean)classInstance.Get("EnablePrivileges");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnablePrivileges(boolean EnablePrivileges) throws Throwable {
        try {
            classInstance.Set("EnablePrivileges", EnablePrivileges);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManagementNamedValueCollection getContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Context");
            return new ManagementNamedValueCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContext(ManagementNamedValueCollection Context) throws Throwable {
        try {
            classInstance.Set("Context", (Object)Context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getTimeout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Timeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTimeout(TimeSpan Timeout) throws Throwable {
        try {
            classInstance.Set("Timeout", (Object)Timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}