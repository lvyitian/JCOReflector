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

package system.xml.xsl.runtime;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.xpath.XPathItem;
import system.xml.xsl.runtime.XmlQueryItemSequence;
import system.Array;


/**
 * The base .NET class managing System.Xml.Xsl.Runtime.XmlQueryItemSequence, System.Data.SqlXml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class XmlQueryItemSequence extends NetObject  {
    public static final String assemblyFullName = "System.Data.SqlXml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data.SqlXml";
    public static final String className = "System.Xml.Xsl.Runtime.XmlQueryItemSequence";
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

    public XmlQueryItemSequence(Object instance) throws Throwable {
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

    public static XmlQueryItemSequence castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlQueryItemSequence(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XmlQueryItemSequence() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlQueryItemSequence(int capacity) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(capacity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlQueryItemSequence(XPathItem item) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public static XmlQueryItemSequence CreateOrReuse(XmlQueryItemSequence seq) throws Throwable {
        try {
            JCObject objCreateOrReuse = (JCObject)classType.Invoke("CreateOrReuse", (Object)seq.getJCOInstance());
            return new XmlQueryItemSequence(objCreateOrReuse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XmlQueryItemSequence CreateOrReuse(XmlQueryItemSequence seq, XPathItem item) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            JCObject objCreateOrReuse = (JCObject)classType.Invoke("CreateOrReuse", (Object)seq.getJCOInstance(), (Object)item.getJCOInstance());
            return new XmlQueryItemSequence(objCreateOrReuse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddClone(XPathItem item) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("AddClone", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(XPathItem value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(XPathItem[] array, int index) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(XPathItem value) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("IndexOf", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(XPathItem value) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("Add", (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SortByKeys(Array keys) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.InvalidOperationException {
        try {
            classInstance.Invoke("SortByKeys", (Object)keys.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}