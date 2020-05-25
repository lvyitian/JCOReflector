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

package system.reflection.portableexecutable;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Reflection.PortableExecutable.Machine, System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Machine extends NetObject  {
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Reflection.Metadata";
    public static final String className = "System.Reflection.PortableExecutable.Machine";
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

    public Machine(Object instance) {
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

    public Machine() {
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

    final static Machine getFrom(JCEnum object, String value) {
        try {
            return new Machine(object.fromValue(value));
        } catch (JCException e) {
            return new Machine(object);
        }
    }

    // Enum fields section
    
    public static Machine Unknown = getFrom(enumReflected, "Unknown");
    public static Machine I386 = getFrom(enumReflected, "I386");
    public static Machine WceMipsV2 = getFrom(enumReflected, "WceMipsV2");
    public static Machine Alpha = getFrom(enumReflected, "Alpha");
    public static Machine SH3 = getFrom(enumReflected, "SH3");
    public static Machine SH3Dsp = getFrom(enumReflected, "SH3Dsp");
    public static Machine SH3E = getFrom(enumReflected, "SH3E");
    public static Machine SH4 = getFrom(enumReflected, "SH4");
    public static Machine SH5 = getFrom(enumReflected, "SH5");
    public static Machine Arm = getFrom(enumReflected, "Arm");
    public static Machine Thumb = getFrom(enumReflected, "Thumb");
    public static Machine ArmThumb2 = getFrom(enumReflected, "ArmThumb2");
    public static Machine AM33 = getFrom(enumReflected, "AM33");
    public static Machine PowerPC = getFrom(enumReflected, "PowerPC");
    public static Machine PowerPCFP = getFrom(enumReflected, "PowerPCFP");
    public static Machine IA64 = getFrom(enumReflected, "IA64");
    public static Machine MIPS16 = getFrom(enumReflected, "MIPS16");
    public static Machine Alpha64 = getFrom(enumReflected, "Alpha64");
    public static Machine MipsFpu = getFrom(enumReflected, "MipsFpu");
    public static Machine MipsFpu16 = getFrom(enumReflected, "MipsFpu16");
    public static Machine Tricore = getFrom(enumReflected, "Tricore");
    public static Machine Ebc = getFrom(enumReflected, "Ebc");
    public static Machine Amd64 = getFrom(enumReflected, "Amd64");
    public static Machine M32R = getFrom(enumReflected, "M32R");
    public static Machine Arm64 = getFrom(enumReflected, "Arm64");


    // Flags management section


}