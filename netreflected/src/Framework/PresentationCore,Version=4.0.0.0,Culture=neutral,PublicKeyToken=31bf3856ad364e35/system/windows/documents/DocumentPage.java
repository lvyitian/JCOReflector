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

package system.windows.documents;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.Visual;
import system.windows.Size;
import system.windows.Rect;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Documents.DocumentPage, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class DocumentPage extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Documents.DocumentPage";
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

    public DocumentPage(Object instance) throws Throwable {
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

    public static DocumentPage castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DocumentPage(from.getJCOInstance());
    }

    // Constructors section
    
    
    public DocumentPage(Visual visual) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)visual.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DocumentPage(Visual visual, Size pageSize, Rect bleedBox, Rect contentBox) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)visual.getJCOInstance(), (Object)pageSize.getJCOInstance(), (Object)bleedBox.getJCOInstance(), (Object)contentBox.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Dispose() throws Throwable {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public Visual getVisual() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Visual");
            return new Visual(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Size getSize() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Size");
            return new Size(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rect getBleedBox() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BleedBox");
            return new Rect(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rect getContentBox() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ContentBox");
            return new Rect(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addPageDestroyed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PageDestroyed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePageDestroyed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PageDestroyed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}