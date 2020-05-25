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
import system.windows.media.media3d.Vector3D;
import system.windows.media.media3d.Quaternion;


/**
 * The base .NET class managing System.Windows.Media.Media3D.Quaternion, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class Quaternion extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.Media3D.Quaternion";
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

    public Quaternion(Object instance) throws Throwable {
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

    public static Quaternion castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Quaternion(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Quaternion(double x, double y, double z, double w) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(x, y, z, w);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Quaternion(Vector3D axisOfRotation, double angleInDegrees) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)axisOfRotation.getJCOInstance(), angleInDegrees);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Conjugate() throws Throwable {
        try {
            classInstance.Invoke("Conjugate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invert() throws Throwable {
        try {
            classInstance.Invoke("Invert");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Normalize() throws Throwable {
        try {
            classInstance.Invoke("Normalize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Quaternion Add(Quaternion left, Quaternion right) throws Throwable {
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", (Object)left.getJCOInstance(), (Object)right.getJCOInstance());
            return new Quaternion(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Quaternion Subtract(Quaternion left, Quaternion right) throws Throwable {
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", (Object)left.getJCOInstance(), (Object)right.getJCOInstance());
            return new Quaternion(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Quaternion Multiply(Quaternion left, Quaternion right) throws Throwable {
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", (Object)left.getJCOInstance(), (Object)right.getJCOInstance());
            return new Quaternion(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Quaternion Slerp(Quaternion from, Quaternion to, double t) throws Throwable {
        try {
            JCObject objSlerp = (JCObject)classType.Invoke("Slerp", (Object)from.getJCOInstance(), (Object)to.getJCOInstance(), t);
            return new Quaternion(objSlerp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Quaternion Slerp(Quaternion from, Quaternion to, double t, boolean useShortestPath) throws Throwable {
        try {
            JCObject objSlerp = (JCObject)classType.Invoke("Slerp", (Object)from.getJCOInstance(), (Object)to.getJCOInstance(), t, useShortestPath);
            return new Quaternion(objSlerp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Equals(Quaternion quaternion1, Quaternion quaternion2) throws Throwable {
        try {
            return (boolean)classType.Invoke("Equals", (Object)quaternion1.getJCOInstance(), (Object)quaternion2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(Quaternion value) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Quaternion Parse(java.lang.String source) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.FormatException, system.OverflowException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)source);
            return new Quaternion(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Vector3D getAxis() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Axis");
            return new Vector3D(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getAngle() throws Throwable {
        try {
            return (double)classInstance.Get("Angle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNormalized() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsNormalized");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsIdentity() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsIdentity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getX() throws Throwable {
        try {
            return (double)classInstance.Get("X");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setX(double X) throws Throwable {
        try {
            classInstance.Set("X", X);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getY() throws Throwable {
        try {
            return (double)classInstance.Get("Y");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setY(double Y) throws Throwable {
        try {
            classInstance.Set("Y", Y);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getZ() throws Throwable {
        try {
            return (double)classInstance.Get("Z");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setZ(double Z) throws Throwable {
        try {
            classInstance.Set("Z", Z);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getW() throws Throwable {
        try {
            return (double)classInstance.Get("W");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setW(double W) throws Throwable {
        try {
            classInstance.Set("W", W);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Quaternion getIdentity() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Identity");
            return new Quaternion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}