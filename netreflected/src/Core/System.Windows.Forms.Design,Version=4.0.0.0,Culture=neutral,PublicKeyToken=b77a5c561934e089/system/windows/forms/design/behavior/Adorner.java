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

package system.windows.forms.design.behavior;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.drawing.Rectangle;
import system.drawing.Region;
import system.windows.forms.design.behavior.BehaviorService;
import system.windows.forms.design.behavior.GlyphCollection;


/**
 * The base .NET class managing System.Windows.Forms.Design.Behavior.Adorner, System.Windows.Forms.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class Adorner extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms.Design";
    public static final String className = "System.Windows.Forms.Design.Behavior.Adorner";
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

    public Adorner(Object instance) throws Throwable {
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

    public static Adorner castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Adorner(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Adorner() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Invalidate() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.NullReferenceException, system.FormatException {
        try {
            classInstance.Invoke("Invalidate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invalidate(Rectangle rectangle) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.FormatException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Invalidate", (Object)rectangle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Invalidate(Region region) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException {
        try {
            classInstance.Invoke("Invalidate", (Object)region.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public BehaviorService getBehaviorService() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BehaviorService");
            return new BehaviorService(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBehaviorService(BehaviorService BehaviorService) throws Throwable {
        try {
            classInstance.Set("BehaviorService", (Object)BehaviorService.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnabled() throws Throwable {
        try {
            return (boolean)classInstance.Get("Enabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnabled(boolean Enabled) throws Throwable {
        try {
            classInstance.Set("Enabled", Enabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GlyphCollection getGlyphs() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Glyphs");
            return new GlyphCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}