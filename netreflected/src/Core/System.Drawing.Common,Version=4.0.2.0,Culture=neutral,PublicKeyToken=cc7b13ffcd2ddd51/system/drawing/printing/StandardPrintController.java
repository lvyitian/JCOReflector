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

package system.drawing.printing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.printing.PrintDocument;
import system.drawing.printing.PrintEventArgs;
import system.drawing.Graphics;
import system.drawing.printing.PrintPageEventArgs;


/**
 * The base .NET class managing System.Drawing.Printing.StandardPrintController, System.Drawing.Common, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class StandardPrintController extends NetObject  {
    public static final String assemblyFullName = "System.Drawing.Common, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Drawing.Common";
    public static final String className = "System.Drawing.Printing.StandardPrintController";
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

    public StandardPrintController(Object instance) throws Throwable {
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

    public static StandardPrintController castFrom(IJCOBridgeReflected from) throws Throwable {
        return new StandardPrintController(from.getJCOInstance());
    }

    // Constructors section
    
    
    public StandardPrintController() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void OnStartPrint(PrintDocument document, PrintEventArgs e) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.AccessViolationException, system.drawing.printing.InvalidPrinterException, system.ArgumentOutOfRangeException, system.ArrayTypeMismatchException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.InvalidCastException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("OnStartPrint", (Object)document.getJCOInstance(), (Object)e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Graphics OnStartPage(PrintDocument document, PrintPageEventArgs e) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.InvalidCastException, system.componentmodel.Win32Exception, system.AccessViolationException, system.drawing.printing.InvalidPrinterException, system.ArrayTypeMismatchException {
        try {
            JCObject objOnStartPage = (JCObject)classInstance.Invoke("OnStartPage", (Object)document.getJCOInstance(), (Object)e.getJCOInstance());
            return new Graphics(objOnStartPage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnEndPage(PrintDocument document, PrintPageEventArgs e) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.ArgumentNullException {
        try {
            classInstance.Invoke("OnEndPage", (Object)document.getJCOInstance(), (Object)e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void OnEndPrint(PrintDocument document, PrintEventArgs e) throws Throwable, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.ArgumentNullException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("OnEndPrint", (Object)document.getJCOInstance(), (Object)e.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsPreview() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsPreview");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}