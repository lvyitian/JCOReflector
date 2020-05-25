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

package system.web.hosting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.TextWriter;
import system.DateTime;
import system.Guid;


/**
 * The base .NET class managing System.Web.Hosting.SimpleWorkerRequest, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SimpleWorkerRequest extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.Hosting.SimpleWorkerRequest";
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

    public SimpleWorkerRequest(Object instance) throws Throwable {
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

    public static SimpleWorkerRequest castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SimpleWorkerRequest(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SimpleWorkerRequest(java.lang.String page, java.lang.String query, TextWriter output) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)page, (Object)query, (Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SimpleWorkerRequest(java.lang.String appVirtualDir, java.lang.String appPhysicalDir, java.lang.String page, java.lang.String query, TextWriter output) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.MemberAccessException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotSupportedException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.web.HttpException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)appVirtualDir, (Object)appPhysicalDir, (Object)page, (Object)query, (Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public java.lang.String GetRawUrl() throws Throwable, system.NullReferenceException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetRawUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetUriPath() throws Throwable, system.NullReferenceException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetUriPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetQueryString() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetQueryString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetRemotePort() throws Throwable {
        try {
            return (int)classInstance.Invoke("GetRemotePort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetLocalPort() throws Throwable {
        try {
            return (int)classInstance.Invoke("GetLocalPort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetFilePath() throws Throwable, system.NullReferenceException, system.IndexOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetFilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetFilePathTranslated() throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetFilePathTranslated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetPathInfo() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetPathInfo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAppPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetAppPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAppPathTranslated() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException {
        try {
            return (java.lang.String)classInstance.Invoke("GetAppPathTranslated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetServerVariable(java.lang.String name) throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetServerVariable", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendStatus(int statusCode, java.lang.String statusDescription) throws Throwable {
        try {
            classInstance.Invoke("SendStatus", statusCode, (Object)statusDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendKnownResponseHeader(int index, java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("SendKnownResponseHeader", index, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendUnknownResponseHeader(java.lang.String name, java.lang.String value) throws Throwable {
        try {
            classInstance.Invoke("SendUnknownResponseHeader", (Object)name, (Object)value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendResponseFromMemory(byte[] data, int length) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.NotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.InvalidOperationException {
        try {
            classInstance.Invoke("SendResponseFromMemory", data, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendResponseFromFile(java.lang.String filename, long offset, long length) throws Throwable {
        try {
            classInstance.Invoke("SendResponseFromFile", (Object)filename, offset, length);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void FlushResponse(boolean finalFlush) throws Throwable {
        try {
            classInstance.Invoke("FlushResponse", finalFlush);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void EndOfRequest() throws Throwable {
        try {
            classInstance.Invoke("EndOfRequest");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetHttpVerbName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetHttpVerbName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetHttpVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetHttpVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetRemoteAddress() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetRemoteAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetLocalAddress() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetLocalAddress");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String MapPath(java.lang.String path) throws Throwable, system.ArgumentOutOfRangeException, system.NullReferenceException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException {
        try {
            return (java.lang.String)classInstance.Invoke("MapPath", (Object)path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsSecure() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsSecure");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetKnownRequestHeader(int index) throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetKnownRequestHeader", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetProtocol() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetProtocol");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HasEntityBody() throws Throwable, system.NullReferenceException {
        try {
            return (boolean)classInstance.Invoke("HasEntityBody");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetQueryStringRawBytes() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetQueryStringRawBytes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetQueryStringRawBytes = 0; indexGetQueryStringRawBytes < resultingArrayList.size(); indexGetQueryStringRawBytes++ ) {
				resultingArray[indexGetQueryStringRawBytes] = (byte)resultingArrayList.get(indexGetQueryStringRawBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetRemoteName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetRemoteName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetServerName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetServerName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetConnectionID() throws Throwable {
        try {
            return (long)classInstance.Invoke("GetConnectionID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetUrlContextID() throws Throwable {
        try {
            return (long)classInstance.Invoke("GetUrlContextID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetAppPoolID() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetAppPoolID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetRequestReason() throws Throwable {
        try {
            return (int)classInstance.Invoke("GetRequestReason");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetPreloadedEntityBodyLength() throws Throwable {
        try {
            return (int)classInstance.Invoke("GetPreloadedEntityBodyLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetPreloadedEntityBody(byte[] buffer, int offset) throws Throwable {
        try {
            return (int)classInstance.Invoke("GetPreloadedEntityBody", buffer, offset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetPreloadedEntityBody() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetPreloadedEntityBody");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetPreloadedEntityBody = 0; indexGetPreloadedEntityBody < resultingArrayList.size(); indexGetPreloadedEntityBody++ ) {
				resultingArray[indexGetPreloadedEntityBody] = (byte)resultingArrayList.get(indexGetPreloadedEntityBody);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsEntireEntityBodyIsPreloaded() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsEntireEntityBodyIsPreloaded");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetTotalEntityBodyLength() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.OverflowException {
        try {
            return (int)classInstance.Invoke("GetTotalEntityBodyLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadEntityBody(byte[] buffer, int size) throws Throwable {
        try {
            return (int)classInstance.Invoke("ReadEntityBody", buffer, size);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetUnknownRequestHeader(java.lang.String name) throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetUnknownRequestHeader", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetBytesRead() throws Throwable {
        try {
            return (long)classInstance.Invoke("GetBytesRead");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendCalculatedContentLength(int contentLength) throws Throwable {
        try {
            classInstance.Invoke("SendCalculatedContentLength", contentLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SendCalculatedContentLength(long contentLength) throws Throwable, system.OverflowException {
        try {
            classInstance.Invoke("SendCalculatedContentLength", contentLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean HeadersSent() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("HeadersSent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsClientConnected() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsClientConnected");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CloseConnection() throws Throwable {
        try {
            classInstance.Invoke("CloseConnection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetClientCertificateValidFrom() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException {
        try {
            JCObject objGetClientCertificateValidFrom = (JCObject)classInstance.Invoke("GetClientCertificateValidFrom");
            return new DateTime(objGetClientCertificateValidFrom);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetClientCertificateValidUntil() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidTimeZoneException, system.OverflowException, system.NotSupportedException {
        try {
            JCObject objGetClientCertificateValidUntil = (JCObject)classInstance.Invoke("GetClientCertificateValidUntil");
            return new DateTime(objGetClientCertificateValidUntil);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetClientCertificateEncoding() throws Throwable {
        try {
            return (int)classInstance.Invoke("GetClientCertificateEncoding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int ReadEntityBody(byte[] buffer, int offset, int size) throws Throwable {
        try {
            return (int)classInstance.Invoke("ReadEntityBody", buffer, offset, size);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetClientCertificate() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetClientCertificate");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetClientCertificate = 0; indexGetClientCertificate < resultingArrayList.size(); indexGetClientCertificate++ ) {
				resultingArray[indexGetClientCertificate] = (byte)resultingArrayList.get(indexGetClientCertificate);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetClientCertificateBinaryIssuer() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetClientCertificateBinaryIssuer");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetClientCertificateBinaryIssuer = 0; indexGetClientCertificateBinaryIssuer < resultingArrayList.size(); indexGetClientCertificateBinaryIssuer++ ) {
				resultingArray[indexGetClientCertificateBinaryIssuer] = (byte)resultingArrayList.get(indexGetClientCertificateBinaryIssuer);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetClientCertificatePublicKey() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetClientCertificatePublicKey");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetClientCertificatePublicKey = 0; indexGetClientCertificatePublicKey < resultingArrayList.size(); indexGetClientCertificatePublicKey++ ) {
				resultingArray[indexGetClientCertificatePublicKey] = (byte)resultingArrayList.get(indexGetClientCertificatePublicKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getMachineConfigPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MachineConfigPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRootWebConfigPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RootWebConfigPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMachineInstallDirectory() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MachineInstallDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsAsyncFlush() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsAsyncFlush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsAsyncRead() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsAsyncRead");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getRequestTraceIdentifier() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RequestTraceIdentifier");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}