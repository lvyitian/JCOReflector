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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DialogResult;
import system.runtime.remoting.ObjRef;
import system.drawing.printing.PrintDocument;
import system.drawing.printing.Margins;
import system.drawing.printing.PageSettings;
import system.drawing.printing.PrinterSettings;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Forms.PageSetupDialog, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class PageSetupDialog extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.PageSetupDialog";
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

    public PageSetupDialog(Object instance) throws Throwable {
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

    public static PageSetupDialog castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PageSetupDialog(from.getJCOInstance());
    }

    // Constructors section
    
    
    public PageSetupDialog() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Reset() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DialogResult ShowDialog() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.security.SecurityException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.io.IOException, system.configuration.ConfigurationException, system.io.FileNotFoundException, system.AccessViolationException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShowDialog = (JCObject)classInstance.Invoke("ShowDialog");
            return new DialogResult(objShowDialog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.InvalidOperationException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjRef CreateObjRef(NetType requestedType) throws Throwable, system.runtime.remoting.RemotingException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException {
        try {
            JCObject objCreateObjRef = (JCObject)classInstance.Invoke("CreateObjRef", (Object)requestedType.getJCOInstance());
            return new ObjRef(objCreateObjRef);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAllowMargins() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowMargins");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowMargins(boolean AllowMargins) throws Throwable {
        try {
            classInstance.Set("AllowMargins", AllowMargins);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowOrientation() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowOrientation");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowOrientation(boolean AllowOrientation) throws Throwable {
        try {
            classInstance.Set("AllowOrientation", AllowOrientation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowPaper() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowPaper");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowPaper(boolean AllowPaper) throws Throwable {
        try {
            classInstance.Set("AllowPaper", AllowPaper);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowPrinter() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowPrinter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowPrinter(boolean AllowPrinter) throws Throwable {
        try {
            classInstance.Set("AllowPrinter", AllowPrinter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrintDocument getDocument() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Document");
            return new PrintDocument(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDocument(PrintDocument Document) throws Throwable {
        try {
            classInstance.Set("Document", (Object)Document.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnableMetric() throws Throwable {
        try {
            return (boolean)classInstance.Get("EnableMetric");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnableMetric(boolean EnableMetric) throws Throwable {
        try {
            classInstance.Set("EnableMetric", EnableMetric);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Margins getMinMargins() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MinMargins");
            return new Margins(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinMargins(Margins MinMargins) throws Throwable {
        try {
            classInstance.Set("MinMargins", (Object)MinMargins.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PageSettings getPageSettings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PageSettings");
            return new PageSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPageSettings(PageSettings PageSettings) throws Throwable {
        try {
            classInstance.Set("PageSettings", (Object)PageSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrinterSettings getPrinterSettings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PrinterSettings");
            return new PrinterSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrinterSettings(PrinterSettings PrinterSettings) throws Throwable {
        try {
            classInstance.Set("PrinterSettings", (Object)PrinterSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowHelp() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowHelp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowHelp(boolean ShowHelp) throws Throwable {
        try {
            classInstance.Set("ShowHelp", ShowHelp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowNetwork() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowNetwork");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowNetwork(boolean ShowNetwork) throws Throwable {
        try {
            classInstance.Set("ShowNetwork", ShowNetwork);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTag() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Tag");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTag(NetObject Tag) throws Throwable {
        try {
            classInstance.Set("Tag", (Object)Tag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addHelpRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("HelpRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeHelpRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("HelpRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}