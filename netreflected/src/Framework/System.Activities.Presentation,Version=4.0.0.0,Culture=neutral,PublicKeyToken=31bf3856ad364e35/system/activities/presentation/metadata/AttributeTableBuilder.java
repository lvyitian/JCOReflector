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

package system.activities.presentation.metadata;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.activities.presentation.metadata.AttributeCallback;
import system.Attribute;
import system.componentmodel.MemberDescriptor;
import system.reflection.MemberInfo;
import system.windows.DependencyProperty;
import system.activities.presentation.metadata.AttributeTable;


/**
 * The base .NET class managing System.Activities.Presentation.Metadata.AttributeTableBuilder, System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class AttributeTableBuilder extends NetObject  {
    public static final String assemblyFullName = "System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities.Presentation";
    public static final String className = "System.Activities.Presentation.Metadata.AttributeTableBuilder";
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

    public AttributeTableBuilder(Object instance) throws Throwable {
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

    public static AttributeTableBuilder castFrom(IJCOBridgeReflected from) throws Throwable {
        return new AttributeTableBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    
    public AttributeTableBuilder() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void AddCallback(NetType type, AttributeCallback callback) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddCallback", (Object)type.getJCOInstance(), callback);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCustomAttributes(NetType type, Attribute... attributes) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddCustomAttributes", (Object)type.getJCOInstance(), (Object[])toObjectFromArray(attributes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCustomAttributes(NetType ownerType, MemberDescriptor descriptor, Attribute... attributes) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddCustomAttributes", (Object)ownerType.getJCOInstance(), (Object)descriptor.getJCOInstance(), (Object[])toObjectFromArray(attributes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCustomAttributes(NetType ownerType, MemberInfo member, Attribute... attributes) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddCustomAttributes", (Object)ownerType.getJCOInstance(), (Object)member.getJCOInstance(), (Object[])toObjectFromArray(attributes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCustomAttributes(NetType ownerType, java.lang.String memberName, Attribute... attributes) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddCustomAttributes", (Object)ownerType.getJCOInstance(), (Object)memberName, (Object[])toObjectFromArray(attributes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCustomAttributes(NetType ownerType, DependencyProperty dp, Attribute... attributes) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddCustomAttributes", (Object)ownerType.getJCOInstance(), (Object)dp.getJCOInstance(), (Object[])toObjectFromArray(attributes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddTable(AttributeTable table) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("AddTable", (Object)table.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AttributeTable CreateTable() throws Throwable {
        try {
            JCObject objCreateTable = (JCObject)classInstance.Invoke("CreateTable");
            return new AttributeTable(objCreateTable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ValidateTable() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NullReferenceException {
        try {
            classInstance.Invoke("ValidateTable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}