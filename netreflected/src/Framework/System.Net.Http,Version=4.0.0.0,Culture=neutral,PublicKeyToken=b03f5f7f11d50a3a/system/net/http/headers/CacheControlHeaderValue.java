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

package system.net.http.headers;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.http.headers.CacheControlHeaderValue;


/**
 * The base .NET class managing System.Net.Http.Headers.CacheControlHeaderValue, System.Net.Http, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class CacheControlHeaderValue extends NetObject  {
    public static final String assemblyFullName = "System.Net.Http, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Net.Http";
    public static final String className = "System.Net.Http.Headers.CacheControlHeaderValue";
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

    public CacheControlHeaderValue(Object instance) throws Throwable {
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

    public static CacheControlHeaderValue castFrom(IJCOBridgeReflected from) throws Throwable {
        return new CacheControlHeaderValue(from.getJCOInstance());
    }

    // Constructors section
    
    
    public CacheControlHeaderValue() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static CacheControlHeaderValue Parse(java.lang.String input) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)input);
            return new CacheControlHeaderValue(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getNoCache() throws Throwable {
        try {
            return (boolean)classInstance.Get("NoCache");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNoCache(boolean NoCache) throws Throwable {
        try {
            classInstance.Set("NoCache", NoCache);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNoStore() throws Throwable {
        try {
            return (boolean)classInstance.Get("NoStore");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNoStore(boolean NoStore) throws Throwable {
        try {
            classInstance.Set("NoStore", NoStore);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getMaxStale() throws Throwable {
        try {
            return (boolean)classInstance.Get("MaxStale");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxStale(boolean MaxStale) throws Throwable {
        try {
            classInstance.Set("MaxStale", MaxStale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNoTransform() throws Throwable {
        try {
            return (boolean)classInstance.Get("NoTransform");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNoTransform(boolean NoTransform) throws Throwable {
        try {
            classInstance.Set("NoTransform", NoTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getOnlyIfCached() throws Throwable {
        try {
            return (boolean)classInstance.Get("OnlyIfCached");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOnlyIfCached(boolean OnlyIfCached) throws Throwable {
        try {
            classInstance.Set("OnlyIfCached", OnlyIfCached);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPublic() throws Throwable {
        try {
            return (boolean)classInstance.Get("Public");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPublic(boolean Public) throws Throwable {
        try {
            classInstance.Set("Public", Public);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPrivate() throws Throwable {
        try {
            return (boolean)classInstance.Get("Private");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrivate(boolean Private) throws Throwable {
        try {
            classInstance.Set("Private", Private);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getMustRevalidate() throws Throwable {
        try {
            return (boolean)classInstance.Get("MustRevalidate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMustRevalidate(boolean MustRevalidate) throws Throwable {
        try {
            classInstance.Set("MustRevalidate", MustRevalidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getProxyRevalidate() throws Throwable {
        try {
            return (boolean)classInstance.Get("ProxyRevalidate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setProxyRevalidate(boolean ProxyRevalidate) throws Throwable {
        try {
            classInstance.Set("ProxyRevalidate", ProxyRevalidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}