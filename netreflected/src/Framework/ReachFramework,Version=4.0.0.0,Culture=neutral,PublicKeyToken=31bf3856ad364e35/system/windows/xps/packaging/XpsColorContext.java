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

package system.windows.xps.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Uri;
import system.io.Stream;


/**
 * The base .NET class managing System.Windows.Xps.Packaging.XpsColorContext, ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class XpsColorContext extends NetObject  {
    public static final String assemblyFullName = "ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "ReachFramework";
    public static final String className = "System.Windows.Xps.Packaging.XpsColorContext";
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

    public XpsColorContext(Object instance) throws Throwable {
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

    public static XpsColorContext castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XpsColorContext(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public Uri RelativeUri(Uri inUri) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.OutOfMemoryException {
        try {
            JCObject objRelativeUri = (JCObject)classInstance.Invoke("RelativeUri", (Object)inUri.getJCOInstance());
            return new Uri(objRelativeUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetStream() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.io.IOException {
        try {
            JCObject objGetStream = (JCObject)classInstance.Invoke("GetStream");
            return new Stream(objGetStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Commit() throws Throwable {
        try {
            classInstance.Invoke("Commit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Uri getUri() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Uri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUri(Uri Uri) throws Throwable {
        try {
            classInstance.Set("Uri", (Object)Uri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}