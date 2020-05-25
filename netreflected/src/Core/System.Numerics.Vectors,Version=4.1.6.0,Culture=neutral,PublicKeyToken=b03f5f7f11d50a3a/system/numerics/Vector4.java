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

package system.numerics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Single;
import system.numerics.Vector2;
import system.numerics.Vector3;
import system.numerics.Vector4;
import system.numerics.Matrix4x4;
import system.numerics.Quaternion;


/**
 * The base .NET class managing System.Numerics.Vector4, System.Numerics.Vectors, Version=4.1.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Vector4 extends NetObject  {
    public static final String assemblyFullName = "System.Numerics.Vectors, Version=4.1.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Numerics.Vectors";
    public static final String className = "System.Numerics.Vector4";
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

    public Vector4(Object instance) throws Throwable {
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

    public static Vector4 castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Vector4(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Vector4(Single value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector4(Single x, Single y, Single z, Single w) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)x.getJCOInstance(), (Object)y.getJCOInstance(), (Object)z.getJCOInstance(), (Object)w.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector4(Vector2 value, Single z, Single w) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)value.getJCOInstance(), (Object)z.getJCOInstance(), (Object)w.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector4(Vector3 value, Single w) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)value.getJCOInstance(), (Object)w.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public java.lang.String ToString(java.lang.String format) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            return (java.lang.String)classInstance.Invoke("ToString", (Object)format);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single Length() throws Throwable {
        try {
            JCObject objLength = (JCObject)classInstance.Invoke("Length");
            return new Single(objLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single LengthSquared() throws Throwable {
        try {
            JCObject objLengthSquared = (JCObject)classInstance.Invoke("LengthSquared");
            return new Single(objLengthSquared);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Distance(Vector4 value1, Vector4 value2) throws Throwable {
        try {
            JCObject objDistance = (JCObject)classType.Invoke("Distance", (Object)value1.getJCOInstance(), (Object)value2.getJCOInstance());
            return new Single(objDistance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single DistanceSquared(Vector4 value1, Vector4 value2) throws Throwable {
        try {
            JCObject objDistanceSquared = (JCObject)classType.Invoke("DistanceSquared", (Object)value1.getJCOInstance(), (Object)value2.getJCOInstance());
            return new Single(objDistanceSquared);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Normalize(Vector4 vector) throws Throwable {
        try {
            JCObject objNormalize = (JCObject)classType.Invoke("Normalize", (Object)vector.getJCOInstance());
            return new Vector4(objNormalize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Clamp(Vector4 value1, Vector4 min, Vector4 max) throws Throwable {
        try {
            JCObject objClamp = (JCObject)classType.Invoke("Clamp", (Object)value1.getJCOInstance(), (Object)min.getJCOInstance(), (Object)max.getJCOInstance());
            return new Vector4(objClamp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Lerp(Vector4 value1, Vector4 value2, Single amount) throws Throwable {
        try {
            JCObject objLerp = (JCObject)classType.Invoke("Lerp", (Object)value1.getJCOInstance(), (Object)value2.getJCOInstance(), (Object)amount.getJCOInstance());
            return new Vector4(objLerp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Transform(Vector2 position, Matrix4x4 matrix) throws Throwable {
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", (Object)position.getJCOInstance(), (Object)matrix.getJCOInstance());
            return new Vector4(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Transform(Vector3 position, Matrix4x4 matrix) throws Throwable {
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", (Object)position.getJCOInstance(), (Object)matrix.getJCOInstance());
            return new Vector4(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Transform(Vector4 vector, Matrix4x4 matrix) throws Throwable {
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", (Object)vector.getJCOInstance(), (Object)matrix.getJCOInstance());
            return new Vector4(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Transform(Vector2 value, Quaternion rotation) throws Throwable {
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", (Object)value.getJCOInstance(), (Object)rotation.getJCOInstance());
            return new Vector4(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Transform(Vector3 value, Quaternion rotation) throws Throwable {
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", (Object)value.getJCOInstance(), (Object)rotation.getJCOInstance());
            return new Vector4(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Transform(Vector4 value, Quaternion rotation) throws Throwable {
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", (Object)value.getJCOInstance(), (Object)rotation.getJCOInstance());
            return new Vector4(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Add(Vector4 left, Vector4 right) throws Throwable {
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", (Object)left.getJCOInstance(), (Object)right.getJCOInstance());
            return new Vector4(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Subtract(Vector4 left, Vector4 right) throws Throwable {
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", (Object)left.getJCOInstance(), (Object)right.getJCOInstance());
            return new Vector4(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Multiply(Vector4 left, Vector4 right) throws Throwable {
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", (Object)left.getJCOInstance(), (Object)right.getJCOInstance());
            return new Vector4(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Multiply(Vector4 left, Single right) throws Throwable {
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", (Object)left.getJCOInstance(), (Object)right.getJCOInstance());
            return new Vector4(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Multiply(Single left, Vector4 right) throws Throwable {
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", (Object)left.getJCOInstance(), (Object)right.getJCOInstance());
            return new Vector4(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Divide(Vector4 left, Vector4 right) throws Throwable {
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", (Object)left.getJCOInstance(), (Object)right.getJCOInstance());
            return new Vector4(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Divide(Vector4 left, Single divisor) throws Throwable {
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", (Object)left.getJCOInstance(), (Object)divisor.getJCOInstance());
            return new Vector4(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Negate(Vector4 value) throws Throwable {
        try {
            JCObject objNegate = (JCObject)classType.Invoke("Negate", (Object)value.getJCOInstance());
            return new Vector4(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Single[] array) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.NullReferenceException {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Single[] array, int index) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.NullReferenceException {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(Vector4 other) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Dot(Vector4 vector1, Vector4 vector2) throws Throwable {
        try {
            JCObject objDot = (JCObject)classType.Invoke("Dot", (Object)vector1.getJCOInstance(), (Object)vector2.getJCOInstance());
            return new Single(objDot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Min(Vector4 value1, Vector4 value2) throws Throwable {
        try {
            JCObject objMin = (JCObject)classType.Invoke("Min", (Object)value1.getJCOInstance(), (Object)value2.getJCOInstance());
            return new Vector4(objMin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Max(Vector4 value1, Vector4 value2) throws Throwable {
        try {
            JCObject objMax = (JCObject)classType.Invoke("Max", (Object)value1.getJCOInstance(), (Object)value2.getJCOInstance());
            return new Vector4(objMax);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 Abs(Vector4 value) throws Throwable {
        try {
            JCObject objAbs = (JCObject)classType.Invoke("Abs", (Object)value.getJCOInstance());
            return new Vector4(objAbs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 SquareRoot(Vector4 value) throws Throwable {
        try {
            JCObject objSquareRoot = (JCObject)classType.Invoke("SquareRoot", (Object)value.getJCOInstance());
            return new Vector4(objSquareRoot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public static Vector4 getZero() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Zero");
            return new Vector4(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 getOne() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("One");
            return new Vector4(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 getUnitX() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("UnitX");
            return new Vector4(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 getUnitY() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("UnitY");
            return new Vector4(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 getUnitZ() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("UnitZ");
            return new Vector4(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector4 getUnitW() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("UnitW");
            return new Vector4(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}