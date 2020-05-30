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

package system.activities.tracking;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Guid;
import system.activities.tracking.ActivityInfo;
import system.DateTime;
import system.diagnostics.TraceLevel;


/**
 * The base .NET class managing System.Activities.Tracking.ActivityScheduledRecord, System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ActivityScheduledRecord extends NetObject  {
    public static final String assemblyFullName = "System.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities";
    public static final String className = "System.Activities.Tracking.ActivityScheduledRecord";
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

    public ActivityScheduledRecord(Object instance) throws Throwable {
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

    public static ActivityScheduledRecord castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ActivityScheduledRecord(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ActivityScheduledRecord(Guid instanceId, long recordNumber, ActivityInfo activity, ActivityInfo child) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)instanceId.getJCOInstance(), recordNumber, (Object)activity.getJCOInstance(), (Object)child.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public ActivityInfo getActivity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Activity");
            return new ActivityInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setActivity(ActivityInfo Activity) throws Throwable {
        try {
            classInstance.Set("Activity", (Object)Activity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityInfo getChild() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Child");
            return new ActivityInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setChild(ActivityInfo Child) throws Throwable {
        try {
            classInstance.Set("Child", (Object)Child.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getInstanceId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InstanceId");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInstanceId(Guid InstanceId) throws Throwable {
        try {
            classInstance.Set("InstanceId", (Object)InstanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getRecordNumber() throws Throwable {
        try {
            return (long)classInstance.Get("RecordNumber");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRecordNumber(long RecordNumber) throws Throwable {
        try {
            classInstance.Set("RecordNumber", RecordNumber);
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

    public TraceLevel getLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Level");
            return new TraceLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLevel(TraceLevel Level) throws Throwable {
        try {
            classInstance.Set("Level", (Object)Level.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}