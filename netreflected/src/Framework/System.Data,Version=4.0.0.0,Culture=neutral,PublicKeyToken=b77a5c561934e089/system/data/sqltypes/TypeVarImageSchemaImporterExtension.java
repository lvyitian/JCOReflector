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

package system.data.sqltypes;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.xml.schema.XmlSchemaObject;
import system.xml.serialization.XmlSchemas;
import system.xml.serialization.XmlSchemaImporter;
import system.codedom.CodeCompileUnit;
import system.codedom.CodeNamespace;
import system.xml.serialization.CodeGenerationOptions;
import system.codedom.compiler.CodeDomProvider;
import system.xml.schema.XmlSchemaType;
import system.xml.schema.XmlSchemaAny;
import system.codedom.CodeExpression;


/**
 * The base .NET class managing System.Data.SqlTypes.TypeVarImageSchemaImporterExtension, System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TypeVarImageSchemaImporterExtension extends NetObject  {
    public static final String assemblyFullName = "System.Data, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Data";
    public static final String className = "System.Data.SqlTypes.TypeVarImageSchemaImporterExtension";
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

    public TypeVarImageSchemaImporterExtension(Object instance) throws Throwable {
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

    public static TypeVarImageSchemaImporterExtension castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TypeVarImageSchemaImporterExtension(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TypeVarImageSchemaImporterExtension() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public java.lang.String ImportSchemaType(java.lang.String name, java.lang.String xmlNamespace, XmlSchemaObject context, XmlSchemas schemas, XmlSchemaImporter importer, CodeCompileUnit compileUnit, CodeNamespace mainNamespace, CodeGenerationOptions options, CodeDomProvider codeProvider) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.InvalidOperationException {
        try {
            return (java.lang.String)classInstance.Invoke("ImportSchemaType", (Object)name, (Object)xmlNamespace, (Object)context.getJCOInstance(), (Object)schemas.getJCOInstance(), (Object)importer.getJCOInstance(), (Object)compileUnit.getJCOInstance(), (Object)mainNamespace.getJCOInstance(), (Object)options.getJCOInstance(), (Object)codeProvider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ImportSchemaType(XmlSchemaType type, XmlSchemaObject context, XmlSchemas schemas, XmlSchemaImporter importer, CodeCompileUnit compileUnit, CodeNamespace mainNamespace, CodeGenerationOptions options, CodeDomProvider codeProvider) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.InvalidOperationException {
        try {
            return (java.lang.String)classInstance.Invoke("ImportSchemaType", (Object)type.getJCOInstance(), (Object)context.getJCOInstance(), (Object)schemas.getJCOInstance(), (Object)importer.getJCOInstance(), (Object)compileUnit.getJCOInstance(), (Object)mainNamespace.getJCOInstance(), (Object)options.getJCOInstance(), (Object)codeProvider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ImportAnyElement(XmlSchemaAny any, boolean mixed, XmlSchemas schemas, XmlSchemaImporter importer, CodeCompileUnit compileUnit, CodeNamespace mainNamespace, CodeGenerationOptions options, CodeDomProvider codeProvider) throws Throwable {
        try {
            return (java.lang.String)classInstance.Invoke("ImportAnyElement", (Object)any.getJCOInstance(), mixed, (Object)schemas.getJCOInstance(), (Object)importer.getJCOInstance(), (Object)compileUnit.getJCOInstance(), (Object)mainNamespace.getJCOInstance(), (Object)options.getJCOInstance(), (Object)codeProvider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CodeExpression ImportDefaultValue(java.lang.String value, java.lang.String type) throws Throwable {
        try {
            JCObject objImportDefaultValue = (JCObject)classInstance.Invoke("ImportDefaultValue", (Object)value, (Object)type);
            return new CodeExpression(objImportDefaultValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    

	// Instance Events section
    
    
}