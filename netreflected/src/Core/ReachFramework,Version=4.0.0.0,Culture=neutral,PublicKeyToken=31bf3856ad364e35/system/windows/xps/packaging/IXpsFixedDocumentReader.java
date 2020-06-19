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
 *      This code was generated from a template using JCOReflector version 1.1.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.windows.xps.packaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.windows.xps.packaging.IXpsFixedPageReader;
import system.windows.xps.packaging.IXpsFixedPageReaderImplementation;
import system.Uri;
import system.windows.xps.packaging.XpsSignatureDefinition;
import system.windows.xps.packaging.XpsStructure;
import system.printing.PrintTicket;
import system.windows.xps.packaging.XpsThumbnail;


/**
 * The base .NET class managing System.Windows.Xps.Packaging.IXpsFixedDocumentReader, ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Implements {@link IJCOBridgeReflected}.
 */
public interface IXpsFixedDocumentReader extends IJCOBridgeReflected {

    public static IXpsFixedDocumentReader ToIXpsFixedDocumentReader(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType("System.Windows.Xps.Packaging.IXpsFixedDocumentReader, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "ReachFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35" : "ReachFramework"));
        NetType.AssertCast(classType, from);
        return new IXpsFixedDocumentReaderImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link Object} representing the instance of the instantiated Class
     */
    public Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public IXpsFixedPageReader GetFixedPage(Uri pageSource) throws Throwable;

    public void AddSignatureDefinition(XpsSignatureDefinition signatureDefinition) throws Throwable;

    public void RemoveSignatureDefinition(XpsSignatureDefinition signatureDefinition) throws Throwable;

    public void CommitSignatureDefinition() throws Throwable;

    public XpsStructure AddDocumentStructure() throws Throwable;


    
    // Properties section
    
    public PrintTicket getPrintTicket() throws Throwable;

    public Uri getUri() throws Throwable;

    public int getDocumentNumber() throws Throwable;

    public XpsThumbnail getThumbnail() throws Throwable;

    public XpsStructure getDocumentStructure() throws Throwable;



    // Instance Events section
    

}