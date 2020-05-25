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

package system.runtime.remoting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.remoting.proxies.RealProxy;
import system.MarshalByRefObject;
import system.runtime.remoting.ObjRef;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.reflection.MethodBase;


/**
 * The base .NET class managing System.Runtime.Remoting.RemotingServices, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class RemotingServices extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Runtime.Remoting.RemotingServices";
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

    public RemotingServices(Object instance) throws Throwable {
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

    public static RemotingServices castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RemotingServices(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static boolean IsTransparentProxy(NetObject proxy) throws Throwable {
        try {
            return (boolean)classType.Invoke("IsTransparentProxy", (Object)proxy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static RealProxy GetRealProxy(NetObject proxy) throws Throwable {
        try {
            JCObject objGetRealProxy = (JCObject)classType.Invoke("GetRealProxy", (Object)proxy.getJCOInstance());
            return new RealProxy(objGetRealProxy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsObjectOutOfContext(NetObject tp) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException {
        try {
            return (boolean)classType.Invoke("IsObjectOutOfContext", (Object)tp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsObjectOutOfAppDomain(NetObject tp) throws Throwable {
        try {
            return (boolean)classType.Invoke("IsObjectOutOfAppDomain", (Object)tp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetObjectUri(MarshalByRefObject obj) throws Throwable {
        try {
            return (java.lang.String)classType.Invoke("GetObjectUri", (Object)obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetObjectUriForMarshal(MarshalByRefObject obj, java.lang.String uri) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.NullReferenceException, system.ArgumentOutOfRangeException, system.FormatException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("SetObjectUriForMarshal", (Object)obj.getJCOInstance(), (Object)uri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjRef Marshal(MarshalByRefObject Obj) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.OutOfMemoryException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        try {
            JCObject objMarshal = (JCObject)classType.Invoke("Marshal", (Object)Obj.getJCOInstance());
            return new ObjRef(objMarshal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjRef Marshal(MarshalByRefObject Obj, java.lang.String URI) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.OutOfMemoryException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        try {
            JCObject objMarshal = (JCObject)classType.Invoke("Marshal", (Object)Obj.getJCOInstance(), (Object)URI);
            return new ObjRef(objMarshal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjRef Marshal(MarshalByRefObject Obj, java.lang.String ObjURI, NetType RequestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.OutOfMemoryException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        try {
            JCObject objMarshal = (JCObject)classType.Invoke("Marshal", (Object)Obj.getJCOInstance(), (Object)ObjURI, (Object)RequestedType.getJCOInstance());
            return new ObjRef(objMarshal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void GetObjectData(NetObject obj, SerializationInfo info, StreamingContext context) throws Throwable, system.ArgumentNullException, system.runtime.remoting.RemotingException, system.OutOfMemoryException, system.ObjectDisposedException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.runtime.serialization.SerializationException, system.NullReferenceException {
        try {
            classType.Invoke("GetObjectData", (Object)obj.getJCOInstance(), (Object)info.getJCOInstance(), (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Unmarshal(ObjRef objectRef) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidCastException, system.NotImplementedException {
        try {
            JCObject objUnmarshal = (JCObject)classType.Invoke("Unmarshal", (Object)objectRef.getJCOInstance());
            return new NetObject(objUnmarshal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Unmarshal(ObjRef objectRef, boolean fRefine) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidCastException, system.NotImplementedException {
        try {
            JCObject objUnmarshal = (JCObject)classType.Invoke("Unmarshal", (Object)objectRef.getJCOInstance(), fRefine);
            return new NetObject(objUnmarshal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Connect(NetType classToProxy, java.lang.String url) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.runtime.remoting.RemotingException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NullReferenceException, system.NotSupportedException, system.ApplicationException, system.OutOfMemoryException, system.FormatException, system.InvalidCastException {
        try {
            JCObject objConnect = (JCObject)classType.Invoke("Connect", (Object)classToProxy.getJCOInstance(), (Object)url);
            return new NetObject(objConnect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Connect(NetType classToProxy, java.lang.String url, NetObject data) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.runtime.remoting.RemotingException, system.ArgumentException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NullReferenceException, system.NotSupportedException, system.ApplicationException, system.OutOfMemoryException, system.FormatException, system.InvalidCastException {
        try {
            JCObject objConnect = (JCObject)classType.Invoke("Connect", (Object)classToProxy.getJCOInstance(), (Object)url, (Object)data.getJCOInstance());
            return new NetObject(objConnect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean Disconnect(MarshalByRefObject obj) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException {
        try {
            return (boolean)classType.Invoke("Disconnect", (Object)obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ObjRef GetObjRefForProxy(MarshalByRefObject obj) throws Throwable, system.runtime.remoting.RemotingException {
        try {
            JCObject objGetObjRefForProxy = (JCObject)classType.Invoke("GetObjRefForProxy", (Object)obj.getJCOInstance());
            return new ObjRef(objGetObjRefForProxy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean IsOneWay(MethodBase method) throws Throwable, system.ArgumentException {
        try {
            return (boolean)classType.Invoke("IsOneWay", (Object)method.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetType GetServerTypeForUri(java.lang.String URI) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.security.SecurityException, system.NotSupportedException, system.InvalidOperationException {
        try {
            JCObject objGetServerTypeForUri = (JCObject)classType.Invoke("GetServerTypeForUri", (Object)URI);
            return new NetType(objGetServerTypeForUri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void LogRemotingStage(int stage) throws Throwable {
        try {
            classType.Invoke("LogRemotingStage", stage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetLifetimeService(MarshalByRefObject obj) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetLifetimeService = (JCObject)classType.Invoke("GetLifetimeService", (Object)obj.getJCOInstance());
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}