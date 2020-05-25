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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Windows.Forms.Keys, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class Keys extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.Keys";
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

    public Keys(Object instance) {
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

    public Keys() {
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

    final static Keys getFrom(JCEnum object, String value) {
        try {
            return new Keys(object.fromValue(value));
        } catch (JCException e) {
            return new Keys(object);
        }
    }

    // Enum fields section
    
    public static Keys None = getFrom(enumReflected, "None");
    public static Keys LButton = getFrom(enumReflected, "LButton");
    public static Keys RButton = getFrom(enumReflected, "RButton");
    public static Keys Cancel = getFrom(enumReflected, "Cancel");
    public static Keys MButton = getFrom(enumReflected, "MButton");
    public static Keys XButton1 = getFrom(enumReflected, "XButton1");
    public static Keys XButton2 = getFrom(enumReflected, "XButton2");
    public static Keys Back = getFrom(enumReflected, "Back");
    public static Keys Tab = getFrom(enumReflected, "Tab");
    public static Keys LineFeed = getFrom(enumReflected, "LineFeed");
    public static Keys Clear = getFrom(enumReflected, "Clear");
    public static Keys Enter = getFrom(enumReflected, "Enter");
    public static Keys Return = getFrom(enumReflected, "Return");
    public static Keys ShiftKey = getFrom(enumReflected, "ShiftKey");
    public static Keys ControlKey = getFrom(enumReflected, "ControlKey");
    public static Keys Menu = getFrom(enumReflected, "Menu");
    public static Keys Pause = getFrom(enumReflected, "Pause");
    public static Keys CapsLock = getFrom(enumReflected, "CapsLock");
    public static Keys Capital = getFrom(enumReflected, "Capital");
    public static Keys HangulMode = getFrom(enumReflected, "HangulMode");
    public static Keys HanguelMode = getFrom(enumReflected, "HanguelMode");
    public static Keys KanaMode = getFrom(enumReflected, "KanaMode");
    public static Keys JunjaMode = getFrom(enumReflected, "JunjaMode");
    public static Keys FinalMode = getFrom(enumReflected, "FinalMode");
    public static Keys KanjiMode = getFrom(enumReflected, "KanjiMode");
    public static Keys HanjaMode = getFrom(enumReflected, "HanjaMode");
    public static Keys Escape = getFrom(enumReflected, "Escape");
    public static Keys IMEConvert = getFrom(enumReflected, "IMEConvert");
    public static Keys IMENonconvert = getFrom(enumReflected, "IMENonconvert");
    public static Keys IMEAccept = getFrom(enumReflected, "IMEAccept");
    public static Keys IMEAceept = getFrom(enumReflected, "IMEAceept");
    public static Keys IMEModeChange = getFrom(enumReflected, "IMEModeChange");
    public static Keys Space = getFrom(enumReflected, "Space");
    public static Keys Prior = getFrom(enumReflected, "Prior");
    public static Keys PageUp = getFrom(enumReflected, "PageUp");
    public static Keys PageDown = getFrom(enumReflected, "PageDown");
    public static Keys Next = getFrom(enumReflected, "Next");
    public static Keys End = getFrom(enumReflected, "End");
    public static Keys Home = getFrom(enumReflected, "Home");
    public static Keys Left = getFrom(enumReflected, "Left");
    public static Keys Up = getFrom(enumReflected, "Up");
    public static Keys Right = getFrom(enumReflected, "Right");
    public static Keys Down = getFrom(enumReflected, "Down");
    public static Keys Select = getFrom(enumReflected, "Select");
    public static Keys Print = getFrom(enumReflected, "Print");
    public static Keys Execute = getFrom(enumReflected, "Execute");
    public static Keys Snapshot = getFrom(enumReflected, "Snapshot");
    public static Keys PrintScreen = getFrom(enumReflected, "PrintScreen");
    public static Keys Insert = getFrom(enumReflected, "Insert");
    public static Keys Delete = getFrom(enumReflected, "Delete");
    public static Keys Help = getFrom(enumReflected, "Help");
    public static Keys D0 = getFrom(enumReflected, "D0");
    public static Keys D1 = getFrom(enumReflected, "D1");
    public static Keys D2 = getFrom(enumReflected, "D2");
    public static Keys D3 = getFrom(enumReflected, "D3");
    public static Keys D4 = getFrom(enumReflected, "D4");
    public static Keys D5 = getFrom(enumReflected, "D5");
    public static Keys D6 = getFrom(enumReflected, "D6");
    public static Keys D7 = getFrom(enumReflected, "D7");
    public static Keys D8 = getFrom(enumReflected, "D8");
    public static Keys D9 = getFrom(enumReflected, "D9");
    public static Keys A = getFrom(enumReflected, "A");
    public static Keys B = getFrom(enumReflected, "B");
    public static Keys C = getFrom(enumReflected, "C");
    public static Keys D = getFrom(enumReflected, "D");
    public static Keys E = getFrom(enumReflected, "E");
    public static Keys F = getFrom(enumReflected, "F");
    public static Keys G = getFrom(enumReflected, "G");
    public static Keys H = getFrom(enumReflected, "H");
    public static Keys I = getFrom(enumReflected, "I");
    public static Keys J = getFrom(enumReflected, "J");
    public static Keys K = getFrom(enumReflected, "K");
    public static Keys L = getFrom(enumReflected, "L");
    public static Keys M = getFrom(enumReflected, "M");
    public static Keys N = getFrom(enumReflected, "N");
    public static Keys O = getFrom(enumReflected, "O");
    public static Keys P = getFrom(enumReflected, "P");
    public static Keys Q = getFrom(enumReflected, "Q");
    public static Keys R = getFrom(enumReflected, "R");
    public static Keys S = getFrom(enumReflected, "S");
    public static Keys T = getFrom(enumReflected, "T");
    public static Keys U = getFrom(enumReflected, "U");
    public static Keys V = getFrom(enumReflected, "V");
    public static Keys W = getFrom(enumReflected, "W");
    public static Keys X = getFrom(enumReflected, "X");
    public static Keys Y = getFrom(enumReflected, "Y");
    public static Keys Z = getFrom(enumReflected, "Z");
    public static Keys LWin = getFrom(enumReflected, "LWin");
    public static Keys RWin = getFrom(enumReflected, "RWin");
    public static Keys Apps = getFrom(enumReflected, "Apps");
    public static Keys Sleep = getFrom(enumReflected, "Sleep");
    public static Keys NumPad0 = getFrom(enumReflected, "NumPad0");
    public static Keys NumPad1 = getFrom(enumReflected, "NumPad1");
    public static Keys NumPad2 = getFrom(enumReflected, "NumPad2");
    public static Keys NumPad3 = getFrom(enumReflected, "NumPad3");
    public static Keys NumPad4 = getFrom(enumReflected, "NumPad4");
    public static Keys NumPad5 = getFrom(enumReflected, "NumPad5");
    public static Keys NumPad6 = getFrom(enumReflected, "NumPad6");
    public static Keys NumPad7 = getFrom(enumReflected, "NumPad7");
    public static Keys NumPad8 = getFrom(enumReflected, "NumPad8");
    public static Keys NumPad9 = getFrom(enumReflected, "NumPad9");
    public static Keys Multiply = getFrom(enumReflected, "Multiply");
    public static Keys Add = getFrom(enumReflected, "Add");
    public static Keys Separator = getFrom(enumReflected, "Separator");
    public static Keys Subtract = getFrom(enumReflected, "Subtract");
    public static Keys Decimal = getFrom(enumReflected, "Decimal");
    public static Keys Divide = getFrom(enumReflected, "Divide");
    public static Keys F1 = getFrom(enumReflected, "F1");
    public static Keys F2 = getFrom(enumReflected, "F2");
    public static Keys F3 = getFrom(enumReflected, "F3");
    public static Keys F4 = getFrom(enumReflected, "F4");
    public static Keys F5 = getFrom(enumReflected, "F5");
    public static Keys F6 = getFrom(enumReflected, "F6");
    public static Keys F7 = getFrom(enumReflected, "F7");
    public static Keys F8 = getFrom(enumReflected, "F8");
    public static Keys F9 = getFrom(enumReflected, "F9");
    public static Keys F10 = getFrom(enumReflected, "F10");
    public static Keys F11 = getFrom(enumReflected, "F11");
    public static Keys F12 = getFrom(enumReflected, "F12");
    public static Keys F13 = getFrom(enumReflected, "F13");
    public static Keys F14 = getFrom(enumReflected, "F14");
    public static Keys F15 = getFrom(enumReflected, "F15");
    public static Keys F16 = getFrom(enumReflected, "F16");
    public static Keys F17 = getFrom(enumReflected, "F17");
    public static Keys F18 = getFrom(enumReflected, "F18");
    public static Keys F19 = getFrom(enumReflected, "F19");
    public static Keys F20 = getFrom(enumReflected, "F20");
    public static Keys F21 = getFrom(enumReflected, "F21");
    public static Keys F22 = getFrom(enumReflected, "F22");
    public static Keys F23 = getFrom(enumReflected, "F23");
    public static Keys F24 = getFrom(enumReflected, "F24");
    public static Keys NumLock = getFrom(enumReflected, "NumLock");
    public static Keys Scroll = getFrom(enumReflected, "Scroll");
    public static Keys LShiftKey = getFrom(enumReflected, "LShiftKey");
    public static Keys RShiftKey = getFrom(enumReflected, "RShiftKey");
    public static Keys LControlKey = getFrom(enumReflected, "LControlKey");
    public static Keys RControlKey = getFrom(enumReflected, "RControlKey");
    public static Keys LMenu = getFrom(enumReflected, "LMenu");
    public static Keys RMenu = getFrom(enumReflected, "RMenu");
    public static Keys BrowserBack = getFrom(enumReflected, "BrowserBack");
    public static Keys BrowserForward = getFrom(enumReflected, "BrowserForward");
    public static Keys BrowserRefresh = getFrom(enumReflected, "BrowserRefresh");
    public static Keys BrowserStop = getFrom(enumReflected, "BrowserStop");
    public static Keys BrowserSearch = getFrom(enumReflected, "BrowserSearch");
    public static Keys BrowserFavorites = getFrom(enumReflected, "BrowserFavorites");
    public static Keys BrowserHome = getFrom(enumReflected, "BrowserHome");
    public static Keys VolumeMute = getFrom(enumReflected, "VolumeMute");
    public static Keys VolumeDown = getFrom(enumReflected, "VolumeDown");
    public static Keys VolumeUp = getFrom(enumReflected, "VolumeUp");
    public static Keys MediaNextTrack = getFrom(enumReflected, "MediaNextTrack");
    public static Keys MediaPreviousTrack = getFrom(enumReflected, "MediaPreviousTrack");
    public static Keys MediaStop = getFrom(enumReflected, "MediaStop");
    public static Keys MediaPlayPause = getFrom(enumReflected, "MediaPlayPause");
    public static Keys LaunchMail = getFrom(enumReflected, "LaunchMail");
    public static Keys SelectMedia = getFrom(enumReflected, "SelectMedia");
    public static Keys LaunchApplication1 = getFrom(enumReflected, "LaunchApplication1");
    public static Keys LaunchApplication2 = getFrom(enumReflected, "LaunchApplication2");
    public static Keys OemSemicolon = getFrom(enumReflected, "OemSemicolon");
    public static Keys Oem1 = getFrom(enumReflected, "Oem1");
    public static Keys Oemplus = getFrom(enumReflected, "Oemplus");
    public static Keys Oemcomma = getFrom(enumReflected, "Oemcomma");
    public static Keys OemMinus = getFrom(enumReflected, "OemMinus");
    public static Keys OemPeriod = getFrom(enumReflected, "OemPeriod");
    public static Keys Oem2 = getFrom(enumReflected, "Oem2");
    public static Keys OemQuestion = getFrom(enumReflected, "OemQuestion");
    public static Keys Oem3 = getFrom(enumReflected, "Oem3");
    public static Keys Oemtilde = getFrom(enumReflected, "Oemtilde");
    public static Keys Oem4 = getFrom(enumReflected, "Oem4");
    public static Keys OemOpenBrackets = getFrom(enumReflected, "OemOpenBrackets");
    public static Keys OemPipe = getFrom(enumReflected, "OemPipe");
    public static Keys Oem5 = getFrom(enumReflected, "Oem5");
    public static Keys OemCloseBrackets = getFrom(enumReflected, "OemCloseBrackets");
    public static Keys Oem6 = getFrom(enumReflected, "Oem6");
    public static Keys OemQuotes = getFrom(enumReflected, "OemQuotes");
    public static Keys Oem7 = getFrom(enumReflected, "Oem7");
    public static Keys Oem8 = getFrom(enumReflected, "Oem8");
    public static Keys Oem102 = getFrom(enumReflected, "Oem102");
    public static Keys OemBackslash = getFrom(enumReflected, "OemBackslash");
    public static Keys ProcessKey = getFrom(enumReflected, "ProcessKey");
    public static Keys Packet = getFrom(enumReflected, "Packet");
    public static Keys Attn = getFrom(enumReflected, "Attn");
    public static Keys Crsel = getFrom(enumReflected, "Crsel");
    public static Keys Exsel = getFrom(enumReflected, "Exsel");
    public static Keys EraseEof = getFrom(enumReflected, "EraseEof");
    public static Keys Play = getFrom(enumReflected, "Play");
    public static Keys Zoom = getFrom(enumReflected, "Zoom");
    public static Keys NoName = getFrom(enumReflected, "NoName");
    public static Keys Pa1 = getFrom(enumReflected, "Pa1");
    public static Keys OemClear = getFrom(enumReflected, "OemClear");
    public static Keys KeyCode = getFrom(enumReflected, "KeyCode");
    public static Keys Shift = getFrom(enumReflected, "Shift");
    public static Keys Control = getFrom(enumReflected, "Control");
    public static Keys Alt = getFrom(enumReflected, "Alt");
    public static Keys Modifiers = getFrom(enumReflected, "Modifiers");


    // Flags management section

    public Keys add(Keys val) throws Throwable {
        return new Keys(NetEnum.add(classInstance, val.classInstance));
    }

    public Keys remove(Keys val) throws Throwable {
        return new Keys(NetEnum.remove(classInstance, val.classInstance));
    }

    public boolean is(Keys val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public boolean has(Keys val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}