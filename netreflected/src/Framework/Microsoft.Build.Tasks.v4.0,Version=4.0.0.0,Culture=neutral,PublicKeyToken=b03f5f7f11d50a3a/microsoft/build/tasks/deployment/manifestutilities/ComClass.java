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

package microsoft.build.tasks.deployment.manifestutilities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section


/**
 * The base .NET class managing Microsoft.Build.Tasks.Deployment.ManifestUtilities.ComClass, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ComClass extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.Deployment.ManifestUtilities.ComClass";
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

    public ComClass(Object instance) throws Throwable {
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

    public static ComClass castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ComClass(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ComClass() throws Throwable {
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
    
    
    public java.lang.String getClsId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ClsId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getProgId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ProgId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getThreadingModel() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ThreadingModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTlbId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TlbId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlClsId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlClsId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlClsId(java.lang.String XmlClsId) throws Throwable {
        try {
            classInstance.Set("XmlClsId", (Object)XmlClsId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlDescription() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlDescription");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlDescription(java.lang.String XmlDescription) throws Throwable {
        try {
            classInstance.Set("XmlDescription", (Object)XmlDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlProgId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlProgId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlProgId(java.lang.String XmlProgId) throws Throwable {
        try {
            classInstance.Set("XmlProgId", (Object)XmlProgId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlThreadingModel() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlThreadingModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlThreadingModel(java.lang.String XmlThreadingModel) throws Throwable {
        try {
            classInstance.Set("XmlThreadingModel", (Object)XmlThreadingModel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlTlbId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlTlbId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlTlbId(java.lang.String XmlTlbId) throws Throwable {
        try {
            classInstance.Set("XmlTlbId", (Object)XmlTlbId);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}