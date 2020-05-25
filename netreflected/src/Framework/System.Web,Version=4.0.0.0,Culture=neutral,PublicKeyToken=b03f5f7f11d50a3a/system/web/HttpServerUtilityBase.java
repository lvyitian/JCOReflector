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

package system.web;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.TextWriter;
import system.collections.specialized.NameValueCollection;


/**
 * The base .NET class managing System.Web.HttpServerUtilityBase, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class HttpServerUtilityBase extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.HttpServerUtilityBase";
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

    public HttpServerUtilityBase(Object instance) throws Throwable {
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

    public static HttpServerUtilityBase castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HttpServerUtilityBase(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void ClearError() throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("ClearError");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateObject(java.lang.String progID) throws Throwable, system.NotImplementedException {
        try {
            JCObject objCreateObject = (JCObject)classInstance.Invoke("CreateObject", (Object)progID);
            return new NetObject(objCreateObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateObject(NetType type) throws Throwable, system.NotImplementedException {
        try {
            JCObject objCreateObject = (JCObject)classInstance.Invoke("CreateObject", (Object)type.getJCOInstance());
            return new NetObject(objCreateObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateObjectFromClsid(java.lang.String clsid) throws Throwable, system.NotImplementedException {
        try {
            JCObject objCreateObjectFromClsid = (JCObject)classInstance.Invoke("CreateObjectFromClsid", (Object)clsid);
            return new NetObject(objCreateObjectFromClsid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Execute(java.lang.String path) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("Execute", (Object)path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Execute(java.lang.String path, TextWriter writer) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("Execute", (Object)path, (Object)writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Execute(java.lang.String path, boolean preserveForm) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("Execute", (Object)path, preserveForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Execute(java.lang.String path, TextWriter writer, boolean preserveForm) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("Execute", (Object)path, (Object)writer.getJCOInstance(), preserveForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetException GetLastError() throws Throwable, system.NotImplementedException {
        try {
            JCObject objGetLastError = (JCObject)classInstance.Invoke("GetLastError");
            return new NetException(objGetLastError);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String HtmlDecode(java.lang.String s) throws Throwable, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("HtmlDecode", (Object)s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void HtmlDecode(java.lang.String s, TextWriter output) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("HtmlDecode", (Object)s, (Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String HtmlEncode(java.lang.String s) throws Throwable, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("HtmlEncode", (Object)s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void HtmlEncode(java.lang.String s, TextWriter output) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("HtmlEncode", (Object)s, (Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String MapPath(java.lang.String path) throws Throwable, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("MapPath", (Object)path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transfer(java.lang.String path, boolean preserveForm) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("Transfer", (Object)path, preserveForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transfer(java.lang.String path) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("Transfer", (Object)path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TransferRequest(java.lang.String path) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("TransferRequest", (Object)path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TransferRequest(java.lang.String path, boolean preserveForm) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("TransferRequest", (Object)path, preserveForm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TransferRequest(java.lang.String path, boolean preserveForm, java.lang.String method, NameValueCollection headers) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("TransferRequest", (Object)path, preserveForm, (Object)method, (Object)headers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TransferRequest(java.lang.String path, boolean preserveForm, java.lang.String method, NameValueCollection headers, boolean preserveUser) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("TransferRequest", (Object)path, preserveForm, (Object)method, (Object)headers.getJCOInstance(), preserveUser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String UrlDecode(java.lang.String s) throws Throwable, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("UrlDecode", (Object)s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UrlDecode(java.lang.String s, TextWriter output) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("UrlDecode", (Object)s, (Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String UrlEncode(java.lang.String s) throws Throwable, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("UrlEncode", (Object)s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UrlEncode(java.lang.String s, TextWriter output) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("UrlEncode", (Object)s, (Object)output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String UrlPathEncode(java.lang.String s) throws Throwable, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("UrlPathEncode", (Object)s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] UrlTokenDecode(java.lang.String input) throws Throwable, system.NotImplementedException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("UrlTokenDecode", (Object)input);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlTokenDecode = 0; indexUrlTokenDecode < resultingArrayList.size(); indexUrlTokenDecode++ ) {
				resultingArray[indexUrlTokenDecode] = (byte)resultingArrayList.get(indexUrlTokenDecode);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String UrlTokenEncode(byte[] input) throws Throwable, system.NotImplementedException {
        try {
            return (java.lang.String)classInstance.Invoke("UrlTokenEncode", input);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getMachineName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MachineName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getScriptTimeout() throws Throwable {
        try {
            return (int)classInstance.Get("ScriptTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setScriptTimeout(int ScriptTimeout) throws Throwable {
        try {
            classInstance.Set("ScriptTimeout", ScriptTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}