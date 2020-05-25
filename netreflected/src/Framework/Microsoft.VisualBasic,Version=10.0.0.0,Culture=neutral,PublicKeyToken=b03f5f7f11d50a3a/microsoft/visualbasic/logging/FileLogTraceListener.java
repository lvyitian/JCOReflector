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

package microsoft.visualbasic.logging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.TraceEventCache;
import system.diagnostics.TraceEventType;
import system.Guid;
import system.runtime.remoting.ObjRef;
import microsoft.visualbasic.logging.LogFileLocation;
import microsoft.visualbasic.logging.DiskSpaceExhaustedOption;
import microsoft.visualbasic.logging.LogFileCreationScheduleOption;
import system.text.Encoding;
import system.collections.specialized.StringDictionary;
import system.diagnostics.TraceFilter;
import system.diagnostics.TraceOptions;


/**
 * The base .NET class managing Microsoft.VisualBasic.Logging.FileLogTraceListener, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class FileLogTraceListener extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic";
    public static final String className = "Microsoft.VisualBasic.Logging.FileLogTraceListener";
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

    public FileLogTraceListener(Object instance) throws Throwable {
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

    public static FileLogTraceListener castFrom(IJCOBridgeReflected from) throws Throwable {
        return new FileLogTraceListener(from.getJCOInstance());
    }

    // Constructors section
    
    
    public FileLogTraceListener(java.lang.String name) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.NullReferenceException, system.security.SecurityException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.MemberAccessException, system.UriFormatException, system.deployment.application.InvalidDeploymentException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.deployment.application.DeploymentException, system.AccessViolationException, system.InvalidTimeZoneException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileLogTraceListener() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.IndexOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.deployment.application.InvalidDeploymentException, system.PlatformNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.AccessViolationException, system.InvalidTimeZoneException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Write(java.lang.String message) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.deployment.application.InvalidDeploymentException, system.NullReferenceException, system.PlatformNotSupportedException, system.NotImplementedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.FormatException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("Write", (Object)message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, java.lang.String format, NetObject... args) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.InvalidOperationException, system.security.SecurityException, system.NullReferenceException, system.OverflowException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.deployment.application.InvalidDeploymentException, system.NotImplementedException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("TraceEvent", (Object)eventCache.getJCOInstance(), (Object)source, (Object)eventType.getJCOInstance(), id, (Object)format, (Object[])toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, NetObject data) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.InvalidOperationException, system.security.SecurityException, system.NullReferenceException, system.OverflowException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.deployment.application.InvalidDeploymentException, system.NotImplementedException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("TraceData", (Object)eventCache.getJCOInstance(), (Object)source, (Object)eventType.getJCOInstance(), id, (Object)data.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceData(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, NetObject... data) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.InvalidOperationException, system.security.SecurityException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.deployment.application.InvalidDeploymentException, system.NotImplementedException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("TraceData", (Object)eventCache.getJCOInstance(), (Object)source, (Object)eventType.getJCOInstance(), id, (Object[])toObjectFromArray(data));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Flush() throws Throwable, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classInstance.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteLine(java.lang.String message) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.security.SecurityException, system.ObjectDisposedException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.OverflowException, system.deployment.application.InvalidDeploymentException, system.NullReferenceException, system.PlatformNotSupportedException, system.NotImplementedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.FormatException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("WriteLine", (Object)message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TraceEvent(TraceEventCache eventCache, java.lang.String source, TraceEventType eventType, int id, java.lang.String message) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.InvalidOperationException, system.security.SecurityException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.deployment.application.InvalidDeploymentException, system.MemberAccessException, system.NotImplementedException, system.io.FileNotFoundException, system.io.IOException, system.io.PathTooLongException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("TraceEvent", (Object)eventCache.getJCOInstance(), (Object)source, (Object)eventType.getJCOInstance(), id, (Object)message);
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
    
    
    public LogFileLocation getLocation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Location");
            return new LogFileLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLocation(LogFileLocation Location) throws Throwable {
        try {
            classInstance.Set("Location", (Object)Location.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

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

    public boolean getIncludeHostName() throws Throwable {
        try {
            return (boolean)classInstance.Get("IncludeHostName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIncludeHostName(boolean IncludeHostName) throws Throwable {
        try {
            classInstance.Set("IncludeHostName", IncludeHostName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAppend() throws Throwable {
        try {
            return (boolean)classInstance.Get("Append");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAppend(boolean Append) throws Throwable {
        try {
            classInstance.Set("Append", Append);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DiskSpaceExhaustedOption getDiskSpaceExhaustedBehavior() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DiskSpaceExhaustedBehavior");
            return new DiskSpaceExhaustedOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDiskSpaceExhaustedBehavior(DiskSpaceExhaustedOption DiskSpaceExhaustedBehavior) throws Throwable {
        try {
            classInstance.Set("DiskSpaceExhaustedBehavior", (Object)DiskSpaceExhaustedBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBaseFileName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("BaseFileName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBaseFileName(java.lang.String BaseFileName) throws Throwable {
        try {
            classInstance.Set("BaseFileName", (Object)BaseFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFullLogFileName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FullLogFileName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LogFileCreationScheduleOption getLogFileCreationSchedule() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LogFileCreationSchedule");
            return new LogFileCreationScheduleOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLogFileCreationSchedule(LogFileCreationScheduleOption LogFileCreationSchedule) throws Throwable {
        try {
            classInstance.Set("LogFileCreationSchedule", (Object)LogFileCreationSchedule.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getMaxFileSize() throws Throwable {
        try {
            return (long)classInstance.Get("MaxFileSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxFileSize(long MaxFileSize) throws Throwable {
        try {
            classInstance.Set("MaxFileSize", MaxFileSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getReserveDiskSpace() throws Throwable {
        try {
            return (long)classInstance.Get("ReserveDiskSpace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReserveDiskSpace(long ReserveDiskSpace) throws Throwable {
        try {
            classInstance.Set("ReserveDiskSpace", ReserveDiskSpace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

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

    public Encoding getEncoding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Encoding");
            return new Encoding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncoding(Encoding Encoding) throws Throwable {
        try {
            classInstance.Set("Encoding", (Object)Encoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCustomLocation() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CustomLocation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCustomLocation(java.lang.String CustomLocation) throws Throwable {
        try {
            classInstance.Set("CustomLocation", (Object)CustomLocation);
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