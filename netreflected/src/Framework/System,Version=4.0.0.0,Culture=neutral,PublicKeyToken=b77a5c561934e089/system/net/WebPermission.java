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

package system.net;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.permissions.PermissionState;
import system.net.NetworkAccess;
import system.text.regularexpressions.Regex;
import system.security.SecurityElement;


/**
 * The base .NET class managing System.Net.WebPermission, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class WebPermission extends NetObject  {
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System";
    public static final String className = "System.Net.WebPermission";
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

    public WebPermission(Object instance) throws Throwable {
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

    public static WebPermission castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WebPermission(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WebPermission(PermissionState state) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebPermission() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebPermission(NetworkAccess access, Regex uriRegex) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)access.getJCOInstance(), (Object)uriRegex.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebPermission(NetworkAccess access, java.lang.String uriString) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)access.getJCOInstance(), (Object)uriString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void AddPermission(NetworkAccess access, java.lang.String uriString) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.configuration.ConfigurationException, system.UriFormatException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            classInstance.Invoke("AddPermission", (Object)access.getJCOInstance(), (Object)uriString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsUnrestricted() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsUnrestricted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddPermission(NetworkAccess access, Regex uriRegex) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        try {
            classInstance.Invoke("AddPermission", (Object)access.getJCOInstance(), (Object)uriRegex.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void FromXml(SecurityElement securityElement) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("FromXml", (Object)securityElement.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityElement ToXml() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.IndexOutOfRangeException {
        try {
            JCObject objToXml = (JCObject)classInstance.Invoke("ToXml");
            return new SecurityElement(objToXml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Demand() throws Throwable {
        try {
            classInstance.Invoke("Demand");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Assert() throws Throwable, system.security.SecurityException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            classInstance.Invoke("Assert");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Deny() throws Throwable, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            classInstance.Invoke("Deny");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PermitOnly() throws Throwable, system.security.SecurityException, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            classInstance.Invoke("PermitOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    


	// Instance Events section
    
    
}