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
import system.security.claims.ClaimsPrincipal;
import system.TimeSpan;
import system.xml.UniqueId;
import system.identitymodel.tokens.SymmetricSecurityKey;
import system.DateTime;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.identitymodel.tokens.SecurityKeyIdentifierClause;
import system.identitymodel.tokens.SecurityKey;
import system.Uri;


/**
 * The base .NET class managing System.IdentityModel.Tokens.SessionSecurityToken, System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SessionSecurityToken extends NetObject  {
    public static final String assemblyFullName = "System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.IdentityModel";
    public static final String className = "System.IdentityModel.Tokens.SessionSecurityToken";
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

    public SessionSecurityToken(Object instance) throws Throwable {
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

    public static SessionSecurityToken castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SessionSecurityToken(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SessionSecurityToken(ClaimsPrincipal claimsPrincipal) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)claimsPrincipal.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SessionSecurityToken(ClaimsPrincipal claimsPrincipal, TimeSpan lifetime) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)claimsPrincipal.getJCOInstance(), (Object)lifetime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SessionSecurityToken(ClaimsPrincipal claimsPrincipal, java.lang.String context) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)claimsPrincipal.getJCOInstance(), (Object)context);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SessionSecurityToken(ClaimsPrincipal claimsPrincipal, UniqueId contextId, java.lang.String context, java.lang.String endpointId, TimeSpan lifetime, SymmetricSecurityKey key) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)claimsPrincipal.getJCOInstance(), (Object)contextId.getJCOInstance(), (Object)context, (Object)endpointId, (Object)lifetime.getJCOInstance(), (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SessionSecurityToken(ClaimsPrincipal claimsPrincipal, UniqueId contextId, java.lang.String context, java.lang.String endpointId, DateTime validFrom, TimeSpan lifetime, SymmetricSecurityKey key) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.NotSupportedException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)claimsPrincipal.getJCOInstance(), (Object)contextId.getJCOInstance(), (Object)context, (Object)endpointId, (Object)validFrom.getJCOInstance(), (Object)lifetime.getJCOInstance(), (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.UriFormatException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.OverflowException, system.MulticastNotSupportedException, system.NotSupportedException, system.runtime.serialization.SerializationException, system.NullReferenceException {
        try {
            classInstance.Invoke("GetObjectData", (Object)info.getJCOInstance(), (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean MatchesKeyIdentifierClause(SecurityKeyIdentifierClause keyIdentifierClause) throws Throwable {
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
    
    
    public ClaimsPrincipal getClaimsPrincipal() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClaimsPrincipal");
            return new ClaimsPrincipal(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getContext() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Context");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UniqueId getContextId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContextId");
            return new UniqueId(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getEndpointId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("EndpointId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getKeyEffectiveTime() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyEffectiveTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getKeyExpirationTime() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyExpirationTime");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UniqueId getKeyGeneration() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyGeneration");
            return new UniqueId(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsPersistent() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsPersistent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsPersistent(boolean IsPersistent) throws Throwable {
        try {
            classInstance.Set("IsPersistent", IsPersistent);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsReferenceMode() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsReferenceMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsReferenceMode(boolean IsReferenceMode) throws Throwable {
        try {
            classInstance.Set("IsReferenceMode", IsReferenceMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getSecureConversationVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecureConversationVersion");
            return new Uri(val);
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



	// Instance Events section
    
    
}