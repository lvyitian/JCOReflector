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

package system.web.ui.webcontrols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Web.UI.WebControls.AutoCompleteType, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class AutoCompleteType extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.UI.WebControls.AutoCompleteType";
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

    public AutoCompleteType(Object instance) {
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

    public AutoCompleteType() {
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

    final static AutoCompleteType getFrom(JCEnum object, String value) {
        try {
            return new AutoCompleteType(object.fromValue(value));
        } catch (JCException e) {
            return new AutoCompleteType(object);
        }
    }

    // Enum fields section
    
    public static AutoCompleteType None = getFrom(enumReflected, "None");
    public static AutoCompleteType Disabled = getFrom(enumReflected, "Disabled");
    public static AutoCompleteType Cellular = getFrom(enumReflected, "Cellular");
    public static AutoCompleteType Company = getFrom(enumReflected, "Company");
    public static AutoCompleteType Department = getFrom(enumReflected, "Department");
    public static AutoCompleteType DisplayName = getFrom(enumReflected, "DisplayName");
    public static AutoCompleteType Email = getFrom(enumReflected, "Email");
    public static AutoCompleteType FirstName = getFrom(enumReflected, "FirstName");
    public static AutoCompleteType Gender = getFrom(enumReflected, "Gender");
    public static AutoCompleteType HomeCity = getFrom(enumReflected, "HomeCity");
    public static AutoCompleteType HomeCountryRegion = getFrom(enumReflected, "HomeCountryRegion");
    public static AutoCompleteType HomeFax = getFrom(enumReflected, "HomeFax");
    public static AutoCompleteType HomePhone = getFrom(enumReflected, "HomePhone");
    public static AutoCompleteType HomeState = getFrom(enumReflected, "HomeState");
    public static AutoCompleteType HomeStreetAddress = getFrom(enumReflected, "HomeStreetAddress");
    public static AutoCompleteType HomeZipCode = getFrom(enumReflected, "HomeZipCode");
    public static AutoCompleteType Homepage = getFrom(enumReflected, "Homepage");
    public static AutoCompleteType JobTitle = getFrom(enumReflected, "JobTitle");
    public static AutoCompleteType LastName = getFrom(enumReflected, "LastName");
    public static AutoCompleteType MiddleName = getFrom(enumReflected, "MiddleName");
    public static AutoCompleteType Notes = getFrom(enumReflected, "Notes");
    public static AutoCompleteType Office = getFrom(enumReflected, "Office");
    public static AutoCompleteType Pager = getFrom(enumReflected, "Pager");
    public static AutoCompleteType BusinessCity = getFrom(enumReflected, "BusinessCity");
    public static AutoCompleteType BusinessCountryRegion = getFrom(enumReflected, "BusinessCountryRegion");
    public static AutoCompleteType BusinessFax = getFrom(enumReflected, "BusinessFax");
    public static AutoCompleteType BusinessPhone = getFrom(enumReflected, "BusinessPhone");
    public static AutoCompleteType BusinessState = getFrom(enumReflected, "BusinessState");
    public static AutoCompleteType BusinessStreetAddress = getFrom(enumReflected, "BusinessStreetAddress");
    public static AutoCompleteType BusinessUrl = getFrom(enumReflected, "BusinessUrl");
    public static AutoCompleteType BusinessZipCode = getFrom(enumReflected, "BusinessZipCode");
    public static AutoCompleteType Search = getFrom(enumReflected, "Search");
    public static AutoCompleteType Enabled = getFrom(enumReflected, "Enabled");


    // Flags management section


}