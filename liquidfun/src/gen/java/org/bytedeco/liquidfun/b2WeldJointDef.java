// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Weld joint definition. You need to specify local anchor points
 *  where they are attached and the relative body angle. The position
 *  of the anchor points is important for computing the reaction torque. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2WeldJointDef extends b2JointDef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2WeldJointDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2WeldJointDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2WeldJointDef position(long position) {
        return (b2WeldJointDef)super.position(position);
    }

	public b2WeldJointDef() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Initialize the bodies, anchors, and reference angle using a world
	 *  anchor point. */
	public native void Initialize(b2Body bodyA, b2Body bodyB, @Const @ByRef b2Vec2 anchor);

	/** The local anchor point relative to bodyA's origin. */
	public native @ByRef b2Vec2 localAnchorA(); public native b2WeldJointDef localAnchorA(b2Vec2 setter);

	/** The local anchor point relative to bodyB's origin. */
	public native @ByRef b2Vec2 localAnchorB(); public native b2WeldJointDef localAnchorB(b2Vec2 setter);

	/** The bodyB angle minus bodyA angle in the reference state (radians). */
	public native @Cast("float32") float referenceAngle(); public native b2WeldJointDef referenceAngle(float setter);
	
	/** The mass-spring-damper frequency in Hertz. Rotation only.
	 *  Disable softness with a value of 0. */
	public native @Cast("float32") float frequencyHz(); public native b2WeldJointDef frequencyHz(float setter);

	/** The damping ratio. 0 = no damping, 1 = critical damping. */
	public native @Cast("float32") float dampingRatio(); public native b2WeldJointDef dampingRatio(float setter);
}
