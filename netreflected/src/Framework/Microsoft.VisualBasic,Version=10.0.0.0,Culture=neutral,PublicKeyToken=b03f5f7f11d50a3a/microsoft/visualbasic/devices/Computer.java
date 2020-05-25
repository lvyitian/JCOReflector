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
import microsoft.visualbasic.devices.Audio;
import microsoft.visualbasic.myservices.ClipboardProxy;
import microsoft.visualbasic.devices.Ports;
import microsoft.visualbasic.devices.Mouse;
import microsoft.visualbasic.devices.Keyboard;
import system.windows.forms.Screen;
import microsoft.visualbasic.devices.Clock;
import microsoft.visualbasic.myservices.FileSystemProxy;
import microsoft.visualbasic.devices.ComputerInfo;
import microsoft.visualbasic.devices.Network;
import microsoft.visualbasic.myservices.RegistryProxy;


/**
 * The base .NET class managing Microsoft.VisualBasic.Devices.Computer, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Computer extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic";
    public static final String className = "Microsoft.VisualBasic.Devices.Computer";
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

    public Computer(Object instance) throws Throwable {
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

    public static Computer castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Computer(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Computer() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public Audio getAudio() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Audio");
            return new Audio(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClipboardProxy getClipboard() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Clipboard");
            return new ClipboardProxy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Ports getPorts() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Ports");
            return new Ports(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Mouse getMouse() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Mouse");
            return new Mouse(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Keyboard getKeyboard() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Keyboard");
            return new Keyboard(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Screen getScreen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Screen");
            return new Screen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Clock getClock() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Clock");
            return new Clock(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileSystemProxy getFileSystem() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FileSystem");
            return new FileSystemProxy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ComputerInfo getInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Info");
            return new ComputerInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Network getNetwork() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Network");
            return new Network(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryProxy getRegistry() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Registry");
            return new RegistryProxy(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}