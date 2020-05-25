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
import java.util.ArrayList;

// Import section
import system.drawing.imaging.ImageCodecInfo;
import system.Guid;
import system.drawing.imaging.ImageCodecFlags;


/**
 * The base .NET class managing System.Drawing.Imaging.ImageCodecInfo, System.Drawing.Common, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class ImageCodecInfo extends NetObject  {
    public static final String assemblyFullName = "System.Drawing.Common, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Drawing.Common";
    public static final String className = "System.Drawing.Imaging.ImageCodecInfo";
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

    public ImageCodecInfo(Object instance) throws Throwable {
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

    public static ImageCodecInfo castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ImageCodecInfo(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static ImageCodecInfo[] GetImageEncoders() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ArrayTypeMismatchException {
        try {
            ArrayList<ImageCodecInfo> resultingArrayList = new ArrayList<ImageCodecInfo>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetImageEncoders");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ImageCodecInfo(resultingObject));
            }
            ImageCodecInfo[] resultingArray = new ImageCodecInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ImageCodecInfo[] GetImageDecoders() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.OutOfMemoryException, system.ArrayTypeMismatchException {
        try {
            ArrayList<ImageCodecInfo> resultingArrayList = new ArrayList<ImageCodecInfo>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetImageDecoders");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ImageCodecInfo(resultingObject));
            }
            ImageCodecInfo[] resultingArray = new ImageCodecInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Guid getClsid() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Clsid");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClsid(Guid Clsid) throws Throwable {
        try {
            classInstance.Set("Clsid", (Object)Clsid.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getFormatID() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FormatID");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFormatID(Guid FormatID) throws Throwable {
        try {
            classInstance.Set("FormatID", (Object)FormatID.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCodecName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CodecName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCodecName(java.lang.String CodecName) throws Throwable {
        try {
            classInstance.Set("CodecName", (Object)CodecName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDllName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DllName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDllName(java.lang.String DllName) throws Throwable {
        try {
            classInstance.Set("DllName", (Object)DllName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFormatDescription() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FormatDescription");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFormatDescription(java.lang.String FormatDescription) throws Throwable {
        try {
            classInstance.Set("FormatDescription", (Object)FormatDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFilenameExtension() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FilenameExtension");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFilenameExtension(java.lang.String FilenameExtension) throws Throwable {
        try {
            classInstance.Set("FilenameExtension", (Object)FilenameExtension);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMimeType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MimeType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMimeType(java.lang.String MimeType) throws Throwable {
        try {
            classInstance.Set("MimeType", (Object)MimeType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ImageCodecFlags getFlags() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Flags");
            return new ImageCodecFlags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFlags(ImageCodecFlags Flags) throws Throwable {
        try {
            classInstance.Set("Flags", (Object)Flags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getVersion() throws Throwable {
        try {
            return (int)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVersion(int Version) throws Throwable {
        try {
            classInstance.Set("Version", Version);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}