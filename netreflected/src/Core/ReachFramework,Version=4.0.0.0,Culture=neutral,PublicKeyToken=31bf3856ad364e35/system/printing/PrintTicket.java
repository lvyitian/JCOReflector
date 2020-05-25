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

package system.printing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.printing.PrintTicket;
import system.io.MemoryStream;
import system.printing.PageMediaSize;
import system.printing.PageResolution;
import system.componentmodel.PropertyChangedEventHandler;


/**
 * The base .NET class managing System.Printing.PrintTicket, ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class PrintTicket extends NetObject  {
    public static final String assemblyFullName = "ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "ReachFramework";
    public static final String className = "System.Printing.PrintTicket";
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

    public PrintTicket(Object instance) throws Throwable {
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

    public static PrintTicket castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PrintTicket(from.getJCOInstance());
    }

    // Constructors section
    
    
    public PrintTicket() throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentException, system.xml.XmlException, system.InvalidOperationException, system.xml.schema.XmlSchemaException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrintTicket(Stream xmlStream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)xmlStream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public PrintTicket Clone() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.globalization.CultureNotFoundException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new PrintTicket(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MemoryStream GetXmlStream() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException {
        try {
            JCObject objGetXmlStream = (JCObject)classInstance.Invoke("GetXmlStream");
            return new MemoryStream(objGetXmlStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveTo(Stream outStream) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException {
        try {
            classInstance.Invoke("SaveTo", (Object)outStream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public PageMediaSize getPageMediaSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PageMediaSize");
            return new PageMediaSize(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPageMediaSize(PageMediaSize PageMediaSize) throws Throwable {
        try {
            classInstance.Set("PageMediaSize", (Object)PageMediaSize.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PageResolution getPageResolution() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PageResolution");
            return new PageResolution(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPageResolution(PageResolution PageResolution) throws Throwable {
        try {
            classInstance.Set("PageResolution", (Object)PageResolution.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addPropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}