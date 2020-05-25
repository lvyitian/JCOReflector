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

package system.net;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Net.FtpStatusCode, System.Net.Requests, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class FtpStatusCode extends NetObject  {
    public static final String assemblyFullName = "System.Net.Requests, Version=4.1.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Net.Requests";
    public static final String className = "System.Net.FtpStatusCode";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
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

    public FtpStatusCode(Object instance) {
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public FtpStatusCode() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
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

    final static FtpStatusCode getFrom(JCEnum object, String value) {
        try {
            return new FtpStatusCode(object.fromValue(value));
        } catch (JCException e) {
            return new FtpStatusCode(object);
        }
    }

    // Enum fields section
    
    public static FtpStatusCode Undefined = getFrom(enumReflected, "Undefined");
    public static FtpStatusCode RestartMarker = getFrom(enumReflected, "RestartMarker");
    public static FtpStatusCode ServiceTemporarilyNotAvailable = getFrom(enumReflected, "ServiceTemporarilyNotAvailable");
    public static FtpStatusCode DataAlreadyOpen = getFrom(enumReflected, "DataAlreadyOpen");
    public static FtpStatusCode OpeningData = getFrom(enumReflected, "OpeningData");
    public static FtpStatusCode CommandOK = getFrom(enumReflected, "CommandOK");
    public static FtpStatusCode CommandExtraneous = getFrom(enumReflected, "CommandExtraneous");
    public static FtpStatusCode DirectoryStatus = getFrom(enumReflected, "DirectoryStatus");
    public static FtpStatusCode FileStatus = getFrom(enumReflected, "FileStatus");
    public static FtpStatusCode SystemType = getFrom(enumReflected, "SystemType");
    public static FtpStatusCode SendUserCommand = getFrom(enumReflected, "SendUserCommand");
    public static FtpStatusCode ClosingControl = getFrom(enumReflected, "ClosingControl");
    public static FtpStatusCode ClosingData = getFrom(enumReflected, "ClosingData");
    public static FtpStatusCode EnteringPassive = getFrom(enumReflected, "EnteringPassive");
    public static FtpStatusCode LoggedInProceed = getFrom(enumReflected, "LoggedInProceed");
    public static FtpStatusCode ServerWantsSecureSession = getFrom(enumReflected, "ServerWantsSecureSession");
    public static FtpStatusCode FileActionOK = getFrom(enumReflected, "FileActionOK");
    public static FtpStatusCode PathnameCreated = getFrom(enumReflected, "PathnameCreated");
    public static FtpStatusCode SendPasswordCommand = getFrom(enumReflected, "SendPasswordCommand");
    public static FtpStatusCode NeedLoginAccount = getFrom(enumReflected, "NeedLoginAccount");
    public static FtpStatusCode FileCommandPending = getFrom(enumReflected, "FileCommandPending");
    public static FtpStatusCode ServiceNotAvailable = getFrom(enumReflected, "ServiceNotAvailable");
    public static FtpStatusCode CantOpenData = getFrom(enumReflected, "CantOpenData");
    public static FtpStatusCode ConnectionClosed = getFrom(enumReflected, "ConnectionClosed");
    public static FtpStatusCode ActionNotTakenFileUnavailableOrBusy = getFrom(enumReflected, "ActionNotTakenFileUnavailableOrBusy");
    public static FtpStatusCode ActionAbortedLocalProcessingError = getFrom(enumReflected, "ActionAbortedLocalProcessingError");
    public static FtpStatusCode ActionNotTakenInsufficientSpace = getFrom(enumReflected, "ActionNotTakenInsufficientSpace");
    public static FtpStatusCode CommandSyntaxError = getFrom(enumReflected, "CommandSyntaxError");
    public static FtpStatusCode ArgumentSyntaxError = getFrom(enumReflected, "ArgumentSyntaxError");
    public static FtpStatusCode CommandNotImplemented = getFrom(enumReflected, "CommandNotImplemented");
    public static FtpStatusCode BadCommandSequence = getFrom(enumReflected, "BadCommandSequence");
    public static FtpStatusCode NotLoggedIn = getFrom(enumReflected, "NotLoggedIn");
    public static FtpStatusCode AccountNeeded = getFrom(enumReflected, "AccountNeeded");
    public static FtpStatusCode ActionNotTakenFileUnavailable = getFrom(enumReflected, "ActionNotTakenFileUnavailable");
    public static FtpStatusCode ActionAbortedUnknownPageType = getFrom(enumReflected, "ActionAbortedUnknownPageType");
    public static FtpStatusCode FileActionAborted = getFrom(enumReflected, "FileActionAborted");
    public static FtpStatusCode ActionNotTakenFilenameNotAllowed = getFrom(enumReflected, "ActionNotTakenFilenameNotAllowed");


    // Flags management section


}