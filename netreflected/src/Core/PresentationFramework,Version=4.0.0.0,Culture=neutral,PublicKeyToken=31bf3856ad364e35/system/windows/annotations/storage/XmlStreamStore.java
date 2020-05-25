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

package system.windows.annotations.storage;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.windows.annotations.Annotation;
import system.Guid;
import system.windows.annotations.storage.StoreContentChangedEventHandler;
import system.windows.annotations.AnnotationAuthorChangedEventHandler;
import system.windows.annotations.AnnotationResourceChangedEventHandler;


/**
 * The base .NET class managing System.Windows.Annotations.Storage.XmlStreamStore, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class XmlStreamStore extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Annotations.Storage.XmlStreamStore";
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

    public XmlStreamStore(Object instance) throws Throwable {
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

    public static XmlStreamStore castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlStreamStore(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XmlStreamStore(Stream stream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.xml.xpath.XPathException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void AddAnnotation(Annotation newAnnotation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidCastException, system.xml.xpath.XPathException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("AddAnnotation", (Object)newAnnotation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Annotation DeleteAnnotation(Guid annotationId) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidCastException, system.xml.xpath.XPathException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.collections.generic.KeyNotFoundException {
        try {
            JCObject objDeleteAnnotation = (JCObject)classInstance.Invoke("DeleteAnnotation", (Object)annotationId.getJCOInstance());
            return new Annotation(objDeleteAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Annotation GetAnnotation(Guid annotationId) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidCastException, system.xml.xpath.XPathException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException {
        try {
            JCObject objGetAnnotation = (JCObject)classInstance.Invoke("GetAnnotation", (Object)annotationId.getJCOInstance());
            return new Annotation(objGetAnnotation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.UnauthorizedAccessException, system.xml.xpath.XPathException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAutoFlush() throws Throwable {
        try {
            return (boolean)classInstance.Get("AutoFlush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoFlush(boolean AutoFlush) throws Throwable {
        try {
            classInstance.Set("AutoFlush", AutoFlush);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addStoreContentChanged(StoreContentChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("StoreContentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeStoreContentChanged(StoreContentChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("StoreContentChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAuthorChanged(AnnotationAuthorChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AuthorChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAuthorChanged(AnnotationAuthorChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AuthorChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addAnchorChanged(AnnotationResourceChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("AnchorChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeAnchorChanged(AnnotationResourceChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("AnchorChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCargoChanged(AnnotationResourceChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("CargoChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCargoChanged(AnnotationResourceChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("CargoChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}