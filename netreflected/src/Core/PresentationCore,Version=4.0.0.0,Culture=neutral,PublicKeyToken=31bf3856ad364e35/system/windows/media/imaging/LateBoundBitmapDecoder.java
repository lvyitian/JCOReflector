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

package system.windows.media.imaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.imaging.InPlaceBitmapMetadataWriter;
import system.windows.media.imaging.BitmapPalette;
import system.windows.media.imaging.BitmapSource;
import system.windows.media.imaging.BitmapCodecInfo;
import system.windows.media.imaging.BitmapDecoder;
import system.windows.media.imaging.BitmapMetadata;
import system.windows.threading.Dispatcher;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Media.Imaging.LateBoundBitmapDecoder, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class LateBoundBitmapDecoder extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.Imaging.LateBoundBitmapDecoder";
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

    public LateBoundBitmapDecoder(Object instance) throws Throwable {
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

    public static LateBoundBitmapDecoder castFrom(IJCOBridgeReflected from) throws Throwable {
        return new LateBoundBitmapDecoder(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public InPlaceBitmapMetadataWriter CreateInPlaceBitmapMetadataWriter() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.FormatException {
        try {
            JCObject objCreateInPlaceBitmapMetadataWriter = (JCObject)classInstance.Invoke("CreateInPlaceBitmapMetadataWriter");
            return new InPlaceBitmapMetadataWriter(objCreateInPlaceBitmapMetadataWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckAccess() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CheckAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VerifyAccess() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("VerifyAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public BitmapPalette getPalette() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Palette");
            return new BitmapPalette(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapSource getThumbnail() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Thumbnail");
            return new BitmapSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapCodecInfo getCodecInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CodecInfo");
            return new BitmapCodecInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapSource getPreview() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Preview");
            return new BitmapSource(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapDecoder getDecoder() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Decoder");
            return new BitmapDecoder(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDownloading() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDownloading");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BitmapMetadata getMetadata() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Metadata");
            return new BitmapMetadata(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Dispatcher getDispatcher() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Dispatcher");
            return new Dispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addDownloadCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("DownloadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDownloadCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("DownloadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}