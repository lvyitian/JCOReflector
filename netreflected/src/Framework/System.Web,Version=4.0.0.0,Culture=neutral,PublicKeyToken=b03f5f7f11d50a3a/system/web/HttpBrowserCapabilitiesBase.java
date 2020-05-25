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

package system.web;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.HtmlTextWriter;
import system.io.TextWriter;
import system.Version;


/**
 * The base .NET class managing System.Web.HttpBrowserCapabilitiesBase, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class HttpBrowserCapabilitiesBase extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.HttpBrowserCapabilitiesBase";
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

    public HttpBrowserCapabilitiesBase(Object instance) throws Throwable {
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

    public static HttpBrowserCapabilitiesBase castFrom(IJCOBridgeReflected from) throws Throwable {
        return new HttpBrowserCapabilitiesBase(from.getJCOInstance());
    }

    // Constructors section
    
    
    
    // Methods section
    
    
    public void AddBrowser(java.lang.String browserName) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("AddBrowser", (Object)browserName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HtmlTextWriter CreateHtmlTextWriter(TextWriter w) throws Throwable, system.NotImplementedException {
        try {
            JCObject objCreateHtmlTextWriter = (JCObject)classInstance.Invoke("CreateHtmlTextWriter", (Object)w.getJCOInstance());
            return new HtmlTextWriter(objCreateHtmlTextWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DisableOptimizedCacheKey() throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("DisableOptimizedCacheKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version[] GetClrVersions() throws Throwable, system.NotImplementedException {
        try {
            ArrayList<Version> resultingArrayList = new ArrayList<Version>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetClrVersions");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new Version(resultingObject));
            }
            Version[] resultingArray = new Version[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsBrowser(java.lang.String browserName) throws Throwable, system.NotImplementedException {
        try {
            return (boolean)classInstance.Invoke("IsBrowser", (Object)browserName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int CompareFilters(java.lang.String filter1, java.lang.String filter2) throws Throwable, system.NotImplementedException {
        try {
            return (int)classInstance.Invoke("CompareFilters", (Object)filter1, (Object)filter2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean EvaluateFilter(java.lang.String filterName) throws Throwable, system.NotImplementedException {
        try {
            return (boolean)classInstance.Invoke("EvaluateFilter", (Object)filterName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getActiveXControls() throws Throwable {
        try {
            return (boolean)classInstance.Get("ActiveXControls");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAOL() throws Throwable {
        try {
            return (boolean)classInstance.Get("AOL");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getBackgroundSounds() throws Throwable {
        try {
            return (boolean)classInstance.Get("BackgroundSounds");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getBeta() throws Throwable {
        try {
            return (boolean)classInstance.Get("Beta");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getBrowser() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Browser");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetArrayList getBrowsers() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Browsers");
            return new NetArrayList(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanCombineFormsInDeck() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanCombineFormsInDeck");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanInitiateVoiceCall() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanInitiateVoiceCall");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRenderAfterInputOrSelectElement() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRenderAfterInputOrSelectElement");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRenderEmptySelects() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRenderEmptySelects");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRenderInputAndSelectElementsTogether() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRenderInputAndSelectElementsTogether");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRenderMixedSelects() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRenderMixedSelects");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRenderOneventAndPrevElementsTogether() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRenderOneventAndPrevElementsTogether");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRenderPostBackCards() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRenderPostBackCards");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanRenderSetvarZeroWithMultiSelectionList() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanRenderSetvarZeroWithMultiSelectionList");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanSendMail() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanSendMail");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCDF() throws Throwable {
        try {
            return (boolean)classInstance.Get("CDF");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version getClrVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClrVersion");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCookies() throws Throwable {
        try {
            return (boolean)classInstance.Get("Cookies");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCrawler() throws Throwable {
        try {
            return (boolean)classInstance.Get("Crawler");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDefaultSubmitButtonLimit() throws Throwable {
        try {
            return (int)classInstance.Get("DefaultSubmitButtonLimit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version getEcmaScriptVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EcmaScriptVersion");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFrames() throws Throwable {
        try {
            return (boolean)classInstance.Get("Frames");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getGatewayMajorVersion() throws Throwable {
        try {
            return (int)classInstance.Get("GatewayMajorVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getGatewayMinorVersion() throws Throwable {
        try {
            return (double)classInstance.Get("GatewayMinorVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getGatewayVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("GatewayVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasBackButton() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasBackButton");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHidesRightAlignedMultiselectScrollbars() throws Throwable {
        try {
            return (boolean)classInstance.Get("HidesRightAlignedMultiselectScrollbars");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHtmlTextWriter() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("HtmlTextWriter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHtmlTextWriter(java.lang.String HtmlTextWriter) throws Throwable {
        try {
            classInstance.Set("HtmlTextWriter", (Object)HtmlTextWriter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getId() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getInputType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("InputType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsColor() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsColor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsMobileDevice() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsMobileDevice");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getJavaApplets() throws Throwable {
        try {
            return (boolean)classInstance.Get("JavaApplets");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version getJScriptVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("JScriptVersion");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMajorVersion() throws Throwable {
        try {
            return (int)classInstance.Get("MajorVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaximumHrefLength() throws Throwable {
        try {
            return (int)classInstance.Get("MaximumHrefLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaximumRenderedPageSize() throws Throwable {
        try {
            return (int)classInstance.Get("MaximumRenderedPageSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaximumSoftkeyLabelLength() throws Throwable {
        try {
            return (int)classInstance.Get("MaximumSoftkeyLabelLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getMinorVersion() throws Throwable {
        try {
            return (double)classInstance.Get("MinorVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMinorVersionString() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MinorVersionString");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMobileDeviceManufacturer() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MobileDeviceManufacturer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMobileDeviceModel() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("MobileDeviceModel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version getMSDomVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MSDomVersion");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNumberOfSoftkeys() throws Throwable {
        try {
            return (int)classInstance.Get("NumberOfSoftkeys");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPlatform() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Platform");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPreferredImageMime() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PreferredImageMime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPreferredRenderingMime() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PreferredRenderingMime");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPreferredRenderingType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PreferredRenderingType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPreferredRequestEncoding() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PreferredRequestEncoding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPreferredResponseEncoding() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("PreferredResponseEncoding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRendersBreakBeforeWmlSelectAndInput() throws Throwable {
        try {
            return (boolean)classInstance.Get("RendersBreakBeforeWmlSelectAndInput");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRendersBreaksAfterHtmlLists() throws Throwable {
        try {
            return (boolean)classInstance.Get("RendersBreaksAfterHtmlLists");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRendersBreaksAfterWmlAnchor() throws Throwable {
        try {
            return (boolean)classInstance.Get("RendersBreaksAfterWmlAnchor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRendersBreaksAfterWmlInput() throws Throwable {
        try {
            return (boolean)classInstance.Get("RendersBreaksAfterWmlInput");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRendersWmlDoAcceptsInline() throws Throwable {
        try {
            return (boolean)classInstance.Get("RendersWmlDoAcceptsInline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRendersWmlSelectsAsMenuCards() throws Throwable {
        try {
            return (boolean)classInstance.Get("RendersWmlSelectsAsMenuCards");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRequiredMetaTagNameValue() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RequiredMetaTagNameValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresAttributeColonSubstitution() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresAttributeColonSubstitution");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresContentTypeMetaTag() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresContentTypeMetaTag");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresControlStateInSession() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresControlStateInSession");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresDBCSCharacter() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresDBCSCharacter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresHtmlAdaptiveErrorReporting() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresHtmlAdaptiveErrorReporting");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresLeadingPageBreak() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresLeadingPageBreak");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresNoBreakInFormatting() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresNoBreakInFormatting");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresOutputOptimization() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresOutputOptimization");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresPhoneNumbersAsPlainText() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresPhoneNumbersAsPlainText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresSpecialViewStateEncoding() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresSpecialViewStateEncoding");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresUniqueFilePathSuffix() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresUniqueFilePathSuffix");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresUniqueHtmlCheckboxNames() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresUniqueHtmlCheckboxNames");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresUniqueHtmlInputNames() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresUniqueHtmlInputNames");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequiresUrlEncodedPostfieldValues() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequiresUrlEncodedPostfieldValues");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getScreenBitDepth() throws Throwable {
        try {
            return (int)classInstance.Get("ScreenBitDepth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getScreenCharactersHeight() throws Throwable {
        try {
            return (int)classInstance.Get("ScreenCharactersHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getScreenCharactersWidth() throws Throwable {
        try {
            return (int)classInstance.Get("ScreenCharactersWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getScreenPixelsHeight() throws Throwable {
        try {
            return (int)classInstance.Get("ScreenPixelsHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getScreenPixelsWidth() throws Throwable {
        try {
            return (int)classInstance.Get("ScreenPixelsWidth");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsAccesskeyAttribute() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsAccesskeyAttribute");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsBodyColor() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsBodyColor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsBold() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsBold");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsCacheControlMetaTag() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsCacheControlMetaTag");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsCallback() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsCallback");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsCss() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsCss");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsDivAlign() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsDivAlign");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsDivNoWrap() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsDivNoWrap");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsEmptyStringInCookieValue() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsEmptyStringInCookieValue");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsFontColor() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsFontColor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsFontName() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsFontName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsFontSize() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsFontSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsImageSubmit() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsImageSubmit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsIModeSymbols() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsIModeSymbols");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsInputIStyle() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsInputIStyle");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsInputMode() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsInputMode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsItalic() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsItalic");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsJPhoneMultiMediaAttributes() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsJPhoneMultiMediaAttributes");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsJPhoneSymbols() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsJPhoneSymbols");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsQueryStringInFormAction() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsQueryStringInFormAction");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsRedirectWithCookie() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsRedirectWithCookie");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsSelectMultiple() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsSelectMultiple");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsUncheck() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsUncheck");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSupportsXmlHttp() throws Throwable {
        try {
            return (boolean)classInstance.Get("SupportsXmlHttp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTables() throws Throwable {
        try {
            return (boolean)classInstance.Get("Tables");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getTagWriter() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TagWriter");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Type");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseOptimizedCacheKey() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseOptimizedCacheKey");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getVBScript() throws Throwable {
        try {
            return (boolean)classInstance.Get("VBScript");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Version getW3CDomVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("W3CDomVersion");
            return new Version(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getWin16() throws Throwable {
        try {
            return (boolean)classInstance.Get("Win16");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getWin32() throws Throwable {
        try {
            return (boolean)classInstance.Get("Win32");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}