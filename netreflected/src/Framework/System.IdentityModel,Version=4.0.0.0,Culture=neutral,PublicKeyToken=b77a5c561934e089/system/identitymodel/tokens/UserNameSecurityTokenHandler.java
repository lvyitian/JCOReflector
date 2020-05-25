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
import system.xml.XmlReader;
import system.identitymodel.tokens.SecurityToken;
import system.xml.XmlWriter;
import system.identitymodel.selectors.SecurityTokenResolver;
import system.identitymodel.tokens.SecurityKeyIdentifierClause;
import system.identitymodel.tokens.SecurityTokenDescriptor;
import system.xml.XmlNodeList;
import system.identitymodel.tokens.SecurityTokenHandlerConfiguration;
import system.identitymodel.tokens.SecurityTokenHandlerCollection;


/**
 * The base .NET class managing System.IdentityModel.Tokens.UserNameSecurityTokenHandler, System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class UserNameSecurityTokenHandler extends NetObject  {
    public static final String assemblyFullName = "System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.IdentityModel";
    public static final String className = "System.IdentityModel.Tokens.UserNameSecurityTokenHandler";
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

    public UserNameSecurityTokenHandler(Object instance) throws Throwable {
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

    public static UserNameSecurityTokenHandler castFrom(IJCOBridgeReflected from) throws Throwable {
        return new UserNameSecurityTokenHandler(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public boolean CanReadToken(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (boolean)classInstance.Invoke("CanReadToken", (Object)reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetTokenTypeIdentifiers() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetTokenTypeIdentifiers");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetTokenTypeIdentifiers = 0; indexGetTokenTypeIdentifiers < resultingArrayList.size(); indexGetTokenTypeIdentifiers++ ) {
				resultingArray[indexGetTokenTypeIdentifiers] = (java.lang.String)resultingArrayList.get(indexGetTokenTypeIdentifiers);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityToken ReadToken(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.xml.XmlException {
        try {
            JCObject objReadToken = (JCObject)classInstance.Invoke("ReadToken", (Object)reader.getJCOInstance());
            return new SecurityToken(objReadToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteToken(XmlWriter writer, SecurityToken token) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("WriteToken", (Object)writer.getJCOInstance(), (Object)token.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanReadToken(java.lang.String tokenString) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CanReadToken", (Object)tokenString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityToken ReadToken(XmlReader reader, SecurityTokenResolver tokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException {
        try {
            JCObject objReadToken = (JCObject)classInstance.Invoke("ReadToken", (Object)reader.getJCOInstance(), (Object)tokenResolver.getJCOInstance());
            return new SecurityToken(objReadToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityToken ReadToken(java.lang.String tokenString) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objReadToken = (JCObject)classInstance.Invoke("ReadToken", (Object)tokenString);
            return new SecurityToken(objReadToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String WriteToken(SecurityToken token) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("WriteToken", (Object)token.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanReadKeyIdentifierClause(XmlReader reader) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CanReadKeyIdentifierClause", (Object)reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityKeyIdentifierClause ReadKeyIdentifierClause(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objReadKeyIdentifierClause = (JCObject)classInstance.Invoke("ReadKeyIdentifierClause", (Object)reader.getJCOInstance());
            return new SecurityKeyIdentifierClause(objReadKeyIdentifierClause);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CanWriteKeyIdentifierClause(SecurityKeyIdentifierClause securityKeyIdentifierClause) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CanWriteKeyIdentifierClause", (Object)securityKeyIdentifierClause.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteKeyIdentifierClause(XmlWriter writer, SecurityKeyIdentifierClause securityKeyIdentifierClause) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("WriteKeyIdentifierClause", (Object)writer.getJCOInstance(), (Object)securityKeyIdentifierClause.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityToken CreateToken(SecurityTokenDescriptor tokenDescriptor) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objCreateToken = (JCObject)classInstance.Invoke("CreateToken", (Object)tokenDescriptor.getJCOInstance());
            return new SecurityToken(objCreateToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityKeyIdentifierClause CreateSecurityTokenReference(SecurityToken token, boolean attached) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objCreateSecurityTokenReference = (JCObject)classInstance.Invoke("CreateSecurityTokenReference", (Object)token.getJCOInstance(), attached);
            return new SecurityKeyIdentifierClause(objCreateSecurityTokenReference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LoadCustomConfiguration(XmlNodeList nodelist) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("LoadCustomConfiguration", (Object)nodelist.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getRetainPassword() throws Throwable {
        try {
            return (boolean)classInstance.Get("RetainPassword");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRetainPassword(boolean RetainPassword) throws Throwable {
        try {
            classInstance.Set("RetainPassword", RetainPassword);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanWriteToken() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanWriteToken");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getTokenType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TokenType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanValidateToken() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanValidateToken");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityTokenHandlerConfiguration getConfiguration() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Configuration");
            return new SecurityTokenHandlerConfiguration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConfiguration(SecurityTokenHandlerConfiguration Configuration) throws Throwable {
        try {
            classInstance.Set("Configuration", (Object)Configuration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityTokenHandlerCollection getContainingCollection() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContainingCollection");
            return new SecurityTokenHandlerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContainingCollection(SecurityTokenHandlerCollection ContainingCollection) throws Throwable {
        try {
            classInstance.Set("ContainingCollection", (Object)ContainingCollection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}