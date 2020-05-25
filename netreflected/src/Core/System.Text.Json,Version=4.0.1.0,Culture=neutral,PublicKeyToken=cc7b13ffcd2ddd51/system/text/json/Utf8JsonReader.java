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

package system.text.json;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.SByte;
import system.UInt16;
import system.UInt32;
import system.UInt64;
import system.Single;
import system.Decimal;
import system.DateTime;
import system.DateTimeOffset;
import system.Guid;
import system.text.json.JsonTokenType;
import system.SequencePosition;
import system.text.json.JsonReaderState;


/**
 * The base .NET class managing System.Text.Json.Utf8JsonReader, System.Text.Json, Version=4.0.1.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class Utf8JsonReader extends NetObject  {
    public static final String assemblyFullName = "System.Text.Json, Version=4.0.1.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Text.Json";
    public static final String className = "System.Text.Json.Utf8JsonReader";
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

    public Utf8JsonReader(Object instance) throws Throwable {
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

    public static Utf8JsonReader castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Utf8JsonReader(from.getJCOInstance());
    }

    // Constructors section
    
    

    
    // Methods section
    
    
    public java.lang.String GetString() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        try {
            return (java.lang.String)classInstance.Invoke("GetString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetComment() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        try {
            return (java.lang.String)classInstance.Invoke("GetComment");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GetBoolean() throws Throwable, system.ArgumentException, system.ArrayTypeMismatchException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.globalization.CultureNotFoundException {
        try {
            return (boolean)classInstance.Invoke("GetBoolean");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] GetBytesFromBase64() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetBytesFromBase64");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetBytesFromBase64 = 0; indexGetBytesFromBase64 < resultingArrayList.size(); indexGetBytesFromBase64++ ) {
				resultingArray[indexGetBytesFromBase64] = (byte)resultingArrayList.get(indexGetBytesFromBase64);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte GetByte() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            return (byte)classInstance.Invoke("GetByte");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SByte GetSByte() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            JCObject objGetSByte = (JCObject)classInstance.Invoke("GetSByte");
            return new SByte(objGetSByte);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short GetInt16() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            return (short)classInstance.Invoke("GetInt16");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetInt32() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            return (int)classInstance.Invoke("GetInt32");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long GetInt64() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            return (long)classInstance.Invoke("GetInt64");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 GetUInt16() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            JCObject objGetUInt16 = (JCObject)classInstance.Invoke("GetUInt16");
            return new UInt16(objGetUInt16);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt32 GetUInt32() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            JCObject objGetUInt32 = (JCObject)classInstance.Invoke("GetUInt32");
            return new UInt32(objGetUInt32);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 GetUInt64() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            JCObject objGetUInt64 = (JCObject)classInstance.Invoke("GetUInt64");
            return new UInt64(objGetUInt64);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single GetSingle() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.OverflowException {
        try {
            JCObject objGetSingle = (JCObject)classInstance.Invoke("GetSingle");
            return new Single(objGetSingle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double GetDouble() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException, system.OverflowException {
        try {
            return (double)classInstance.Invoke("GetDouble");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Decimal GetDecimal() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.IndexOutOfRangeException {
        try {
            JCObject objGetDecimal = (JCObject)classInstance.Invoke("GetDecimal");
            return new Decimal(objGetDecimal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime GetDateTime() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.IndexOutOfRangeException, system.OverflowException {
        try {
            JCObject objGetDateTime = (JCObject)classInstance.Invoke("GetDateTime");
            return new DateTime(objGetDateTime);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeOffset GetDateTimeOffset() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            JCObject objGetDateTimeOffset = (JCObject)classInstance.Invoke("GetDateTimeOffset");
            return new DateTimeOffset(objGetDateTimeOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid GetGuid() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            JCObject objGetGuid = (JCObject)classInstance.Invoke("GetGuid");
            return new Guid(objGetGuid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Read() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.text.json.JsonException, system.InvalidOperationException {
        try {
            return (boolean)classInstance.Invoke("Read");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Skip() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.text.json.JsonException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("Skip");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean TrySkip() throws Throwable, system.ArgumentNullException, system.text.json.JsonException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("TrySkip");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ValueTextEquals(java.lang.String text) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.IndexOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("ValueTextEquals", (Object)text);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public long getBytesConsumed() throws Throwable {
        try {
            return (long)classInstance.Get("BytesConsumed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getTokenStartIndex() throws Throwable {
        try {
            return (long)classInstance.Get("TokenStartIndex");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTokenStartIndex(long TokenStartIndex) throws Throwable {
        try {
            classInstance.Set("TokenStartIndex", TokenStartIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCurrentDepth() throws Throwable {
        try {
            return (int)classInstance.Get("CurrentDepth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonTokenType getTokenType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TokenType");
            return new JsonTokenType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasValueSequence() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasValueSequence");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHasValueSequence(boolean HasValueSequence) throws Throwable {
        try {
            classInstance.Set("HasValueSequence", HasValueSequence);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFinalBlock() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFinalBlock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SequencePosition getPosition() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Position");
            return new SequencePosition(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public JsonReaderState getCurrentState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CurrentState");
            return new JsonReaderState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}