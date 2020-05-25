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

package system.windows.media.animation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.Vector;
import system.windows.Duration;
import system.windows.media.animation.FillBehavior;
import system.windows.media.animation.VectorAnimation;
import system.windows.media.animation.AnimationClock;
import system.windows.media.animation.Timeline;
import system.windows.media.animation.Clock;
import system.windows.DependencyProperty;
import system.windows.media.animation.AnimationTimeline;
import system.windows.media.animation.HandoffBehavior;
import system.windows.Freezable;
import system.windows.DependencyPropertyKey;
import system.windows.LocalValueEnumerator;
import system.windows.media.animation.RepeatBehavior;
import system.windows.DependencyObjectType;
import system.windows.threading.Dispatcher;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Media.Animation.VectorAnimation, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class VectorAnimation extends NetObject  {
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
	public static final String assemblyShortName = "PresentationCore";
    public static final String className = "System.Windows.Media.Animation.VectorAnimation";
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

    public VectorAnimation(Object instance) throws Throwable {
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

    public static VectorAnimation castFrom(IJCOBridgeReflected from) throws Throwable {
        return new VectorAnimation(from.getJCOInstance());
    }

    // Constructors section
    
    
    public VectorAnimation() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VectorAnimation(Vector toValue, Duration duration) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)toValue.getJCOInstance(), (Object)duration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VectorAnimation(Vector toValue, Duration duration, FillBehavior fillBehavior) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)toValue.getJCOInstance(), (Object)duration.getJCOInstance(), (Object)fillBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VectorAnimation(Vector fromValue, Vector toValue, Duration duration) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)fromValue.getJCOInstance(), (Object)toValue.getJCOInstance(), (Object)duration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VectorAnimation(Vector fromValue, Vector toValue, Duration duration, FillBehavior fillBehavior) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject((Object)fromValue.getJCOInstance(), (Object)toValue.getJCOInstance(), (Object)duration.getJCOInstance(), (Object)fillBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public VectorAnimation Clone() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.ArgumentException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new VectorAnimation(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetCurrentValue(NetObject defaultOriginValue, NetObject defaultDestinationValue, AnimationClock animationClock) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objGetCurrentValue = (JCObject)classInstance.Invoke("GetCurrentValue", (Object)defaultOriginValue.getJCOInstance(), (Object)defaultDestinationValue.getJCOInstance(), (Object)animationClock.getJCOInstance());
            return new NetObject(objGetCurrentValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector GetCurrentValue(Vector defaultOriginValue, Vector defaultDestinationValue, AnimationClock animationClock) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objGetCurrentValue = (JCObject)classInstance.Invoke("GetCurrentValue", (Object)defaultOriginValue.getJCOInstance(), (Object)defaultDestinationValue.getJCOInstance(), (Object)animationClock.getJCOInstance());
            return new Vector(objGetCurrentValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AnimationClock CreateClock() throws Throwable, system.InvalidOperationException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentException, system.OverflowException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.MulticastNotSupportedException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objCreateClock = (JCObject)classInstance.Invoke("CreateClock");
            return new AnimationClock(objCreateClock);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Timeline CloneCurrentValue() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            JCObject objCloneCurrentValue = (JCObject)classInstance.Invoke("CloneCurrentValue");
            return new Timeline(objCloneCurrentValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Clock CreateClock(boolean hasControllableRoot) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.componentmodel.Win32Exception, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.OverflowException, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.InvalidCastException {
        try {
            JCObject objCreateClock = (JCObject)classInstance.Invoke("CreateClock", hasControllableRoot);
            return new Clock(objCreateClock);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyAnimationClock(DependencyProperty dp, AnimationClock clock) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.MulticastNotSupportedException {
        try {
            classInstance.Invoke("ApplyAnimationClock", (Object)dp.getJCOInstance(), (Object)clock.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginAnimation(DependencyProperty dp, AnimationTimeline animation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.MulticastNotSupportedException, system.windows.media.animation.AnimationException {
        try {
            classInstance.Invoke("BeginAnimation", (Object)dp.getJCOInstance(), (Object)animation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetAnimationBaseValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.security.SecurityException, system.io.IOException {
        try {
            JCObject objGetAnimationBaseValue = (JCObject)classInstance.Invoke("GetAnimationBaseValue", (Object)dp.getJCOInstance());
            return new NetObject(objGetAnimationBaseValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyAnimationClock(DependencyProperty dp, AnimationClock clock, HandoffBehavior handoffBehavior) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.MulticastNotSupportedException, system.windows.media.animation.AnimationException {
        try {
            classInstance.Invoke("ApplyAnimationClock", (Object)dp.getJCOInstance(), (Object)clock.getJCOInstance(), (Object)handoffBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginAnimation(DependencyProperty dp, AnimationTimeline animation, HandoffBehavior handoffBehavior) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.componentmodel.Win32Exception, system.windows.media.animation.AnimationException {
        try {
            classInstance.Invoke("BeginAnimation", (Object)dp.getJCOInstance(), (Object)animation.getJCOInstance(), (Object)handoffBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Freezable GetAsFrozen() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetAsFrozen = (JCObject)classInstance.Invoke("GetAsFrozen");
            return new Freezable(objGetAsFrozen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Freezable GetCurrentValueAsFrozen() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException {
        try {
            JCObject objGetCurrentValueAsFrozen = (JCObject)classInstance.Invoke("GetCurrentValueAsFrozen");
            return new Freezable(objGetCurrentValueAsFrozen);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Freeze() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        try {
            classInstance.Invoke("Freeze");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.io.IOException {
        try {
            JCObject objGetValue = (JCObject)classInstance.Invoke("GetValue", (Object)dp.getJCOInstance());
            return new NetObject(objGetValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(DependencyProperty dp, NetObject value) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetValue", (Object)dp.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetCurrentValue(DependencyProperty dp, NetObject value) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetCurrentValue", (Object)dp.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetValue(DependencyPropertyKey key, NetObject value) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("SetValue", (Object)key.getJCOInstance(), (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("ClearValue", (Object)dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ClearValue(DependencyPropertyKey key) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("ClearValue", (Object)key.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CoerceValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.io.IOException {
        try {
            classInstance.Invoke("CoerceValue", (Object)dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InvalidateProperty(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            classInstance.Invoke("InvalidateProperty", (Object)dp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ReadLocalValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objReadLocalValue = (JCObject)classInstance.Invoke("ReadLocalValue", (Object)dp.getJCOInstance());
            return new NetObject(objReadLocalValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalValueEnumerator GetLocalValueEnumerator() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        try {
            JCObject objGetLocalValueEnumerator = (JCObject)classInstance.Invoke("GetLocalValueEnumerator");
            return new LocalValueEnumerator(objGetLocalValueEnumerator);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean CheckAccess() throws Throwable {
        try {
            return (boolean)classInstance.Invoke("CheckAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void VerifyAccess() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            classInstance.Invoke("VerifyAccess");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsAdditive() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsAdditive");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsAdditive(boolean IsAdditive) throws Throwable {
        try {
            classInstance.Set("IsAdditive", IsAdditive);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCumulative() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsCumulative");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsCumulative(boolean IsCumulative) throws Throwable {
        try {
            classInstance.Set("IsCumulative", IsCumulative);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getTargetPropertyType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("TargetPropertyType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDestinationDefault() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDestinationDefault");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getAccelerationRatio() throws Throwable {
        try {
            return (double)classInstance.Get("AccelerationRatio");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAccelerationRatio(double AccelerationRatio) throws Throwable {
        try {
            classInstance.Set("AccelerationRatio", AccelerationRatio);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAutoReverse() throws Throwable {
        try {
            return (boolean)classInstance.Get("AutoReverse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAutoReverse(boolean AutoReverse) throws Throwable {
        try {
            classInstance.Set("AutoReverse", AutoReverse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getDecelerationRatio() throws Throwable {
        try {
            return (double)classInstance.Get("DecelerationRatio");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDecelerationRatio(double DecelerationRatio) throws Throwable {
        try {
            classInstance.Set("DecelerationRatio", DecelerationRatio);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Duration getDuration() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Duration");
            return new Duration(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDuration(Duration Duration) throws Throwable {
        try {
            classInstance.Set("Duration", (Object)Duration.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FillBehavior getFillBehavior() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("FillBehavior");
            return new FillBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFillBehavior(FillBehavior FillBehavior) throws Throwable {
        try {
            classInstance.Set("FillBehavior", (Object)FillBehavior.getJCOInstance());
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

    public void setName(java.lang.String Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RepeatBehavior getRepeatBehavior() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("RepeatBehavior");
            return new RepeatBehavior(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRepeatBehavior(RepeatBehavior RepeatBehavior) throws Throwable {
        try {
            classInstance.Set("RepeatBehavior", (Object)RepeatBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getSpeedRatio() throws Throwable {
        try {
            return (double)classInstance.Get("SpeedRatio");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSpeedRatio(double SpeedRatio) throws Throwable {
        try {
            classInstance.Set("SpeedRatio", SpeedRatio);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasAnimatedProperties() throws Throwable {
        try {
            return (boolean)classInstance.Get("HasAnimatedProperties");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCanFreeze() throws Throwable {
        try {
            return (boolean)classInstance.Get("CanFreeze");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsFrozen() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsFrozen");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObjectType getDependencyObjectType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DependencyObjectType");
            return new DependencyObjectType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsSealed() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsSealed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Dispatcher getDispatcher() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Dispatcher");
            return new Dispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addCurrentStateInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("CurrentStateInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentStateInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("CurrentStateInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCurrentTimeInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("CurrentTimeInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentTimeInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("CurrentTimeInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCurrentGlobalSpeedInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("CurrentGlobalSpeedInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCurrentGlobalSpeedInvalidated(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("CurrentGlobalSpeedInvalidated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Completed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeCompleted(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Completed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addRemoveRequested(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("RemoveRequested", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeRemoveRequested(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("RemoveRequested", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Changed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeChanged(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Changed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}