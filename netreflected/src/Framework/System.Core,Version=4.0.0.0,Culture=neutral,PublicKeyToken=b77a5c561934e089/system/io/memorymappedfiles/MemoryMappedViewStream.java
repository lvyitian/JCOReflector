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

package system.io.memorymappedfiles;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.threading.tasks.Task;
import system.threading.CancellationToken;
import system.io.SeekOrigin;
import system.io.Stream;
import system.runtime.remoting.ObjRef;
import microsoft.win32.safehandles.SafeMemoryMappedViewHandle;


/**
 * The base .NET class managing System.IO.MemoryMappedFiles.MemoryMappedViewStream, System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class MemoryMappedViewStream extends NetObject  {
    public static final String assemblyFullName = "System.Core, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Core";
    public static final String className = "System.IO.MemoryMappedFiles.MemoryMappedViewStream";
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

    public MemoryMappedViewStream(Object instance) throws Throwable {
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

    public static MemoryMappedViewStream castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MemoryMappedViewStream(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void SetLength(long value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("SetLength", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadByte() throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.InvalidOperationException {
        try {
            return (int)classInstance.Invoke("ReadByte");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task FlushAsync(CancellationToken cancellationToken) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException {
        try {
            JCObject objFlushAsync = (JCObject)classInstance.Invoke("FlushAsync", (Object)cancellationToken.getJCOInstance());
            return new Task(objFlushAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long Seek(long offset, SeekOrigin loc) throws Throwable, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.io.IOException, system.ArgumentException {
        try {
            return (long)classInstance.Invoke("Seek", offset, (Object)loc.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteAsync(byte[] buffer, int offset, int count, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.MulticastNotSupportedException {
        try {
            JCObject objWriteAsync = (JCObject)classInstance.Invoke("WriteAsync", buffer, offset, count, (Object)cancellationToken.getJCOInstance());
            return new Task(objWriteAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(byte[] buffer, int offset, int count) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.NotSupportedException, system.io.IOException, system.InvalidOperationException {
        try {
            classInstance.Invoke("Write", buffer, offset, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteByte(byte value) throws Throwable, system.ObjectDisposedException, system.NotSupportedException, system.io.IOException, system.InvalidOperationException {
        try {
            classInstance.Invoke("WriteByte", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CopyToAsync(Stream destination, int bufferSize, CancellationToken cancellationToken) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.InvalidOperationException, system.NullReferenceException, system.ArgumentException {
        try {
            JCObject objCopyToAsync = (JCObject)classInstance.Invoke("CopyToAsync", (Object)destination.getJCOInstance(), bufferSize, (Object)cancellationToken.getJCOInstance());
            return new Task(objCopyToAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CopyToAsync(Stream destination) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.InvalidOperationException {
        try {
            JCObject objCopyToAsync = (JCObject)classInstance.Invoke("CopyToAsync", (Object)destination.getJCOInstance());
            return new Task(objCopyToAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task CopyToAsync(Stream destination, int bufferSize) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.InvalidOperationException {
        try {
            JCObject objCopyToAsync = (JCObject)classInstance.Invoke("CopyToAsync", (Object)destination.getJCOInstance(), bufferSize);
            return new Task(objCopyToAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Stream destination) throws Throwable, system.ArgumentNullException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            classInstance.Invoke("CopyTo", (Object)destination.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Stream destination, int bufferSize) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            classInstance.Invoke("CopyTo", (Object)destination.getJCOInstance(), bufferSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task FlushAsync() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.tasks.TaskSchedulerException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            JCObject objFlushAsync = (JCObject)classInstance.Invoke("FlushAsync");
            return new Task(objFlushAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task WriteAsync(byte[] buffer, int offset, int count) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.ArgumentException, system.OperationCanceledException, system.threading.tasks.TaskSchedulerException, system.threading.SemaphoreFullException {
        try {
            JCObject objWriteAsync = (JCObject)classInstance.Invoke("WriteAsync", buffer, offset, count);
            return new Task(objWriteAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", (Object)requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public SafeMemoryMappedViewHandle getSafeMemoryMappedViewHandle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SafeMemoryMappedViewHandle");
            return new SafeMemoryMappedViewHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getPointerOffset() throws Throwable {
        try {
            return (long)classInstance.Get("PointerOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRead() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRead");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanSeek() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanSeek");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanWrite() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanWrite");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getLength() throws Throwable {
        try {
            return (long)classInstance.Get("Length");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getCapacity() throws Throwable {
        try {
            return (long)classInstance.Get("Capacity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getPosition() throws Throwable {
        try {
            return (long)classInstance.Get("Position");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPosition(long Position) throws Throwable {
        try {
            classInstance.Set("Position", Position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanTimeout() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getReadTimeout() throws Throwable {
        try {
            return (int)classInstance.Get("ReadTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadTimeout(int ReadTimeout) throws Throwable {
        try {
            classInstance.Set("ReadTimeout", ReadTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getWriteTimeout() throws Throwable {
        try {
            return (int)classInstance.Get("WriteTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWriteTimeout(int WriteTimeout) throws Throwable {
        try {
            classInstance.Set("WriteTimeout", WriteTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}