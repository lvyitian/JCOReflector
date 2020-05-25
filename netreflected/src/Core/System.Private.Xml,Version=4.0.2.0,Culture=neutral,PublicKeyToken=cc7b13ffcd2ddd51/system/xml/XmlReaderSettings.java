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

package system.xml;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.XmlReaderSettings;
import system.xml.XmlNameTable;
import system.xml.XmlResolver;
import system.xml.ConformanceLevel;
import system.xml.DtdProcessing;
import system.xml.ValidationType;
import system.xml.schema.XmlSchemaValidationFlags;
import system.xml.schema.XmlSchemaSet;
import system.xml.schema.ValidationEventHandler;


/**
 * The base .NET class managing System.Xml.XmlReaderSettings, System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51. Extends {@link NetObject}.
 */
public class XmlReaderSettings extends NetObject  {
    public static final String assemblyFullName = "System.Private.Xml, Version=4.0.2.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
	public static final String assemblyShortName = "System.Private.Xml";
    public static final String className = "System.Xml.XmlReaderSettings";
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

    public XmlReaderSettings(Object instance) throws Throwable {
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

    public static XmlReaderSettings castFrom(IJCOBridgeReflected from) throws Throwable {
        return new XmlReaderSettings(from.getJCOInstance());
    }

    // Constructors section
    
    
    public XmlReaderSettings() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Reset() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.xml.XmlException {
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlReaderSettings Clone() throws Throwable {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new XmlReaderSettings(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAsync() throws Throwable {
        try {
            return (boolean)classInstance.Get("Async");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAsync(boolean Async) throws Throwable {
        try {
            classInstance.Set("Async", Async);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlNameTable getNameTable() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("NameTable");
            return new XmlNameTable(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setNameTable(XmlNameTable NameTable) throws Throwable {
        try {
            classInstance.Set("NameTable", (Object)NameTable.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlResolver(XmlResolver XmlResolver) throws Throwable {
        try {
            classInstance.Set("XmlResolver", (Object)XmlResolver.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLineNumberOffset() throws Throwable {
        try {
            return (int)classInstance.Get("LineNumberOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLineNumberOffset(int LineNumberOffset) throws Throwable {
        try {
            classInstance.Set("LineNumberOffset", LineNumberOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLinePositionOffset() throws Throwable {
        try {
            return (int)classInstance.Get("LinePositionOffset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLinePositionOffset(int LinePositionOffset) throws Throwable {
        try {
            classInstance.Set("LinePositionOffset", LinePositionOffset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConformanceLevel getConformanceLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ConformanceLevel");
            return new ConformanceLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConformanceLevel(ConformanceLevel ConformanceLevel) throws Throwable {
        try {
            classInstance.Set("ConformanceLevel", (Object)ConformanceLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCheckCharacters() throws Throwable {
        try {
            return (boolean)classInstance.Get("CheckCharacters");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCheckCharacters(boolean CheckCharacters) throws Throwable {
        try {
            classInstance.Set("CheckCharacters", CheckCharacters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getMaxCharactersInDocument() throws Throwable {
        try {
            return (long)classInstance.Get("MaxCharactersInDocument");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxCharactersInDocument(long MaxCharactersInDocument) throws Throwable {
        try {
            classInstance.Set("MaxCharactersInDocument", MaxCharactersInDocument);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getMaxCharactersFromEntities() throws Throwable {
        try {
            return (long)classInstance.Get("MaxCharactersFromEntities");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxCharactersFromEntities(long MaxCharactersFromEntities) throws Throwable {
        try {
            classInstance.Set("MaxCharactersFromEntities", MaxCharactersFromEntities);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnoreWhitespace() throws Throwable {
        try {
            return (boolean)classInstance.Get("IgnoreWhitespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreWhitespace(boolean IgnoreWhitespace) throws Throwable {
        try {
            classInstance.Set("IgnoreWhitespace", IgnoreWhitespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnoreProcessingInstructions() throws Throwable {
        try {
            return (boolean)classInstance.Get("IgnoreProcessingInstructions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreProcessingInstructions(boolean IgnoreProcessingInstructions) throws Throwable {
        try {
            classInstance.Set("IgnoreProcessingInstructions", IgnoreProcessingInstructions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnoreComments() throws Throwable {
        try {
            return (boolean)classInstance.Get("IgnoreComments");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreComments(boolean IgnoreComments) throws Throwable {
        try {
            classInstance.Set("IgnoreComments", IgnoreComments);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getProhibitDtd() throws Throwable {
        try {
            return (boolean)classInstance.Get("ProhibitDtd");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setProhibitDtd(boolean ProhibitDtd) throws Throwable {
        try {
            classInstance.Set("ProhibitDtd", ProhibitDtd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DtdProcessing getDtdProcessing() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DtdProcessing");
            return new DtdProcessing(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDtdProcessing(DtdProcessing DtdProcessing) throws Throwable {
        try {
            classInstance.Set("DtdProcessing", (Object)DtdProcessing.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCloseInput() throws Throwable {
        try {
            return (boolean)classInstance.Get("CloseInput");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCloseInput(boolean CloseInput) throws Throwable {
        try {
            classInstance.Set("CloseInput", CloseInput);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ValidationType getValidationType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValidationType");
            return new ValidationType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidationType(ValidationType ValidationType) throws Throwable {
        try {
            classInstance.Set("ValidationType", (Object)ValidationType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaValidationFlags getValidationFlags() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ValidationFlags");
            return new XmlSchemaValidationFlags(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setValidationFlags(XmlSchemaValidationFlags ValidationFlags) throws Throwable {
        try {
            classInstance.Set("ValidationFlags", (Object)ValidationFlags.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XmlSchemaSet getSchemas() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Schemas");
            return new XmlSchemaSet(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSchemas(XmlSchemaSet Schemas) throws Throwable {
        try {
            classInstance.Set("Schemas", (Object)Schemas.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addValidationEventHandler(ValidationEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("ValidationEventHandler", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeValidationEventHandler(ValidationEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("ValidationEventHandler", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}