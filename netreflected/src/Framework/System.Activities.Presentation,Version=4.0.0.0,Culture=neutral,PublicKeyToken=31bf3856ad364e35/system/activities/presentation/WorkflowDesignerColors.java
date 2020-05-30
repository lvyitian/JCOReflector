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

package system.activities.presentation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.Color;
import system.windows.media.Brush;
import system.windows.media.FontFamily;
import system.windows.FontWeight;


/**
 * The base .NET class managing System.Activities.Presentation.WorkflowDesignerColors, System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WorkflowDesignerColors extends NetObject  {
    public static final String assemblyFullName = "System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Activities.Presentation";
    public static final String className = "System.Activities.Presentation.WorkflowDesignerColors";
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

    public WorkflowDesignerColors(Object instance) throws Throwable {
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

    public static WorkflowDesignerColors castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WorkflowDesignerColors(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    

    
    // Properties section
    
    
    public static java.lang.String getPropertyInspectorTextBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorTextBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorSelectedForegroundBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorSelectedForegroundBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorSelectedBackgroundBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorSelectedBackgroundBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorBackgroundBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorBackgroundBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorBorderBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorBorderBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorCategoryCaptionTextBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorCategoryCaptionTextBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorPaneBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorPaneBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorPopupBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorPopupBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorToolBarItemHoverBackgroundBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorToolBarItemHoverBackgroundBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorToolBarItemHoverBorderBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorToolBarItemHoverBorderBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorToolBarItemSelectedBackgroundBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorToolBarItemSelectedBackgroundBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorToolBarItemSelectedBorderBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorToolBarItemSelectedBorderBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorToolBarBackgroundBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorToolBarBackgroundBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorToolBarSeparatorBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorToolBarSeparatorBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String getPropertyInspectorToolBarTextBoxBorderBrushKey() throws Throwable {
        try {
            return (java.lang.String)classType.Get("PropertyInspectorToolBarTextBoxBorderBrushKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getWorkflowViewElementBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WorkflowViewElementBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getWorkflowViewElementBackgroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WorkflowViewElementBackgroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getWorkflowViewElementSelectedBackgroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WorkflowViewElementSelectedBackgroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getGridViewRowHoverColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("GridViewRowHoverColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getWorkflowViewElementSelectedBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WorkflowViewElementSelectedBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewStatusBarBackgroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewStatusBarBackgroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getWorkflowViewElementCaptionColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WorkflowViewElementCaptionColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getWorkflowViewElementSelectedCaptionColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("WorkflowViewElementSelectedCaptionColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewBackgroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewBackgroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewShellBarColorGradientBeginColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewShellBarColorGradientBeginColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewShellBarColorGradientEndColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewShellBarColorGradientEndColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewShellBarSelectedColorGradientBeginColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewShellBarSelectedColorGradientBeginColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewShellBarSelectedColorGradientEndColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewShellBarSelectedColorGradientEndColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewShellBarHoverColorGradientBeginColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewShellBarHoverColorGradientBeginColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewShellBarHoverColorGradientEndColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewShellBarHoverColorGradientEndColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewShellBarControlBackgroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewShellBarControlBackgroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewShellBarCaptionActiveColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewShellBarCaptionActiveColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getDesignerViewShellBarCaptionColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewShellBarCaptionColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getDesignerViewExpandAllCollapseAllButtonBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewExpandAllCollapseAllButtonBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getDesignerViewExpandAllCollapseAllButtonMouseOverBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewExpandAllCollapseAllButtonMouseOverBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getDesignerViewExpandAllCollapseAllPressedBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("DesignerViewExpandAllCollapseAllPressedBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getPropertyToolBarHightlightedButtonForegroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("PropertyToolBarHightlightedButtonForegroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getActivityDesignerSelectedTitleForegroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ActivityDesignerSelectedTitleForegroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuBackgroundGradientBeginColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuBackgroundGradientBeginColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuBackgroundGradientEndColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuBackgroundGradientEndColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuIconAreaColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuIconAreaColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuMouseOverBeginColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuMouseOverBeginColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuMouseOverMiddle1Color() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuMouseOverMiddle1Color");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuMouseOverMiddle2Color() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuMouseOverMiddle2Color");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuMouseOverEndColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuMouseOverEndColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuMouseOverBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuMouseOverBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuItemTextColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuItemTextColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuItemTextHoverColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuItemTextHoverColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuItemTextHoverQuirkedColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuItemTextHoverQuirkedColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuItemTextSelectedColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuItemTextSelectedColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuItemTextDisabledColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuItemTextDisabledColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getContextMenuSeparatorColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("ContextMenuSeparatorColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getFlowchartConnectorColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("FlowchartConnectorColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getFlowchartExpressionButtonBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("FlowchartExpressionButtonBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getFlowchartExpressionButtonMouseOverBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("FlowchartExpressionButtonMouseOverBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Brush getFlowchartExpressionButtonPressedBrush() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("FlowchartExpressionButtonPressedBrush");
            return new Brush(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationBackgroundGradientBeginColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationBackgroundGradientBeginColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationBackgroundGradientMiddleColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationBackgroundGradientMiddleColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationBackgroundGradientEndColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationBackgroundGradientEndColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationDockTextColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationDockTextColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationUndockTextColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationUndockTextColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationDockButtonColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationDockButtonColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationDockButtonHoverColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationDockButtonHoverColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationDockButtonHoverBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationDockButtonHoverBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getAnnotationDockButtonHoverBackgroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("AnnotationDockButtonHoverBackgroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getOutlineViewItemHighlightBackgroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OutlineViewItemHighlightBackgroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getOutlineViewCollapsedArrowBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OutlineViewCollapsedArrowBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getOutlineViewCollapsedArrowHoverBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OutlineViewCollapsedArrowHoverBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getOutlineViewExpandedArrowColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OutlineViewExpandedArrowColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getOutlineViewExpandedArrowBorderColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OutlineViewExpandedArrowBorderColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getOutlineViewBackgroundColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OutlineViewBackgroundColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getOutlineViewItemSelectedTextColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OutlineViewItemSelectedTextColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Color getOutlineViewItemTextColor() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("OutlineViewItemTextColor");
            return new Color(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FontFamily getFontFamily() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("FontFamily");
            return new FontFamily(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double getFontSize() throws Throwable {
        try {
            return (double)classType.Get("FontSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static FontWeight getFontWeight() throws Throwable {
        try {
            JCObject val = (JCObject)classType.Get("FontWeight");
            return new FontWeight(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}