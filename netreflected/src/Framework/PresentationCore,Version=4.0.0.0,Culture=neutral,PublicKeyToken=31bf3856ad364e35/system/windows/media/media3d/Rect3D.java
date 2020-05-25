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
import system.windows.media.media3d.Point3D;
import system.windows.media.media3d.Size3D;
import system.windows.media.media3d.Rect3D;
import system.windows.media.media3d.Vector3D;


/**
 * The base .NET class managing System.Windows.Media.Media3D.Rect3D, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class Rect3D extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.Media3D.Rect3D";
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

    public Rect3D(Object instance) throws Throwable {
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

    public static Rect3D castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Rect3D(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Rect3D(Point3D location, Size3D size) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)location.getJCOInstance(), (Object)size.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rect3D(double x, double y, double z, double sizeX, double sizeY, double sizeZ) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(x, y, z, sizeX, sizeY, sizeZ);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Contains(Point3D point) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)point.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(double x, double y, double z) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Contains", x, y, z);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(Rect3D rect) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)rect.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IntersectsWith(Rect3D rect) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IntersectsWith", (Object)rect.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Intersect(Rect3D rect) throws Throwable {
        try {
            classInstance.Invoke("Intersect", (Object)rect.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect3D Intersect(Rect3D rect1, Rect3D rect2) throws Throwable {
        try {
            JCObject objIntersect = (JCObject)classType.Invoke("Intersect", (Object)rect1.getJCOInstance(), (Object)rect2.getJCOInstance());
            return new Rect3D(objIntersect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Union(Rect3D rect) throws Throwable {
        try {
            classInstance.Invoke("Union", (Object)rect.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect3D Union(Rect3D rect1, Rect3D rect2) throws Throwable {
        try {
            JCObject objUnion = (JCObject)classType.Invoke("Union", (Object)rect1.getJCOInstance(), (Object)rect2.getJCOInstance());
            return new Rect3D(objUnion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Union(Point3D point) throws Throwable {
        try {
            classInstance.Invoke("Union", (Object)point.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect3D Union(Rect3D rect, Point3D point) throws Throwable {
        try {
            JCObject objUnion = (JCObject)classType.Invoke("Union", (Object)rect.getJCOInstance(), (Object)point.getJCOInstance());
            return new Rect3D(objUnion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Offset(Vector3D offsetVector) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("Offset", (Object)offsetVector.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Offset(double offsetX, double offsetY, double offsetZ) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Offset", offsetX, offsetY, offsetZ);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect3D Offset(Rect3D rect, Vector3D offsetVector) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            JCObject objOffset = (JCObject)classType.Invoke("Offset", (Object)rect.getJCOInstance(), (Object)offsetVector.getJCOInstance());
            return new Rect3D(objOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect3D Offset(Rect3D rect, double offsetX, double offsetY, double offsetZ) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            JCObject objOffset = (JCObject)classType.Invoke("Offset", (Object)rect.getJCOInstance(), offsetX, offsetY, offsetZ);
            return new Rect3D(objOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Equals(Rect3D rect1, Rect3D rect2) throws Throwable {
        try {
            return (boolean)classType.Invoke("Equals", (Object)rect1.getJCOInstance(), (Object)rect2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(Rect3D value) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Rect3D Parse(java.lang.String source) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.NullReferenceException, system.FormatException, system.OverflowException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)source);
            return new Rect3D(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsEmpty() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point3D getLocation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Location");
            return new Point3D(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLocation(Point3D Location) throws Throwable {
        try {
            classInstance.Set("Location", (Object)Location.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size3D getSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Size");
            return new Size3D(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSize(Size3D Size) throws Throwable {
        try {
            classInstance.Set("Size", (Object)Size.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getSizeX() throws Throwable {
        try {
            return (double)classInstance.Get("SizeX");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSizeX(double SizeX) throws Throwable {
        try {
            classInstance.Set("SizeX", SizeX);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getSizeY() throws Throwable {
        try {
            return (double)classInstance.Get("SizeY");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSizeY(double SizeY) throws Throwable {
        try {
            classInstance.Set("SizeY", SizeY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getSizeZ() throws Throwable {
        try {
            return (double)classInstance.Get("SizeZ");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSizeZ(double SizeZ) throws Throwable {
        try {
            classInstance.Set("SizeZ", SizeZ);
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

    public static Rect3D getEmpty() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Empty");
            return new Rect3D(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}