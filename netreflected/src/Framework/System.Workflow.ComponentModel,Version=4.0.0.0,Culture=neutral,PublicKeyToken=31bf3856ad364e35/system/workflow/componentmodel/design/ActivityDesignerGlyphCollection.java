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

package system.workflow.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.workflow.componentmodel.design.ActivityDesignerGlyphCollection;
import system.workflow.componentmodel.design.DesignerGlyph;


/**
 * The base .NET class managing System.Workflow.ComponentModel.Design.ActivityDesignerGlyphCollection, System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class ActivityDesignerGlyphCollection extends NetObject  {
    public static final String assemblyFullName = "System.Workflow.ComponentModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "System.Workflow.ComponentModel";
    public static final String className = "System.Workflow.ComponentModel.Design.ActivityDesignerGlyphCollection";
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

    public ActivityDesignerGlyphCollection(Object instance) throws Throwable {
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

    public static ActivityDesignerGlyphCollection castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ActivityDesignerGlyphCollection(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ActivityDesignerGlyphCollection() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ActivityDesignerGlyphCollection(ActivityDesignerGlyphCollection glyphs) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)glyphs.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Add(DesignerGlyph item) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("Add", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int BinarySearch(DesignerGlyph item) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException {
        try {
            return (int)classInstance.Invoke("BinarySearch", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(DesignerGlyph item) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(DesignerGlyph[] array) throws Throwable {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(int index, DesignerGlyph[] array, int arrayIndex, int count) throws Throwable, system.ArgumentException {
        try {
            classInstance.Invoke("CopyTo", index, (Object)toObjectFromArray(array), arrayIndex, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(DesignerGlyph[] array, int arrayIndex) throws Throwable {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array), arrayIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(DesignerGlyph item) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (int)classInstance.Invoke("IndexOf", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(DesignerGlyph item, int index) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            return (int)classInstance.Invoke("IndexOf", (Object)item.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(DesignerGlyph item, int index, int count) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            return (int)classInstance.Invoke("IndexOf", (Object)item.getJCOInstance(), index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Insert(int index, DesignerGlyph item) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("Insert", index, (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int LastIndexOf(DesignerGlyph item) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            return (int)classInstance.Invoke("LastIndexOf", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int LastIndexOf(DesignerGlyph item, int index) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            return (int)classInstance.Invoke("LastIndexOf", (Object)item.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int LastIndexOf(DesignerGlyph item, int index, int count) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException {
        try {
            return (int)classInstance.Invoke("LastIndexOf", (Object)item.getJCOInstance(), index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Remove(DesignerGlyph item) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("Remove", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAt(int index) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveRange(int index, int count) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            classInstance.Invoke("RemoveRange", index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reverse() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.RankException {
        try {
            classInstance.Invoke("Reverse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reverse(int index, int count) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.RankException {
        try {
            classInstance.Invoke("Reverse", index, count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Sort() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException {
        try {
            classInstance.Invoke("Sort");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DesignerGlyph[] ToArray() throws Throwable {
        try {
            ArrayList<DesignerGlyph> resultingArrayList = new ArrayList<DesignerGlyph>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ToArray");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new DesignerGlyph(resultingObject));
            }
            DesignerGlyph[] resultingArray = new DesignerGlyph[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void TrimExcess() throws Throwable, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("TrimExcess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public int getCapacity() throws Throwable {
        try {
            return (int)classInstance.Get("Capacity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCapacity(int Capacity) throws Throwable {
        try {
            classInstance.Set("Capacity", Capacity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCount() throws Throwable {
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}