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
import system.security.cryptography.HashAlgorithmName;


/**
 * The base .NET class managing System.Security.Cryptography.Rfc2898DeriveBytes, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class Rfc2898DeriveBytes extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Security.Cryptography.Rfc2898DeriveBytes";
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

    public Rfc2898DeriveBytes(Object instance) throws Throwable {
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

    public static Rfc2898DeriveBytes castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Rfc2898DeriveBytes(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Rfc2898DeriveBytes(java.lang.String password, int saltSize) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ApplicationException, system.NotSupportedException, system.TypeLoadException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)password, saltSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rfc2898DeriveBytes(java.lang.String password, int saltSize, int iterations) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ApplicationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.TypeLoadException, system.io.IOException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)password, saltSize, iterations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rfc2898DeriveBytes(java.lang.String password, int saltSize, int iterations, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.security.SecurityException, system.NotSupportedException, system.ApplicationException, system.globalization.CultureNotFoundException, system.TypeLoadException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)password, saltSize, iterations, (Object)hashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rfc2898DeriveBytes(java.lang.String password, byte[] salt) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ApplicationException, system.NotSupportedException, system.InvalidOperationException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)password, salt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rfc2898DeriveBytes(java.lang.String password, byte[] salt, int iterations) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ApplicationException, system.NotSupportedException, system.TypeLoadException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)password, salt, iterations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rfc2898DeriveBytes(java.lang.String password, byte[] salt, int iterations, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ApplicationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.TypeLoadException, system.io.IOException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)password, salt, iterations, (Object)hashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rfc2898DeriveBytes(byte[] password, byte[] salt, int iterations) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.security.SecurityException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ApplicationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.TypeLoadException, system.io.IOException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(password, salt, iterations);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rfc2898DeriveBytes(byte[] password, byte[] salt, int iterations, HashAlgorithmName hashAlgorithm) throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.IndexOutOfRangeException, system.InvalidOperationException, system.security.SecurityException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ApplicationException, system.globalization.CultureNotFoundException, system.TypeLoadException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(password, salt, iterations, (Object)hashAlgorithm.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public byte[] GetBytes(int cb) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetBytes", cb);
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

    public void Reset() throws Throwable {
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] CryptDeriveKey(java.lang.String algname, java.lang.String alghashname, int keySize, byte[] rgbIV) throws Throwable, system.security.cryptography.CryptographicException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.ApplicationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("CryptDeriveKey", (Object)algname, (Object)alghashname, keySize, rgbIV);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexCryptDeriveKey = 0; indexCryptDeriveKey < resultingArrayList.size(); indexCryptDeriveKey++ ) {
				resultingArray[indexCryptDeriveKey] = (byte)resultingArrayList.get(indexCryptDeriveKey);
            }
            return resultingArray;
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


    
    // Properties section
    
    
    public int getIterationCount() throws Throwable {
        try {
            return (int)classInstance.Get("IterationCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIterationCount(int IterationCount) throws Throwable {
        try {
            classInstance.Set("IterationCount", IterationCount);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSalt() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Salt");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSalt = 0; indexSalt < resultingArrayList.size(); indexSalt++ ) {
				resultingArray[indexSalt] = (byte)resultingArrayList.get(indexSalt);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSalt(byte[] Salt) throws Throwable {
        try {
            classInstance.Set("Salt", Salt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}