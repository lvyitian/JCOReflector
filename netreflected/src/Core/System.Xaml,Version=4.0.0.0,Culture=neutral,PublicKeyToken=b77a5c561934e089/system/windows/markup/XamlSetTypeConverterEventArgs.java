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

package system.windows.markup;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xaml.XamlMember;
import system.componentmodel.TypeConverter;
import system.globalization.CultureInfo;


/**
 * The base .NET class managing System.Windows.Markup.XamlSetTypeConverterEventArgs, System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XamlSetTypeConverterEventArgs extends NetObject  {
    public static final String assemblyFullName = "System.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Xaml";
    public static final String className = "System.Windows.Markup.XamlSetTypeConverterEventArgs";
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

    public XamlSetTypeConverterEventArgs(Object instance) throws Throwable {
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

    public static XamlSetTypeConverterEventArgs castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XamlSetTypeConverterEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    

    
    // Methods section
    
    
    public void CallBase() throws Throwable, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.ArgumentException, system.InvalidOperationException, system.xaml.XamlSchemaException {
        try {
            classInstance.Invoke("CallBase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public TypeConverter getTypeConverter() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TypeConverter");
            return new TypeConverter(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTypeConverter(TypeConverter TypeConverter) throws Throwable {
        try {
            classInstance.Set("TypeConverter", (Object)TypeConverter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CultureInfo getCultureInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CultureInfo");
            return new CultureInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCultureInfo(CultureInfo CultureInfo) throws Throwable {
        try {
            classInstance.Set("CultureInfo", (Object)CultureInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XamlMember getMember() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Member");
            return new XamlMember(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Value");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHandled() throws Throwable {
        try {
            return (boolean)classInstance.Get("Handled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHandled(boolean Handled) throws Throwable {
        try {
            classInstance.Set("Handled", Handled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}