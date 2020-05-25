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

package system.windows.media.media3d;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.PropertyDescriptorCollection;


/**
 * The base .NET class managing System.Windows.Media.Media3D.Point4DConverter, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class Point4DConverter extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.Media3D.Point4DConverter";
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

    public Point4DConverter(Object instance) throws Throwable {
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

    public static Point4DConverter castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Point4DConverter(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Point4DConverter() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean CanConvertFrom(NetType sourceType) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CanConvertFrom", (Object)sourceType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanConvertTo(NetType destinationType) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CanConvertTo", (Object)destinationType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ConvertFrom(NetObject value) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objConvertFrom = (JCObject)classInstance.Invoke("ConvertFrom", (Object)value.getJCOInstance());
            return new NetObject(objConvertFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ConvertFromInvariantString(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException {
        try {
            JCObject objConvertFromInvariantString = (JCObject)classInstance.Invoke("ConvertFromInvariantString", (Object)text);
            return new NetObject(objConvertFromInvariantString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ConvertFromString(java.lang.String text) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        try {
            JCObject objConvertFromString = (JCObject)classInstance.Invoke("ConvertFromString", (Object)text);
            return new NetObject(objConvertFromString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ConvertTo(NetObject value, NetType destinationType) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            JCObject objConvertTo = (JCObject)classInstance.Invoke("ConvertTo", (Object)value.getJCOInstance(), (Object)destinationType.getJCOInstance());
            return new NetObject(objConvertTo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ConvertToInvariantString(NetObject value) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException {
        try {
            return (java.lang.String)classInstance.Invoke("ConvertToInvariantString", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ConvertToString(NetObject value) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (java.lang.String)classInstance.Invoke("ConvertToString", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetCreateInstanceSupported() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetCreateInstanceSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptorCollection GetProperties(NetObject value) throws Throwable {
        try {
            JCObject objGetProperties = (JCObject)classInstance.Invoke("GetProperties", (Object)value.getJCOInstance());
            return new PropertyDescriptorCollection(objGetProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetPropertiesSupported() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetPropertiesSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetStandardValuesExclusive() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetStandardValuesExclusive");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetStandardValuesSupported() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GetStandardValuesSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValid(NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("IsValid", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}