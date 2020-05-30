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

package system.data.sqlclient;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section


/**
 * The base .NET class managing System.Data.SqlClient.SqlBulkCopyColumnMapping, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SqlBulkCopyColumnMapping extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.SqlClient.SqlBulkCopyColumnMapping";
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

    public SqlBulkCopyColumnMapping(Object instance) throws Throwable {
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

    public static SqlBulkCopyColumnMapping castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SqlBulkCopyColumnMapping(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SqlBulkCopyColumnMapping() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBulkCopyColumnMapping(java.lang.String sourceColumn, java.lang.String destinationColumn) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)sourceColumn, (Object)destinationColumn);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBulkCopyColumnMapping(int sourceColumnOrdinal, java.lang.String destinationColumn) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(sourceColumnOrdinal, (Object)destinationColumn);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBulkCopyColumnMapping(java.lang.String sourceColumn, int destinationOrdinal) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)sourceColumn, destinationOrdinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SqlBulkCopyColumnMapping(int sourceColumnOrdinal, int destinationOrdinal) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(sourceColumnOrdinal, destinationOrdinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public java.lang.String getDestinationColumn() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("DestinationColumn");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDestinationColumn(java.lang.String DestinationColumn) throws Throwable {
        try {
            classInstance.Set("DestinationColumn", (Object)DestinationColumn);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDestinationOrdinal() throws Throwable {
        try {
            return (int)classInstance.Get("DestinationOrdinal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDestinationOrdinal(int DestinationOrdinal) throws Throwable {
        try {
            classInstance.Set("DestinationOrdinal", DestinationOrdinal);
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

    public int getSourceOrdinal() throws Throwable {
        try {
            return (int)classInstance.Get("SourceOrdinal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceOrdinal(int SourceOrdinal) throws Throwable {
        try {
            classInstance.Set("SourceOrdinal", SourceOrdinal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}