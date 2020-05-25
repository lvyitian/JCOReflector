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

package system.text;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.text.Decoder;
import system.text.Encoder;
import system.text.NormalizationForm;
import system.text.EncoderFallback;
import system.text.DecoderFallback;


/**
 * The base .NET class managing System.Text.UTF32Encoding, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class UTF32Encoding extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Text.UTF32Encoding";
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

    public UTF32Encoding(Object instance) throws Throwable {
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

    public static UTF32Encoding castFrom(IJCOBridgeReflected from) throws Throwable {
        return new UTF32Encoding(from.getJCOInstance());
    }

    // Constructors section
    
    
    public UTF32Encoding() throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UTF32Encoding(boolean bigEndian, boolean byteOrderMark) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(bigEndian, byteOrderMark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UTF32Encoding(boolean bigEndian, boolean byteOrderMark, boolean throwOnInvalidCharacters) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(bigEndian, byteOrderMark, throwOnInvalidCharacters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public int GetByteCount(java.lang.String s) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetByteCount", (Object)s);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decoder GetDecoder() throws Throwable {
        try {
            JCObject objGetDecoder = (JCObject)classInstance.Invoke("GetDecoder");
            return new Decoder(objGetDecoder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoder GetEncoder() throws Throwable {
        try {
            JCObject objGetEncoder = (JCObject)classInstance.Invoke("GetEncoder");
            return new Encoder(objGetEncoder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMaxByteCount(int charCount) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetMaxByteCount", charCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetMaxCharCount(int byteCount) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetMaxCharCount", byteCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetPreamble() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetPreamble");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetPreamble = 0; indexGetPreamble < resultingArrayList.size(); indexGetPreamble++ ) {
				resultingArray[indexGetPreamble] = (byte)resultingArrayList.get(indexGetPreamble);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetByteCount(char[] chars, int index, int count) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetByteCount", chars, index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetBytes(java.lang.String s, int charIndex, int charCount, byte[] bytes, int byteIndex) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetBytes", (Object)s, charIndex, charCount, bytes, byteIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetBytes(char[] chars, int charIndex, int charCount, byte[] bytes, int byteIndex) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetBytes", chars, charIndex, charCount, bytes, byteIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetCharCount(byte[] bytes, int index, int count) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetCharCount", bytes, index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetChars(byte[] bytes, int byteIndex, int byteCount, char[] chars, int charIndex) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetChars", bytes, byteIndex, byteCount, chars, charIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetString(byte[] bytes, int index, int count) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetString", bytes, index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject Clone() throws Throwable {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new NetObject(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetByteCount(char[] chars) throws Throwable, system.ArgumentNullException {
        try {
            return (int)classInstance.Invoke("GetByteCount", chars);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetBytes(char[] chars) throws Throwable, system.ArgumentNullException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetBytes", chars);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetBytes(char[] chars, int index, int count) throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetBytes", chars, index, count);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetBytes(java.lang.String s) throws Throwable, system.ArgumentNullException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetBytes", (Object)s);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytes = 0; indexGetBytes < resultingArrayList.size(); indexGetBytes++ ) {
				resultingArray[indexGetBytes] = (byte)resultingArrayList.get(indexGetBytes);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetCharCount(byte[] bytes) throws Throwable, system.ArgumentNullException {
        try {
            return (int)classInstance.Invoke("GetCharCount", bytes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char[] GetChars(byte[] bytes) throws Throwable, system.ArgumentNullException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetChars", bytes);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            char[] resultingArray = new char[resultingArrayList.size()];
            for(int indexGetChars = 0; indexGetChars < resultingArrayList.size(); indexGetChars++ ) {
				resultingArray[indexGetChars] = (char)resultingArrayList.get(indexGetChars);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public char[] GetChars(byte[] bytes, int index, int count) throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetChars", bytes, index, count);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            char[] resultingArray = new char[resultingArrayList.size()];
            for(int indexGetChars = 0; indexGetChars < resultingArrayList.size(); indexGetChars++ ) {
				resultingArray[indexGetChars] = (char)resultingArrayList.get(indexGetChars);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAlwaysNormalized() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsAlwaysNormalized");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsAlwaysNormalized(NormalizationForm form) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsAlwaysNormalized", (Object)form.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetString(byte[] bytes) throws Throwable, system.ArgumentNullException {
        try {
            return (java.lang.String)classInstance.Invoke("GetString", bytes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getBodyName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("BodyName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getEncodingName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("EncodingName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHeaderName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HeaderName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWebName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("WebName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getWindowsCodePage() throws Throwable {
        try {
            return (int)classInstance.Get("WindowsCodePage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBrowserDisplay() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsBrowserDisplay");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsBrowserSave() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsBrowserSave");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsMailNewsDisplay() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsMailNewsDisplay");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsMailNewsSave() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsMailNewsSave");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSingleByte() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSingleByte");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EncoderFallback getEncoderFallback() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EncoderFallback");
            return new EncoderFallback(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncoderFallback(EncoderFallback EncoderFallback) throws Throwable {
        try {
            classInstance.Set("EncoderFallback", (Object)EncoderFallback.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DecoderFallback getDecoderFallback() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DecoderFallback");
            return new DecoderFallback(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDecoderFallback(DecoderFallback DecoderFallback) throws Throwable {
        try {
            classInstance.Set("DecoderFallback", (Object)DecoderFallback.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCodePage() throws Throwable {
        try {
            return (int)classInstance.Get("CodePage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}