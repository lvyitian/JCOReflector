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

package system.componentmodel.dataannotations;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.dataannotations.ValidationResult;
import system.componentmodel.dataannotations.ValidationContext;


/**
 * The base .NET class managing System.ComponentModel.DataAnnotations.ValidationAttribute, System.ComponentModel.Annotations, Version=4.3.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ValidationAttribute extends NetObject  {
    public static final String assemblyFullName = "System.ComponentModel.Annotations, Version=4.3.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.ComponentModel.Annotations";
    public static final String className = "System.ComponentModel.DataAnnotations.ValidationAttribute";
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

    public ValidationAttribute(Object instance) throws Throwable {
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

    public static ValidationAttribute castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ValidationAttribute(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public java.lang.String FormatErrorMessage(java.lang.String name) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            return (java.lang.String)classInstance.Invoke("FormatErrorMessage", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValid(NetObject value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("IsValid", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValidationResult GetValidationResult(NetObject value, ValidationContext validationContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException {
        try {
            JCObject objGetValidationResult = (JCObject)classInstance.Invoke("GetValidationResult", (Object)value.getJCOInstance(), (Object)validationContext.getJCOInstance());
            return new ValidationResult(objGetValidationResult);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Validate(NetObject value, java.lang.String name) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.PlatformNotSupportedException, system.componentmodel.dataannotations.ValidationException {
        try {
            classInstance.Invoke("Validate", (Object)value.getJCOInstance(), (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Validate(NetObject value, ValidationContext validationContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.dataannotations.ValidationException {
        try {
            classInstance.Invoke("Validate", (Object)value.getJCOInstance(), (Object)validationContext.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Match(NetObject obj) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Match", (Object)obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDefaultAttribute() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("IsDefaultAttribute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getRequiresValidationContext() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresValidationContext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorMessage() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ErrorMessage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorMessage(java.lang.String ErrorMessage) throws Throwable {
        try {
            classInstance.Set("ErrorMessage", (Object)ErrorMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorMessageResourceName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ErrorMessageResourceName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorMessageResourceName(java.lang.String ErrorMessageResourceName) throws Throwable {
        try {
            classInstance.Set("ErrorMessageResourceName", (Object)ErrorMessageResourceName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getErrorMessageResourceType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ErrorMessageResourceType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorMessageResourceType(NetType ErrorMessageResourceType) throws Throwable {
        try {
            classInstance.Set("ErrorMessageResourceType", (Object)ErrorMessageResourceType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTypeId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TypeId");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}