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

package system.identitymodel.metadata;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.identitymodel.metadata.IndexedProtocolEndpointDictionary;
import system.Uri;
import system.identitymodel.metadata.Organization;
import system.DateTime;


/**
 * The base .NET class managing System.IdentityModel.Metadata.IdentityProviderSingleSignOnDescriptor, System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class IdentityProviderSingleSignOnDescriptor extends NetObject  {
    public static final String assemblyFullName = "System.IdentityModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.IdentityModel";
    public static final String className = "System.IdentityModel.Metadata.IdentityProviderSingleSignOnDescriptor";
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

    public IdentityProviderSingleSignOnDescriptor(Object instance) throws Throwable {
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

    public static IdentityProviderSingleSignOnDescriptor castFrom(IJCOBridgeReflected from) throws Throwable {
        return new IdentityProviderSingleSignOnDescriptor(from.getJCOInstance());
    }

    // Constructors section
    
    
    public IdentityProviderSingleSignOnDescriptor() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public boolean getWantAuthenticationRequestsSigned() throws Throwable {
        try {
            return (boolean)classInstance.Get("WantAuthenticationRequestsSigned");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWantAuthenticationRequestsSigned(boolean WantAuthenticationRequestsSigned) throws Throwable {
        try {
            classInstance.Set("WantAuthenticationRequestsSigned", WantAuthenticationRequestsSigned);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IndexedProtocolEndpointDictionary getArtifactResolutionServices() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ArtifactResolutionServices");
            return new IndexedProtocolEndpointDictionary(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getErrorUrl() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ErrorUrl");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorUrl(Uri ErrorUrl) throws Throwable {
        try {
            classInstance.Set("ErrorUrl", (Object)ErrorUrl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Organization getOrganization() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Organization");
            return new Organization(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOrganization(Organization Organization) throws Throwable {
        try {
            classInstance.Set("Organization", (Object)Organization.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTime getValidUntil() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValidUntil");
            return new DateTime(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidUntil(DateTime ValidUntil) throws Throwable {
        try {
            classInstance.Set("ValidUntil", (Object)ValidUntil.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}