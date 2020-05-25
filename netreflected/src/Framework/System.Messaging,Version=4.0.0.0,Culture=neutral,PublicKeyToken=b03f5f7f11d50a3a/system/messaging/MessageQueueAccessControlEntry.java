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

package system.messaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.messaging.Trustee;
import system.messaging.MessageQueueAccessRights;
import system.messaging.AccessControlEntryType;
import system.messaging.GenericAccessRights;
import system.messaging.StandardAccessRights;


/**
 * The base .NET class managing System.Messaging.MessageQueueAccessControlEntry, System.Messaging, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class MessageQueueAccessControlEntry extends NetObject  {
    public static final String assemblyFullName = "System.Messaging, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Messaging";
    public static final String className = "System.Messaging.MessageQueueAccessControlEntry";
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

    public MessageQueueAccessControlEntry(Object instance) throws Throwable {
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

    public static MessageQueueAccessControlEntry castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MessageQueueAccessControlEntry(from.getJCOInstance());
    }

    // Constructors section
    
    
    public MessageQueueAccessControlEntry(Trustee trustee, MessageQueueAccessRights rights) throws Throwable, system.ArgumentNullException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)trustee.getJCOInstance(), (Object)rights.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageQueueAccessControlEntry(Trustee trustee, MessageQueueAccessRights rights, AccessControlEntryType entryType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)trustee.getJCOInstance(), (Object)rights.getJCOInstance(), (Object)entryType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public MessageQueueAccessRights getMessageQueueAccessRights() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MessageQueueAccessRights");
            return new MessageQueueAccessRights(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMessageQueueAccessRights(MessageQueueAccessRights MessageQueueAccessRights) throws Throwable {
        try {
            classInstance.Set("MessageQueueAccessRights", (Object)MessageQueueAccessRights.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AccessControlEntryType getEntryType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EntryType");
            return new AccessControlEntryType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEntryType(AccessControlEntryType EntryType) throws Throwable {
        try {
            classInstance.Set("EntryType", (Object)EntryType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GenericAccessRights getGenericAccessRights() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("GenericAccessRights");
            return new GenericAccessRights(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGenericAccessRights(GenericAccessRights GenericAccessRights) throws Throwable {
        try {
            classInstance.Set("GenericAccessRights", (Object)GenericAccessRights.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StandardAccessRights getStandardAccessRights() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StandardAccessRights");
            return new StandardAccessRights(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStandardAccessRights(StandardAccessRights StandardAccessRights) throws Throwable {
        try {
            classInstance.Set("StandardAccessRights", (Object)StandardAccessRights.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Trustee getTrustee() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Trustee");
            return new Trustee(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrustee(Trustee Trustee) throws Throwable {
        try {
            classInstance.Set("Trustee", (Object)Trustee.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}