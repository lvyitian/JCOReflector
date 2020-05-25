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

package system.web.management;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.management.WebEventFormatter;
import system.web.management.WebRequestInformation;
import system.web.management.WebProcessInformation;
import system.DateTime;
import system.Guid;


/**
 * The base .NET class managing System.Web.Management.WebFailureAuditEvent, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class WebFailureAuditEvent extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.Management.WebFailureAuditEvent";
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

    public WebFailureAuditEvent(Object instance) throws Throwable {
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

    public static WebFailureAuditEvent castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WebFailureAuditEvent(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void FormatCustomEventDetails(WebEventFormatter formatter) throws Throwable {
        try {
            classInstance.Invoke("FormatCustomEventDetails", (Object)formatter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Raise() throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.FormatException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.OverflowException, system.threading.AbandonedMutexException, system.NullReferenceException {
        try {
            classInstance.Invoke("Raise");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(boolean includeAppInfo, boolean includeCustomEventDetails) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.web.HttpException, system.configuration.ConfigurationException, system.configuration.provider.ProviderException, system.NotSupportedException, system.NullReferenceException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("ToString", includeAppInfo, includeCustomEventDetails);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public WebRequestInformation getRequestInformation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RequestInformation");
            return new WebRequestInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebProcessInformation getProcessInformation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ProcessInformation");
            return new WebProcessInformation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getEventTime() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EventTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getEventTimeUtc() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EventTimeUtc");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMessage() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Message");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getEventSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EventSource");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getEventSequence() throws Throwable {
        try {
            return (long)classInstance.Get("EventSequence");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getEventOccurrence() throws Throwable {
        try {
            return (long)classInstance.Get("EventOccurrence");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getEventCode() throws Throwable {
        try {
            return (int)classInstance.Get("EventCode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getEventDetailCode() throws Throwable {
        try {
            return (int)classInstance.Get("EventDetailCode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getEventID() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EventID");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}