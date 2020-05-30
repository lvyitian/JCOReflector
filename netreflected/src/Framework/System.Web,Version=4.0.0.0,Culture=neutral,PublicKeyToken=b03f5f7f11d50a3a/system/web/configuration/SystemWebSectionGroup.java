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

package system.web.configuration;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.configuration.AnonymousIdentificationSection;
import system.web.configuration.AuthenticationSection;
import system.web.configuration.AuthorizationSection;
import system.configuration.DefaultSection;
import system.web.configuration.ClientTargetSection;
import system.web.configuration.CompilationSection;
import system.web.configuration.CustomErrorsSection;
import system.web.configuration.DeploymentSection;
import system.web.configuration.FullTrustAssembliesSection;
import system.web.configuration.GlobalizationSection;
import system.web.configuration.HealthMonitoringSection;
import system.web.configuration.HostingEnvironmentSection;
import system.web.configuration.HttpCookiesSection;
import system.web.configuration.HttpHandlersSection;
import system.web.configuration.HttpModulesSection;
import system.web.configuration.HttpRuntimeSection;
import system.web.configuration.IdentitySection;
import system.web.configuration.MachineKeySection;
import system.web.configuration.MembershipSection;
import system.configuration.ConfigurationSection;
import system.web.configuration.PagesSection;
import system.web.configuration.PartialTrustVisibleAssembliesSection;
import system.web.configuration.ProcessModelSection;
import system.web.configuration.ProfileSection;
import system.web.configuration.RoleManagerSection;
import system.web.configuration.SecurityPolicySection;
import system.web.configuration.SessionStateSection;
import system.web.configuration.SiteMapSection;
import system.web.configuration.TraceSection;
import system.web.configuration.TrustSection;
import system.web.configuration.UrlMappingsSection;
import system.web.configuration.WebControlsSection;
import system.web.configuration.WebPartsSection;
import system.web.services.configuration.WebServicesSection;
import system.web.configuration.XhtmlConformanceSection;
import system.configuration.ConfigurationSectionCollection;
import system.configuration.ConfigurationSectionGroupCollection;


/**
 * The base .NET class managing System.Web.Configuration.SystemWebSectionGroup, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class SystemWebSectionGroup extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.Configuration.SystemWebSectionGroup";
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

    public SystemWebSectionGroup(Object instance) throws Throwable {
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

    public static SystemWebSectionGroup castFrom(IJCOBridgeReflected from) throws Throwable {
        return new SystemWebSectionGroup(from.getJCOInstance());
    }

    // Constructors section
    
    
    public SystemWebSectionGroup() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void ForceDeclaration() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("ForceDeclaration");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ForceDeclaration(boolean force) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            classInstance.Invoke("ForceDeclaration", force);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public AnonymousIdentificationSection getAnonymousIdentification() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AnonymousIdentification");
            return new AnonymousIdentificationSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthenticationSection getAuthentication() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Authentication");
            return new AuthenticationSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuthorizationSection getAuthorization() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Authorization");
            return new AuthorizationSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DefaultSection getBrowserCaps() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("BrowserCaps");
            return new DefaultSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ClientTargetSection getClientTarget() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ClientTarget");
            return new ClientTargetSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CompilationSection getCompilation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Compilation");
            return new CompilationSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CustomErrorsSection getCustomErrors() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("CustomErrors");
            return new CustomErrorsSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DeploymentSection getDeployment() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Deployment");
            return new DeploymentSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DefaultSection getDeviceFilters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DeviceFilters");
            return new DefaultSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FullTrustAssembliesSection getFullTrustAssemblies() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FullTrustAssemblies");
            return new FullTrustAssembliesSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GlobalizationSection getGlobalization() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Globalization");
            return new GlobalizationSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HealthMonitoringSection getHealthMonitoring() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HealthMonitoring");
            return new HealthMonitoringSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HostingEnvironmentSection getHostingEnvironment() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HostingEnvironment");
            return new HostingEnvironmentSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpCookiesSection getHttpCookies() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HttpCookies");
            return new HttpCookiesSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpHandlersSection getHttpHandlers() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HttpHandlers");
            return new HttpHandlersSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpModulesSection getHttpModules() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HttpModules");
            return new HttpModulesSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public HttpRuntimeSection getHttpRuntime() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("HttpRuntime");
            return new HttpRuntimeSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IdentitySection getIdentity() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Identity");
            return new IdentitySection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MachineKeySection getMachineKey() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MachineKey");
            return new MachineKeySection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MembershipSection getMembership() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Membership");
            return new MembershipSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationSection getMobileControls() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MobileControls");
            return new ConfigurationSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PagesSection getPages() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Pages");
            return new PagesSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PartialTrustVisibleAssembliesSection getPartialTrustVisibleAssemblies() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PartialTrustVisibleAssemblies");
            return new PartialTrustVisibleAssembliesSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProcessModelSection getProcessModel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ProcessModel");
            return new ProcessModelSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProfileSection getProfile() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Profile");
            return new ProfileSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DefaultSection getProtocols() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Protocols");
            return new DefaultSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RoleManagerSection getRoleManager() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RoleManager");
            return new RoleManagerSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityPolicySection getSecurityPolicy() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityPolicy");
            return new SecurityPolicySection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SessionStateSection getSessionState() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SessionState");
            return new SessionStateSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SiteMapSection getSiteMap() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SiteMap");
            return new SiteMapSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TraceSection getTrace() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Trace");
            return new TraceSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TrustSection getTrust() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Trust");
            return new TrustSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UrlMappingsSection getUrlMappings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("UrlMappings");
            return new UrlMappingsSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebControlsSection getWebControls() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WebControls");
            return new WebControlsSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebPartsSection getWebParts() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WebParts");
            return new WebPartsSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebServicesSection getWebServices() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("WebServices");
            return new WebServicesSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public XhtmlConformanceSection getXhtmlConformance() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("XhtmlConformance");
            return new XhtmlConformanceSection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDeclared() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDeclared");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDeclarationRequired() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDeclarationRequired");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSectionGroupName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("SectionGroupName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
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

    public void setType(java.lang.String Type) throws Throwable {
        try {
            classInstance.Set("Type", (Object)Type);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationSectionCollection getSections() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Sections");
            return new ConfigurationSectionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ConfigurationSectionGroupCollection getSectionGroups() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SectionGroups");
            return new ConfigurationSectionGroupCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}