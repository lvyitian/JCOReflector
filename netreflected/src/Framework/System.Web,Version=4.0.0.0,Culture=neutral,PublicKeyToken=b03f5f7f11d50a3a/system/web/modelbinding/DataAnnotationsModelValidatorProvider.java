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

package system.web.modelbinding;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.modelbinding.DataAnnotationsModelValidationFactory;
import system.web.modelbinding.DataAnnotationsValidatableObjectAdapterFactory;


/**
 * The base .NET class managing System.Web.ModelBinding.DataAnnotationsModelValidatorProvider, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DataAnnotationsModelValidatorProvider extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.ModelBinding.DataAnnotationsModelValidatorProvider";
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

    public DataAnnotationsModelValidatorProvider(Object instance) throws Throwable {
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

    public static DataAnnotationsModelValidatorProvider castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DataAnnotationsModelValidatorProvider(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DataAnnotationsModelValidatorProvider() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static void RegisterAdapterFactory(NetType attributeType, DataAnnotationsModelValidationFactory factory) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.TypeLoadException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.SynchronizationLockException {
        try {
            classType.Invoke("RegisterAdapterFactory", (Object)attributeType.getJCOInstance(), factory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterDefaultAdapterFactory(DataAnnotationsModelValidationFactory factory) throws Throwable, system.ArgumentNullException {
        try {
            classType.Invoke("RegisterDefaultAdapterFactory", factory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterValidatableObjectAdapterFactory(NetType modelType, DataAnnotationsValidatableObjectAdapterFactory factory) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.TypeLoadException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.SynchronizationLockException {
        try {
            classType.Invoke("RegisterValidatableObjectAdapterFactory", (Object)modelType.getJCOInstance(), factory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterDefaultValidatableObjectAdapterFactory(DataAnnotationsValidatableObjectAdapterFactory factory) throws Throwable, system.ArgumentNullException {
        try {
            classType.Invoke("RegisterDefaultValidatableObjectAdapterFactory", factory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterAdapter(NetType attributeType, NetType adapterType) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.TypeLoadException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.SynchronizationLockException {
        try {
            classType.Invoke("RegisterAdapter", (Object)attributeType.getJCOInstance(), (Object)adapterType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterDefaultAdapter(NetType adapterType) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.TypeLoadException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classType.Invoke("RegisterDefaultAdapter", (Object)adapterType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterValidatableObjectAdapter(NetType modelType, NetType adapterType) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.TypeLoadException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.threading.LockRecursionException, system.threading.AbandonedMutexException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.SynchronizationLockException {
        try {
            classType.Invoke("RegisterValidatableObjectAdapter", (Object)modelType.getJCOInstance(), (Object)adapterType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterDefaultValidatableObjectAdapter(NetType adapterType) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.TypeLoadException, system.ArgumentException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            classType.Invoke("RegisterDefaultValidatableObjectAdapter", (Object)adapterType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public static boolean getAddImplicitRequiredAttributeForValueTypes() throws Throwable {
        try {
            return (boolean)classType.Get("AddImplicitRequiredAttributeForValueTypes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setAddImplicitRequiredAttributeForValueTypes(boolean AddImplicitRequiredAttributeForValueTypes) throws Throwable {
        try {
            classType.Set("AddImplicitRequiredAttributeForValueTypes", AddImplicitRequiredAttributeForValueTypes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}