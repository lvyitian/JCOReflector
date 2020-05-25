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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.Graphics;
import system.drawing.Rectangle;
import system.windows.forms.visualstyles.ScrollBarArrowButtonState;
import system.windows.forms.visualstyles.ScrollBarState;
import system.windows.forms.visualstyles.ScrollBarSizeBoxState;
import system.drawing.Size;


/**
 * The base .NET class managing System.Windows.Forms.ScrollBarRenderer, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ScrollBarRenderer extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.ScrollBarRenderer";
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

    public ScrollBarRenderer(Object instance) throws Throwable {
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

    public static ScrollBarRenderer castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ScrollBarRenderer(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static void DrawArrowButton(Graphics g, Rectangle bounds, ScrollBarArrowButtonState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawArrowButton", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawHorizontalThumb(Graphics g, Rectangle bounds, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawHorizontalThumb", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawVerticalThumb(Graphics g, Rectangle bounds, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawVerticalThumb", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawHorizontalThumbGrip(Graphics g, Rectangle bounds, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawHorizontalThumbGrip", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawVerticalThumbGrip(Graphics g, Rectangle bounds, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawVerticalThumbGrip", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawRightHorizontalTrack(Graphics g, Rectangle bounds, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawRightHorizontalTrack", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawLeftHorizontalTrack(Graphics g, Rectangle bounds, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawLeftHorizontalTrack", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawUpperVerticalTrack(Graphics g, Rectangle bounds, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawUpperVerticalTrack", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawLowerVerticalTrack(Graphics g, Rectangle bounds, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawLowerVerticalTrack", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawSizeBox(Graphics g, Rectangle bounds, ScrollBarSizeBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawSizeBox", (Object)g.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size GetThumbGripSize(Graphics g, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        try {
            JCObject objGetThumbGripSize = (JCObject)classType.Invoke("GetThumbGripSize", (Object)g.getJCOInstance(), (Object)state.getJCOInstance());
            return new Size(objGetThumbGripSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size GetSizeBoxSize(Graphics g, ScrollBarState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        try {
            JCObject objGetSizeBoxSize = (JCObject)classType.Invoke("GetSizeBoxSize", (Object)g.getJCOInstance(), (Object)state.getJCOInstance());
            return new Size(objGetSizeBoxSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public static boolean getIsSupported() throws Throwable {
        try {
            return (boolean)classType.Get("IsSupported");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}