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

package system.windows.forms.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.PropertyDescriptor;
import system.componentmodel.PropertyDescriptorCollection;
import system.Attribute;
import system.drawing.Bitmap;


/**
 * The base .NET class managing System.Windows.Forms.Design.EventsTab, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class EventsTab extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.Design.EventsTab";
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

    public EventsTab(Object instance) throws Throwable {
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

    public static EventsTab castFrom(IJCOBridgeReflected from) throws Throwable {
        return new EventsTab(from.getJCOInstance());
    }

    // Constructors section
    
    

    
    // Methods section
    
    
    public boolean CanExtend(NetObject extendee) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CanExtend", (Object)extendee.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptor GetDefaultProperty(NetObject obj) throws Throwable, system.ArgumentException, system.ArgumentNullException {
        try {
            JCObject objGetDefaultProperty = (JCObject)classInstance.Invoke("GetDefaultProperty", (Object)obj.getJCOInstance());
            return new PropertyDescriptor(objGetDefaultProperty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptorCollection GetProperties(NetObject component, Attribute[] attributes) throws Throwable {
        try {
            JCObject objGetProperties = (JCObject)classInstance.Invoke("GetProperties", (Object)component.getJCOInstance(), (Object)toObjectFromArray(attributes));
            return new PropertyDescriptorCollection(objGetProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PropertyDescriptorCollection GetProperties(NetObject component) throws Throwable {
        try {
            JCObject objGetProperties = (JCObject)classInstance.Invoke("GetProperties", (Object)component.getJCOInstance());
            return new PropertyDescriptorCollection(objGetProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String getTabName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TabName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHelpKeyword() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HelpKeyword");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bitmap getBitmap() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Bitmap");
            return new Bitmap(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject[] getComponents() throws Throwable {
        try {
            ArrayList<NetObject> resultingArrayList = new ArrayList<NetObject>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Components");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new NetObject(resultingObject));
            }
            NetObject[] resultingArray = new NetObject[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setComponents(NetObject[] Components) throws Throwable {
        try {
            classInstance.Set("Components", (Object)toObjectFromArray(Components));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}