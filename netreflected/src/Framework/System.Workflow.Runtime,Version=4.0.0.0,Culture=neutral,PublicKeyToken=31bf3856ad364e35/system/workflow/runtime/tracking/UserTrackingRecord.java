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

package system.workflow.runtime.tracking;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Guid;
import system.DateTime;
import system.workflow.runtime.tracking.TrackingAnnotationCollection;
import system.EventArgs;


/**
 * The base .NET class managing System.Workflow.Runtime.Tracking.UserTrackingRecord, System.Workflow.Runtime, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class UserTrackingRecord extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.Runtime, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.Runtime";
    public static final String className = "System.Workflow.Runtime.Tracking.UserTrackingRecord";
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

    public UserTrackingRecord(Object instance) throws Throwable {
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

    public static UserTrackingRecord castFrom(IJCOBridgeReflected from) throws Throwable {
        return new UserTrackingRecord(from.getJCOInstance());
    }

    // Constructors section
    
    
    public UserTrackingRecord() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UserTrackingRecord(NetType activityType, java.lang.String qualifiedName, Guid contextGuid, Guid parentContextGuid, DateTime eventDateTime, int eventOrder, java.lang.String userDataKey, NetObject userData) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)activityType.getJCOInstance(), (Object)qualifiedName, (Object)contextGuid.getJCOInstance(), (Object)parentContextGuid.getJCOInstance(), (Object)eventDateTime.getJCOInstance(), eventOrder, (Object)userDataKey, (Object)userData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public java.lang.String getQualifiedName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("QualifiedName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setQualifiedName(java.lang.String QualifiedName) throws Throwable {
        try {
            classInstance.Set("QualifiedName", (Object)QualifiedName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getContextGuid() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContextGuid");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContextGuid(Guid ContextGuid) throws Throwable {
        try {
            classInstance.Set("ContextGuid", (Object)ContextGuid.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getParentContextGuid() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ParentContextGuid");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setParentContextGuid(Guid ParentContextGuid) throws Throwable {
        try {
            classInstance.Set("ParentContextGuid", (Object)ParentContextGuid.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getActivityType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ActivityType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setActivityType(NetType ActivityType) throws Throwable {
        try {
            classInstance.Set("ActivityType", (Object)ActivityType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUserDataKey() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("UserDataKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUserDataKey(java.lang.String UserDataKey) throws Throwable {
        try {
            classInstance.Set("UserDataKey", (Object)UserDataKey);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getUserData() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UserData");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUserData(NetObject UserData) throws Throwable {
        try {
            classInstance.Set("UserData", (Object)UserData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getEventDateTime() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EventDateTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEventDateTime(DateTime EventDateTime) throws Throwable {
        try {
            classInstance.Set("EventDateTime", (Object)EventDateTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getEventOrder() throws Throwable {
        try {
            return (int)classInstance.Get("EventOrder");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEventOrder(int EventOrder) throws Throwable {
        try {
            classInstance.Set("EventOrder", EventOrder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TrackingAnnotationCollection getAnnotations() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Annotations");
            return new TrackingAnnotationCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventArgs getEventArgs() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EventArgs");
            return new EventArgs(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEventArgs(EventArgs EventArgs) throws Throwable {
        try {
            classInstance.Set("EventArgs", (Object)EventArgs.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}