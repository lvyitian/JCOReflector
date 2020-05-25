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

package microsoft.visualbasic.devices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section


/**
 * The base .NET class managing Microsoft.VisualBasic.Devices.Keyboard, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Keyboard extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic";
    public static final String className = "Microsoft.VisualBasic.Devices.Keyboard";
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

    public Keyboard(Object instance) throws Throwable {
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

    public static Keyboard castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Keyboard(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Keyboard() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void SendKeys(java.lang.String keys) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.NullReferenceException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationErrorsException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException {
        try {
            classInstance.Invoke("SendKeys", (Object)keys);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendKeys(java.lang.String keys, boolean wait) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.NullReferenceException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.configuration.ConfigurationErrorsException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            classInstance.Invoke("SendKeys", (Object)keys, wait);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getShiftKeyDown() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShiftKeyDown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAltKeyDown() throws Throwable {
        try {
            return (boolean)classInstance.Get("AltKeyDown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCtrlKeyDown() throws Throwable {
        try {
            return (boolean)classInstance.Get("CtrlKeyDown");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCapsLock() throws Throwable {
        try {
            return (boolean)classInstance.Get("CapsLock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNumLock() throws Throwable {
        try {
            return (boolean)classInstance.Get("NumLock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getScrollLock() throws Throwable {
        try {
            return (boolean)classInstance.Get("ScrollLock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}