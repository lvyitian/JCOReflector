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

package system.windows.controls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.Size;
import system.windows.controls.HierarchicalVirtualizationItemDesiredSizes;


/**
 * The base .NET class managing System.Windows.Controls.HierarchicalVirtualizationItemDesiredSizes, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class HierarchicalVirtualizationItemDesiredSizes extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Controls.HierarchicalVirtualizationItemDesiredSizes";
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

    public HierarchicalVirtualizationItemDesiredSizes(Object instance) throws Throwable {
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

    public static HierarchicalVirtualizationItemDesiredSizes castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HierarchicalVirtualizationItemDesiredSizes(from.getJCOInstance());
    }

    // Constructors section
    
    
    public HierarchicalVirtualizationItemDesiredSizes(Size logicalSize, Size logicalSizeInViewport, Size logicalSizeBeforeViewport, Size logicalSizeAfterViewport, Size pixelSize, Size pixelSizeInViewport, Size pixelSizeBeforeViewport, Size pixelSizeAfterViewport) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)logicalSize.getJCOInstance(), (Object)logicalSizeInViewport.getJCOInstance(), (Object)logicalSizeBeforeViewport.getJCOInstance(), (Object)logicalSizeAfterViewport.getJCOInstance(), (Object)pixelSize.getJCOInstance(), (Object)pixelSizeInViewport.getJCOInstance(), (Object)pixelSizeBeforeViewport.getJCOInstance(), (Object)pixelSizeAfterViewport.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Equals(HierarchicalVirtualizationItemDesiredSizes comparisonItemSizes) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)comparisonItemSizes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Size getLogicalSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LogicalSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getLogicalSizeInViewport() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LogicalSizeInViewport");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getLogicalSizeBeforeViewport() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LogicalSizeBeforeViewport");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getLogicalSizeAfterViewport() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LogicalSizeAfterViewport");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getPixelSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PixelSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getPixelSizeInViewport() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PixelSizeInViewport");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getPixelSizeBeforeViewport() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PixelSizeBeforeViewport");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getPixelSizeAfterViewport() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PixelSizeAfterViewport");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}