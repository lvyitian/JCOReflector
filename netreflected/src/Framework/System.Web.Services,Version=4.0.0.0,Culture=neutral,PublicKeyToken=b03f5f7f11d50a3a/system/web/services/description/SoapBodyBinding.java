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

package system.web.services.description;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.services.description.SoapBindingUse;


/**
 * The base .NET class managing System.Web.Services.Description.SoapBodyBinding, System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SoapBodyBinding extends NetObject  {
    public static final String assemblyFullName = "System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web.Services";
    public static final String className = "System.Web.Services.Description.SoapBodyBinding";
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

    public SoapBodyBinding(Object instance) throws Throwable {
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

    public static SoapBodyBinding castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SoapBodyBinding(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SoapBodyBinding() throws Throwable {
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
    
    
    public SoapBindingUse getUse() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Use");
            return new SoapBindingUse(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUse(SoapBindingUse Use) throws Throwable {
        try {
            classInstance.Set("Use", (Object)Use.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getNamespace() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Namespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNamespace(java.lang.String Namespace) throws Throwable {
        try {
            classInstance.Set("Namespace", (Object)Namespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getEncoding() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Encoding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEncoding(java.lang.String Encoding) throws Throwable {
        try {
            classInstance.Set("Encoding", (Object)Encoding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPartsString() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PartsString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPartsString(java.lang.String PartsString) throws Throwable {
        try {
            classInstance.Set("PartsString", (Object)PartsString);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getParts() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Parts");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexParts = 0; indexParts < resultingArrayList.size(); indexParts++ ) {
				resultingArray[indexParts] = (java.lang.String)resultingArrayList.get(indexParts);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setParts(java.lang.String[] Parts) throws Throwable {
        try {
            classInstance.Set("Parts", (Object)Parts);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getParent() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequired() throws Throwable {
        try {
            return (boolean)classInstance.Get("Required");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequired(boolean Required) throws Throwable {
        try {
            classInstance.Set("Required", Required);
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