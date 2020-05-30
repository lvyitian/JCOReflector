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
import microsoft.build.tasks.deployment.manifestutilities.ComClass;
import microsoft.build.tasks.deployment.manifestutilities.ProxyStub;
import microsoft.build.tasks.deployment.manifestutilities.TypeLib;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Deployment.ManifestUtilities.FileReference, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class FileReference extends NetObject  {
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    public static final String className = "Microsoft.Build.Tasks.Deployment.ManifestUtilities.FileReference";
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

    public FileReference(Object instance) throws Throwable {
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

    public static FileReference castFrom(IJCOBridgeReflected from) throws Throwable {
        return new FileReference(from.getJCOInstance());
    }

    // Constructors section
    
    
    public FileReference() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileReference(java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public ComClass[] getComClasses() throws Throwable {
        try {
            ArrayList<ComClass> resultingArrayList = new ArrayList<ComClass>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ComClasses");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ComClass(resultingObject));
            }
            ComClass[] resultingArray = new ComClass[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDataFile() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDataFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsDataFile(boolean IsDataFile) throws Throwable {
        try {
            classInstance.Set("IsDataFile", IsDataFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProxyStub[] getProxyStubs() throws Throwable {
        try {
            ArrayList<ProxyStub> resultingArrayList = new ArrayList<ProxyStub>();
            JCObject resultingObjects = (JCObject)classInstance.Get("ProxyStubs");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ProxyStub(resultingObject));
            }
            ProxyStub[] resultingArray = new ProxyStub[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeLib[] getTypeLibs() throws Throwable {
        try {
            ArrayList<TypeLib> resultingArrayList = new ArrayList<TypeLib>();
            JCObject resultingObjects = (JCObject)classInstance.Get("TypeLibs");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new TypeLib(resultingObject));
            }
            TypeLib[] resultingArray = new TypeLib[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ComClass[] getXmlComClasses() throws Throwable {
        try {
            ArrayList<ComClass> resultingArrayList = new ArrayList<ComClass>();
            JCObject resultingObjects = (JCObject)classInstance.Get("XmlComClasses");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ComClass(resultingObject));
            }
            ComClass[] resultingArray = new ComClass[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlComClasses(ComClass[] XmlComClasses) throws Throwable {
        try {
            classInstance.Set("XmlComClasses", (Object)toObjectFromArray(XmlComClasses));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProxyStub[] getXmlProxyStubs() throws Throwable {
        try {
            ArrayList<ProxyStub> resultingArrayList = new ArrayList<ProxyStub>();
            JCObject resultingObjects = (JCObject)classInstance.Get("XmlProxyStubs");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ProxyStub(resultingObject));
            }
            ProxyStub[] resultingArray = new ProxyStub[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlProxyStubs(ProxyStub[] XmlProxyStubs) throws Throwable {
        try {
            classInstance.Set("XmlProxyStubs", (Object)toObjectFromArray(XmlProxyStubs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeLib[] getXmlTypeLibs() throws Throwable {
        try {
            ArrayList<TypeLib> resultingArrayList = new ArrayList<TypeLib>();
            JCObject resultingObjects = (JCObject)classInstance.Get("XmlTypeLibs");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new TypeLib(resultingObject));
            }
            TypeLib[] resultingArray = new TypeLib[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlTypeLibs(TypeLib[] XmlTypeLibs) throws Throwable {
        try {
            classInstance.Set("XmlTypeLibs", (Object)toObjectFromArray(XmlTypeLibs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlWriteableType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlWriteableType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlWriteableType(java.lang.String XmlWriteableType) throws Throwable {
        try {
            classInstance.Set("XmlWriteableType", (Object)XmlWriteableType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getGroup() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Group");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGroup(java.lang.String Group) throws Throwable {
        try {
            classInstance.Set("Group", (Object)Group);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHash() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Hash");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHash(java.lang.String Hash) throws Throwable {
        try {
            classInstance.Set("Hash", (Object)Hash);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsOptional() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsOptional");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsOptional(boolean IsOptional) throws Throwable {
        try {
            classInstance.Set("IsOptional", IsOptional);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getResolvedPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ResolvedPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setResolvedPath(java.lang.String ResolvedPath) throws Throwable {
        try {
            classInstance.Set("ResolvedPath", (Object)ResolvedPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getSize() throws Throwable {
        try {
            return (long)classInstance.Get("Size");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSize(long Size) throws Throwable {
        try {
            classInstance.Set("Size", Size);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSourcePath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SourcePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourcePath(java.lang.String SourcePath) throws Throwable {
        try {
            classInstance.Set("SourcePath", (Object)SourcePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TargetPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetPath(java.lang.String TargetPath) throws Throwable {
        try {
            classInstance.Set("TargetPath", (Object)TargetPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlGroup() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlGroup");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlGroup(java.lang.String XmlGroup) throws Throwable {
        try {
            classInstance.Set("XmlGroup", (Object)XmlGroup);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlHash() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlHash");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlHash(java.lang.String XmlHash) throws Throwable {
        try {
            classInstance.Set("XmlHash", (Object)XmlHash);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlHashAlgorithm() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlHashAlgorithm");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlHashAlgorithm(java.lang.String XmlHashAlgorithm) throws Throwable {
        try {
            classInstance.Set("XmlHashAlgorithm", (Object)XmlHashAlgorithm);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlIsOptional() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlIsOptional");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlIsOptional(java.lang.String XmlIsOptional) throws Throwable {
        try {
            classInstance.Set("XmlIsOptional", (Object)XmlIsOptional);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlPath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlPath(java.lang.String XmlPath) throws Throwable {
        try {
            classInstance.Set("XmlPath", (Object)XmlPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlSize() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("XmlSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlSize(java.lang.String XmlSize) throws Throwable {
        try {
            classInstance.Set("XmlSize", (Object)XmlSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}