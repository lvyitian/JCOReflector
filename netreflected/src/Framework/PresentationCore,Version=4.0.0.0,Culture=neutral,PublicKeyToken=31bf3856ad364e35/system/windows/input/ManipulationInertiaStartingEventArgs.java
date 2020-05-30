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

package system.windows.input;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.input.manipulations.InertiaParameters2D;
import system.windows.Point;
import system.windows.input.ManipulationVelocities;
import system.windows.input.InertiaTranslationBehavior;
import system.windows.input.InertiaRotationBehavior;
import system.windows.input.InertiaExpansionBehavior;
import system.windows.input.InputDevice;
import system.windows.RoutedEvent;


/**
 * The base .NET class managing System.Windows.Input.ManipulationInertiaStartingEventArgs, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ManipulationInertiaStartingEventArgs extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Input.ManipulationInertiaStartingEventArgs";
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

    public ManipulationInertiaStartingEventArgs(Object instance) throws Throwable {
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

    public static ManipulationInertiaStartingEventArgs castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ManipulationInertiaStartingEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public boolean Cancel() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetInertiaParameter(InertiaParameters2D parameter) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("SetInertiaParameter", (Object)parameter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Point getManipulationOrigin() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ManipulationOrigin");
            return new Point(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setManipulationOrigin(Point ManipulationOrigin) throws Throwable {
        try {
            classInstance.Set("ManipulationOrigin", (Object)ManipulationOrigin.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManipulationVelocities getInitialVelocities() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InitialVelocities");
            return new ManipulationVelocities(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInitialVelocities(ManipulationVelocities InitialVelocities) throws Throwable {
        try {
            classInstance.Set("InitialVelocities", (Object)InitialVelocities.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InertiaTranslationBehavior getTranslationBehavior() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TranslationBehavior");
            return new InertiaTranslationBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTranslationBehavior(InertiaTranslationBehavior TranslationBehavior) throws Throwable {
        try {
            classInstance.Set("TranslationBehavior", (Object)TranslationBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InertiaRotationBehavior getRotationBehavior() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RotationBehavior");
            return new InertiaRotationBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRotationBehavior(InertiaRotationBehavior RotationBehavior) throws Throwable {
        try {
            classInstance.Set("RotationBehavior", (Object)RotationBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InertiaExpansionBehavior getExpansionBehavior() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ExpansionBehavior");
            return new InertiaExpansionBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExpansionBehavior(InertiaExpansionBehavior ExpansionBehavior) throws Throwable {
        try {
            classInstance.Set("ExpansionBehavior", (Object)ExpansionBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InputDevice getDevice() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Device");
            return new InputDevice(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDevice(InputDevice Device) throws Throwable {
        try {
            classInstance.Set("Device", (Object)Device.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTimestamp() throws Throwable {
        try {
            return (int)classInstance.Get("Timestamp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RoutedEvent getRoutedEvent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RoutedEvent");
            return new RoutedEvent(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRoutedEvent(RoutedEvent RoutedEvent) throws Throwable {
        try {
            classInstance.Set("RoutedEvent", (Object)RoutedEvent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHandled() throws Throwable {
        try {
            return (boolean)classInstance.Get("Handled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHandled(boolean Handled) throws Throwable {
        try {
            classInstance.Set("Handled", Handled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Source");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSource(NetObject Source) throws Throwable {
        try {
            classInstance.Set("Source", (Object)Source.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getOriginalSource() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OriginalSource");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}