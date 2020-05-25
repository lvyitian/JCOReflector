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

package system.net.networkinformation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.net.networkinformation.DuplicateAddressDetectionState;
import system.net.networkinformation.PrefixOrigin;
import system.net.networkinformation.SuffixOrigin;
import system.net.IPAddress;


/**
 * The base .NET class managing System.Net.NetworkInformation.MulticastIPAddressInformation, System.Net.NetworkInformation, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class MulticastIPAddressInformation extends NetObject  {
    public static final String assemblyFullName = "System.Net.NetworkInformation, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Net.NetworkInformation";
    public static final String className = "System.Net.NetworkInformation.MulticastIPAddressInformation";
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

    public MulticastIPAddressInformation(Object instance) throws Throwable {
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

    public static MulticastIPAddressInformation castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MulticastIPAddressInformation(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
    public long getAddressPreferredLifetime() throws Throwable {
        try {
            return (long)classInstance.Get("AddressPreferredLifetime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getAddressValidLifetime() throws Throwable {
        try {
            return (long)classInstance.Get("AddressValidLifetime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getDhcpLeaseLifetime() throws Throwable {
        try {
            return (long)classInstance.Get("DhcpLeaseLifetime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DuplicateAddressDetectionState getDuplicateAddressDetectionState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DuplicateAddressDetectionState");
            return new DuplicateAddressDetectionState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrefixOrigin getPrefixOrigin() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PrefixOrigin");
            return new PrefixOrigin(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SuffixOrigin getSuffixOrigin() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SuffixOrigin");
            return new SuffixOrigin(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IPAddress getAddress() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Address");
            return new IPAddress(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDnsEligible() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDnsEligible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsTransient() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsTransient");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}