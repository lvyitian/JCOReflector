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

package system.security.cryptography;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.cryptography.KeySizes;
import system.security.cryptography.CipherMode;
import system.security.cryptography.PaddingMode;


/**
 * The base .NET class managing System.Security.Cryptography.RC2CryptoServiceProvider, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class RC2CryptoServiceProvider extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Security.Cryptography.RC2CryptoServiceProvider";
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

    public RC2CryptoServiceProvider(Object instance) throws Throwable {
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

    public static RC2CryptoServiceProvider castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RC2CryptoServiceProvider(from.getJCOInstance());
    }

    // Constructors section
    
    
    public RC2CryptoServiceProvider() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.NotSupportedException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean ValidKeySize(int bitLength) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("ValidKeySize", bitLength);
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

    public void Clear() throws Throwable {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getEffectiveKeySize() throws Throwable {
        try {
            return (int)classInstance.Get("EffectiveKeySize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEffectiveKeySize(int EffectiveKeySize) throws Throwable {
        try {
            classInstance.Set("EffectiveKeySize", EffectiveKeySize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseSalt() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseSalt");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseSalt(boolean UseSalt) throws Throwable {
        try {
            classInstance.Set("UseSalt", UseSalt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getKeySize() throws Throwable {
        try {
            return (int)classInstance.Get("KeySize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeySize(int KeySize) throws Throwable {
        try {
            classInstance.Set("KeySize", KeySize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBlockSize() throws Throwable {
        try {
            return (int)classInstance.Get("BlockSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBlockSize(int BlockSize) throws Throwable {
        try {
            classInstance.Set("BlockSize", BlockSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getFeedbackSize() throws Throwable {
        try {
            return (int)classInstance.Get("FeedbackSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFeedbackSize(int FeedbackSize) throws Throwable {
        try {
            classInstance.Set("FeedbackSize", FeedbackSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getIV() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("IV");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexIV = 0; indexIV < resultingArrayList.size(); indexIV++ ) {
				resultingArray[indexIV] = (byte)resultingArrayList.get(indexIV);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIV(byte[] IV) throws Throwable {
        try {
            classInstance.Set("IV", IV);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getKey() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Key");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexKey = 0; indexKey < resultingArrayList.size(); indexKey++ ) {
				resultingArray[indexKey] = (byte)resultingArrayList.get(indexKey);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKey(byte[] Key) throws Throwable {
        try {
            classInstance.Set("Key", Key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeySizes[] getLegalBlockSizes() throws Throwable {
        try {
            ArrayList<KeySizes> resultingArrayList = new ArrayList<KeySizes>();
            JCObject resultingObjects = (JCObject)classInstance.Get("LegalBlockSizes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new KeySizes(resultingObject));
            }
            KeySizes[] resultingArray = new KeySizes[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KeySizes[] getLegalKeySizes() throws Throwable {
        try {
            ArrayList<KeySizes> resultingArrayList = new ArrayList<KeySizes>();
            JCObject resultingObjects = (JCObject)classInstance.Get("LegalKeySizes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new KeySizes(resultingObject));
            }
            KeySizes[] resultingArray = new KeySizes[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CipherMode getMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Mode");
            return new CipherMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMode(CipherMode Mode) throws Throwable {
        try {
            classInstance.Set("Mode", (Object)Mode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PaddingMode getPadding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Padding");
            return new PaddingMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPadding(PaddingMode Padding) throws Throwable {
        try {
            classInstance.Set("Padding", (Object)Padding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}