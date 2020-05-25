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

package system.web.services.protocols;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlReader;
import system.xml.serialization.XmlSerializer;
import system.web.services.protocols.SoapHeaderCollection;
import system.web.services.protocols.SoapHeaderMapping;
import system.web.services.protocols.SoapHeaderDirection;
import system.xml.XmlWriter;


/**
 * The base .NET class managing System.Web.Services.Protocols.SoapHeaderHandling, System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SoapHeaderHandling extends NetObject  {
    public static final String assemblyFullName = "System.Web.Services, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web.Services";
    public static final String className = "System.Web.Services.Protocols.SoapHeaderHandling";
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

    public SoapHeaderHandling(Object instance) throws Throwable {
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

    public static SoapHeaderHandling castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SoapHeaderHandling(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SoapHeaderHandling() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public java.lang.String ReadHeaders(XmlReader reader, XmlSerializer serializer, SoapHeaderCollection headers, SoapHeaderMapping[] mappings, SoapHeaderDirection direction, java.lang.String envelopeNS, java.lang.String encodingStyle, boolean checkRequiredHeaders) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.xml.XmlException, system.MulticastNotSupportedException, system.FormatException, system.OverflowException, system.NotImplementedException, system.MissingMethodException {
        try {
            return (java.lang.String)classInstance.Invoke("ReadHeaders", (Object)reader.getJCOInstance(), (Object)serializer.getJCOInstance(), (Object)headers.getJCOInstance(), (Object)toObjectFromArray(mappings), (Object)direction.getJCOInstance(), (Object)envelopeNS, (Object)encodingStyle, checkRequiredHeaders);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteHeaders(XmlWriter writer, XmlSerializer serializer, SoapHeaderCollection headers, SoapHeaderMapping[] mappings, SoapHeaderDirection direction, boolean isEncoded, java.lang.String defaultNS, boolean serviceDefaultIsEncoded, java.lang.String envelopeNS) throws Throwable, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException, system.OverflowException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.NotImplementedException, system.MissingMethodException, system.xml.XmlException, system.RankException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.threading.ThreadAbortException, system.security.SecurityException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.ApplicationException, system.componentmodel.Win32Exception, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.TypeLoadException, system.collections.generic.KeyNotFoundException {
        try {
            classType.Invoke("WriteHeaders", (Object)writer.getJCOInstance(), (Object)serializer.getJCOInstance(), (Object)headers.getJCOInstance(), (Object)toObjectFromArray(mappings), (Object)direction.getJCOInstance(), isEncoded, (Object)defaultNS, serviceDefaultIsEncoded, (Object)envelopeNS);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteUnknownHeaders(XmlWriter writer, SoapHeaderCollection headers, java.lang.String envelopeNS) throws Throwable, system.ArgumentOutOfRangeException, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.xml.XmlException, system.RankException {
        try {
            classType.Invoke("WriteUnknownHeaders", (Object)writer.getJCOInstance(), (Object)headers.getJCOInstance(), (Object)envelopeNS);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetHeaderMembers(SoapHeaderCollection headers, NetObject target, SoapHeaderMapping[] mappings, SoapHeaderDirection direction, boolean client) throws Throwable, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.NullReferenceException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.web.services.protocols.SoapHeaderException {
        try {
            classType.Invoke("SetHeaderMembers", (Object)headers.getJCOInstance(), (Object)target.getJCOInstance(), (Object)toObjectFromArray(mappings), (Object)direction.getJCOInstance(), client);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void GetHeaderMembers(SoapHeaderCollection headers, NetObject target, SoapHeaderMapping[] mappings, SoapHeaderDirection direction, boolean client) throws Throwable {
        try {
            classType.Invoke("GetHeaderMembers", (Object)headers.getJCOInstance(), (Object)target.getJCOInstance(), (Object)toObjectFromArray(mappings), (Object)direction.getJCOInstance(), client);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void EnsureHeadersUnderstood(SoapHeaderCollection headers) throws Throwable, system.ArgumentOutOfRangeException, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.xml.XmlException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.configuration.ConfigurationErrorsException, system.OutOfMemoryException, system.web.services.protocols.SoapHeaderException {
        try {
            classType.Invoke("EnsureHeadersUnderstood", (Object)headers.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}