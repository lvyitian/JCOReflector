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

package system.windows.media;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.Matrix;
import system.windows.Point;
import system.windows.Vector;


/**
 * The base .NET class managing System.Windows.Media.Matrix, WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class Matrix extends NetObject  {
    public static final String assemblyFullName = "WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "WindowsBase";
    public static final String className = "System.Windows.Media.Matrix";
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

    public Matrix(Object instance) throws Throwable {
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

    public static Matrix castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Matrix(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Matrix(double m11, double m12, double m21, double m22, double offsetX, double offsetY) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(m11, m12, m21, m22, offsetX, offsetY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void SetIdentity() throws Throwable {
        try {
            classInstance.Invoke("SetIdentity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix Multiply(Matrix trans1, Matrix trans2) throws Throwable {
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", (Object)trans1.getJCOInstance(), (Object)trans2.getJCOInstance());
            return new Matrix(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Append(Matrix matrix) throws Throwable {
        try {
            classInstance.Invoke("Append", (Object)matrix.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Prepend(Matrix matrix) throws Throwable {
        try {
            classInstance.Invoke("Prepend", (Object)matrix.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Rotate(double angle) throws Throwable {
        try {
            classInstance.Invoke("Rotate", angle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RotatePrepend(double angle) throws Throwable {
        try {
            classInstance.Invoke("RotatePrepend", angle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RotateAt(double angle, double centerX, double centerY) throws Throwable {
        try {
            classInstance.Invoke("RotateAt", angle, centerX, centerY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RotateAtPrepend(double angle, double centerX, double centerY) throws Throwable {
        try {
            classInstance.Invoke("RotateAtPrepend", angle, centerX, centerY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Scale(double scaleX, double scaleY) throws Throwable {
        try {
            classInstance.Invoke("Scale", scaleX, scaleY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ScalePrepend(double scaleX, double scaleY) throws Throwable {
        try {
            classInstance.Invoke("ScalePrepend", scaleX, scaleY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ScaleAt(double scaleX, double scaleY, double centerX, double centerY) throws Throwable {
        try {
            classInstance.Invoke("ScaleAt", scaleX, scaleY, centerX, centerY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ScaleAtPrepend(double scaleX, double scaleY, double centerX, double centerY) throws Throwable {
        try {
            classInstance.Invoke("ScaleAtPrepend", scaleX, scaleY, centerX, centerY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Skew(double skewX, double skewY) throws Throwable {
        try {
            classInstance.Invoke("Skew", skewX, skewY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SkewPrepend(double skewX, double skewY) throws Throwable {
        try {
            classInstance.Invoke("SkewPrepend", skewX, skewY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Translate(double offsetX, double offsetY) throws Throwable {
        try {
            classInstance.Invoke("Translate", offsetX, offsetY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TranslatePrepend(double offsetX, double offsetY) throws Throwable {
        try {
            classInstance.Invoke("TranslatePrepend", offsetX, offsetY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point Transform(Point point) throws Throwable {
        try {
            JCObject objTransform = (JCObject)classInstance.Invoke("Transform", (Object)point.getJCOInstance());
            return new Point(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(Point[] points) throws Throwable {
        try {
            classInstance.Invoke("Transform", (Object)toObjectFromArray(points));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector Transform(Vector vector) throws Throwable {
        try {
            JCObject objTransform = (JCObject)classInstance.Invoke("Transform", (Object)vector.getJCOInstance());
            return new Vector(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(Vector[] vectors) throws Throwable {
        try {
            classInstance.Invoke("Transform", (Object)toObjectFromArray(vectors));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invert() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Invert");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Equals(Matrix matrix1, Matrix matrix2) throws Throwable {
        try {
            return (boolean)classType.Invoke("Equals", (Object)matrix1.getJCOInstance(), (Object)matrix2.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(Matrix value) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix Parse(java.lang.String source) throws Throwable, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.FormatException, system.OverflowException {
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", (Object)source);
            return new Matrix(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsIdentity() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsIdentity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getDeterminant() throws Throwable {
        try {
            return (double)classInstance.Get("Determinant");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasInverse() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasInverse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM11() throws Throwable {
        try {
            return (double)classInstance.Get("M11");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM11(double M11) throws Throwable {
        try {
            classInstance.Set("M11", M11);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM12() throws Throwable {
        try {
            return (double)classInstance.Get("M12");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM12(double M12) throws Throwable {
        try {
            classInstance.Set("M12", M12);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM21() throws Throwable {
        try {
            return (double)classInstance.Get("M21");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM21(double M21) throws Throwable {
        try {
            classInstance.Set("M21", M21);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getM22() throws Throwable {
        try {
            return (double)classInstance.Get("M22");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setM22(double M22) throws Throwable {
        try {
            classInstance.Set("M22", M22);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getOffsetX() throws Throwable {
        try {
            return (double)classInstance.Get("OffsetX");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOffsetX(double OffsetX) throws Throwable {
        try {
            classInstance.Set("OffsetX", OffsetX);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getOffsetY() throws Throwable {
        try {
            return (double)classInstance.Get("OffsetY");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOffsetY(double OffsetY) throws Throwable {
        try {
            classInstance.Set("OffsetY", OffsetY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix getIdentity() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Identity");
            return new Matrix(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}