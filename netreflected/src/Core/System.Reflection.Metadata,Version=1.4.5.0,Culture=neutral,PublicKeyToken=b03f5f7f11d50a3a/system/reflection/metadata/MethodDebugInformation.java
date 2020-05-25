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

package system.reflection.metadata;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.metadata.SequencePointCollection;
import system.reflection.metadata.MethodDefinitionHandle;
import system.reflection.metadata.BlobHandle;
import system.reflection.metadata.DocumentHandle;
import system.reflection.metadata.StandaloneSignatureHandle;


/**
 * The base .NET class managing System.Reflection.Metadata.MethodDebugInformation, System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class MethodDebugInformation extends NetObject  {
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=1.4.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Reflection.Metadata";
    public static final String className = "System.Reflection.Metadata.MethodDebugInformation";
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

    public MethodDebugInformation(Object instance) throws Throwable {
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

    public static MethodDebugInformation castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MethodDebugInformation(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public SequencePointCollection GetSequencePoints() throws Throwable, system.BadImageFormatException, system.ArgumentOutOfRangeException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.ArgumentNullException, system.InvalidOperationException {
        try {
            JCObject objGetSequencePoints = (JCObject)classInstance.Invoke("GetSequencePoints");
            return new SequencePointCollection(objGetSequencePoints);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodDefinitionHandle GetStateMachineKickoffMethod() throws Throwable, system.BadImageFormatException {
        try {
            JCObject objGetStateMachineKickoffMethod = (JCObject)classInstance.Invoke("GetStateMachineKickoffMethod");
            return new MethodDefinitionHandle(objGetStateMachineKickoffMethod);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public BlobHandle getSequencePointsBlob() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SequencePointsBlob");
            return new BlobHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DocumentHandle getDocument() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Document");
            return new DocumentHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StandaloneSignatureHandle getLocalSignature() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LocalSignature");
            return new StandaloneSignatureHandle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}