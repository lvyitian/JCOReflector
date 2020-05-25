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

package system.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.design.DesignerVerb;
import system.componentmodel.design.MenuCommand;
import system.componentmodel.design.CommandID;
import system.componentmodel.design.DesignerVerbCollection;
import system.componentmodel.design.MenuCommandsChangedEventHandler;


/**
 * The base .NET class managing System.ComponentModel.Design.MenuCommandService, System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class MenuCommandService extends NetObject  {
    public static final String assemblyFullName = "System.Design, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Design";
    public static final String className = "System.ComponentModel.Design.MenuCommandService";
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

    public MenuCommandService(Object instance) throws Throwable {
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

    public static MenuCommandService castFrom(IJCOBridgeReflected from) throws Throwable {
        return new MenuCommandService(from.getJCOInstance());
    }

    // Constructors section
    
    

    
    // Methods section
    
    
    public void AddVerb(DesignerVerb verb) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NotSupportedException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("AddVerb", (Object)verb.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.InvalidOperationException, system.ArgumentException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MenuCommand FindCommand(CommandID commandID) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.MulticastNotSupportedException {
        try {
            JCObject objFindCommand = (JCObject)classInstance.Invoke("FindCommand", (Object)commandID.getJCOInstance());
            return new MenuCommand(objFindCommand);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GlobalInvoke(CommandID commandID) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GlobalInvoke", (Object)commandID.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean GlobalInvoke(CommandID commandId, NetObject arg) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("GlobalInvoke", (Object)commandId.getJCOInstance(), (Object)arg.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveCommand(MenuCommand command) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.RankException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("RemoveCommand", (Object)command.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveVerb(DesignerVerb verb) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NotSupportedException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("RemoveVerb", (Object)verb.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowContextMenu(CommandID menuID, int x, int y) throws Throwable {
        try {
            classInstance.Invoke("ShowContextMenu", (Object)menuID.getJCOInstance(), x, y);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddCommand(MenuCommand command) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("AddCommand", (Object)command.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public DesignerVerbCollection getVerbs() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Verbs");
            return new DesignerVerbCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addMenuCommandsChanged(MenuCommandsChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("MenuCommandsChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeMenuCommandsChanged(MenuCommandsChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("MenuCommandsChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}