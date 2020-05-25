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

package system.xaml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.reflection.MethodBase;

/**
 * The base .NET class managing System.Xaml.XamlParseException, System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetException}.
 */
public class XamlParseException extends NetException  {
    public static final String assemblyFullName = "System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xaml";
    public static final String className = "System.Xaml.XamlParseException";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException jce) {
            if (JCOBridgeInstance.getDebug())
                jce.printStackTrace();
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

    public XamlParseException() {
        super();
    }

    public XamlParseException(Object instance) {
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        }
    }

    public XamlParseException(String message) {
        super(message);
    }

    public XamlParseException(NetException cause) {
        super(cause);
    }

    public XamlParseException(String message, NetException cause) {
        super(message, cause);
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

    public static XamlParseException castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XamlParseException(from.getJCOInstance());
    }

    // Constructors section
    
    

    
    // Methods section
    
    
    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.runtime.serialization.SerializationException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("GetObjectData", (Object)info.getJCOInstance(), (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetException GetBaseException() throws Throwable {
        try {
            JCObject objGetBaseException = (JCObject)classInstance.Invoke("GetBaseException");
            return new NetException(objGetBaseException);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getLineNumber() throws Throwable {
        try {
            return (int)classInstance.Get("LineNumber");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLineNumber(int LineNumber) throws Throwable {
        try {
            classInstance.Set("LineNumber", LineNumber);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLinePosition() throws Throwable {
        try {
            return (int)classInstance.Get("LinePosition");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLinePosition(int LinePosition) throws Throwable {
        try {
            classInstance.Set("LinePosition", LinePosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodBase getTargetSite() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TargetSite");
            return new MethodBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetException getInnerException() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("InnerException");
            return new NetException(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHelpLink() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HelpLink");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHelpLink(java.lang.String HelpLink) throws Throwable {
        try {
            classInstance.Set("HelpLink", (Object)HelpLink);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSource() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Source");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSource(java.lang.String Source) throws Throwable {
        try {
            classInstance.Set("Source", (Object)Source);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getHResult() throws Throwable {
        try {
            return (int)classInstance.Get("HResult");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHResult(int HResult) throws Throwable {
        try {
            classInstance.Set("HResult", HResult);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}