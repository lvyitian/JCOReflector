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

package system.runtime.remoting.messaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.remoting.messaging.LogicalCallContext;
import system.reflection.MethodBase;


/**
 * The base .NET class managing System.Runtime.Remoting.Messaging.MethodCallMessageWrapper, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class MethodCallMessageWrapper extends NetObject  {
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "mscorlib";
    public static final String className = "System.Runtime.Remoting.Messaging.MethodCallMessageWrapper";
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

    public MethodCallMessageWrapper(Object instance) throws Throwable {
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

    public static MethodCallMessageWrapper castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MethodCallMessageWrapper(from.getJCOInstance());
    }

    // Constructors section
    
    

    
    // Methods section
    
    
    public java.lang.String GetArgName(int index) throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("GetArgName", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetArg(int argNum) throws Throwable {
        try {
            JCObject objGetArg = (JCObject)classInstance.Invoke("GetArg", argNum);
            return new NetObject(objGetArg);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetInArg(int argNum) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException {
        try {
            JCObject objGetInArg = (JCObject)classInstance.Invoke("GetInArg", argNum);
            return new NetObject(objGetInArg);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetInArgName(int index) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException {
        try {
            return (java.lang.String)classInstance.Invoke("GetInArgName", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getUri() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Uri");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUri(java.lang.String Uri) throws Throwable {
        try {
            classInstance.Set("Uri", (Object)Uri);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMethodName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MethodName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTypeName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TypeName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getMethodSignature() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MethodSignature");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LogicalCallContext getLogicalCallContext() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LogicalCallContext");
            return new LogicalCallContext(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MethodBase getMethodBase() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MethodBase");
            return new MethodBase(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getArgCount() throws Throwable {
        try {
            return (int)classInstance.Get("ArgCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] getArgs() throws Throwable {
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Args");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setArgs(NetObject[] Args) throws Throwable {
        try {
            classInstance.Set("Args", (Object)toObjectFromArray(Args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasVarArgs() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasVarArgs");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getInArgCount() throws Throwable {
        try {
            return (int)classInstance.Get("InArgCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] getInArgs() throws Throwable {
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Get("InArgs");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}