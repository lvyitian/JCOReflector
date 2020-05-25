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

package system.windows.xps.serialization;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.xps.serialization.BasePackagingPolicy;
import system.windows.xps.serialization.FontSubsetterCommitPolicies;
import system.windows.xps.serialization.XpsSerializationPrintTicketRequiredEventHandler;
import system.windows.xps.serialization.XpsSerializationProgressChangedEventHandler;


/**
 * The base .NET class managing System.Windows.Xps.Serialization.XpsSerializationManager, ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class XpsSerializationManager extends NetObject  {
    public static final String assemblyFullName = "ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "ReachFramework";
    public static final String className = "System.Windows.Xps.Serialization.XpsSerializationManager";
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

    public XpsSerializationManager(Object instance) throws Throwable {
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

    public static XpsSerializationManager castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XpsSerializationManager(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XpsSerializationManager(BasePackagingPolicy packagingPolicy, boolean batchMode) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException, system.windows.xps.XpsPackagingException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)packagingPolicy.getJCOInstance(), batchMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void SaveAsXaml(NetObject serializedObject) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidCastException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.windows.xps.XpsSerializationException, system.PlatformNotSupportedException, system.NotSupportedException, system.FormatException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            classInstance.Invoke("SaveAsXaml", (Object)serializedObject.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Commit() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.windows.xps.XpsSerializationException {
        try {
            classInstance.Invoke("Commit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetFontSubsettingPolicy(FontSubsetterCommitPolicies policy) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("SetFontSubsettingPolicy", (Object)policy.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetFontSubsettingCountPolicy(int countPolicy) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        try {
            classInstance.Invoke("SetFontSubsettingCountPolicy", countPolicy);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsBatchMode() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsBatchMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addXpsSerializationPrintTicketRequired(XpsSerializationPrintTicketRequiredEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("XpsSerializationPrintTicketRequired", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeXpsSerializationPrintTicketRequired(XpsSerializationPrintTicketRequiredEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("XpsSerializationPrintTicketRequired", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addXpsSerializationProgressChanged(XpsSerializationProgressChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("XpsSerializationProgressChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeXpsSerializationProgressChanged(XpsSerializationProgressChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("XpsSerializationProgressChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}