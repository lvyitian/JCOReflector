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

package system.windows.controls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.Visual;
import system.windows.documents.DocumentPaginator;
import system.windows.controls.PageRangeSelection;
import system.windows.controls.PageRange;
import system.UInt32;
import system.printing.PrintQueue;
import system.printing.PrintTicket;


/**
 * The base .NET class managing System.Windows.Controls.PrintDialog, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class PrintDialog extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Controls.PrintDialog";
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

    public PrintDialog(Object instance) throws Throwable {
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

    public static PrintDialog castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PrintDialog(from.getJCOInstance());
    }

    // Constructors section
    
    
    public PrintDialog() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void PrintVisual(Visual visual, java.lang.String description) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.componentmodel.Win32Exception, system.FormatException {
        try {
            classInstance.Invoke("PrintVisual", (Object)visual.getJCOInstance(), (Object)description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PrintDocument(DocumentPaginator documentPaginator, java.lang.String description) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.printing.PrintingNotSupportedException, system.printing.PrintQueueException, system.componentmodel.Win32Exception, system.FormatException {
        try {
            classInstance.Invoke("PrintDocument", (Object)documentPaginator.getJCOInstance(), (Object)description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public PageRangeSelection getPageRangeSelection() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PageRangeSelection");
            return new PageRangeSelection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPageRangeSelection(PageRangeSelection PageRangeSelection) throws Throwable {
        try {
            classInstance.Set("PageRangeSelection", (Object)PageRangeSelection.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PageRange getPageRange() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PageRange");
            return new PageRange(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPageRange(PageRange PageRange) throws Throwable {
        try {
            classInstance.Set("PageRange", (Object)PageRange.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUserPageRangeEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("UserPageRangeEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUserPageRangeEnabled(boolean UserPageRangeEnabled) throws Throwable {
        try {
            classInstance.Set("UserPageRangeEnabled", UserPageRangeEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSelectedPagesEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("SelectedPagesEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSelectedPagesEnabled(boolean SelectedPagesEnabled) throws Throwable {
        try {
            classInstance.Set("SelectedPagesEnabled", SelectedPagesEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCurrentPageEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("CurrentPageEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCurrentPageEnabled(boolean CurrentPageEnabled) throws Throwable {
        try {
            classInstance.Set("CurrentPageEnabled", CurrentPageEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt32 getMinPage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MinPage");
            return new UInt32(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMinPage(UInt32 MinPage) throws Throwable {
        try {
            classInstance.Set("MinPage", (Object)MinPage.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt32 getMaxPage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MaxPage");
            return new UInt32(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxPage(UInt32 MaxPage) throws Throwable {
        try {
            classInstance.Set("MaxPage", (Object)MaxPage.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrintQueue getPrintQueue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PrintQueue");
            return new PrintQueue(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrintQueue(PrintQueue PrintQueue) throws Throwable {
        try {
            classInstance.Set("PrintQueue", (Object)PrintQueue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrintTicket getPrintTicket() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PrintTicket");
            return new PrintTicket(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrintTicket(PrintTicket PrintTicket) throws Throwable {
        try {
            classInstance.Set("PrintTicket", (Object)PrintTicket.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getPrintableAreaWidth() throws Throwable {
        try {
            return (double)classInstance.Get("PrintableAreaWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getPrintableAreaHeight() throws Throwable {
        try {
            return (double)classInstance.Get("PrintableAreaHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}