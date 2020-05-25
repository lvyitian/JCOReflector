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

package system.data.sqlclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section


/**
 * The base .NET class managing System.Data.SqlClient.SqlColumnEncryptionCspProvider, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SqlColumnEncryptionCspProvider extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.SqlClient.SqlColumnEncryptionCspProvider";
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

    public SqlColumnEncryptionCspProvider(Object instance) throws Throwable {
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

    public static SqlColumnEncryptionCspProvider castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SqlColumnEncryptionCspProvider(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SqlColumnEncryptionCspProvider() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public byte[] SignColumnMasterKeyMetadata(java.lang.String masterKeyPath, boolean allowEnclaveComputations) throws Throwable, system.NotSupportedException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("SignColumnMasterKeyMetadata", (Object)masterKeyPath, allowEnclaveComputations);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexSignColumnMasterKeyMetadata = 0; indexSignColumnMasterKeyMetadata < resultingArrayList.size(); indexSignColumnMasterKeyMetadata++ ) {
				resultingArray[indexSignColumnMasterKeyMetadata] = (byte)resultingArrayList.get(indexSignColumnMasterKeyMetadata);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean VerifyColumnMasterKeyMetadata(java.lang.String masterKeyPath, boolean allowEnclaveComputations, byte[] signature) throws Throwable, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("VerifyColumnMasterKeyMetadata", (Object)masterKeyPath, allowEnclaveComputations, signature);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] DecryptColumnEncryptionKey(java.lang.String masterKeyPath, java.lang.String encryptionAlgorithm, byte[] encryptedColumnEncryptionKey) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.security.cryptography.CryptographicException, system.RankException, system.OutOfMemoryException, system.security.accesscontrol.PrivilegeNotHeldException, system.NullReferenceException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.security.cryptography.CryptographicUnexpectedOperationException, system.ApplicationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("DecryptColumnEncryptionKey", (Object)masterKeyPath, (Object)encryptionAlgorithm, encryptedColumnEncryptionKey);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexDecryptColumnEncryptionKey = 0; indexDecryptColumnEncryptionKey < resultingArrayList.size(); indexDecryptColumnEncryptionKey++ ) {
				resultingArray[indexDecryptColumnEncryptionKey] = (byte)resultingArrayList.get(indexDecryptColumnEncryptionKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] EncryptColumnEncryptionKey(java.lang.String masterKeyPath, java.lang.String encryptionAlgorithm, byte[] columnEncryptionKey) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.security.cryptography.CryptographicException, system.RankException, system.OutOfMemoryException, system.security.accesscontrol.PrivilegeNotHeldException, system.NullReferenceException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.security.cryptography.CryptographicUnexpectedOperationException, system.ApplicationException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("EncryptColumnEncryptionKey", (Object)masterKeyPath, (Object)encryptionAlgorithm, columnEncryptionKey);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexEncryptColumnEncryptionKey = 0; indexEncryptColumnEncryptionKey < resultingArrayList.size(); indexEncryptColumnEncryptionKey++ ) {
				resultingArray[indexEncryptColumnEncryptionKey] = (byte)resultingArrayList.get(indexEncryptColumnEncryptionKey);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}