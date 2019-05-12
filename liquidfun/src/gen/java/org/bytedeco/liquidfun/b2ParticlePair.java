// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Connection between two particles */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ParticlePair extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2ParticlePair() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ParticlePair(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ParticlePair(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2ParticlePair position(long position) {
        return (b2ParticlePair)super.position(position);
    }

	/** Indices of the respective particles making pair. */
	public native @Cast("int32") int indexA(); public native b2ParticlePair indexA(int setter);
	public native @Cast("int32") int indexB(); public native b2ParticlePair indexB(int setter);

	/** The logical sum of the particle flags. See the b2ParticleFlag enum. */
	public native @Cast("uint32") long flags(); public native b2ParticlePair flags(long setter);

	/** The strength of cohesion among the particles. */
	public native @Cast("float32") float strength(); public native b2ParticlePair strength(float setter);

	/** The initial distance of the particles. */
	public native @Cast("float32") float distance(); public native b2ParticlePair distance(float setter);
}
