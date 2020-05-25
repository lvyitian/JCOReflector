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

package system.web.security.antixss;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Web.Security.AntiXss.UpperCodeCharts, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class UpperCodeCharts extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.Security.AntiXss.UpperCodeCharts";
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

    public UpperCodeCharts(Object instance) {
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

    public UpperCodeCharts() {
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

    final static UpperCodeCharts getFrom(JCEnum object, String value) {
        try {
            return new UpperCodeCharts(object.fromValue(value));
        } catch (JCException e) {
            return new UpperCodeCharts(object);
        }
    }

    // Enum fields section
    
    public static UpperCodeCharts None = getFrom(enumReflected, "None");
    public static UpperCodeCharts DevanagariExtended = getFrom(enumReflected, "DevanagariExtended");
    public static UpperCodeCharts KayahLi = getFrom(enumReflected, "KayahLi");
    public static UpperCodeCharts Rejang = getFrom(enumReflected, "Rejang");
    public static UpperCodeCharts HangulJamoExtendedA = getFrom(enumReflected, "HangulJamoExtendedA");
    public static UpperCodeCharts Javanese = getFrom(enumReflected, "Javanese");
    public static UpperCodeCharts Cham = getFrom(enumReflected, "Cham");
    public static UpperCodeCharts MyanmarExtendedA = getFrom(enumReflected, "MyanmarExtendedA");
    public static UpperCodeCharts TaiViet = getFrom(enumReflected, "TaiViet");
    public static UpperCodeCharts MeeteiMayek = getFrom(enumReflected, "MeeteiMayek");
    public static UpperCodeCharts HangulSyllables = getFrom(enumReflected, "HangulSyllables");
    public static UpperCodeCharts HangulJamoExtendedB = getFrom(enumReflected, "HangulJamoExtendedB");
    public static UpperCodeCharts CjkCompatibilityIdeographs = getFrom(enumReflected, "CjkCompatibilityIdeographs");
    public static UpperCodeCharts AlphabeticPresentationForms = getFrom(enumReflected, "AlphabeticPresentationForms");
    public static UpperCodeCharts ArabicPresentationFormsA = getFrom(enumReflected, "ArabicPresentationFormsA");
    public static UpperCodeCharts VariationSelectors = getFrom(enumReflected, "VariationSelectors");
    public static UpperCodeCharts VerticalForms = getFrom(enumReflected, "VerticalForms");
    public static UpperCodeCharts CombiningHalfMarks = getFrom(enumReflected, "CombiningHalfMarks");
    public static UpperCodeCharts CjkCompatibilityForms = getFrom(enumReflected, "CjkCompatibilityForms");
    public static UpperCodeCharts SmallFormVariants = getFrom(enumReflected, "SmallFormVariants");
    public static UpperCodeCharts ArabicPresentationFormsB = getFrom(enumReflected, "ArabicPresentationFormsB");
    public static UpperCodeCharts HalfWidthAndFullWidthForms = getFrom(enumReflected, "HalfWidthAndFullWidthForms");
    public static UpperCodeCharts Specials = getFrom(enumReflected, "Specials");


    // Flags management section

    public UpperCodeCharts add(UpperCodeCharts val) throws Throwable {
        return new UpperCodeCharts(NetEnum.add(classInstance, val.classInstance));
    }

    public UpperCodeCharts remove(UpperCodeCharts val) throws Throwable {
        return new UpperCodeCharts(NetEnum.remove(classInstance, val.classInstance));
    }

    public boolean is(UpperCodeCharts val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public boolean has(UpperCodeCharts val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}