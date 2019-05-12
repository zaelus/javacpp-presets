// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;


/* Data structure to describe CPU mask.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class cpu_set_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cpu_set_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cpu_set_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cpu_set_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cpu_set_t position(long position) {
        return (cpu_set_t)super.position(position);
    }

  public native @Cast("__cpu_mask") long __bits(int i); public native cpu_set_t __bits(int i, long setter);
  @MemberGetter public native @Cast("__cpu_mask*") CLongPointer __bits();
}
