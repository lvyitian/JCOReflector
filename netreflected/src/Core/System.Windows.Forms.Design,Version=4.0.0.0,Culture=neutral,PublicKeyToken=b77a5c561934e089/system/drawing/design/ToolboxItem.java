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

package system.drawing.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.AssemblyName;
import system.drawing.Bitmap;
import system.drawing.design.ToolboxComponentsCreatedEventHandler;
import system.drawing.design.ToolboxComponentsCreatingEventHandler;


/**
 * The base .NET class managing System.Drawing.Design.ToolboxItem, System.Windows.Forms.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ToolboxItem extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms.Design";
    public static final String className = "System.Drawing.Design.ToolboxItem";
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

    public ToolboxItem(Object instance) throws Throwable {
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

    public static ToolboxItem castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ToolboxItem(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ToolboxItem() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolboxItem(NetType toolType) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.io.FileLoadException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)toolType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Initialize(NetType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.io.FileLoadException, system.NotSupportedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.ArrayTypeMismatchException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("Initialize", (Object)type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public AssemblyName getAssemblyName() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AssemblyName");
            return new AssemblyName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssemblyName(AssemblyName AssemblyName) throws Throwable {
        try {
            classInstance.Set("AssemblyName", (Object)AssemblyName.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyName[] getDependentAssemblies() throws Throwable {
        try {
            ArrayList<AssemblyName> resultingArrayList = new ArrayList<AssemblyName>();
            JCObject resultingObjects = (JCObject)classInstance.Get("DependentAssemblies");
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

    public void setDependentAssemblies(AssemblyName[] DependentAssemblies) throws Throwable {
        try {
            classInstance.Set("DependentAssemblies", (Object)toObjectFromArray(DependentAssemblies));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bitmap getBitmap() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Bitmap");
            return new Bitmap(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBitmap(Bitmap Bitmap) throws Throwable {
        try {
            classInstance.Set("Bitmap", (Object)Bitmap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bitmap getOriginalBitmap() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OriginalBitmap");
            return new Bitmap(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOriginalBitmap(Bitmap OriginalBitmap) throws Throwable {
        try {
            classInstance.Set("OriginalBitmap", (Object)OriginalBitmap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCompany() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Company");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCompany(java.lang.String Company) throws Throwable {
        try {
            classInstance.Set("Company", (Object)Company);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getComponentType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ComponentType");
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

    public void setDescription(java.lang.String Description) throws Throwable {
        try {
            classInstance.Set("Description", (Object)Description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDisplayName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DisplayName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayName(java.lang.String DisplayName) throws Throwable {
        try {
            classInstance.Set("DisplayName", (Object)DisplayName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsTransient() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsTransient");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsTransient(boolean IsTransient) throws Throwable {
        try {
            classInstance.Set("IsTransient", IsTransient);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLocked() throws Throwable {
        try {
            return (boolean)classInstance.Get("Locked");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTypeName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TypeName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTypeName(java.lang.String TypeName) throws Throwable {
        try {
            classInstance.Set("TypeName", (Object)TypeName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addComponentsCreated(ToolboxComponentsCreatedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ComponentsCreated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeComponentsCreated(ToolboxComponentsCreatedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ComponentsCreated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addComponentsCreating(ToolboxComponentsCreatingEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ComponentsCreating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeComponentsCreating(ToolboxComponentsCreatingEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ComponentsCreating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}