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

package system.windows.interop;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.interop.HwndSourceParameters;
import system.windows.input.RestoreFocusMode;


/**
 * The base .NET class managing System.Windows.Interop.HwndSourceParameters, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class HwndSourceParameters extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Interop.HwndSourceParameters";
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

    public HwndSourceParameters(Object instance) throws Throwable {
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

    public static HwndSourceParameters castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HwndSourceParameters(from.getJCOInstance());
    }

    // Constructors section
    
    
    public HwndSourceParameters(java.lang.String name) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HwndSourceParameters(java.lang.String name, int width, int height) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)name, width, height);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void SetPosition(int x, int y) throws Throwable {
        try {
            classInstance.Invoke("SetPosition", x, y);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetSize(int width, int height) throws Throwable {
        try {
            classInstance.Invoke("SetSize", width, height);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(HwndSourceParameters obj) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("Equals", (Object)obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getWindowClassStyle() throws Throwable {
        try {
            return (int)classInstance.Get("WindowClassStyle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWindowClassStyle(int WindowClassStyle) throws Throwable {
        try {
            classInstance.Set("WindowClassStyle", WindowClassStyle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getWindowStyle() throws Throwable {
        try {
            return (int)classInstance.Get("WindowStyle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWindowStyle(int WindowStyle) throws Throwable {
        try {
            classInstance.Set("WindowStyle", WindowStyle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getExtendedWindowStyle() throws Throwable {
        try {
            return (int)classInstance.Get("ExtendedWindowStyle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExtendedWindowStyle(int ExtendedWindowStyle) throws Throwable {
        try {
            classInstance.Set("ExtendedWindowStyle", ExtendedWindowStyle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getPositionX() throws Throwable {
        try {
            return (int)classInstance.Get("PositionX");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPositionX(int PositionX) throws Throwable {
        try {
            classInstance.Set("PositionX", PositionX);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getPositionY() throws Throwable {
        try {
            return (int)classInstance.Get("PositionY");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPositionY(int PositionY) throws Throwable {
        try {
            classInstance.Set("PositionY", PositionY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getWidth() throws Throwable {
        try {
            return (int)classInstance.Get("Width");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWidth(int Width) throws Throwable {
        try {
            classInstance.Set("Width", Width);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getHeight() throws Throwable {
        try {
            return (int)classInstance.Get("Height");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHeight(int Height) throws Throwable {
        try {
            classInstance.Set("Height", Height);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasAssignedSize() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasAssignedSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWindowName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("WindowName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWindowName(java.lang.String WindowName) throws Throwable {
        try {
            classInstance.Set("WindowName", (Object)WindowName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAdjustSizingForNonClientArea() throws Throwable {
        try {
            return (boolean)classInstance.Get("AdjustSizingForNonClientArea");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAdjustSizingForNonClientArea(boolean AdjustSizingForNonClientArea) throws Throwable {
        try {
            classInstance.Set("AdjustSizingForNonClientArea", AdjustSizingForNonClientArea);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTreatAncestorsAsNonClientArea() throws Throwable {
        try {
            return (boolean)classInstance.Get("TreatAncestorsAsNonClientArea");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTreatAncestorsAsNonClientArea(boolean TreatAncestorsAsNonClientArea) throws Throwable {
        try {
            classInstance.Set("TreatAncestorsAsNonClientArea", TreatAncestorsAsNonClientArea);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUsesPerPixelOpacity() throws Throwable {
        try {
            return (boolean)classInstance.Get("UsesPerPixelOpacity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUsesPerPixelOpacity(boolean UsesPerPixelOpacity) throws Throwable {
        try {
            classInstance.Set("UsesPerPixelOpacity", UsesPerPixelOpacity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUsesPerPixelTransparency() throws Throwable {
        try {
            return (boolean)classInstance.Get("UsesPerPixelTransparency");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUsesPerPixelTransparency(boolean UsesPerPixelTransparency) throws Throwable {
        try {
            classInstance.Set("UsesPerPixelTransparency", UsesPerPixelTransparency);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RestoreFocusMode getRestoreFocusMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RestoreFocusMode");
            return new RestoreFocusMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRestoreFocusMode(RestoreFocusMode RestoreFocusMode) throws Throwable {
        try {
            classInstance.Set("RestoreFocusMode", (Object)RestoreFocusMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAcquireHwndFocusInMenuMode() throws Throwable {
        try {
            return (boolean)classInstance.Get("AcquireHwndFocusInMenuMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAcquireHwndFocusInMenuMode(boolean AcquireHwndFocusInMenuMode) throws Throwable {
        try {
            classInstance.Set("AcquireHwndFocusInMenuMode", AcquireHwndFocusInMenuMode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTreatAsInputRoot() throws Throwable {
        try {
            return (boolean)classInstance.Get("TreatAsInputRoot");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTreatAsInputRoot(boolean TreatAsInputRoot) throws Throwable {
        try {
            classInstance.Set("TreatAsInputRoot", TreatAsInputRoot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}