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

package microsoft.visualbasic.fileio;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.text.Encoding;
import system.io.Stream;
import system.io.TextReader;
import microsoft.visualbasic.fileio.FieldType;


/**
 * The base .NET class managing Microsoft.VisualBasic.FileIO.TextFieldParser, Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class TextFieldParser extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic.Core";
    public static final String className = "Microsoft.VisualBasic.FileIO.TextFieldParser";
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

    public TextFieldParser(Object instance) throws Throwable {
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

    public static TextFieldParser castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TextFieldParser(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TextFieldParser(java.lang.String path) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.FormatException, system.NotImplementedException, system.io.FileNotFoundException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextFieldParser(java.lang.String path, Encoding defaultEncoding) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.FormatException, system.NotImplementedException, system.io.FileNotFoundException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)path, (Object)defaultEncoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextFieldParser(java.lang.String path, Encoding defaultEncoding, boolean detectEncoding) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.FormatException, system.NotImplementedException, system.io.FileNotFoundException, system.runtime.serialization.SerializationException, system.ObjectDisposedException, system.io.IOException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)path, (Object)defaultEncoding.getJCOInstance(), detectEncoding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextFieldParser(Stream stream) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.FormatException, system.NotImplementedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextFieldParser(Stream stream, Encoding defaultEncoding) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.FormatException, system.NotImplementedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)stream.getJCOInstance(), (Object)defaultEncoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextFieldParser(Stream stream, Encoding defaultEncoding, boolean detectEncoding) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.FormatException, system.NotImplementedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)stream.getJCOInstance(), (Object)defaultEncoding.getJCOInstance(), detectEncoding);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextFieldParser(Stream stream, Encoding defaultEncoding, boolean detectEncoding, boolean leaveOpen) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.FormatException, system.NotImplementedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)stream.getJCOInstance(), (Object)defaultEncoding.getJCOInstance(), detectEncoding, leaveOpen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextFieldParser(TextReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.collections.generic.KeyNotFoundException, system.ArrayTypeMismatchException, system.FormatException, system.NotImplementedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)reader.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void SetDelimiters(java.lang.String... delimiters) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetDelimiters", (Object)delimiters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetFieldWidths(int... fieldWidths) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException {
        try {
            classInstance.Invoke("SetFieldWidths", fieldWidths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadLine() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("ReadLine");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] ReadFields() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.OverflowException, system.NotSupportedException, system.OutOfMemoryException, microsoft.visualbasic.fileio.MalformedLineException, system.text.regularexpressions.RegexMatchTimeoutException {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("ReadFields");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexReadFields = 0; indexReadFields < resultingArrayList.size(); indexReadFields++ ) {
				resultingArray[indexReadFields] = (java.lang.String)resultingArrayList.get(indexReadFields);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String PeekChars(int numberOfChars) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        try {
            return (java.lang.String)classInstance.Invoke("PeekChars", numberOfChars);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ReadToEnd() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.OutOfMemoryException {
        try {
            return (java.lang.String)classInstance.Invoke("ReadToEnd");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Close() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException {
        try {
            classInstance.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable, system.ArgumentNullException {
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public java.lang.String[] getCommentTokens() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("CommentTokens");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexCommentTokens = 0; indexCommentTokens < resultingArrayList.size(); indexCommentTokens++ ) {
				resultingArray[indexCommentTokens] = (java.lang.String)resultingArrayList.get(indexCommentTokens);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCommentTokens(java.lang.String[] CommentTokens) throws Throwable {
        try {
            classInstance.Set("CommentTokens", (Object)CommentTokens);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEndOfData() throws Throwable {
        try {
            return (boolean)classInstance.Get("EndOfData");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getLineNumber() throws Throwable {
        try {
            return (long)classInstance.Get("LineNumber");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorLine() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ErrorLine");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public long getErrorLineNumber() throws Throwable {
        try {
            return (long)classInstance.Get("ErrorLineNumber");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FieldType getTextFieldType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TextFieldType");
            return new FieldType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTextFieldType(FieldType TextFieldType) throws Throwable {
        try {
            classInstance.Set("TextFieldType", (Object)TextFieldType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int[] getFieldWidths() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("FieldWidths");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            int[] resultingArray = new int[resultingArrayList.size()];
			for(int indexFieldWidths = 0; indexFieldWidths < resultingArrayList.size(); indexFieldWidths++ ) {
				resultingArray[indexFieldWidths] = (int)resultingArrayList.get(indexFieldWidths);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFieldWidths(int[] FieldWidths) throws Throwable {
        try {
            classInstance.Set("FieldWidths", FieldWidths);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getDelimiters() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Delimiters");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexDelimiters = 0; indexDelimiters < resultingArrayList.size(); indexDelimiters++ ) {
				resultingArray[indexDelimiters] = (java.lang.String)resultingArrayList.get(indexDelimiters);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDelimiters(java.lang.String[] Delimiters) throws Throwable {
        try {
            classInstance.Set("Delimiters", (Object)Delimiters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTrimWhiteSpace() throws Throwable {
        try {
            return (boolean)classInstance.Get("TrimWhiteSpace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrimWhiteSpace(boolean TrimWhiteSpace) throws Throwable {
        try {
            classInstance.Set("TrimWhiteSpace", TrimWhiteSpace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasFieldsEnclosedInQuotes() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasFieldsEnclosedInQuotes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHasFieldsEnclosedInQuotes(boolean HasFieldsEnclosedInQuotes) throws Throwable {
        try {
            classInstance.Set("HasFieldsEnclosedInQuotes", HasFieldsEnclosedInQuotes);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}