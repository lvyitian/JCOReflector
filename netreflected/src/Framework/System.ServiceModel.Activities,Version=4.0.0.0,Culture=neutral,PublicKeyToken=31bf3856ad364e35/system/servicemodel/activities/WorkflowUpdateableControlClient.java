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

package system.servicemodel.activities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.EndpointAddress;
import system.servicemodel.activities.WorkflowControlEndpoint;
import system.Guid;
import system.activities.WorkflowIdentity;
import system.servicemodel.description.ClientCredentials;
import system.servicemodel.CommunicationState;
import system.servicemodel.description.ServiceEndpoint;


/**
 * The base .NET class managing System.ServiceModel.Activities.WorkflowUpdateableControlClient, System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class WorkflowUpdateableControlClient extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.ServiceModel.Activities";
    public static final String className = "System.ServiceModel.Activities.WorkflowUpdateableControlClient";
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

    public WorkflowUpdateableControlClient(Object instance) throws Throwable {
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

    public static WorkflowUpdateableControlClient castFrom(IJCOBridgeReflected from) throws Throwable {
        return new WorkflowUpdateableControlClient(from.getJCOInstance());
    }

    // Constructors section
    
    
    public WorkflowUpdateableControlClient() throws Throwable, system.ArgumentException, system.configuration.ConfigurationException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowUpdateableControlClient(java.lang.String endpointConfigurationName) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)endpointConfigurationName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowUpdateableControlClient(java.lang.String endpointConfigurationName, EndpointAddress remoteAddress) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.globalization.CultureNotFoundException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)endpointConfigurationName, (Object)remoteAddress.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowUpdateableControlClient(java.lang.String endpointConfigurationName, java.lang.String remoteAddress) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.UriFormatException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)endpointConfigurationName, (Object)remoteAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowUpdateableControlClient(system.servicemodel.channels.Binding binding, EndpointAddress remoteAddress) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)binding.getJCOInstance(), (Object)remoteAddress.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WorkflowUpdateableControlClient(WorkflowControlEndpoint workflowEndpoint) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.security.cryptography.CryptographicException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)workflowEndpoint.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Abandon(Guid instanceId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("Abandon", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Abandon(Guid instanceId, java.lang.String reason) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("Abandon", (Object)instanceId.getJCOInstance(), (Object)reason);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AbandonAsync(Guid instanceId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.NullReferenceException {
        try {
            classInstance.Invoke("AbandonAsync", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AbandonAsync(Guid instanceId, NetObject userState) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.NullReferenceException {
        try {
            classInstance.Invoke("AbandonAsync", (Object)instanceId.getJCOInstance(), (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AbandonAsync(Guid instanceId, java.lang.String reason) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.NullReferenceException {
        try {
            classInstance.Invoke("AbandonAsync", (Object)instanceId.getJCOInstance(), (Object)reason);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AbandonAsync(Guid instanceId, java.lang.String reason, NetObject userState) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.NullReferenceException {
        try {
            classInstance.Invoke("AbandonAsync", (Object)instanceId.getJCOInstance(), (Object)reason, (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Cancel(Guid instanceId) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Cancel", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelAsync(Guid instanceId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.threading.WaitHandleCannotBeOpenedException {
        try {
            classInstance.Invoke("CancelAsync", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelAsync(Guid instanceId, NetObject userState) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("CancelAsync", (Object)instanceId.getJCOInstance(), (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Run(Guid instanceId) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Run", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RunAsync(Guid instanceId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.threading.WaitHandleCannotBeOpenedException {
        try {
            classInstance.Invoke("RunAsync", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RunAsync(Guid instanceId, NetObject userState) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("RunAsync", (Object)instanceId.getJCOInstance(), (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Suspend(Guid instanceId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NullReferenceException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("Suspend", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Suspend(Guid instanceId, java.lang.String reason) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Suspend", (Object)instanceId.getJCOInstance(), (Object)reason);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SuspendAsync(Guid instanceId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("SuspendAsync", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SuspendAsync(Guid instanceId, java.lang.String reason) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("SuspendAsync", (Object)instanceId.getJCOInstance(), (Object)reason);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SuspendAsync(Guid instanceId, NetObject userState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("SuspendAsync", (Object)instanceId.getJCOInstance(), (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SuspendAsync(Guid instanceId, java.lang.String reason, NetObject userState) throws Throwable, system.MulticastNotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("SuspendAsync", (Object)instanceId.getJCOInstance(), (Object)reason, (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Unsuspend(Guid instanceId) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Unsuspend", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UnsuspendAsync(Guid instanceId) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.threading.WaitHandleCannotBeOpenedException {
        try {
            classInstance.Invoke("UnsuspendAsync", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UnsuspendAsync(Guid instanceId, NetObject userState) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("UnsuspendAsync", (Object)instanceId.getJCOInstance(), (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Terminate(Guid instanceId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NullReferenceException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("Terminate", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Terminate(Guid instanceId, java.lang.String reason) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Terminate", (Object)instanceId.getJCOInstance(), (Object)reason);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TerminateAsync(Guid instanceId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("TerminateAsync", (Object)instanceId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TerminateAsync(Guid instanceId, java.lang.String reason) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("TerminateAsync", (Object)instanceId.getJCOInstance(), (Object)reason);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TerminateAsync(Guid instanceId, NetObject userState) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("TerminateAsync", (Object)instanceId.getJCOInstance(), (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TerminateAsync(Guid instanceId, java.lang.String reason, NetObject userState) throws Throwable, system.MulticastNotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException {
        try {
            classInstance.Invoke("TerminateAsync", (Object)instanceId.getJCOInstance(), (Object)reason, (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Update(Guid instanceId, WorkflowIdentity updatedDefinitionIdentity) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.transactions.TransactionException, system.transactions.TransactionManagerCommunicationException, system.ObjectDisposedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Update", (Object)instanceId.getJCOInstance(), (Object)updatedDefinitionIdentity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateAsync(Guid instanceId, WorkflowIdentity updatedDefinitionIdentity) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.collections.generic.KeyNotFoundException, system.threading.WaitHandleCannotBeOpenedException {
        try {
            classInstance.Invoke("UpdateAsync", (Object)instanceId.getJCOInstance(), (Object)updatedDefinitionIdentity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UpdateAsync(Guid instanceId, WorkflowIdentity updatedDefinitionIdentity, NetObject userState) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.collections.generic.KeyNotFoundException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("UpdateAsync", (Object)instanceId.getJCOInstance(), (Object)updatedDefinitionIdentity.getJCOInstance(), (Object)userState.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public ClientCredentials getClientCredentials() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClientCredentials");
            return new ClientCredentials(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CommunicationState getState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("State");
            return new CommunicationState(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServiceEndpoint getEndpoint() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Endpoint");
            return new ServiceEndpoint(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    

}