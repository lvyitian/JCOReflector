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

package system.security.policy;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.policy.EvidenceBase;
import system.reflection.Assembly;
import system.security.cryptography.HashAlgorithm;
import system.security.policy.Hash;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;


/**
 * The base .NET class managing System.Security.Policy.Hash, System.Security.Permissions, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Policy.Hash" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Policy.Hash</a>
 */
public class Hash extends EvidenceBase  {
    /**
     * Fully assembly qualified name: System.Security.Permissions, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Security.Permissions, Version=4.0.3.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Security.Permissions
     */
    public static final String assemblyShortName = "System.Security.Permissions";
    /**
     * Qualified class name: System.Security.Policy.Hash
     */
    public static final String className = "System.Security.Policy.Hash";
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

    public Hash(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Hash}, a cast assert is made to check if types are compatible.
     */
    public static Hash cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Hash(from.getJCOInstance());
    }

    // Constructors section
    
    public Hash() throws Throwable {
    }

    public Hash(Assembly assembly) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(assembly == null ? null : assembly.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public byte[] GenerateHash(HashAlgorithm hashAlg) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GenerateHash", hashAlg == null ? null : hashAlg.getJCOInstance());
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGenerateHash = 0; indexGenerateHash < resultingArrayList.size(); indexGenerateHash++ ) {
				resultingArray[indexGenerateHash] = (byte)resultingArrayList.get(indexGenerateHash);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateMD5(byte[] md5) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMD5 = (JCObject)classType.Invoke("CreateMD5", (Object)md5);
            return new Hash(objCreateMD5);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateMD5(JCRefOut dupParam0) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateMD5 = (JCObject)classType.Invoke("CreateMD5", (Object)dupParam0);
            return new Hash(objCreateMD5);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateSHA1(byte[] sha1) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSHA1 = (JCObject)classType.Invoke("CreateSHA1", (Object)sha1);
            return new Hash(objCreateSHA1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateSHA1(JCRefOut dupParam0) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSHA1 = (JCObject)classType.Invoke("CreateSHA1", (Object)dupParam0);
            return new Hash(objCreateSHA1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateSHA256(byte[] sha256) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSHA256 = (JCObject)classType.Invoke("CreateSHA256", (Object)sha256);
            return new Hash(objCreateSHA256);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Hash CreateSHA256(JCRefOut dupParam0) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateSHA256 = (JCObject)classType.Invoke("CreateSHA256", (Object)dupParam0);
            return new Hash(objCreateSHA256);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GetObjectData", info == null ? null : info.getJCOInstance(), context == null ? null : context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public byte[] getMD5() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("MD5");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexMD5 = 0; indexMD5 < resultingArrayList.size(); indexMD5++ ) {
				resultingArray[indexMD5] = (byte)resultingArrayList.get(indexMD5);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSHA1() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SHA1");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSHA1 = 0; indexSHA1 < resultingArrayList.size(); indexSHA1++ ) {
				resultingArray[indexSHA1] = (byte)resultingArrayList.get(indexSHA1);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] getSHA256() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("SHA256");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
			for(int indexSHA256 = 0; indexSHA256 < resultingArrayList.size(); indexSHA256++ ) {
				resultingArray[indexSHA256] = (byte)resultingArrayList.get(indexSHA256);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}