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

package system.web.services.protocols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.services.configuration.WebServiceProtocols;
import system.web.services.protocols.SoapServerMethod;


/**
 * The base .NET class managing System.Web.Services.Protocols.SoapServerType, System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SoapServerType extends NetObject  {
    public static final String assemblyFullName = "System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web.Services";
    public static final String className = "System.Web.Services.Protocols.SoapServerType";
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

    public SoapServerType(Object instance) throws Throwable {
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

    public static SoapServerType castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SoapServerType(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SoapServerType(NetType type, WebServiceProtocols protocolsSupported) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.RankException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.NullReferenceException, system.io.PathTooLongException, system.MemberAccessException, system.security.SecurityException, system.web.HttpException, system.web.HttpRequestValidationException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.threading.ThreadAbortException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.TypeLoadException, system.collections.generic.KeyNotFoundException, system.UnauthorizedAccessException, system.web.services.protocols.SoapException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)type.getJCOInstance(), (Object)protocolsSupported.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public SoapServerMethod GetMethod(NetObject key) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            JCObject objGetMethod = (JCObject)classInstance.Invoke("GetMethod", (Object)key.getJCOInstance());
            return new SoapServerMethod(objGetMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SoapServerMethod GetDuplicateMethod(NetObject key) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            JCObject objGetDuplicateMethod = (JCObject)classInstance.Invoke("GetDuplicateMethod", (Object)key.getJCOInstance());
            return new SoapServerMethod(objGetDuplicateMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getServiceNamespace() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ServiceNamespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getServiceDefaultIsEncoded() throws Throwable {
        try {
            return (boolean)classInstance.Get("ServiceDefaultIsEncoded");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getServiceRoutingOnSoapAction() throws Throwable {
        try {
            return (boolean)classInstance.Get("ServiceRoutingOnSoapAction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}