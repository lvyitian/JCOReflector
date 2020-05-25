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

package system.windows.automation.text;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Windows.Automation.Text.TextDecorationLineStyle, UIAutomationTypes, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class TextDecorationLineStyle extends NetObject  {
    public static final String assemblyFullName = "UIAutomationTypes, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "UIAutomationTypes";
    public static final String className = "System.Windows.Automation.Text.TextDecorationLineStyle";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
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

    public TextDecorationLineStyle(Object instance) {
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public TextDecorationLineStyle() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
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

    final static TextDecorationLineStyle getFrom(JCEnum object, String value) {
        try {
            return new TextDecorationLineStyle(object.fromValue(value));
        } catch (JCException e) {
            return new TextDecorationLineStyle(object);
        }
    }

    // Enum fields section
    
    public static TextDecorationLineStyle None = getFrom(enumReflected, "None");
    public static TextDecorationLineStyle Single = getFrom(enumReflected, "Single");
    public static TextDecorationLineStyle WordsOnly = getFrom(enumReflected, "WordsOnly");
    public static TextDecorationLineStyle Double = getFrom(enumReflected, "Double");
    public static TextDecorationLineStyle Dot = getFrom(enumReflected, "Dot");
    public static TextDecorationLineStyle Dash = getFrom(enumReflected, "Dash");
    public static TextDecorationLineStyle DashDot = getFrom(enumReflected, "DashDot");
    public static TextDecorationLineStyle DashDotDot = getFrom(enumReflected, "DashDotDot");
    public static TextDecorationLineStyle Wavy = getFrom(enumReflected, "Wavy");
    public static TextDecorationLineStyle ThickSingle = getFrom(enumReflected, "ThickSingle");
    public static TextDecorationLineStyle DoubleWavy = getFrom(enumReflected, "DoubleWavy");
    public static TextDecorationLineStyle ThickWavy = getFrom(enumReflected, "ThickWavy");
    public static TextDecorationLineStyle LongDash = getFrom(enumReflected, "LongDash");
    public static TextDecorationLineStyle ThickDash = getFrom(enumReflected, "ThickDash");
    public static TextDecorationLineStyle ThickDashDot = getFrom(enumReflected, "ThickDashDot");
    public static TextDecorationLineStyle ThickDashDotDot = getFrom(enumReflected, "ThickDashDotDot");
    public static TextDecorationLineStyle ThickDot = getFrom(enumReflected, "ThickDot");
    public static TextDecorationLineStyle ThickLongDash = getFrom(enumReflected, "ThickLongDash");
    public static TextDecorationLineStyle Other = getFrom(enumReflected, "Other");


    // Flags management section


}