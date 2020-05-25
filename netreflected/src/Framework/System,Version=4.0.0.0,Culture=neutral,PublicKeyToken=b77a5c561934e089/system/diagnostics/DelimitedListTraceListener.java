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

package system.diagnostics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.io.TextWriter;
import system.diagnostics.TraceEventCache;
import system.diagnostics.TraceEventType;
import system.Guid;
import system.runtime.remoting.ObjRef;
import system.collections.specialized.StringDictionary;
import system.diagnostics.TraceFilter;
import system.diagnostics.TraceOptions;


/**
 * The base .NET class managing System.Diagnostics.DelimitedListTraceListener, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DelimitedListTraceListener extends NetObject  {
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System";
    public static final String className = "System.Diagnostics.DelimitedListTraceListener";
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

    public DelimitedListTraceListener(Object instance) throws Throwable {
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

    public static DelimitedListTraceListener castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DelimitedListTraceListener(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DelimitedListTraceListener(Stream stream) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DelimitedListTraceListener(Stream stream, java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)stream.getJCOInstance(), (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DelimitedListTraceListener(TextWriter writer) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DelimitedListTraceListener(TextWriter writer, java.lang.String name) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)writer.getJCOInstance(), (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DelimitedListTraceListener(java.lang.String fileName) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DelimitedListTraceListener(java.lang.String fileName, java.lang.String name) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)fileName, (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, java.lang.String format, NetObject... args) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.NotSupportedException, system.NullReferenceException, system.componentmodel.Win32Exception, system.OverflowException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.security.SecurityException {
        try {
            classInstance.Invoke("TraceEvent", (Object)eventCache.getJCOInstance(), (Object)source, (Object)eventType.getJCOInstance(), id, (Object)format, (Object[])toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, java.lang.String message) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.NotSupportedException, system.NullReferenceException, system.componentmodel.Win32Exception, system.OverflowException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.security.SecurityException {
        try {
            classInstance.Invoke("TraceEvent", (Object)eventCache.getJCOInstance(), (Object)source, (Object)eventType.getJCOInstance(), id, (Object)message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, NetObject data) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.NotSupportedException, system.NullReferenceException, system.componentmodel.Win32Exception, system.OverflowException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.security.SecurityException {
        try {
            classInstance.Invoke("TraceData", (Object)eventCache.getJCOInstance(), (Object)source, (Object)eventType.getJCOInstance(), id, (Object)data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, NetObject... data) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.NotSupportedException, system.NullReferenceException, system.componentmodel.Win32Exception, system.OverflowException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.security.SecurityException {
        try {
            classInstance.Invoke("TraceData", (Object)eventCache.getJCOInstance(), (Object)source, (Object)eventType.getJCOInstance(), id, (Object[])toObjectFromArray(data));
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

    public void Flush() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(java.lang.String message) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("Write", (Object)message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteLine(java.lang.String message) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.FormatException, system.InvalidOperationException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NotSupportedException, system.NullReferenceException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("WriteLine", (Object)message);
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

    public void Fail(java.lang.String message) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotImplementedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Fail", (Object)message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(NetObject o) throws Throwable {
        try {
            classInstance.Invoke("Write", (Object)o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(NetObject o, java.lang.String category) throws Throwable, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("Write", (Object)o.getJCOInstance(), (Object)category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteLine(NetObject o) throws Throwable {
        try {
            classInstance.Invoke("WriteLine", (Object)o.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteLine(NetObject o, java.lang.String category) throws Throwable, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("WriteLine", (Object)o.getJCOInstance(), (Object)category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.IndexOutOfRangeException, system.OverflowException {
        try {
            classInstance.Invoke("TraceEvent", (Object)eventCache.getJCOInstance(), (Object)source, (Object)eventType.getJCOInstance(), id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Fail(java.lang.String message, java.lang.String detailMessage) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("Fail", (Object)message, (Object)detailMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Write(java.lang.String message, java.lang.String category) throws Throwable, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("Write", (Object)message, (Object)category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteLine(java.lang.String message, java.lang.String category) throws Throwable, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("WriteLine", (Object)message, (Object)category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceTransfer(TraceEventCache eventCache, java.lang.String source, int id, java.lang.String message, Guid relatedActivityId) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.NotSupportedException, system.componentmodel.Win32Exception, system.OverflowException {
        try {
            classInstance.Invoke("TraceTransfer", (Object)eventCache.getJCOInstance(), (Object)source, id, (Object)message, (Object)relatedActivityId.getJCOInstance());
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
    
    
    public java.lang.String getDelimiter() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Delimiter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDelimiter(java.lang.String Delimiter) throws Throwable {
        try {
            classInstance.Set("Delimiter", (Object)Delimiter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextWriter getWriter() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Writer");
            return new TextWriter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWriter(TextWriter Writer) throws Throwable {
        try {
            classInstance.Set("Writer", (Object)Writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringDictionary getAttributes() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new StringDictionary(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsThreadSafe() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsThreadSafe");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getIndentLevel() throws Throwable {
        try {
            return (int)classInstance.Get("IndentLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIndentLevel(int IndentLevel) throws Throwable {
        try {
            classInstance.Set("IndentLevel", IndentLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getIndentSize() throws Throwable {
        try {
            return (int)classInstance.Get("IndentSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIndentSize(int IndentSize) throws Throwable {
        try {
            classInstance.Set("IndentSize", IndentSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TraceFilter getFilter() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Filter");
            return new TraceFilter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFilter(TraceFilter Filter) throws Throwable {
        try {
            classInstance.Set("Filter", (Object)Filter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TraceOptions getTraceOutputOptions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TraceOutputOptions");
            return new TraceOptions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTraceOutputOptions(TraceOptions TraceOutputOptions) throws Throwable {
        try {
            classInstance.Set("TraceOutputOptions", (Object)TraceOutputOptions.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}