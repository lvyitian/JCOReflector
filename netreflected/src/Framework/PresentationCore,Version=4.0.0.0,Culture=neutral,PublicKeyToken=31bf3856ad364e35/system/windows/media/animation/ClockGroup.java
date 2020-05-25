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

package system.windows.media.animation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.animation.TimelineGroup;
import system.windows.media.animation.ClockCollection;
import system.windows.media.animation.ClockController;
import system.windows.media.animation.ClockState;
import system.windows.Duration;
import system.windows.media.animation.Clock;
import system.windows.threading.Dispatcher;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Media.Animation.ClockGroup, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ClockGroup extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.Animation.ClockGroup";
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

    public ClockGroup(Object instance) throws Throwable {
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

    public static ClockGroup castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ClockGroup(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
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
    
    
    public TimelineGroup getTimeline() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Timeline");
            return new TimelineGroup(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClockCollection getChildren() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Children");
            return new ClockCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClockController getController() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Controller");
            return new ClockController(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClockState getCurrentState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentState");
            return new ClockState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasControllableRoot() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasControllableRoot");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPaused() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsPaused");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Duration getNaturalDuration() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NaturalDuration");
            return new Duration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Clock getParent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new Clock(val);
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



	// Instance Events section
    
    
    public void addCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Completed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Completed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCurrentGlobalSpeedInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("CurrentGlobalSpeedInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentGlobalSpeedInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("CurrentGlobalSpeedInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCurrentStateInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("CurrentStateInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentStateInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("CurrentStateInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCurrentTimeInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("CurrentTimeInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentTimeInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("CurrentTimeInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addRemoveRequested(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("RemoveRequested", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeRemoveRequested(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("RemoveRequested", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}