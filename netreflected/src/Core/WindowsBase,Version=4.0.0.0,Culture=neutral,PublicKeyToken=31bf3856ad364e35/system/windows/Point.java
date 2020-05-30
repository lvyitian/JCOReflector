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

package system.windows;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.Point;
import system.windows.Vector;
import system.windows.media.Matrix;


/**
 * The base .NET class managing System.Windows.Point, WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class Point extends NetObject  {
    public static final String assemblyFullName = "WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "WindowsBase";
    public static final String className = "System.Windows.Point";
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

    public Point(Object instance) throws Throwable {
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

    public static Point castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Point(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Point(double x, double y) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(x, y);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static boolean Equals(Point point1, Point point2) throws Throwable {
        try {
            return (boolean)classType.Invoke("Equals", (Object)point1.getJCOInstance(), (Object)point2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(Point value) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Point Parse(java.lang.String source) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.FormatException, system.OverflowException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)source);
            return new Point(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Offset(double offsetX, double offsetY) throws Throwable {
        try {
            classInstance.Invoke("Offset", offsetX, offsetY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Point Add(Point point, Vector vector) throws Throwable {
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", (Object)point.getJCOInstance(), (Object)vector.getJCOInstance());
            return new Point(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Point Subtract(Point point, Vector vector) throws Throwable {
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", (Object)point.getJCOInstance(), (Object)vector.getJCOInstance());
            return new Point(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector Subtract(Point point1, Point point2) throws Throwable {
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", (Object)point1.getJCOInstance(), (Object)point2.getJCOInstance());
            return new Vector(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Point Multiply(Point point, Matrix matrix) throws Throwable {
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", (Object)point.getJCOInstance(), (Object)matrix.getJCOInstance());
            return new Point(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
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



	// Instance Events section
    
    
}