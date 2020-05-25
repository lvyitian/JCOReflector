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
import system.DateTime;
import system.identitymodel.tokens.SamlConditions;
import system.identitymodel.tokens.SamlAdvice;
import system.xml.XmlDictionaryReader;
import system.identitymodel.tokens.SamlSerializer;
import system.identitymodel.selectors.SecurityTokenSerializer;
import system.identitymodel.selectors.SecurityTokenResolver;
import system.xml.XmlDictionaryWriter;
import system.xml.XmlWriter;
import system.identitymodel.tokens.SigningCredentials;
import system.identitymodel.tokens.SecurityToken;


/**
 * The base .NET class managing System.IdentityModel.Tokens.SamlAssertion, System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SamlAssertion extends NetObject  {
    public static final String assemblyFullName = "System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.IdentityModel";
    public static final String className = "System.IdentityModel.Tokens.SamlAssertion";
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

    public SamlAssertion(Object instance) throws Throwable {
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

    public static SamlAssertion castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SamlAssertion(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SamlAssertion() throws Throwable, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidTimeZoneException, system.security.SecurityException, system.io.IOException, system.InvalidOperationException, system.NotSupportedException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void MakeReadOnly() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            classInstance.Invoke("MakeReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReadXml(XmlDictionaryReader reader, SamlSerializer samlSerializer, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.xml.XmlException, system.UnauthorizedAccessException, system.security.cryptography.CryptographicUnexpectedOperationException {
        try {
            classInstance.Invoke("ReadXml", (Object)reader.getJCOInstance(), (Object)samlSerializer.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance(), (Object)outOfBandTokenResolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteXml(XmlDictionaryWriter writer, SamlSerializer samlSerializer, SecurityTokenSerializer keyInfoSerializer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("WriteXml", (Object)writer.getJCOInstance(), (Object)samlSerializer.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteSourceData(XmlWriter writer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("WriteSourceData", (Object)writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getMinorVersion() throws Throwable {
        try {
            return (int)classInstance.Get("MinorVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMajorVersion() throws Throwable {
        try {
            return (int)classInstance.Get("MajorVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAssertionId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("AssertionId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssertionId(java.lang.String AssertionId) throws Throwable {
        try {
            classInstance.Set("AssertionId", (Object)AssertionId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanWriteSourceData() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanWriteSourceData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getIssuer() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Issuer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIssuer(java.lang.String Issuer) throws Throwable {
        try {
            classInstance.Set("Issuer", (Object)Issuer);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getIssueInstant() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IssueInstant");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIssueInstant(DateTime IssueInstant) throws Throwable {
        try {
            classInstance.Set("IssueInstant", (Object)IssueInstant.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlConditions getConditions() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Conditions");
            return new SamlConditions(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConditions(SamlConditions Conditions) throws Throwable {
        try {
            classInstance.Set("Conditions", (Object)Conditions.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlAdvice getAdvice() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Advice");
            return new SamlAdvice(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAdvice(SamlAdvice Advice) throws Throwable {
        try {
            classInstance.Set("Advice", (Object)Advice.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SigningCredentials getSigningCredentials() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SigningCredentials");
            return new SigningCredentials(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSigningCredentials(SigningCredentials SigningCredentials) throws Throwable {
        try {
            classInstance.Set("SigningCredentials", (Object)SigningCredentials.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityToken getSigningToken() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SigningToken");
            return new SecurityToken(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSigningToken(SecurityToken SigningToken) throws Throwable {
        try {
            classInstance.Set("SigningToken", (Object)SigningToken.getJCOInstance());
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



	// Instance Events section
    
    
}