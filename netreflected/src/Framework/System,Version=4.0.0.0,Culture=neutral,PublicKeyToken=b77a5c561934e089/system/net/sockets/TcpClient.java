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

package system.net.sockets;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.IPEndPoint;
import system.net.sockets.AddressFamily;
import system.net.IPAddress;
import system.threading.tasks.Task;
import system.net.sockets.NetworkStream;
import system.net.sockets.Socket;
import system.net.sockets.LingerOption;


/**
 * The base .NET class managing System.Net.Sockets.TcpClient, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TcpClient extends NetObject  {
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System";
    public static final String className = "System.Net.Sockets.TcpClient";
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

    public TcpClient(Object instance) throws Throwable {
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

    public static TcpClient castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TcpClient(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TcpClient(IPEndPoint localEP) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.NotImplementedException, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.security.SecurityException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)localEP.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TcpClient() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.InvalidCastException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.security.SecurityException, system.ObjectDisposedException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TcpClient(AddressFamily family) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.security.SecurityException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)family.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TcpClient(java.lang.String hostname, int port) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.FormatException, system.NotImplementedException, system.AccessViolationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)hostname, port);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Dispose() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.InvalidCastException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Connect(java.lang.String hostname, int port) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.net.sockets.SocketException, system.FormatException, system.NotImplementedException, system.AccessViolationException {
        try {
            classInstance.Invoke("Connect", (Object)hostname, port);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Connect(IPAddress address, int port) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotImplementedException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.AccessViolationException {
        try {
            classInstance.Invoke("Connect", (Object)address.getJCOInstance(), port);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Connect(IPEndPoint remoteEP) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotImplementedException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.AccessViolationException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("Connect", (Object)remoteEP.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Connect(IPAddress[] ipAddresses, int port) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.net.sockets.SocketException, system.NotImplementedException, system.IndexOutOfRangeException, system.FormatException, system.AccessViolationException {
        try {
            classInstance.Invoke("Connect", (Object)toObjectFromArray(ipAddresses), port);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectAsync(IPAddress address, int port) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.InvalidCastException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotSupportedException, system.net.sockets.SocketException, system.NotImplementedException, system.IndexOutOfRangeException, system.FormatException, system.threading.tasks.TaskSchedulerException, system.diagnostics.tracing.EventSourceException {
        try {
            JCObject objConnectAsync = (JCObject)classInstance.Invoke("ConnectAsync", (Object)address.getJCOInstance(), port);
            return new Task(objConnectAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectAsync(java.lang.String host, int port) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.InvalidCastException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotSupportedException, system.NotImplementedException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.FormatException, system.threading.tasks.TaskSchedulerException, system.diagnostics.tracing.EventSourceException {
        try {
            JCObject objConnectAsync = (JCObject)classInstance.Invoke("ConnectAsync", (Object)host, port);
            return new Task(objConnectAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Task ConnectAsync(IPAddress[] addresses, int port) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.resources.MissingManifestResourceException, system.InvalidCastException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.NotSupportedException, system.net.sockets.SocketException, system.NotImplementedException, system.threading.WaitHandleCannotBeOpenedException, system.AccessViolationException, system.threading.tasks.TaskSchedulerException, system.diagnostics.tracing.EventSourceException {
        try {
            JCObject objConnectAsync = (JCObject)classInstance.Invoke("ConnectAsync", (Object)toObjectFromArray(addresses), port);
            return new Task(objConnectAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetworkStream GetStream() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetStream = (JCObject)classInstance.Invoke("GetStream");
            return new NetworkStream(objGetStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Socket getClient() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Client");
            return new Socket(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClient(Socket Client) throws Throwable {
        try {
            classInstance.Set("Client", (Object)Client.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getAvailable() throws Throwable {
        try {
            return (int)classInstance.Get("Available");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getConnected() throws Throwable {
        try {
            return (boolean)classInstance.Get("Connected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getExclusiveAddressUse() throws Throwable {
        try {
            return (boolean)classInstance.Get("ExclusiveAddressUse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExclusiveAddressUse(boolean ExclusiveAddressUse) throws Throwable {
        try {
            classInstance.Set("ExclusiveAddressUse", ExclusiveAddressUse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getReceiveBufferSize() throws Throwable {
        try {
            return (int)classInstance.Get("ReceiveBufferSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReceiveBufferSize(int ReceiveBufferSize) throws Throwable {
        try {
            classInstance.Set("ReceiveBufferSize", ReceiveBufferSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSendBufferSize() throws Throwable {
        try {
            return (int)classInstance.Get("SendBufferSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSendBufferSize(int SendBufferSize) throws Throwable {
        try {
            classInstance.Set("SendBufferSize", SendBufferSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getReceiveTimeout() throws Throwable {
        try {
            return (int)classInstance.Get("ReceiveTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReceiveTimeout(int ReceiveTimeout) throws Throwable {
        try {
            classInstance.Set("ReceiveTimeout", ReceiveTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSendTimeout() throws Throwable {
        try {
            return (int)classInstance.Get("SendTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSendTimeout(int SendTimeout) throws Throwable {
        try {
            classInstance.Set("SendTimeout", SendTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LingerOption getLingerState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LingerState");
            return new LingerOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLingerState(LingerOption LingerState) throws Throwable {
        try {
            classInstance.Set("LingerState", (Object)LingerState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getNoDelay() throws Throwable {
        try {
            return (boolean)classInstance.Get("NoDelay");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNoDelay(boolean NoDelay) throws Throwable {
        try {
            classInstance.Set("NoDelay", NoDelay);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}