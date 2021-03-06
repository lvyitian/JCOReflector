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
 *      This code was generated from a template using JCOReflector
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
import system.windows.forms.visualstyles.CheckBoxState;
import system.drawing.Size;
import system.drawing.Graphics;
import system.drawing.Point;
import system.drawing.Rectangle;
import system.drawing.Font;
import system.drawing.Image;
import system.windows.forms.TextFormatFlags;
import system.windows.forms.Control;


/**
 * The base .NET class managing System.Windows.Forms.CheckBoxRenderer, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.CheckBoxRenderer" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.CheckBoxRenderer</a>
 */
public class CheckBoxRenderer extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.CheckBoxRenderer
     */
    public static final String className = "System.Windows.Forms.CheckBoxRenderer";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public CheckBoxRenderer(Object instance) throws Throwable {
        super(instance);
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CheckBoxRenderer}, a cast assert is made to check if types are compatible.
     */
    public static CheckBoxRenderer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CheckBoxRenderer(from.getJCOInstance());
    }

    // Constructors section
    
    public CheckBoxRenderer() throws Throwable {
    }



    
    // Methods section
    
    public static boolean IsBackgroundPartiallyTransparent(CheckBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.runtime.interopservices.ExternalException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("IsBackgroundPartiallyTransparent", state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Size GetGlyphSize(Graphics g, CheckBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetGlyphSize = (JCObject)classType.Invoke("GetGlyphSize", g == null ? null : g.getJCOInstance(), state == null ? null : state.getJCOInstance());
            return new Size(objGetGlyphSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, Rectangle textBounds, java.lang.String checkBoxText, Font font, boolean focused, CheckBoxState state) throws Throwable, system.ArgumentNullException, system.runtime.interopservices.ExternalException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), checkBoxText, font == null ? null : font.getJCOInstance(), focused, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, Rectangle textBounds, java.lang.String checkBoxText, Font font, Image image, Rectangle imageBounds, boolean focused, CheckBoxState state) throws Throwable, system.ArgumentNullException, system.runtime.interopservices.ExternalException, system.ArgumentException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), checkBoxText, font == null ? null : font.getJCOInstance(), image == null ? null : image.getJCOInstance(), imageBounds == null ? null : imageBounds.getJCOInstance(), focused, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, Rectangle textBounds, java.lang.String checkBoxText, Font font, TextFormatFlags flags, boolean focused, CheckBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), checkBoxText, font == null ? null : font.getJCOInstance(), flags == null ? null : flags.getJCOInstance(), focused, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, Rectangle textBounds, java.lang.String checkBoxText, Font font, TextFormatFlags flags, Image image, Rectangle imageBounds, boolean focused, CheckBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), textBounds == null ? null : textBounds.getJCOInstance(), checkBoxText, font == null ? null : font.getJCOInstance(), flags == null ? null : flags.getJCOInstance(), image == null ? null : image.getJCOInstance(), imageBounds == null ? null : imageBounds.getJCOInstance(), focused, state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics g, Point glyphLocation, CheckBoxState state) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawCheckBox", g == null ? null : g.getJCOInstance(), glyphLocation == null ? null : glyphLocation.getJCOInstance(), state == null ? null : state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawParentBackground(Graphics g, Rectangle bounds, Control childControl) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DrawParentBackground", g == null ? null : g.getJCOInstance(), bounds == null ? null : bounds.getJCOInstance(), childControl == null ? null : childControl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getRenderMatchingApplicationState() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RenderMatchingApplicationState");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRenderMatchingApplicationState(boolean RenderMatchingApplicationState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RenderMatchingApplicationState", RenderMatchingApplicationState);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}