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
import system.identitymodel.tokens.SamlSecurityToken;
import system.xml.XmlReader;
import system.identitymodel.selectors.SecurityTokenSerializer;
import system.identitymodel.selectors.SecurityTokenResolver;
import system.xml.XmlWriter;
import system.identitymodel.tokens.SamlAssertion;
import system.xml.XmlDictionaryReader;
import system.identitymodel.tokens.SamlCondition;
import system.identitymodel.tokens.SamlConditions;
import system.identitymodel.tokens.SamlAdvice;
import system.identitymodel.tokens.SamlStatement;
import system.identitymodel.tokens.SamlAttribute;


/**
 * The base .NET class managing System.IdentityModel.Tokens.SamlSerializer, System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SamlSerializer extends NetObject  {
    public static final String assemblyFullName = "System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.IdentityModel";
    public static final String className = "System.IdentityModel.Tokens.SamlSerializer";
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

    public SamlSerializer(Object instance) throws Throwable {
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

    public static SamlSerializer castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SamlSerializer(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SamlSerializer() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public SamlSecurityToken ReadToken(XmlReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.xml.XmlException, system.UnauthorizedAccessException, system.AccessViolationException, system.security.cryptography.CryptographicUnexpectedOperationException, system.security.SecurityException, system.io.IOException {
        try {
            JCObject objReadToken = (JCObject)classInstance.Invoke("ReadToken", (Object)reader.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance(), (Object)outOfBandTokenResolver.getJCOInstance());
            return new SamlSecurityToken(objReadToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void WriteToken(SamlSecurityToken token, XmlWriter writer, SecurityTokenSerializer keyInfoSerializer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.ApplicationException, system.NotSupportedException, system.TypeLoadException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("WriteToken", (Object)token.getJCOInstance(), (Object)writer.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlAssertion LoadAssertion(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.InvalidTimeZoneException, system.NotSupportedException, system.xml.XmlException, system.UnauthorizedAccessException, system.AccessViolationException, system.security.cryptography.CryptographicUnexpectedOperationException, system.security.SecurityException {
        try {
            JCObject objLoadAssertion = (JCObject)classInstance.Invoke("LoadAssertion", (Object)reader.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance(), (Object)outOfBandTokenResolver.getJCOInstance());
            return new SamlAssertion(objLoadAssertion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlCondition LoadCondition(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        try {
            JCObject objLoadCondition = (JCObject)classInstance.Invoke("LoadCondition", (Object)reader.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance(), (Object)outOfBandTokenResolver.getJCOInstance());
            return new SamlCondition(objLoadCondition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlConditions LoadConditions(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.InvalidTimeZoneException, system.NotSupportedException, system.xml.XmlException {
        try {
            JCObject objLoadConditions = (JCObject)classInstance.Invoke("LoadConditions", (Object)reader.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance(), (Object)outOfBandTokenResolver.getJCOInstance());
            return new SamlConditions(objLoadConditions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlAdvice LoadAdvice(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.xml.XmlException, system.UnauthorizedAccessException, system.AccessViolationException, system.security.cryptography.CryptographicUnexpectedOperationException, system.security.SecurityException, system.io.IOException {
        try {
            JCObject objLoadAdvice = (JCObject)classInstance.Invoke("LoadAdvice", (Object)reader.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance(), (Object)outOfBandTokenResolver.getJCOInstance());
            return new SamlAdvice(objLoadAdvice);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlStatement LoadStatement(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.InvalidTimeZoneException, system.NotSupportedException {
        try {
            JCObject objLoadStatement = (JCObject)classInstance.Invoke("LoadStatement", (Object)reader.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance(), (Object)outOfBandTokenResolver.getJCOInstance());
            return new SamlStatement(objLoadStatement);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SamlAttribute LoadAttribute(XmlDictionaryReader reader, SecurityTokenSerializer keyInfoSerializer, SecurityTokenResolver outOfBandTokenResolver) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.security.SecurityException, system.OutOfMemoryException, system.NotSupportedException, system.xml.XmlException {
        try {
            JCObject objLoadAttribute = (JCObject)classInstance.Invoke("LoadAttribute", (Object)reader.getJCOInstance(), (Object)keyInfoSerializer.getJCOInstance(), (Object)outOfBandTokenResolver.getJCOInstance());
            return new SamlAttribute(objLoadAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}