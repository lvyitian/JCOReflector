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

package system.io;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.text.Encoding;
import system.threading.tasks.ValueTask;
import system.io.SeekOrigin;
import system.SByte;
import system.Decimal;
import system.UInt16;
import system.UInt32;
import system.UInt64;
import system.Single;


/**
 * The base .NET class managing System.IO.BinaryWriter, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link NetObject}.
 */
public class BinaryWriter extends NetObject  {
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
	public static final String assemblyShortName = "System.Private.CoreLib";
    public static final String className = "System.IO.BinaryWriter";
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

    public BinaryWriter(Object instance) throws Throwable {
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

    public static BinaryWriter castFrom(IJCOBridgeReflected from) throws Throwable {
        return new BinaryWriter(from.getJCOInstance());
    }

    // Constructors section
    
    
    public BinaryWriter(Stream output) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryWriter(Stream output, Encoding encoding) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)output.getJCOInstance(), (Object)encoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BinaryWriter(Stream output, Encoding encoding, boolean leaveOpen) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)output.getJCOInstance(), (Object)encoding.getJCOInstance(), leaveOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Close() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValueTask DisposeAsync() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.threading.tasks.TaskSchedulerException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            JCObject objDisposeAsync = (JCObject)classInstance.Invoke("DisposeAsync");
            return new ValueTask(objDisposeAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable {
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long Seek(int offset, SeekOrigin origin) throws Throwable {
        try {
            return (long)classInstance.Invoke("Seek", offset, (Object)origin.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(boolean value) throws Throwable {
        try {
            classInstance.Invoke("Write", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(byte value) throws Throwable {
        try {
            classInstance.Invoke("Write", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(SByte value) throws Throwable {
        try {
            classInstance.Invoke("Write", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(byte[] buffer) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Write", buffer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(byte[] buffer, int index, int count) throws Throwable {
        try {
            classInstance.Invoke("Write", buffer, index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(char ch) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Write", ch);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(char[] chars) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Write", chars);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(char[] chars, int index, int count) throws Throwable {
        try {
            classInstance.Invoke("Write", chars, index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(double value) throws Throwable {
        try {
            classInstance.Invoke("Write", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Decimal value) throws Throwable {
        try {
            classInstance.Invoke("Write", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(short value) throws Throwable {
        try {
            classInstance.Invoke("Write", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(UInt16 value) throws Throwable {
        try {
            classInstance.Invoke("Write", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(int value) throws Throwable {
        try {
            classInstance.Invoke("Write", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(UInt32 value) throws Throwable {
        try {
            classInstance.Invoke("Write", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(long value) throws Throwable {
        try {
            classInstance.Invoke("Write", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(UInt64 value) throws Throwable {
        try {
            classInstance.Invoke("Write", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(Single value) throws Throwable {
        try {
            classInstance.Invoke("Write", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(java.lang.String value) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Write", (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Stream getBaseStream() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BaseStream");
            return new Stream(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}