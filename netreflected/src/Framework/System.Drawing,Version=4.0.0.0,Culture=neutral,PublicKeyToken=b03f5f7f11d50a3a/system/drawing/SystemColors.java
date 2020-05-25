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

package system.drawing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.Color;


/**
 * The base .NET class managing System.Drawing.SystemColors, System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SystemColors extends NetObject  {
    public static final String assemblyFullName = "System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Drawing";
    public static final String className = "System.Drawing.SystemColors";
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

    public SystemColors(Object instance) throws Throwable {
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

    public static SystemColors castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SystemColors(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
    public static Color getActiveBorder() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ActiveBorder");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getActiveCaption() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ActiveCaption");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getActiveCaptionText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ActiveCaptionText");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAppWorkspace() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AppWorkspace");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getButtonFace() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ButtonFace");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getButtonHighlight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ButtonHighlight");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getButtonShadow() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ButtonShadow");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getControl() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Control");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getControlDark() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlDark");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getControlDarkDark() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlDarkDark");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getControlLight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlLight");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getControlLightLight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlLightLight");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getControlText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ControlText");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesktop() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Desktop");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getGradientActiveCaption() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("GradientActiveCaption");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getGradientInactiveCaption() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("GradientInactiveCaption");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getGrayText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("GrayText");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getHighlight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Highlight");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getHighlightText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("HighlightText");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getHotTrack() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("HotTrack");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getInactiveBorder() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InactiveBorder");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getInactiveCaption() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InactiveCaption");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getInactiveCaptionText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InactiveCaptionText");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getInfo() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Info");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getInfoText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("InfoText");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getMenu() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Menu");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getMenuBar() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("MenuBar");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getMenuHighlight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("MenuHighlight");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getMenuText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("MenuText");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getScrollBar() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ScrollBar");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getWindow() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("Window");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getWindowFrame() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WindowFrame");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getWindowText() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WindowText");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}