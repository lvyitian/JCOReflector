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

package system.io.compression;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.compression.ZipArchiveEntry;
import system.io.compression.ZipArchive;
import system.io.compression.CompressionLevel;


/**
 * The base .NET class managing System.IO.Compression.ZipFileExtensions, System.IO.Compression.ZipFile, Version=4.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ZipFileExtensions extends NetObject  {
    public static final String assemblyFullName = "System.IO.Compression.ZipFile, Version=4.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.IO.Compression.ZipFile";
    public static final String className = "System.IO.Compression.ZipFileExtensions";
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

    public ZipFileExtensions(Object instance) throws Throwable {
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

    public static ZipFileExtensions castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ZipFileExtensions(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static ZipArchiveEntry CreateEntryFromFile(ZipArchive destination, java.lang.String sourceFileName, java.lang.String entryName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException, system.OverflowException, system.io.InvalidDataException, system.io.compression.ZLibException {
        try {
            JCObject objCreateEntryFromFile = (JCObject)classType.Invoke("CreateEntryFromFile", (Object)destination.getJCOInstance(), (Object)sourceFileName, (Object)entryName);
            return new ZipArchiveEntry(objCreateEntryFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ZipArchiveEntry CreateEntryFromFile(ZipArchive destination, java.lang.String sourceFileName, java.lang.String entryName, CompressionLevel compressionLevel) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException, system.OverflowException, system.io.InvalidDataException, system.io.compression.ZLibException {
        try {
            JCObject objCreateEntryFromFile = (JCObject)classType.Invoke("CreateEntryFromFile", (Object)destination.getJCOInstance(), (Object)sourceFileName, (Object)entryName, (Object)compressionLevel.getJCOInstance());
            return new ZipArchiveEntry(objCreateEntryFromFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(ZipArchive source, java.lang.String destinationDirectoryName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.io.InvalidDataException, system.io.IOException, system.runtime.serialization.SerializationException {
        try {
            classType.Invoke("ExtractToDirectory", (Object)source.getJCOInstance(), (Object)destinationDirectoryName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToDirectory(ZipArchive source, java.lang.String destinationDirectoryName, boolean overwriteFiles) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.io.InvalidDataException, system.io.IOException, system.FormatException, system.runtime.serialization.SerializationException {
        try {
            classType.Invoke("ExtractToDirectory", (Object)source.getJCOInstance(), (Object)destinationDirectoryName, overwriteFiles);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToFile(ZipArchiveEntry source, java.lang.String destinationFileName) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException, system.io.compression.ZLibException {
        try {
            classType.Invoke("ExtractToFile", (Object)source.getJCOInstance(), (Object)destinationFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ExtractToFile(ZipArchiveEntry source, java.lang.String destinationFileName, boolean overwrite) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.runtime.serialization.SerializationException, system.io.IOException, system.io.InvalidDataException, system.io.compression.ZLibException, system.security.SecurityException, system.OverflowException {
        try {
            classType.Invoke("ExtractToFile", (Object)source.getJCOInstance(), (Object)destinationFileName, overwrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}