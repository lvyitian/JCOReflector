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

package system;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.StringComparer;
import system.StringComparison;
import system.globalization.CultureInfo;
import system.globalization.CompareOptions;


/**
 * The base .NET class managing System.StringComparer, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link NetObject}.
 */
public class StringComparer extends NetObject  {
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
	public static final String assemblyShortName = "System.Private.CoreLib";
    public static final String className = "System.StringComparer";
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

    public StringComparer(Object instance) throws Throwable {
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

    public static StringComparer castFrom(IJCOBridgeReflected from) throws Throwable {
        return new StringComparer(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static StringComparer FromComparison(StringComparison comparisonType) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        try {
            JCObject objFromComparison = (JCObject)classType.Invoke("FromComparison", (Object)comparisonType.getJCOInstance());
            return new StringComparer(objFromComparison);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StringComparer Create(CultureInfo culture, boolean ignoreCase) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)culture.getJCOInstance(), ignoreCase);
            return new StringComparer(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StringComparer Create(CultureInfo culture, CompareOptions options) throws Throwable, system.ArgumentException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException {
        try {
            JCObject objCreate = (JCObject)classType.Invoke("Create", (Object)culture.getJCOInstance(), (Object)options.getJCOInstance());
            return new StringComparer(objCreate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Compare(NetObject x, NetObject y) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (int)classInstance.Invoke("Compare", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(NetObject x, NetObject y) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)x.getJCOInstance(), (Object)y.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetHashCode(NetObject obj) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            return (int)classInstance.Invoke("GetHashCode", (Object)obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public static StringComparer getInvariantCulture() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InvariantCulture");
            return new StringComparer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StringComparer getInvariantCultureIgnoreCase() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InvariantCultureIgnoreCase");
            return new StringComparer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StringComparer getCurrentCulture() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("CurrentCulture");
            return new StringComparer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StringComparer getCurrentCultureIgnoreCase() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("CurrentCultureIgnoreCase");
            return new StringComparer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StringComparer getOrdinal() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Ordinal");
            return new StringComparer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static StringComparer getOrdinalIgnoreCase() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OrdinalIgnoreCase");
            return new StringComparer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}