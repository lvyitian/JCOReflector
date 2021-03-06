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
 *      This code was generated from a template using JCOReflector
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
import system.text.Encoding;
import system.collections.specialized.NameValueCollection;
import system.io.TextWriter;


/**
 * The base .NET class managing System.Web.HttpUtility, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.HttpUtility" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.HttpUtility</a>
 */
public class HttpUtility extends NetObject  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.HttpUtility
     */
    public static final String className = "System.Web.HttpUtility";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public HttpUtility(Object instance) throws Throwable {
        super(instance);
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link HttpUtility}, a cast assert is made to check if types are compatible.
     */
    public static HttpUtility cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new HttpUtility(from.getJCOInstance());
    }

    // Constructors section
    
    public HttpUtility() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static byte[] UrlDecodeToBytes(byte[] bytes) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlDecodeToBytes", (Object)bytes);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlDecodeToBytes = 0; indexUrlDecodeToBytes < resultingArrayList.size(); indexUrlDecodeToBytes++ ) {
				resultingArray[indexUrlDecodeToBytes] = (byte)resultingArrayList.get(indexUrlDecodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlDecodeToBytes(JCRefOut dupParam0) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlDecodeToBytes", (Object)dupParam0);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlDecodeToBytes = 0; indexUrlDecodeToBytes < resultingArrayList.size(); indexUrlDecodeToBytes++ ) {
				resultingArray[indexUrlDecodeToBytes] = (byte)resultingArrayList.get(indexUrlDecodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlDecodeToBytes(byte[] bytes, int offset, int count) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlDecodeToBytes", bytes, offset, count);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlDecodeToBytes = 0; indexUrlDecodeToBytes < resultingArrayList.size(); indexUrlDecodeToBytes++ ) {
				resultingArray[indexUrlDecodeToBytes] = (byte)resultingArrayList.get(indexUrlDecodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlDecodeToBytes(JCRefOut dupParam0, int dupParam1, int dupParam2) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlDecodeToBytes", dupParam0, dupParam1, dupParam2);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlDecodeToBytes = 0; indexUrlDecodeToBytes < resultingArrayList.size(); indexUrlDecodeToBytes++ ) {
				resultingArray[indexUrlDecodeToBytes] = (byte)resultingArrayList.get(indexUrlDecodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlDecodeToBytes(java.lang.String str) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlDecodeToBytes", str);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlDecodeToBytes = 0; indexUrlDecodeToBytes < resultingArrayList.size(); indexUrlDecodeToBytes++ ) {
				resultingArray[indexUrlDecodeToBytes] = (byte)resultingArrayList.get(indexUrlDecodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlDecodeToBytes(java.lang.String str, Encoding e) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlDecodeToBytes", str, e == null ? null : e.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlDecodeToBytes = 0; indexUrlDecodeToBytes < resultingArrayList.size(); indexUrlDecodeToBytes++ ) {
				resultingArray[indexUrlDecodeToBytes] = (byte)resultingArrayList.get(indexUrlDecodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlEncodeToBytes(byte[] bytes) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlEncodeToBytes", (Object)bytes);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlEncodeToBytes = 0; indexUrlEncodeToBytes < resultingArrayList.size(); indexUrlEncodeToBytes++ ) {
				resultingArray[indexUrlEncodeToBytes] = (byte)resultingArrayList.get(indexUrlEncodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlEncodeToBytes(JCRefOut dupParam0) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlEncodeToBytes", (Object)dupParam0);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlEncodeToBytes = 0; indexUrlEncodeToBytes < resultingArrayList.size(); indexUrlEncodeToBytes++ ) {
				resultingArray[indexUrlEncodeToBytes] = (byte)resultingArrayList.get(indexUrlEncodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlEncodeToBytes(byte[] bytes, int offset, int count) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlEncodeToBytes", bytes, offset, count);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlEncodeToBytes = 0; indexUrlEncodeToBytes < resultingArrayList.size(); indexUrlEncodeToBytes++ ) {
				resultingArray[indexUrlEncodeToBytes] = (byte)resultingArrayList.get(indexUrlEncodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlEncodeToBytes(JCRefOut dupParam0, int dupParam1, int dupParam2) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlEncodeToBytes", dupParam0, dupParam1, dupParam2);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlEncodeToBytes = 0; indexUrlEncodeToBytes < resultingArrayList.size(); indexUrlEncodeToBytes++ ) {
				resultingArray[indexUrlEncodeToBytes] = (byte)resultingArrayList.get(indexUrlEncodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlEncodeToBytes(java.lang.String str) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlEncodeToBytes", str);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlEncodeToBytes = 0; indexUrlEncodeToBytes < resultingArrayList.size(); indexUrlEncodeToBytes++ ) {
				resultingArray[indexUrlEncodeToBytes] = (byte)resultingArrayList.get(indexUrlEncodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlEncodeToBytes(java.lang.String str, Encoding e) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlEncodeToBytes", str, e == null ? null : e.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlEncodeToBytes = 0; indexUrlEncodeToBytes < resultingArrayList.size(); indexUrlEncodeToBytes++ ) {
				resultingArray[indexUrlEncodeToBytes] = (byte)resultingArrayList.get(indexUrlEncodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte[] UrlEncodeUnicodeToBytes(java.lang.String str) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("UrlEncodeUnicodeToBytes", str);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexUrlEncodeUnicodeToBytes = 0; indexUrlEncodeUnicodeToBytes < resultingArrayList.size(); indexUrlEncodeUnicodeToBytes++ ) {
				resultingArray[indexUrlEncodeUnicodeToBytes] = (byte)resultingArrayList.get(indexUrlEncodeUnicodeToBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NameValueCollection ParseQueryString(java.lang.String query) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.configuration.ConfigurationErrorsException, system.IndexOutOfRangeException, system.InvalidOperationException, system.threading.ThreadAbortException, system.NotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParseQueryString = (JCObject)classType.Invoke("ParseQueryString", query);
            return new NameValueCollection(objParseQueryString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NameValueCollection ParseQueryString(java.lang.String query, Encoding encoding) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.InvalidOperationException, system.threading.ThreadAbortException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParseQueryString = (JCObject)classType.Invoke("ParseQueryString", query, encoding == null ? null : encoding.getJCOInstance());
            return new NameValueCollection(objParseQueryString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String HtmlAttributeEncode(java.lang.String s) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.OverflowException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("HtmlAttributeEncode", s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String HtmlDecode(java.lang.String s) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("HtmlDecode", s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String HtmlEncode(NetObject value) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.threading.ThreadAbortException, system.configuration.ConfigurationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("HtmlEncode", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String HtmlEncode(java.lang.String s) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("HtmlEncode", s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String JavaScriptStringEncode(java.lang.String value) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("JavaScriptStringEncode", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String JavaScriptStringEncode(java.lang.String value, boolean addDoubleQuotes) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("JavaScriptStringEncode", value, addDoubleQuotes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlDecode(byte[] bytes, int offset, int count, Encoding e) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlDecode", bytes, offset, count, e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlDecode(JCRefOut dupParam0, int dupParam1, int dupParam2, Encoding dupParam3) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlDecode", dupParam0, dupParam1, dupParam2, dupParam3 == null ? null : dupParam3.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlDecode(byte[] bytes, Encoding e) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlDecode", bytes, e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlDecode(JCRefOut dupParam0, Encoding dupParam1) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlDecode", dupParam0, dupParam1 == null ? null : dupParam1.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlDecode(java.lang.String str) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlDecode", str);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlDecode(java.lang.String str, Encoding e) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlDecode", str, e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlEncode(byte[] bytes) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlEncode", (Object)bytes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlEncode(JCRefOut dupParam0) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlEncode", (Object)dupParam0);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlEncode(byte[] bytes, int offset, int count) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlEncode", bytes, offset, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlEncode(JCRefOut dupParam0, int dupParam1, int dupParam2) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlEncode", dupParam0, dupParam1, dupParam2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlEncode(java.lang.String str) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.threading.ThreadAbortException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlEncode", str);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlEncode(java.lang.String str, Encoding e) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlEncode", str, e == null ? null : e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlEncodeUnicode(java.lang.String str) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlEncodeUnicode", str);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String UrlPathEncode(java.lang.String str) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.FormatException, system.security.SecurityException, system.UriFormatException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("UrlPathEncode", str);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void HtmlAttributeEncode(java.lang.String s, TextWriter output) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.web.HttpException, system.configuration.ConfigurationErrorsException, system.configuration.ConfigurationException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OverflowException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("HtmlAttributeEncode", s, output == null ? null : output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void HtmlDecode(java.lang.String s, TextWriter output) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("HtmlDecode", s, output == null ? null : output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void HtmlEncode(java.lang.String s, TextWriter output) throws Throwable, system.ArgumentException, system.InvalidOperationException, system.threading.ThreadAbortException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("HtmlEncode", s, output == null ? null : output.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}