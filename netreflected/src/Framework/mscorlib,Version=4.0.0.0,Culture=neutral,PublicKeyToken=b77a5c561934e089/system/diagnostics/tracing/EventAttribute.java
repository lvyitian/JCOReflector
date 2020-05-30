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

package system.diagnostics.tracing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.tracing.EventLevel;
import system.diagnostics.tracing.EventKeywords;
import system.diagnostics.tracing.EventOpcode;
import system.diagnostics.tracing.EventTask;
import system.diagnostics.tracing.EventChannel;
import system.diagnostics.tracing.EventTags;
import system.diagnostics.tracing.EventActivityOptions;


/**
 * The base .NET class managing System.Diagnostics.Tracing.EventAttribute, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class EventAttribute extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Diagnostics.Tracing.EventAttribute";
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

    public EventAttribute(Object instance) throws Throwable {
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

    public static EventAttribute castFrom(IJCOBridgeReflected from) throws Throwable {
        return new EventAttribute(from.getJCOInstance());
    }

    // Constructors section
    
    
    public EventAttribute(int eventId) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(eventId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Match(NetObject obj) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Match", (Object)obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDefaultAttribute() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsDefaultAttribute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getEventId() throws Throwable {
        try {
            return (int)classInstance.Get("EventId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEventId(int EventId) throws Throwable {
        try {
            classInstance.Set("EventId", EventId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventLevel getLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Level");
            return new EventLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLevel(EventLevel Level) throws Throwable {
        try {
            classInstance.Set("Level", (Object)Level.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventKeywords getKeywords() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Keywords");
            return new EventKeywords(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeywords(EventKeywords Keywords) throws Throwable {
        try {
            classInstance.Set("Keywords", (Object)Keywords.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventOpcode getOpcode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Opcode");
            return new EventOpcode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOpcode(EventOpcode Opcode) throws Throwable {
        try {
            classInstance.Set("Opcode", (Object)Opcode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventTask getTask() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Task");
            return new EventTask(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTask(EventTask Task) throws Throwable {
        try {
            classInstance.Set("Task", (Object)Task.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventChannel getChannel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Channel");
            return new EventChannel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setChannel(EventChannel Channel) throws Throwable {
        try {
            classInstance.Set("Channel", (Object)Channel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getVersion() throws Throwable {
        try {
            return (byte)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVersion(byte Version) throws Throwable {
        try {
            classInstance.Set("Version", Version);
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

    public void setMessage(java.lang.String Message) throws Throwable {
        try {
            classInstance.Set("Message", (Object)Message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventTags getTags() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Tags");
            return new EventTags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTags(EventTags Tags) throws Throwable {
        try {
            classInstance.Set("Tags", (Object)Tags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EventActivityOptions getActivityOptions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ActivityOptions");
            return new EventActivityOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setActivityOptions(EventActivityOptions ActivityOptions) throws Throwable {
        try {
            classInstance.Set("ActivityOptions", (Object)ActivityOptions.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTypeId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TypeId");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}