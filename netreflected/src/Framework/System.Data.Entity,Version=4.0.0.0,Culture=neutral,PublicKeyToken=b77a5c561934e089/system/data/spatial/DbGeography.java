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

package system.data.spatial;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.spatial.DbGeography;
import system.data.spatial.DbGeographyWellKnownValue;


/**
 * The base .NET class managing System.Data.Spatial.DbGeography, System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DbGeography extends NetObject  {
    public static final String assemblyFullName = "System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data.Entity";
    public static final String className = "System.Data.Spatial.DbGeography";
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

    public DbGeography(Object instance) throws Throwable {
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

    public static DbGeography castFrom(IJCOBridgeReflected from) throws Throwable {
        return new DbGeography(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public static DbGeography FromBinary(byte[] wellKnownBinary) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objFromBinary = (JCObject)classType.Invoke("FromBinary", wellKnownBinary);
            return new DbGeography(objFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromBinary(byte[] wellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objFromBinary = (JCObject)classType.Invoke("FromBinary", wellKnownBinary, coordinateSystemId);
            return new DbGeography(objFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography LineFromBinary(byte[] lineWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objLineFromBinary = (JCObject)classType.Invoke("LineFromBinary", lineWellKnownBinary, coordinateSystemId);
            return new DbGeography(objLineFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PointFromBinary(byte[] pointWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objPointFromBinary = (JCObject)classType.Invoke("PointFromBinary", pointWellKnownBinary, coordinateSystemId);
            return new DbGeography(objPointFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PolygonFromBinary(byte[] polygonWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objPolygonFromBinary = (JCObject)classType.Invoke("PolygonFromBinary", polygonWellKnownBinary, coordinateSystemId);
            return new DbGeography(objPolygonFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiLineFromBinary(byte[] multiLineWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objMultiLineFromBinary = (JCObject)classType.Invoke("MultiLineFromBinary", multiLineWellKnownBinary, coordinateSystemId);
            return new DbGeography(objMultiLineFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPointFromBinary(byte[] multiPointWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objMultiPointFromBinary = (JCObject)classType.Invoke("MultiPointFromBinary", multiPointWellKnownBinary, coordinateSystemId);
            return new DbGeography(objMultiPointFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPolygonFromBinary(byte[] multiPolygonWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objMultiPolygonFromBinary = (JCObject)classType.Invoke("MultiPolygonFromBinary", multiPolygonWellKnownBinary, coordinateSystemId);
            return new DbGeography(objMultiPolygonFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography GeographyCollectionFromBinary(byte[] geographyCollectionWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objGeographyCollectionFromBinary = (JCObject)classType.Invoke("GeographyCollectionFromBinary", geographyCollectionWellKnownBinary, coordinateSystemId);
            return new DbGeography(objGeographyCollectionFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromGml(java.lang.String geographyMarkup) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objFromGml = (JCObject)classType.Invoke("FromGml", (Object)geographyMarkup);
            return new DbGeography(objFromGml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromGml(java.lang.String geographyMarkup, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objFromGml = (JCObject)classType.Invoke("FromGml", (Object)geographyMarkup, coordinateSystemId);
            return new DbGeography(objFromGml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromText(java.lang.String wellKnownText) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objFromText = (JCObject)classType.Invoke("FromText", (Object)wellKnownText);
            return new DbGeography(objFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromText(java.lang.String wellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objFromText = (JCObject)classType.Invoke("FromText", (Object)wellKnownText, coordinateSystemId);
            return new DbGeography(objFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography LineFromText(java.lang.String lineWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objLineFromText = (JCObject)classType.Invoke("LineFromText", (Object)lineWellKnownText, coordinateSystemId);
            return new DbGeography(objLineFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PointFromText(java.lang.String pointWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objPointFromText = (JCObject)classType.Invoke("PointFromText", (Object)pointWellKnownText, coordinateSystemId);
            return new DbGeography(objPointFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PolygonFromText(java.lang.String polygonWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objPolygonFromText = (JCObject)classType.Invoke("PolygonFromText", (Object)polygonWellKnownText, coordinateSystemId);
            return new DbGeography(objPolygonFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiLineFromText(java.lang.String multiLineWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objMultiLineFromText = (JCObject)classType.Invoke("MultiLineFromText", (Object)multiLineWellKnownText, coordinateSystemId);
            return new DbGeography(objMultiLineFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPointFromText(java.lang.String multiPointWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objMultiPointFromText = (JCObject)classType.Invoke("MultiPointFromText", (Object)multiPointWellKnownText, coordinateSystemId);
            return new DbGeography(objMultiPointFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPolygonFromText(java.lang.String multiPolygonWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objMultiPolygonFromText = (JCObject)classType.Invoke("MultiPolygonFromText", (Object)multiPolygonWellKnownText, coordinateSystemId);
            return new DbGeography(objMultiPolygonFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography GeographyCollectionFromText(java.lang.String geographyCollectionWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objGeographyCollectionFromText = (JCObject)classType.Invoke("GeographyCollectionFromText", (Object)geographyCollectionWellKnownText, coordinateSystemId);
            return new DbGeography(objGeographyCollectionFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String AsText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("AsText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] AsBinary() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("AsBinary");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexAsBinary = 0; indexAsBinary < resultingArrayList.size(); indexAsBinary++ ) {
				resultingArray[indexAsBinary] = (byte)resultingArrayList.get(indexAsBinary);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String AsGml() throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("AsGml");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SpatialEquals(DbGeography other) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("SpatialEquals", (Object)other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Disjoint(DbGeography other) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("Disjoint", (Object)other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Intersects(DbGeography other) throws Throwable, system.ArgumentNullException {
        try {
            return (boolean)classInstance.Invoke("Intersects", (Object)other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography Intersection(DbGeography other) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objIntersection = (JCObject)classInstance.Invoke("Intersection", (Object)other.getJCOInstance());
            return new DbGeography(objIntersection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography Union(DbGeography other) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objUnion = (JCObject)classInstance.Invoke("Union", (Object)other.getJCOInstance());
            return new DbGeography(objUnion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography Difference(DbGeography other) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objDifference = (JCObject)classInstance.Invoke("Difference", (Object)other.getJCOInstance());
            return new DbGeography(objDifference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography SymmetricDifference(DbGeography other) throws Throwable, system.ArgumentNullException {
        try {
            JCObject objSymmetricDifference = (JCObject)classInstance.Invoke("SymmetricDifference", (Object)other.getJCOInstance());
            return new DbGeography(objSymmetricDifference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography ElementAt(int index) throws Throwable {
        try {
            JCObject objElementAt = (JCObject)classInstance.Invoke("ElementAt", index);
            return new DbGeography(objElementAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography PointAt(int index) throws Throwable {
        try {
            JCObject objPointAt = (JCObject)classInstance.Invoke("PointAt", index);
            return new DbGeography(objPointAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public NetObject getProviderValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ProviderValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeographyWellKnownValue getWellKnownValue() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WellKnownValue");
            return new DbGeographyWellKnownValue(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWellKnownValue(DbGeographyWellKnownValue WellKnownValue) throws Throwable {
        try {
            classInstance.Set("WellKnownValue", (Object)WellKnownValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCoordinateSystemId() throws Throwable {
        try {
            return (int)classInstance.Get("CoordinateSystemId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDimension() throws Throwable {
        try {
            return (int)classInstance.Get("Dimension");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSpatialTypeName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SpatialTypeName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEmpty() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography getStartPoint() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StartPoint");
            return new DbGeography(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography getEndPoint() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EndPoint");
            return new DbGeography(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getDefaultCoordinateSystemId() throws Throwable {
        try {
            return (int)classType.Get("DefaultCoordinateSystemId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}