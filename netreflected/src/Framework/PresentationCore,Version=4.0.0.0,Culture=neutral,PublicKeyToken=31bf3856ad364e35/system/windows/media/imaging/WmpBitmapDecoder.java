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
import system.Uri;
import system.windows.media.imaging.BitmapCreateOptions;
import system.windows.media.imaging.BitmapCacheOption;
import system.io.Stream;
import system.windows.media.imaging.InPlaceBitmapMetadataWriter;
import system.windows.media.imaging.BitmapPalette;
import system.windows.media.imaging.BitmapSource;
import system.windows.media.imaging.BitmapMetadata;
import system.windows.media.imaging.BitmapCodecInfo;
import system.windows.threading.Dispatcher;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Media.Imaging.WmpBitmapDecoder, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WmpBitmapDecoder extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.Imaging.WmpBitmapDecoder";
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

    public WmpBitmapDecoder(Object instance) throws Throwable {
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

    public static WmpBitmapDecoder castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WmpBitmapDecoder(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WmpBitmapDecoder(Uri bitmapUri, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.UriFormatException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.net.WebException, system.NotImplementedException, system.net.CookieException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.IndexOutOfRangeException, system.io.FileFormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)bitmapUri.getJCOInstance(), (Object)createOptions.getJCOInstance(), (Object)cacheOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WmpBitmapDecoder(Stream bitmapStream, BitmapCreateOptions createOptions, BitmapCacheOption cacheOption) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.componentmodel.InvalidEnumArgumentException, system.InvalidOperationException, system.componentmodel.Win32Exception, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.UriFormatException, system.OutOfMemoryException, system.configuration.ConfigurationErrorsException, system.net.WebException, system.NotImplementedException, system.net.CookieException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.InvalidDeploymentException, system.IndexOutOfRangeException, system.io.FileFormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)bitmapStream.getJCOInstance(), (Object)createOptions.getJCOInstance(), (Object)cacheOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public InPlaceBitmapMetadataWriter CreateInPlaceBitmapMetadataWriter() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.UriFormatException, system.OutOfMemoryException, system.MissingMethodException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
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

    public void VerifyAccess() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
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

    public BitmapMetadata getMetadata() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Metadata");
            return new BitmapMetadata(val);
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

    public boolean getIsDownloading() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDownloading");
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