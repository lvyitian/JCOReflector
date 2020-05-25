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

package system.data.common;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.DbType;
import system.data.ParameterDirection;
import system.data.DataRowVersion;


/**
 * The base .NET class managing System.Data.Common.DbParameter, System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class DbParameter extends NetObject  {
    public static final String assemblyFullName = "System.Data.Common, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Data.Common";
    public static final String className = "System.Data.Common.DbParameter";
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

    public DbParameter(Object instance) throws Throwable {
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

    public static DbParameter castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DbParameter(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public DbType getDbType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DbType");
            return new DbType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDbType(DbType DbType) throws Throwable {
        try {
            classInstance.Set("DbType", (Object)DbType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ParameterDirection getDirection() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Direction");
            return new ParameterDirection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDirection(ParameterDirection Direction) throws Throwable {
        try {
            classInstance.Set("Direction", (Object)Direction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsNullable() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsNullable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsNullable(boolean IsNullable) throws Throwable {
        try {
            classInstance.Set("IsNullable", IsNullable);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getParameterName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ParameterName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setParameterName(java.lang.String ParameterName) throws Throwable {
        try {
            classInstance.Set("ParameterName", (Object)ParameterName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getPrecision() throws Throwable {
        try {
            return (byte)classInstance.Get("Precision");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrecision(byte Precision) throws Throwable {
        try {
            classInstance.Set("Precision", Precision);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getScale() throws Throwable {
        try {
            return (byte)classInstance.Get("Scale");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setScale(byte Scale) throws Throwable {
        try {
            classInstance.Set("Scale", Scale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSize() throws Throwable {
        try {
            return (int)classInstance.Get("Size");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSize(int Size) throws Throwable {
        try {
            classInstance.Set("Size", Size);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSourceColumn() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SourceColumn");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceColumn(java.lang.String SourceColumn) throws Throwable {
        try {
            classInstance.Set("SourceColumn", (Object)SourceColumn);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSourceColumnNullMapping() throws Throwable {
        try {
            return (boolean)classInstance.Get("SourceColumnNullMapping");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceColumnNullMapping(boolean SourceColumnNullMapping) throws Throwable {
        try {
            classInstance.Set("SourceColumnNullMapping", SourceColumnNullMapping);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DataRowVersion getSourceVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SourceVersion");
            return new DataRowVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceVersion(DataRowVersion SourceVersion) throws Throwable {
        try {
            classInstance.Set("SourceVersion", (Object)SourceVersion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Value");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValue(NetObject Value) throws Throwable {
        try {
            classInstance.Set("Value", (Object)Value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}