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

package system.identitymodel.tokens;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.principal.TokenImpersonationLevel;
import system.net.NetworkCredential;
import system.identitymodel.tokens.SecurityKeyIdentifierClause;
import system.identitymodel.tokens.SecurityKey;
import system.DateTime;
import system.identitymodel.tokens.SymmetricSecurityKey;


/**
 * The base .NET class managing System.IdentityModel.Tokens.KerberosRequestorSecurityToken, System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class KerberosRequestorSecurityToken extends NetObject  {
    public static final String assemblyFullName = "System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.IdentityModel";
    public static final String className = "System.IdentityModel.Tokens.KerberosRequestorSecurityToken";
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

    public KerberosRequestorSecurityToken(Object instance) throws Throwable {
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

    public static KerberosRequestorSecurityToken castFrom(IJCOBridgeReflected from) throws Throwable {
        return new KerberosRequestorSecurityToken(from.getJCOInstance());
    }

    // Constructors section
    
    
    public KerberosRequestorSecurityToken(java.lang.String servicePrincipalName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException, system.AccessViolationException, system.NotSupportedException, system.OverflowException, system.identitymodel.tokens.SecurityTokenValidationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)servicePrincipalName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public KerberosRequestorSecurityToken(java.lang.String servicePrincipalName, TokenImpersonationLevel tokenImpersonationLevel, NetworkCredential networkCredential, java.lang.String id) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException, system.AccessViolationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.identitymodel.tokens.SecurityTokenValidationException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)servicePrincipalName, (Object)tokenImpersonationLevel.getJCOInstance(), (Object)networkCredential.getJCOInstance(), (Object)id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public byte[] GetRequest() throws Throwable, system.ArgumentException, system.MulticastNotSupportedException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.FormatException, system.ArgumentOutOfRangeException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetRequest");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexGetRequest = 0; indexGetRequest < resultingArrayList.size(); indexGetRequest++ ) {
				resultingArray[indexGetRequest] = (byte)resultingArrayList.get(indexGetRequest);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MatchesKeyIdentifierClause(SecurityKeyIdentifierClause keyIdentifierClause) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ApplicationException, system.NotSupportedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.collections.generic.KeyNotFoundException {
        try {
            return (boolean)classInstance.Invoke("MatchesKeyIdentifierClause", (Object)keyIdentifierClause.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityKey ResolveKeyIdentifierClause(SecurityKeyIdentifierClause keyIdentifierClause) throws Throwable {
        try {
            JCObject objResolveKeyIdentifierClause = (JCObject)classInstance.Invoke("ResolveKeyIdentifierClause", (Object)keyIdentifierClause.getJCOInstance());
            return new SecurityKey(objResolveKeyIdentifierClause);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getValidFrom() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValidFrom");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getValidTo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValidTo");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getServicePrincipalName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ServicePrincipalName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SymmetricSecurityKey getSecurityKey() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityKey");
            return new SymmetricSecurityKey(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}