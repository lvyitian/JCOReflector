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

package system.reflection.emit;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.emit.AssemblyBuilder;
import system.reflection.AssemblyName;
import system.reflection.emit.AssemblyBuilderAccess;
import system.reflection.emit.ModuleBuilder;
import system.io.FileStream;
import system.io.Stream;
import system.reflection.ManifestResourceInfo;
import system.reflection.Module;
import system.reflection.Assembly;
import system.globalization.CultureInfo;
import system.Version;
import system.reflection.ConstructorInfo;
import system.reflection.emit.CustomAttributeBuilder;
import system.reflection.BindingFlags;
import system.reflection.Binder;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.reflection.MethodInfo;
import system.security.SecurityRuleSet;
import system.reflection.ModuleResolveEventHandler;


/**
 * The base .NET class managing System.Reflection.Emit.AssemblyBuilder, System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e. Extends {@link NetObject}.
 */
public class AssemblyBuilder extends NetObject  {
    public static final String assemblyFullName = "System.Private.CoreLib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e";
	public static final String assemblyShortName = "System.Private.CoreLib";
    public static final String className = "System.Reflection.Emit.AssemblyBuilder";
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

    public AssemblyBuilder(Object instance) throws Throwable {
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

    public static AssemblyBuilder castFrom(IJCOBridgeReflected from) throws Throwable {
        return new AssemblyBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static AssemblyBuilder DefineDynamicAssembly(AssemblyName name, AssemblyBuilderAccess access) throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objDefineDynamicAssembly = (JCObject)classType.Invoke("DefineDynamicAssembly", (Object)name.getJCOInstance(), (Object)access.getJCOInstance());
            return new AssemblyBuilder(objDefineDynamicAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModuleBuilder DefineDynamicModule(java.lang.String name) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            JCObject objDefineDynamicModule = (JCObject)classInstance.Invoke("DefineDynamicModule", (Object)name);
            return new ModuleBuilder(objDefineDynamicModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModuleBuilder DefineDynamicModule(java.lang.String name, boolean emitSymbolInfo) throws Throwable, system.PlatformNotSupportedException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            JCObject objDefineDynamicModule = (JCObject)classInstance.Invoke("DefineDynamicModule", (Object)name, emitSymbolInfo);
            return new ModuleBuilder(objDefineDynamicModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(boolean inherit) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", inherit);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] GetCustomAttributes(NetType attributeType, boolean inherit) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetCustomAttributes", (Object)attributeType.getJCOInstance(), inherit);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDefined(NetType attributeType, boolean inherit) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            return (boolean)classInstance.Invoke("IsDefined", (Object)attributeType.getJCOInstance(), inherit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] GetManifestResourceNames() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetManifestResourceNames");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetManifestResourceNames = 0; indexGetManifestResourceNames < resultingArrayList.size(); indexGetManifestResourceNames++ ) {
				resultingArray[indexGetManifestResourceNames] = (java.lang.String)resultingArrayList.get(indexGetManifestResourceNames);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream GetFile(java.lang.String name) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetFile = (JCObject)classInstance.Invoke("GetFile", (Object)name);
            return new FileStream(objGetFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream[] GetFiles(boolean getResourceModules) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<FileStream> resultingArrayList = new ArrayList<FileStream>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFiles", getResourceModules);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileStream(resultingObject));
            }
            FileStream[] resultingArray = new FileStream[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetManifestResourceStream(NetType type, java.lang.String name) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetManifestResourceStream = (JCObject)classInstance.Invoke("GetManifestResourceStream", (Object)type.getJCOInstance(), (Object)name);
            return new Stream(objGetManifestResourceStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Stream GetManifestResourceStream(java.lang.String name) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetManifestResourceStream = (JCObject)classInstance.Invoke("GetManifestResourceStream", (Object)name);
            return new Stream(objGetManifestResourceStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManifestResourceInfo GetManifestResourceInfo(java.lang.String resourceName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetManifestResourceInfo = (JCObject)classInstance.Invoke("GetManifestResourceInfo", (Object)resourceName);
            return new ManifestResourceInfo(objGetManifestResourceInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetExportedTypes() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetExportedTypes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyName GetName(boolean copiedName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetName = (JCObject)classInstance.Invoke("GetName", copiedName);
            return new AssemblyName(objGetName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetType(java.lang.String name, boolean throwOnError, boolean ignoreCase) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetType = (JCObject)classInstance.Invoke("GetType", (Object)name, throwOnError, ignoreCase);
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module GetModule(java.lang.String name) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetModule = (JCObject)classInstance.Invoke("GetModule", (Object)name);
            return new Module(objGetModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyName[] GetReferencedAssemblies() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<AssemblyName> resultingArrayList = new ArrayList<AssemblyName>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetReferencedAssemblies");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new AssemblyName(resultingObject));
            }
            AssemblyName[] resultingArray = new AssemblyName[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module[] GetModules(boolean getResourceModules) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<Module> resultingArrayList = new ArrayList<Module>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetModules", getResourceModules);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Module(resultingObject));
            }
            Module[] resultingArray = new Module[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module[] GetLoadedModules(boolean getResourceModules) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<Module> resultingArrayList = new ArrayList<Module>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetLoadedModules", getResourceModules);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Module(resultingObject));
            }
            Module[] resultingArray = new Module[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly GetSatelliteAssembly(CultureInfo culture) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetSatelliteAssembly = (JCObject)classInstance.Invoke("GetSatelliteAssembly", (Object)culture.getJCOInstance());
            return new Assembly(objGetSatelliteAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly GetSatelliteAssembly(CultureInfo culture, Version version) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetSatelliteAssembly = (JCObject)classInstance.Invoke("GetSatelliteAssembly", (Object)culture.getJCOInstance(), (Object)version.getJCOInstance());
            return new Assembly(objGetSatelliteAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModuleBuilder GetDynamicModule(java.lang.String name) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetDynamicModule = (JCObject)classInstance.Invoke("GetDynamicModule", (Object)name);
            return new ModuleBuilder(objGetDynamicModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(ConstructorInfo con, byte[] binaryAttribute) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("SetCustomAttribute", (Object)con.getJCOInstance(), binaryAttribute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCustomAttribute(CustomAttributeBuilder customBuilder) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("SetCustomAttribute", (Object)customBuilder.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetTypes() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetTypes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType[] GetForwardedTypes() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<NetType> resultingArrayList = new ArrayList<NetType>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetForwardedTypes");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetType(resultingObject));
            }
            NetType[] resultingArray = new NetType[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyName GetName() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetName = (JCObject)classInstance.Invoke("GetName");
            return new AssemblyName(objGetName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetType(java.lang.String name) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetType = (JCObject)classInstance.Invoke("GetType", (Object)name);
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetType(java.lang.String name, boolean throwOnError) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objGetType = (JCObject)classInstance.Invoke("GetType", (Object)name, throwOnError);
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateInstance(java.lang.String typeName) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", (Object)typeName);
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateInstance(java.lang.String typeName, boolean ignoreCase) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.FormatException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", (Object)typeName, ignoreCase);
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject CreateInstance(java.lang.String typeName, boolean ignoreCase, BindingFlags bindingAttr, Binder binder, NetObject[] args, CultureInfo culture, NetObject[] activationAttributes) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            JCObject objCreateInstance = (JCObject)classInstance.Invoke("CreateInstance", (Object)typeName, ignoreCase, (Object)bindingAttr.getJCOInstance(), (Object)binder.getJCOInstance(), (Object)toObjectFromArray(args), (Object)culture.getJCOInstance(), (Object)toObjectFromArray(activationAttributes));
            return new NetObject(objCreateInstance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module[] GetModules() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<Module> resultingArrayList = new ArrayList<Module>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetModules");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Module(resultingObject));
            }
            Module[] resultingArray = new Module[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module[] GetLoadedModules() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<Module> resultingArrayList = new ArrayList<Module>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetLoadedModules");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Module(resultingObject));
            }
            Module[] resultingArray = new Module[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileStream[] GetFiles() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            ArrayList<FileStream> resultingArrayList = new ArrayList<FileStream>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFiles");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileStream(resultingObject));
            }
            FileStream[] resultingArray = new FileStream[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            classInstance.Invoke("GetObjectData", (Object)info.getJCOInstance(), (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module LoadModule(java.lang.String moduleName, byte[] rawModule) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objLoadModule = (JCObject)classInstance.Invoke("LoadModule", (Object)moduleName, rawModule);
            return new Module(objLoadModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module LoadModule(java.lang.String moduleName, byte[] rawModule, byte[] rawSymbolStore) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException {
        try {
            JCObject objLoadModule = (JCObject)classInstance.Invoke("LoadModule", (Object)moduleName, rawModule, rawSymbolStore);
            return new Module(objLoadModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getLocation() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Location");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getImageRuntimeVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ImageRuntimeVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCodeBase() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("CodeBase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodInfo getEntryPoint() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EntryPoint");
            return new MethodInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFullName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FullName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module getManifestModule() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ManifestModule");
            return new Module(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReflectionOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReflectionOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGlobalAssemblyCache() throws Throwable {
        try {
            return (boolean)classInstance.Get("GlobalAssemblyCache");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getHostContext() throws Throwable {
        try {
            return (long)classInstance.Get("HostContext");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDynamic() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDynamic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCollectible() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsCollectible");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFullyTrusted() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFullyTrusted");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getEscapedCodeBase() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("EscapedCodeBase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityRuleSet getSecurityRuleSet() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityRuleSet");
            return new SecurityRuleSet(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addModuleResolve(ModuleResolveEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ModuleResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeModuleResolve(ModuleResolveEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ModuleResolve", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}