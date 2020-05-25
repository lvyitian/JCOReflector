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

package system.drawing.imaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Drawing.Imaging.EncoderValue, System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class EncoderValue extends NetObject  {
    public static final String assemblyFullName = "System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Drawing";
    public static final String className = "System.Drawing.Imaging.EncoderValue";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
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

    public EncoderValue(Object instance) {
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public EncoderValue() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
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

    final static EncoderValue getFrom(JCEnum object, String value) {
        try {
            return new EncoderValue(object.fromValue(value));
        } catch (JCException e) {
            return new EncoderValue(object);
        }
    }

    // Enum fields section
    
    public static EncoderValue ColorTypeCMYK = getFrom(enumReflected, "ColorTypeCMYK");
    public static EncoderValue ColorTypeYCCK = getFrom(enumReflected, "ColorTypeYCCK");
    public static EncoderValue CompressionLZW = getFrom(enumReflected, "CompressionLZW");
    public static EncoderValue CompressionCCITT3 = getFrom(enumReflected, "CompressionCCITT3");
    public static EncoderValue CompressionCCITT4 = getFrom(enumReflected, "CompressionCCITT4");
    public static EncoderValue CompressionRle = getFrom(enumReflected, "CompressionRle");
    public static EncoderValue CompressionNone = getFrom(enumReflected, "CompressionNone");
    public static EncoderValue ScanMethodInterlaced = getFrom(enumReflected, "ScanMethodInterlaced");
    public static EncoderValue ScanMethodNonInterlaced = getFrom(enumReflected, "ScanMethodNonInterlaced");
    public static EncoderValue VersionGif87 = getFrom(enumReflected, "VersionGif87");
    public static EncoderValue VersionGif89 = getFrom(enumReflected, "VersionGif89");
    public static EncoderValue RenderProgressive = getFrom(enumReflected, "RenderProgressive");
    public static EncoderValue RenderNonProgressive = getFrom(enumReflected, "RenderNonProgressive");
    public static EncoderValue TransformRotate90 = getFrom(enumReflected, "TransformRotate90");
    public static EncoderValue TransformRotate180 = getFrom(enumReflected, "TransformRotate180");
    public static EncoderValue TransformRotate270 = getFrom(enumReflected, "TransformRotate270");
    public static EncoderValue TransformFlipHorizontal = getFrom(enumReflected, "TransformFlipHorizontal");
    public static EncoderValue TransformFlipVertical = getFrom(enumReflected, "TransformFlipVertical");
    public static EncoderValue MultiFrame = getFrom(enumReflected, "MultiFrame");
    public static EncoderValue LastFrame = getFrom(enumReflected, "LastFrame");
    public static EncoderValue Flush = getFrom(enumReflected, "Flush");
    public static EncoderValue FrameDimensionTime = getFrom(enumReflected, "FrameDimensionTime");
    public static EncoderValue FrameDimensionResolution = getFrom(enumReflected, "FrameDimensionResolution");
    public static EncoderValue FrameDimensionPage = getFrom(enumReflected, "FrameDimensionPage");


    // Flags management section


}