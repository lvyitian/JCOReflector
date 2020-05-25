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
import system.windows.forms.ButtonState;
import system.drawing.Color;
import system.Single;
import system.drawing.Rectangle;
import system.windows.forms.ButtonBorderStyle;
import system.windows.forms.Border3DStyle;
import system.windows.forms.Border3DSide;
import system.windows.forms.CaptionButton;
import system.drawing.Image;
import system.windows.forms.MenuGlyph;
import system.drawing.Point;
import system.windows.forms.ScrollButton;
import system.drawing.Size;
import system.windows.forms.FrameStyle;
import system.drawing.Font;
import system.drawing.RectangleF;
import system.drawing.StringFormat;


/**
 * The base .NET class managing System.Windows.Forms.ControlPaint, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ControlPaint extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.ControlPaint";
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

    public ControlPaint(Object instance) throws Throwable {
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

    public static ControlPaint castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ControlPaint(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static void DrawCheckBox(Graphics graphics, int x, int y, int width, int height, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.runtime.interopservices.ExternalException, system.NotSupportedException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawCheckBox", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawRadioButton(Graphics graphics, int x, int y, int width, int height, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawRadioButton", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color Dark(Color baseColor, Single percOfDarkDark) throws Throwable, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            JCObject objDark = (JCObject)classType.Invoke("Dark", (Object)baseColor.getJCOInstance(), (Object)percOfDarkDark.getJCOInstance());
            return new Color(objDark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color Dark(Color baseColor) throws Throwable, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            JCObject objDark = (JCObject)classType.Invoke("Dark", (Object)baseColor.getJCOInstance());
            return new Color(objDark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color DarkDark(Color baseColor) throws Throwable, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            JCObject objDarkDark = (JCObject)classType.Invoke("DarkDark", (Object)baseColor.getJCOInstance());
            return new Color(objDarkDark);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawBorder(Graphics graphics, Rectangle bounds, Color color, ButtonBorderStyle style) throws Throwable {
        try {
            classType.Invoke("DrawBorder", (Object)graphics.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)color.getJCOInstance(), (Object)style.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawBorder3D(Graphics graphics, Rectangle rectangle) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ObjectDisposedException {
        try {
            classType.Invoke("DrawBorder3D", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawBorder3D(Graphics graphics, Rectangle rectangle, Border3DStyle style) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ObjectDisposedException {
        try {
            classType.Invoke("DrawBorder3D", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)style.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawBorder3D(Graphics graphics, Rectangle rectangle, Border3DStyle style, Border3DSide sides) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ObjectDisposedException {
        try {
            classType.Invoke("DrawBorder3D", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)style.getJCOInstance(), (Object)sides.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawBorder3D(Graphics graphics, int x, int y, int width, int height) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ObjectDisposedException {
        try {
            classType.Invoke("DrawBorder3D", (Object)graphics.getJCOInstance(), x, y, width, height);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawBorder3D(Graphics graphics, int x, int y, int width, int height, Border3DStyle style) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ObjectDisposedException {
        try {
            classType.Invoke("DrawBorder3D", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)style.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawBorder3D(Graphics graphics, int x, int y, int width, int height, Border3DStyle style, Border3DSide sides) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.MulticastNotSupportedException {
        try {
            classType.Invoke("DrawBorder3D", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)style.getJCOInstance(), (Object)sides.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawButton(Graphics graphics, Rectangle rectangle, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawButton", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCaptionButton(Graphics graphics, Rectangle rectangle, CaptionButton button, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawCaptionButton", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)button.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCheckBox(Graphics graphics, Rectangle rectangle, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawCheckBox", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawComboButton(Graphics graphics, Rectangle rectangle, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawComboButton", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawContainerGrabHandle(Graphics graphics, Rectangle bounds) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classType.Invoke("DrawContainerGrabHandle", (Object)graphics.getJCOInstance(), (Object)bounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawFocusRectangle(Graphics graphics, Rectangle rectangle, Color foreColor, Color backColor) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classType.Invoke("DrawFocusRectangle", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)foreColor.getJCOInstance(), (Object)backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawImageDisabled(Graphics graphics, Image image, int x, int y, Color background) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            classType.Invoke("DrawImageDisabled", (Object)graphics.getJCOInstance(), (Object)image.getJCOInstance(), x, y, (Object)background.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawLockedFrame(Graphics graphics, Rectangle rectangle, boolean primary) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        try {
            classType.Invoke("DrawLockedFrame", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), primary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawMenuGlyph(Graphics graphics, Rectangle rectangle, MenuGlyph glyph) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawMenuGlyph", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)glyph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawMenuGlyph(Graphics graphics, Rectangle rectangle, MenuGlyph glyph, Color foreColor, Color backColor) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawMenuGlyph", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)glyph.getJCOInstance(), (Object)foreColor.getJCOInstance(), (Object)backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawMenuGlyph(Graphics graphics, int x, int y, int width, int height, MenuGlyph glyph, Color foreColor, Color backColor) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawMenuGlyph", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)glyph.getJCOInstance(), (Object)foreColor.getJCOInstance(), (Object)backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawMixedCheckBox(Graphics graphics, Rectangle rectangle, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawMixedCheckBox", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawRadioButton(Graphics graphics, Rectangle rectangle, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawRadioButton", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawReversibleLine(Point start, Point end, Color backColor) throws Throwable, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classType.Invoke("DrawReversibleLine", (Object)start.getJCOInstance(), (Object)end.getJCOInstance(), (Object)backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawScrollButton(Graphics graphics, Rectangle rectangle, ScrollButton button, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawScrollButton", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), (Object)button.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawSelectionFrame(Graphics graphics, boolean active, Rectangle outsideRect, Rectangle insideRect, Color backColor) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classType.Invoke("DrawSelectionFrame", (Object)graphics.getJCOInstance(), active, (Object)outsideRect.getJCOInstance(), (Object)insideRect.getJCOInstance(), (Object)backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawSizeGrip(Graphics graphics, Color backColor, Rectangle bounds) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.ArgumentException {
        try {
            classType.Invoke("DrawSizeGrip", (Object)graphics.getJCOInstance(), (Object)backColor.getJCOInstance(), (Object)bounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawSizeGrip(Graphics graphics, Color backColor, int x, int y, int width, int height) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("DrawSizeGrip", (Object)graphics.getJCOInstance(), (Object)backColor.getJCOInstance(), x, y, width, height);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawVisualStyleBorder(Graphics graphics, Rectangle bounds) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.runtime.interopservices.ExternalException {
        try {
            classType.Invoke("DrawVisualStyleBorder", (Object)graphics.getJCOInstance(), (Object)bounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void FillReversibleRectangle(Rectangle rectangle, Color backColor) throws Throwable, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classType.Invoke("FillReversibleRectangle", (Object)rectangle.getJCOInstance(), (Object)backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color Light(Color baseColor, Single percOfLightLight) throws Throwable, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            JCObject objLight = (JCObject)classType.Invoke("Light", (Object)baseColor.getJCOInstance(), (Object)percOfLightLight.getJCOInstance());
            return new Color(objLight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color Light(Color baseColor) throws Throwable, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            JCObject objLight = (JCObject)classType.Invoke("Light", (Object)baseColor.getJCOInstance());
            return new Color(objLight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color LightLight(Color baseColor) throws Throwable, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            JCObject objLightLight = (JCObject)classType.Invoke("LightLight", (Object)baseColor.getJCOInstance());
            return new Color(objLightLight);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawBorder(Graphics graphics, Rectangle bounds, Color leftColor, int leftWidth, ButtonBorderStyle leftStyle, Color topColor, int topWidth, ButtonBorderStyle topStyle, Color rightColor, int rightWidth, ButtonBorderStyle rightStyle, Color bottomColor, int bottomWidth, ButtonBorderStyle bottomStyle) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        try {
            classType.Invoke("DrawBorder", (Object)graphics.getJCOInstance(), (Object)bounds.getJCOInstance(), (Object)leftColor.getJCOInstance(), leftWidth, (Object)leftStyle.getJCOInstance(), (Object)topColor.getJCOInstance(), topWidth, (Object)topStyle.getJCOInstance(), (Object)rightColor.getJCOInstance(), rightWidth, (Object)rightStyle.getJCOInstance(), (Object)bottomColor.getJCOInstance(), bottomWidth, (Object)bottomStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawButton(Graphics graphics, int x, int y, int width, int height, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawButton", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawCaptionButton(Graphics graphics, int x, int y, int width, int height, CaptionButton button, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawCaptionButton", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)button.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawComboButton(Graphics graphics, int x, int y, int width, int height, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawComboButton", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawFocusRectangle(Graphics graphics, Rectangle rectangle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classType.Invoke("DrawFocusRectangle", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawGrabHandle(Graphics graphics, Rectangle rectangle, boolean primary, boolean enabled) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException {
        try {
            classType.Invoke("DrawGrabHandle", (Object)graphics.getJCOInstance(), (Object)rectangle.getJCOInstance(), primary, enabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawGrid(Graphics graphics, Rectangle area, Size pixelsBetweenDots, Color backColor) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            classType.Invoke("DrawGrid", (Object)graphics.getJCOInstance(), (Object)area.getJCOInstance(), (Object)pixelsBetweenDots.getJCOInstance(), (Object)backColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawMenuGlyph(Graphics graphics, int x, int y, int width, int height, MenuGlyph glyph) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawMenuGlyph", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)glyph.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawMixedCheckBox(Graphics graphics, int x, int y, int width, int height, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawMixedCheckBox", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawReversibleFrame(Rectangle rectangle, Color backColor, FrameStyle style) throws Throwable, system.InvalidOperationException, system.runtime.interopservices.ExternalException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classType.Invoke("DrawReversibleFrame", (Object)rectangle.getJCOInstance(), (Object)backColor.getJCOInstance(), (Object)style.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawScrollButton(Graphics graphics, int x, int y, int width, int height, ScrollButton button, ButtonState state) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException, system.NullReferenceException {
        try {
            classType.Invoke("DrawScrollButton", (Object)graphics.getJCOInstance(), x, y, width, height, (Object)button.getJCOInstance(), (Object)state.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DrawStringDisabled(Graphics graphics, java.lang.String s, Font font, Color color, RectangleF layoutRectangle, StringFormat format) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.MemberAccessException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.AbandonedMutexException, system.runtime.interopservices.ExternalException, system.collections.generic.KeyNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            classType.Invoke("DrawStringDisabled", (Object)graphics.getJCOInstance(), (Object)s, (Object)font.getJCOInstance(), (Object)color.getJCOInstance(), (Object)layoutRectangle.getJCOInstance(), (Object)format.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public static Color getContrastControlDark() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContrastControlDark");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}