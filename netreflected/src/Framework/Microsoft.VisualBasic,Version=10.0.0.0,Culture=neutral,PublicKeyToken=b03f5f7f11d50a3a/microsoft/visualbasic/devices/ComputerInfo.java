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
import system.UInt64;
import system.globalization.CultureInfo;


/**
 * The base .NET class managing Microsoft.VisualBasic.Devices.ComputerInfo, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ComputerInfo extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic";
    public static final String className = "Microsoft.VisualBasic.Devices.ComputerInfo";
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

    public ComputerInfo(Object instance) throws Throwable {
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

    public static ComputerInfo castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ComputerInfo(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ComputerInfo() throws Throwable {
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
    
    
    public UInt64 getTotalPhysicalMemory() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TotalPhysicalMemory");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getAvailablePhysicalMemory() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AvailablePhysicalMemory");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getTotalVirtualMemory() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TotalVirtualMemory");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getAvailableVirtualMemory() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AvailableVirtualMemory");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CultureInfo getInstalledUICulture() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InstalledUICulture");
            return new CultureInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOSFullName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("OSFullName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOSPlatform() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("OSPlatform");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOSVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("OSVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}