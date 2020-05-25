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

package system.io;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.IO.FileAttributes, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class FileAttributes extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.IO.FileAttributes";
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

    public FileAttributes(Object instance) {
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

    public FileAttributes() {
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

    final static FileAttributes getFrom(JCEnum object, String value) {
        try {
            return new FileAttributes(object.fromValue(value));
        } catch (JCException e) {
            return new FileAttributes(object);
        }
    }

    // Enum fields section
    
    public static FileAttributes ReadOnly = getFrom(enumReflected, "ReadOnly");
    public static FileAttributes Hidden = getFrom(enumReflected, "Hidden");
    public static FileAttributes System = getFrom(enumReflected, "System");
    public static FileAttributes Directory = getFrom(enumReflected, "Directory");
    public static FileAttributes Archive = getFrom(enumReflected, "Archive");
    public static FileAttributes Device = getFrom(enumReflected, "Device");
    public static FileAttributes Normal = getFrom(enumReflected, "Normal");
    public static FileAttributes Temporary = getFrom(enumReflected, "Temporary");
    public static FileAttributes SparseFile = getFrom(enumReflected, "SparseFile");
    public static FileAttributes ReparsePoint = getFrom(enumReflected, "ReparsePoint");
    public static FileAttributes Compressed = getFrom(enumReflected, "Compressed");
    public static FileAttributes Offline = getFrom(enumReflected, "Offline");
    public static FileAttributes NotContentIndexed = getFrom(enumReflected, "NotContentIndexed");
    public static FileAttributes Encrypted = getFrom(enumReflected, "Encrypted");
    public static FileAttributes IntegrityStream = getFrom(enumReflected, "IntegrityStream");
    public static FileAttributes NoScrubData = getFrom(enumReflected, "NoScrubData");


    // Flags management section

    public FileAttributes add(FileAttributes val) throws Throwable {
        return new FileAttributes(NetEnum.add(classInstance, val.classInstance));
    }

    public FileAttributes remove(FileAttributes val) throws Throwable {
        return new FileAttributes(NetEnum.remove(classInstance, val.classInstance));
    }

    public boolean is(FileAttributes val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public boolean has(FileAttributes val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}