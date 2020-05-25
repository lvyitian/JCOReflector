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

package microsoft.visualbasic.myservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.TextDataFormat;
import system.drawing.Image;
import system.io.Stream;
import system.collections.specialized.StringCollection;
import system.windows.forms.DataObject;


/**
 * The base .NET class managing Microsoft.VisualBasic.MyServices.ClipboardProxy, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ClipboardProxy extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic";
    public static final String className = "Microsoft.VisualBasic.MyServices.ClipboardProxy";
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

    public ClipboardProxy(Object instance) throws Throwable {
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

    public static ClipboardProxy castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ClipboardProxy(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public java.lang.String GetText() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            return (java.lang.String)classInstance.Invoke("GetText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetText(TextDataFormat format) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            return (java.lang.String)classInstance.Invoke("GetText", (Object)format.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsText() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            return (boolean)classInstance.Invoke("ContainsText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsText(TextDataFormat format) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            return (boolean)classInstance.Invoke("ContainsText", (Object)format.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetText(java.lang.String text) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.threading.ThreadStateException, system.security.SecurityException, system.runtime.interopservices.ExternalException {
        try {
            classInstance.Invoke("SetText", (Object)text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetText(java.lang.String text, TextDataFormat format) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.threading.ThreadStateException, system.security.SecurityException, system.runtime.interopservices.ExternalException {
        try {
            classInstance.Invoke("SetText", (Object)text, (Object)format.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Image GetImage() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            JCObject objGetImage = (JCObject)classInstance.Invoke("GetImage");
            return new Image(objGetImage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsImage() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            return (boolean)classInstance.Invoke("ContainsImage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetImage(Image image) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.security.SecurityException, system.runtime.interopservices.ExternalException {
        try {
            classInstance.Invoke("SetImage", (Object)image.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetAudioStream() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            JCObject objGetAudioStream = (JCObject)classInstance.Invoke("GetAudioStream");
            return new Stream(objGetAudioStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsAudio() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            return (boolean)classInstance.Invoke("ContainsAudio");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAudio(byte[] audioBytes) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.ThreadStateException, system.IndexOutOfRangeException, system.security.SecurityException, system.runtime.interopservices.ExternalException {
        try {
            classInstance.Invoke("SetAudio", audioBytes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAudio(Stream audioStream) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.security.SecurityException, system.runtime.interopservices.ExternalException {
        try {
            classInstance.Invoke("SetAudio", (Object)audioStream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringCollection GetFileDropList() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            JCObject objGetFileDropList = (JCObject)classInstance.Invoke("GetFileDropList");
            return new StringCollection(objGetFileDropList);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsFileDropList() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            return (boolean)classInstance.Invoke("ContainsFileDropList");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetFileDropList(StringCollection filePaths) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NotSupportedException, system.threading.ThreadStateException, system.security.SecurityException, system.runtime.interopservices.ExternalException {
        try {
            classInstance.Invoke("SetFileDropList", (Object)filePaths.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetData(java.lang.String format) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            JCObject objGetData = (JCObject)classInstance.Invoke("GetData", (Object)format);
            return new NetObject(objGetData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsData(java.lang.String format) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.runtime.interopservices.ExternalException {
        try {
            return (boolean)classInstance.Invoke("ContainsData", (Object)format);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetData(java.lang.String format, NetObject data) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.security.SecurityException, system.runtime.interopservices.ExternalException {
        try {
            classInstance.Invoke("SetData", (Object)format, (Object)data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.ThreadStateException, system.IndexOutOfRangeException, system.security.SecurityException, system.runtime.interopservices.ExternalException {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetDataObject(DataObject data) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.ThreadStateException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.runtime.interopservices.ExternalException {
        try {
            classInstance.Invoke("SetDataObject", (Object)data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}