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

package system.diagnostics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.collections.specialized.StringDictionary;
import system.text.Encoding;
import system.security.SecureString;
import system.diagnostics.ProcessWindowStyle;


/**
 * The base .NET class managing System.Diagnostics.ProcessStartInfo, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ProcessStartInfo extends NetObject  {
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System";
    public static final String className = "System.Diagnostics.ProcessStartInfo";
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

    public ProcessStartInfo(Object instance) throws Throwable {
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

    public static ProcessStartInfo castFrom(IJCOBridgeReflected from) throws Throwable {
        return new ProcessStartInfo(from.getJCOInstance());
    }

    // Constructors section
    
    
    public ProcessStartInfo() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProcessStartInfo(java.lang.String fileName) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProcessStartInfo(java.lang.String fileName, java.lang.String arguments) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)fileName, (Object)arguments);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public java.lang.String getVerb() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Verb");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVerb(java.lang.String Verb) throws Throwable {
        try {
            classInstance.Set("Verb", (Object)Verb);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getArguments() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Arguments");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setArguments(java.lang.String Arguments) throws Throwable {
        try {
            classInstance.Set("Arguments", (Object)Arguments);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCreateNoWindow() throws Throwable {
        try {
            return (boolean)classInstance.Get("CreateNoWindow");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCreateNoWindow(boolean CreateNoWindow) throws Throwable {
        try {
            classInstance.Set("CreateNoWindow", CreateNoWindow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringDictionary getEnvironmentVariables() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EnvironmentVariables");
            return new StringDictionary(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRedirectStandardInput() throws Throwable {
        try {
            return (boolean)classInstance.Get("RedirectStandardInput");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRedirectStandardInput(boolean RedirectStandardInput) throws Throwable {
        try {
            classInstance.Set("RedirectStandardInput", RedirectStandardInput);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRedirectStandardOutput() throws Throwable {
        try {
            return (boolean)classInstance.Get("RedirectStandardOutput");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRedirectStandardOutput(boolean RedirectStandardOutput) throws Throwable {
        try {
            classInstance.Set("RedirectStandardOutput", RedirectStandardOutput);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRedirectStandardError() throws Throwable {
        try {
            return (boolean)classInstance.Get("RedirectStandardError");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRedirectStandardError(boolean RedirectStandardError) throws Throwable {
        try {
            classInstance.Set("RedirectStandardError", RedirectStandardError);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoding getStandardErrorEncoding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StandardErrorEncoding");
            return new Encoding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStandardErrorEncoding(Encoding StandardErrorEncoding) throws Throwable {
        try {
            classInstance.Set("StandardErrorEncoding", (Object)StandardErrorEncoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Encoding getStandardOutputEncoding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("StandardOutputEncoding");
            return new Encoding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setStandardOutputEncoding(Encoding StandardOutputEncoding) throws Throwable {
        try {
            classInstance.Set("StandardOutputEncoding", (Object)StandardOutputEncoding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseShellExecute() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseShellExecute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseShellExecute(boolean UseShellExecute) throws Throwable {
        try {
            classInstance.Set("UseShellExecute", UseShellExecute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String[] getVerbs() throws Throwable {
        try {
            ArrayList<Object> resultingArrayList = new ArrayList<Object>();
            JCObject resultingObjects = (JCObject)classInstance.Get("Verbs");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
			for(int indexVerbs = 0; indexVerbs < resultingArrayList.size(); indexVerbs++ ) {
				resultingArray[indexVerbs] = (java.lang.String)resultingArrayList.get(indexVerbs);
			}
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getUserName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("UserName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUserName(java.lang.String UserName) throws Throwable {
        try {
            classInstance.Set("UserName", (Object)UserName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecureString getPassword() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Password");
            return new SecureString(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPassword(SecureString Password) throws Throwable {
        try {
            classInstance.Set("Password", (Object)Password.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPasswordInClearText() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PasswordInClearText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPasswordInClearText(java.lang.String PasswordInClearText) throws Throwable {
        try {
            classInstance.Set("PasswordInClearText", (Object)PasswordInClearText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDomain() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Domain");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDomain(java.lang.String Domain) throws Throwable {
        try {
            classInstance.Set("Domain", (Object)Domain);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLoadUserProfile() throws Throwable {
        try {
            return (boolean)classInstance.Get("LoadUserProfile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLoadUserProfile(boolean LoadUserProfile) throws Throwable {
        try {
            classInstance.Set("LoadUserProfile", LoadUserProfile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFileName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("FileName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFileName(java.lang.String FileName) throws Throwable {
        try {
            classInstance.Set("FileName", (Object)FileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getWorkingDirectory() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("WorkingDirectory");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWorkingDirectory(java.lang.String WorkingDirectory) throws Throwable {
        try {
            classInstance.Set("WorkingDirectory", (Object)WorkingDirectory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getErrorDialog() throws Throwable {
        try {
            return (boolean)classInstance.Get("ErrorDialog");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorDialog(boolean ErrorDialog) throws Throwable {
        try {
            classInstance.Set("ErrorDialog", ErrorDialog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProcessWindowStyle getWindowStyle() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WindowStyle");
            return new ProcessWindowStyle(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWindowStyle(ProcessWindowStyle WindowStyle) throws Throwable {
        try {
            classInstance.Set("WindowStyle", (Object)WindowStyle.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}