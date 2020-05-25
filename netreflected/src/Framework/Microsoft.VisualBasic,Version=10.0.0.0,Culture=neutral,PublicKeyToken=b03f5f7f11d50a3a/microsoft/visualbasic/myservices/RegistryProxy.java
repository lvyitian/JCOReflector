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

package microsoft.visualbasic.myservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.win32.RegistryValueKind;
import microsoft.win32.RegistryKey;


/**
 * The base .NET class managing Microsoft.VisualBasic.MyServices.RegistryProxy, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class RegistryProxy extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic";
    public static final String className = "Microsoft.VisualBasic.MyServices.RegistryProxy";
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

    public RegistryProxy(Object instance) throws Throwable {
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

    public static RegistryProxy castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RegistryProxy(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public NetObject GetValue(java.lang.String keyName, java.lang.String valueName, NetObject defaultValue) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)keyName, (Object)valueName, (Object)defaultValue.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(java.lang.String keyName, java.lang.String valueName, NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.IndexOutOfRangeException, system.io.IOException, system.NotSupportedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("SetValue", (Object)keyName, (Object)valueName, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(java.lang.String keyName, java.lang.String valueName, NetObject value, RegistryValueKind valueKind) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.FormatException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.InvalidOperationException {
        try {
            classInstance.Invoke("SetValue", (Object)keyName, (Object)valueName, (Object)value.getJCOInstance(), (Object)valueKind.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public RegistryKey getCurrentUser() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentUser");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey getLocalMachine() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LocalMachine");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey getClassesRoot() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClassesRoot");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey getUsers() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Users");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey getPerformanceData() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PerformanceData");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey getCurrentConfig() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentConfig");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegistryKey getDynData() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DynData");
            return new RegistryKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}