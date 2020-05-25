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

package system.net.http;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.http.HttpMethod;


/**
 * The base .NET class managing System.Net.Http.HttpMethod, System.Net.Http, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class HttpMethod extends NetObject  {
    public static final String assemblyFullName = "System.Net.Http, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Net.Http";
    public static final String className = "System.Net.Http.HttpMethod";
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

    public HttpMethod(Object instance) throws Throwable {
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

    public static HttpMethod castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HttpMethod(from.getJCOInstance());
    }

    // Constructors section
    
    
    public HttpMethod(java.lang.String method) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)method);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Equals(HttpMethod other) throws Throwable, system.ArgumentException {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getMethod() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Method");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpMethod getGet() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Get");
            return new HttpMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpMethod getPut() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Put");
            return new HttpMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpMethod getPost() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Post");
            return new HttpMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpMethod getDelete() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Delete");
            return new HttpMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpMethod getHead() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Head");
            return new HttpMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpMethod getOptions() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Options");
            return new HttpMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpMethod getTrace() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Trace");
            return new HttpMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static HttpMethod getPatch() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Patch");
            return new HttpMethod(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}