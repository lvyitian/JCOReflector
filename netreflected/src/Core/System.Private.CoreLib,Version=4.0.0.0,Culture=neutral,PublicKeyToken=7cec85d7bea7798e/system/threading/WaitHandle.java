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

package system.threading;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.TimeSpan;
import system.threading.WaitHandle;
import microsoft.win32.safehandles.SafeWaitHandle;


/**
 * The base .NET class managing System.Threading.WaitHandle, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link NetObject}.
 */
public class WaitHandle extends NetObject  {
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
	public static final String assemblyShortName = "System.Private.CoreLib";
    public static final String className = "System.Threading.WaitHandle";
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

    public WaitHandle(Object instance) throws Throwable {
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

    public static WaitHandle castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WaitHandle(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void Close() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean WaitOne(int millisecondsTimeout) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classInstance.Invoke("WaitOne", millisecondsTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean WaitOne(TimeSpan timeout) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classInstance.Invoke("WaitOne", (Object)timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean WaitOne() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classInstance.Invoke("WaitOne");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean WaitOne(int millisecondsTimeout, boolean exitContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classInstance.Invoke("WaitOne", millisecondsTimeout, exitContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean WaitOne(TimeSpan timeout, boolean exitContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classInstance.Invoke("WaitOne", (Object)timeout.getJCOInstance(), exitContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean WaitAll(WaitHandle[] waitHandles, int millisecondsTimeout) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classType.Invoke("WaitAll", (Object)toObjectFromArray(waitHandles), millisecondsTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean WaitAll(WaitHandle[] waitHandles, TimeSpan timeout) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classType.Invoke("WaitAll", (Object)toObjectFromArray(waitHandles), (Object)timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean WaitAll(WaitHandle[] waitHandles) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classType.Invoke("WaitAll", (Object)toObjectFromArray(waitHandles));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean WaitAll(WaitHandle[] waitHandles, int millisecondsTimeout, boolean exitContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classType.Invoke("WaitAll", (Object)toObjectFromArray(waitHandles), millisecondsTimeout, exitContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean WaitAll(WaitHandle[] waitHandles, TimeSpan timeout, boolean exitContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classType.Invoke("WaitAll", (Object)toObjectFromArray(waitHandles), (Object)timeout.getJCOInstance(), exitContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(WaitHandle[] waitHandles, int millisecondsTimeout) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (int)classType.Invoke("WaitAny", (Object)toObjectFromArray(waitHandles), millisecondsTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(WaitHandle[] waitHandles, TimeSpan timeout) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (int)classType.Invoke("WaitAny", (Object)toObjectFromArray(waitHandles), (Object)timeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(WaitHandle[] waitHandles) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (int)classType.Invoke("WaitAny", (Object)toObjectFromArray(waitHandles));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(WaitHandle[] waitHandles, int millisecondsTimeout, boolean exitContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (int)classType.Invoke("WaitAny", (Object)toObjectFromArray(waitHandles), millisecondsTimeout, exitContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int WaitAny(WaitHandle[] waitHandles, TimeSpan timeout, boolean exitContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.ArrayTypeMismatchException, system.FormatException, system.threading.AbandonedMutexException {
        try {
            return (int)classType.Invoke("WaitAny", (Object)toObjectFromArray(waitHandles), (Object)timeout.getJCOInstance(), exitContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SignalAndWait(WaitHandle toSignal, WaitHandle toWaitOn) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classType.Invoke("SignalAndWait", (Object)toSignal.getJCOInstance(), (Object)toWaitOn.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SignalAndWait(WaitHandle toSignal, WaitHandle toWaitOn, TimeSpan timeout, boolean exitContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classType.Invoke("SignalAndWait", (Object)toSignal.getJCOInstance(), (Object)toWaitOn.getJCOInstance(), (Object)timeout.getJCOInstance(), exitContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean SignalAndWait(WaitHandle toSignal, WaitHandle toWaitOn, int millisecondsTimeout, boolean exitContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.threading.AbandonedMutexException {
        try {
            return (boolean)classType.Invoke("SignalAndWait", (Object)toSignal.getJCOInstance(), (Object)toWaitOn.getJCOInstance(), millisecondsTimeout, exitContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public SafeWaitHandle getSafeWaitHandle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SafeWaitHandle");
            return new SafeWaitHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSafeWaitHandle(SafeWaitHandle SafeWaitHandle) throws Throwable {
        try {
            classInstance.Set("SafeWaitHandle", (Object)SafeWaitHandle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}