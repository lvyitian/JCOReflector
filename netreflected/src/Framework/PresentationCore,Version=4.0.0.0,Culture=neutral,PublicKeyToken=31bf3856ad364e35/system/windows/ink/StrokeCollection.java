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

package system.windows.ink;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.Stream;
import system.Guid;
import system.windows.media.Matrix;
import system.windows.ink.StrokeCollection;
import system.windows.ink.Stroke;
import system.windows.Rect;
import system.windows.Point;
import system.windows.media.DrawingContext;
import system.windows.ink.IncrementalStrokeHitTester;
import system.windows.ink.StylusShape;
import system.windows.ink.IncrementalLassoHitTester;
import system.windows.ink.StrokeCollectionChangedEventHandler;
import system.windows.ink.PropertyDataChangedEventHandler;


/**
 * The base .NET class managing System.Windows.Ink.StrokeCollection, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class StrokeCollection extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Ink.StrokeCollection";
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

    public StrokeCollection(Object instance) throws Throwable {
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

    public static StrokeCollection castFrom(IJCOBridgeReflected from) throws Throwable {
        return new StrokeCollection(from.getJCOInstance());
    }

    // Constructors section
    
    
    public StrokeCollection() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StrokeCollection(Stream stream) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.security.SecurityException, system.IndexOutOfRangeException, system.NotSupportedException, system.MulticastNotSupportedException, system.io.EndOfStreamException, system.io.IOException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Save(Stream stream, boolean compress) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.NotSupportedException, system.OutOfMemoryException, system.UnauthorizedAccessException {
        try {
            classInstance.Invoke("Save", (Object)stream.getJCOInstance(), compress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Save(Stream stream) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.OutOfMemoryException, system.UnauthorizedAccessException {
        try {
            classInstance.Invoke("Save", (Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddPropertyData(Guid propertyDataId, NetObject propertyData) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException {
        try {
            classInstance.Invoke("AddPropertyData", (Object)propertyDataId.getJCOInstance(), (Object)propertyData.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemovePropertyData(Guid propertyDataId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("RemovePropertyData", (Object)propertyDataId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetPropertyData(Guid propertyDataId) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            JCObject objGetPropertyData = (JCObject)classInstance.Invoke("GetPropertyData", (Object)propertyDataId.getJCOInstance());
            return new NetObject(objGetPropertyData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Guid[] GetPropertyDataIds() throws Throwable, system.ArgumentOutOfRangeException {
        try {
            ArrayList<Guid> resultingArrayList = new ArrayList<Guid>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetPropertyDataIds");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Guid(resultingObject));
            }
            Guid[] resultingArray = new Guid[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsPropertyData(Guid propertyDataId) throws Throwable, system.ArgumentOutOfRangeException {
        try {
            return (boolean)classInstance.Invoke("ContainsPropertyData", (Object)propertyDataId.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Transform(Matrix transformMatrix, boolean applyToStylusTip) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.OverflowException {
        try {
            classInstance.Invoke("Transform", (Object)transformMatrix.getJCOInstance(), applyToStylusTip);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StrokeCollection Clone() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.OverflowException, system.NotSupportedException, system.MulticastNotSupportedException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new StrokeCollection(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(Stroke stroke) throws Throwable {
        try {
            return (int)classInstance.Invoke("IndexOf", (Object)stroke.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(StrokeCollection strokes) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Remove", (Object)strokes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(StrokeCollection strokes) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Add", (Object)strokes.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Replace(Stroke strokeToReplace, StrokeCollection strokesToReplaceWith) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("Replace", (Object)strokeToReplace.getJCOInstance(), (Object)strokesToReplaceWith.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Replace(StrokeCollection strokesToReplace, StrokeCollection strokesToReplaceWith) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Replace", (Object)strokesToReplace.getJCOInstance(), (Object)strokesToReplaceWith.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rect GetBounds() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException {
        try {
            JCObject objGetBounds = (JCObject)classInstance.Invoke("GetBounds");
            return new Rect(objGetBounds);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StrokeCollection HitTest(Point point) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.NotSupportedException, system.NotImplementedException {
        try {
            JCObject objHitTest = (JCObject)classInstance.Invoke("HitTest", (Object)point.getJCOInstance());
            return new StrokeCollection(objHitTest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StrokeCollection HitTest(Point point, double diameter) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.IndexOutOfRangeException, system.NotSupportedException {
        try {
            JCObject objHitTest = (JCObject)classInstance.Invoke("HitTest", (Object)point.getJCOInstance(), diameter);
            return new StrokeCollection(objHitTest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StrokeCollection HitTest(Rect bounds, int percentageWithinBounds) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            JCObject objHitTest = (JCObject)classInstance.Invoke("HitTest", (Object)bounds.getJCOInstance(), percentageWithinBounds);
            return new StrokeCollection(objHitTest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Draw(DrawingContext context) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.OverflowException, system.NotSupportedException, system.MulticastNotSupportedException, system.IndexOutOfRangeException {
        try {
            classInstance.Invoke("Draw", (Object)context.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IncrementalStrokeHitTester GetIncrementalStrokeHitTester(StylusShape eraserShape) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            JCObject objGetIncrementalStrokeHitTester = (JCObject)classInstance.Invoke("GetIncrementalStrokeHitTester", (Object)eraserShape.getJCOInstance());
            return new IncrementalStrokeHitTester(objGetIncrementalStrokeHitTester);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IncrementalLassoHitTester GetIncrementalLassoHitTester(int percentageWithinLasso) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            JCObject objGetIncrementalLassoHitTester = (JCObject)classInstance.Invoke("GetIncrementalLassoHitTester", percentageWithinLasso);
            return new IncrementalLassoHitTester(objGetIncrementalLassoHitTester);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clip(Rect bounds) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("Clip", (Object)bounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Erase(Rect bounds) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("Erase", (Object)bounds.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(Stroke item) throws Throwable, system.NotSupportedException {
        try {
            classInstance.Invoke("Add", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.NotSupportedException {
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Stroke[] array, int index) throws Throwable {
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(Stroke item) throws Throwable {
        try {
            return (boolean)classInstance.Invoke("Contains", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Remove(Stroke item) throws Throwable, system.NotSupportedException {
        try {
            return (boolean)classInstance.Invoke("Remove", (Object)item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAt(int index) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Insert(int index, Stroke item) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("Insert", index, (Object)item.getJCOInstance());
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
    
    
    public void addStrokesChanged(StrokeCollectionChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("StrokesChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeStrokesChanged(StrokeCollectionChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("StrokesChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addPropertyDataChanged(PropertyDataChangedEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("PropertyDataChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePropertyDataChanged(PropertyDataChangedEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("PropertyDataChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}