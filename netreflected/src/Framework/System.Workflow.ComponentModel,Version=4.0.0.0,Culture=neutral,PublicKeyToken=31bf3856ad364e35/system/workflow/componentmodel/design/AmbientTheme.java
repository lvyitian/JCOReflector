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

package system.workflow.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.design.WorkflowTheme;
import system.workflow.componentmodel.design.AmbientProperty;
import system.workflow.componentmodel.design.TextQuality;
import system.drawing.Color;
import system.workflow.componentmodel.design.DesignerContentAlignment;
import system.drawing.drawing2d.DashStyle;
import system.workflow.componentmodel.design.DesignerSize;
import system.drawing.Size;
import system.drawing.Pen;
import system.drawing.Brush;
import system.drawing.Image;
import system.drawing.Font;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.AmbientTheme, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class AmbientTheme extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.ComponentModel";
    public static final String className = "System.Workflow.ComponentModel.Design.AmbientTheme";
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

    public AmbientTheme(Object instance) throws Throwable {
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

    public static AmbientTheme castFrom(IJCOBridgeReflected from) throws Throwable {
        return new AmbientTheme(from.getJCOInstance());
    }

    // Constructors section
    
    
    public AmbientTheme(WorkflowTheme theme) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)theme.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Initialize() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.security.SecurityException {
        try {
            classInstance.Invoke("Initialize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnAmbientPropertyChanged(AmbientProperty ambientProperty) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.FormatException, system.security.SecurityException {
        try {
            classInstance.Invoke("OnAmbientPropertyChanged", (Object)ambientProperty.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getUseOperatingSystemSettings() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseOperatingSystemSettings");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseOperatingSystemSettings(boolean UseOperatingSystemSettings) throws Throwable {
        try {
            classInstance.Set("UseOperatingSystemSettings", UseOperatingSystemSettings);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFontName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FontName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFontName(java.lang.String FontName) throws Throwable {
        try {
            classInstance.Set("FontName", (Object)FontName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextQuality getTextQuality() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TextQuality");
            return new TextQuality(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTextQuality(TextQuality TextQuality) throws Throwable {
        try {
            classInstance.Set("TextQuality", (Object)TextQuality.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowConfigErrors() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowConfigErrors");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowConfigErrors(boolean ShowConfigErrors) throws Throwable {
        try {
            classInstance.Set("ShowConfigErrors", ShowConfigErrors);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDrawGrayscale() throws Throwable {
        try {
            return (boolean)classInstance.Get("DrawGrayscale");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDrawGrayscale(boolean DrawGrayscale) throws Throwable {
        try {
            classInstance.Set("DrawGrayscale", DrawGrayscale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getDropIndicatorColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DropIndicatorColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDropIndicatorColor(Color DropIndicatorColor) throws Throwable {
        try {
            classInstance.Set("DropIndicatorColor", (Object)DropIndicatorColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getSelectionForeColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectionForeColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectionForeColor(Color SelectionForeColor) throws Throwable {
        try {
            classInstance.Set("SelectionForeColor", (Object)SelectionForeColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getSelectionPatternColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectionPatternColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectionPatternColor(Color SelectionPatternColor) throws Throwable {
        try {
            classInstance.Set("SelectionPatternColor", (Object)SelectionPatternColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getForeColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ForeColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setForeColor(Color ForeColor) throws Throwable {
        try {
            classInstance.Set("ForeColor", (Object)ForeColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getCommentIndicatorColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CommentIndicatorColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommentIndicatorColor(Color CommentIndicatorColor) throws Throwable {
        try {
            classInstance.Set("CommentIndicatorColor", (Object)CommentIndicatorColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getReadonlyIndicatorColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReadonlyIndicatorColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadonlyIndicatorColor(Color ReadonlyIndicatorColor) throws Throwable {
        try {
            classInstance.Set("ReadonlyIndicatorColor", (Object)ReadonlyIndicatorColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getBackColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BackColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBackColor(Color BackColor) throws Throwable {
        try {
            classInstance.Set("BackColor", (Object)BackColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDrawShadow() throws Throwable {
        try {
            return (boolean)classInstance.Get("DrawShadow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDrawShadow(boolean DrawShadow) throws Throwable {
        try {
            classInstance.Set("DrawShadow", DrawShadow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWatermarkImagePath() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("WatermarkImagePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWatermarkImagePath(java.lang.String WatermarkImagePath) throws Throwable {
        try {
            classInstance.Set("WatermarkImagePath", (Object)WatermarkImagePath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerContentAlignment getWatermarkAlignment() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WatermarkAlignment");
            return new DesignerContentAlignment(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWatermarkAlignment(DesignerContentAlignment WatermarkAlignment) throws Throwable {
        try {
            classInstance.Set("WatermarkAlignment", (Object)WatermarkAlignment.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowGrid() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowGrid");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowGrid(boolean ShowGrid) throws Throwable {
        try {
            classInstance.Set("ShowGrid", ShowGrid);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DashStyle getGridStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("GridStyle");
            return new DashStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGridStyle(DashStyle GridStyle) throws Throwable {
        try {
            classInstance.Set("GridStyle", (Object)GridStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Color getGridColor() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("GridColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGridColor(Color GridColor) throws Throwable {
        try {
            classInstance.Set("GridColor", (Object)GridColor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerSize getDesignerSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DesignerSize");
            return new DesignerSize(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDesignerSize(DesignerSize DesignerSize) throws Throwable {
        try {
            classInstance.Set("DesignerSize", (Object)DesignerSize.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getDrawRounded() throws Throwable {
        try {
            return (boolean)classInstance.Get("DrawRounded");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDrawRounded(boolean DrawRounded) throws Throwable {
        try {
            classInstance.Set("DrawRounded", DrawRounded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowDesignerBorder() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowDesignerBorder");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowDesignerBorder(boolean ShowDesignerBorder) throws Throwable {
        try {
            classInstance.Set("ShowDesignerBorder", ShowDesignerBorder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getMargin() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Margin");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getSelectionSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectionSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getGlyphSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("GlyphSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getGridSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("GridSize");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getBorderWidth() throws Throwable {
        try {
            return (int)classInstance.Get("BorderWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pen getMajorGridPen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MajorGridPen");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush getMajorGridBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MajorGridBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pen getMinorGridPen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MinorGridPen");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pen getSelectionPatternPen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectionPatternPen");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pen getSelectionForegroundPen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectionForegroundPen");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush getSelectionForegroundBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SelectionForegroundBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pen getDropIndicatorPen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DropIndicatorPen");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush getDropIndicatorBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DropIndicatorBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pen getForegroundPen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ForegroundPen");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Pen getCommentIndicatorPen() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CommentIndicatorPen");
            return new Pen(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush getCommentIndicatorBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CommentIndicatorBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush getReadonlyIndicatorBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ReadonlyIndicatorBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush getForegroundBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ForegroundBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Brush getBackgroundBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BackgroundBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Image getWorkflowWatermarkImage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WorkflowWatermarkImage");
            return new Image(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font getFont() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Font");
            return new Font(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Font getBoldFont() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BoldFont");
            return new Font(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getDesignerType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DesignerType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDesignerType(NetType DesignerType) throws Throwable {
        try {
            classInstance.Set("DesignerType", (Object)DesignerType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplyTo() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ApplyTo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplyTo(java.lang.String ApplyTo) throws Throwable {
        try {
            classInstance.Set("ApplyTo", (Object)ApplyTo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getReadOnly() throws Throwable {
        try {
            return (boolean)classInstance.Get("ReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReadOnly(boolean ReadOnly) throws Throwable {
        try {
            classInstance.Set("ReadOnly", ReadOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}