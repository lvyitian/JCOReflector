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

package system.enterpriseservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.enterpriseservices.ThreadPoolOption;
import system.enterpriseservices.InheritanceOption;
import system.enterpriseservices.BindingOption;
import system.enterpriseservices.TransactionOption;
import system.enterpriseservices.TransactionIsolationLevel;
import system.transactions.Transaction;
import system.enterpriseservices.SynchronizationOption;
import system.enterpriseservices.SxsOption;
import system.enterpriseservices.PartitionOption;
import system.Guid;


/**
 * The base .NET class managing System.EnterpriseServices.ServiceConfig, System.EnterpriseServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class ServiceConfig extends NetObject  {
    public static final String assemblyFullName = "System.EnterpriseServices, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.EnterpriseServices";
    public static final String className = "System.EnterpriseServices.ServiceConfig";
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

    public ServiceConfig(Object instance) throws Throwable {
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

    public static ServiceConfig castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ServiceConfig(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ServiceConfig() throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public ThreadPoolOption getThreadPool() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ThreadPool");
            return new ThreadPoolOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setThreadPool(ThreadPoolOption ThreadPool) throws Throwable {
        try {
            classInstance.Set("ThreadPool", (Object)ThreadPool.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public InheritanceOption getInheritance() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Inheritance");
            return new InheritanceOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInheritance(InheritanceOption Inheritance) throws Throwable {
        try {
            classInstance.Set("Inheritance", (Object)Inheritance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public BindingOption getBinding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Binding");
            return new BindingOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBinding(BindingOption Binding) throws Throwable {
        try {
            classInstance.Set("Binding", (Object)Binding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TransactionOption getTransaction() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Transaction");
            return new TransactionOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransaction(TransactionOption Transaction) throws Throwable {
        try {
            classInstance.Set("Transaction", (Object)Transaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TransactionIsolationLevel getIsolationLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IsolationLevel");
            return new TransactionIsolationLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsolationLevel(TransactionIsolationLevel IsolationLevel) throws Throwable {
        try {
            classInstance.Set("IsolationLevel", (Object)IsolationLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTransactionTimeout() throws Throwable {
        try {
            return (int)classInstance.Get("TransactionTimeout");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransactionTimeout(int TransactionTimeout) throws Throwable {
        try {
            classInstance.Set("TransactionTimeout", TransactionTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTipUrl() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TipUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTipUrl(java.lang.String TipUrl) throws Throwable {
        try {
            classInstance.Set("TipUrl", (Object)TipUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTransactionDescription() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TransactionDescription");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransactionDescription(java.lang.String TransactionDescription) throws Throwable {
        try {
            classInstance.Set("TransactionDescription", (Object)TransactionDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Transaction getBringYourOwnSystemTransaction() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BringYourOwnSystemTransaction");
            return new Transaction(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBringYourOwnSystemTransaction(Transaction BringYourOwnSystemTransaction) throws Throwable {
        try {
            classInstance.Set("BringYourOwnSystemTransaction", (Object)BringYourOwnSystemTransaction.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SynchronizationOption getSynchronization() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Synchronization");
            return new SynchronizationOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSynchronization(SynchronizationOption Synchronization) throws Throwable {
        try {
            classInstance.Set("Synchronization", (Object)Synchronization.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIISIntrinsicsEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("IISIntrinsicsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIISIntrinsicsEnabled(boolean IISIntrinsicsEnabled) throws Throwable {
        try {
            classInstance.Set("IISIntrinsicsEnabled", IISIntrinsicsEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCOMTIIntrinsicsEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("COMTIIntrinsicsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCOMTIIntrinsicsEnabled(boolean COMTIIntrinsicsEnabled) throws Throwable {
        try {
            classInstance.Set("COMTIIntrinsicsEnabled", COMTIIntrinsicsEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTrackingEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("TrackingEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrackingEnabled(boolean TrackingEnabled) throws Throwable {
        try {
            classInstance.Set("TrackingEnabled", TrackingEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTrackingAppName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TrackingAppName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrackingAppName(java.lang.String TrackingAppName) throws Throwable {
        try {
            classInstance.Set("TrackingAppName", (Object)TrackingAppName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTrackingComponentName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TrackingComponentName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrackingComponentName(java.lang.String TrackingComponentName) throws Throwable {
        try {
            classInstance.Set("TrackingComponentName", (Object)TrackingComponentName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SxsOption getSxsOption() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SxsOption");
            return new SxsOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSxsOption(SxsOption SxsOption) throws Throwable {
        try {
            classInstance.Set("SxsOption", (Object)SxsOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSxsDirectory() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SxsDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSxsDirectory(java.lang.String SxsDirectory) throws Throwable {
        try {
            classInstance.Set("SxsDirectory", (Object)SxsDirectory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSxsName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SxsName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSxsName(java.lang.String SxsName) throws Throwable {
        try {
            classInstance.Set("SxsName", (Object)SxsName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PartitionOption getPartitionOption() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PartitionOption");
            return new PartitionOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPartitionOption(PartitionOption PartitionOption) throws Throwable {
        try {
            classInstance.Set("PartitionOption", (Object)PartitionOption.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid getPartitionId() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PartitionId");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPartitionId(Guid PartitionId) throws Throwable {
        try {
            classInstance.Set("PartitionId", (Object)PartitionId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}