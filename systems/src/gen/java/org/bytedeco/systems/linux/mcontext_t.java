// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;


/* Context to describe whole processor state.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class mcontext_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mcontext_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mcontext_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mcontext_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mcontext_t position(long position) {
        return (mcontext_t)super.position(position);
    }

    @MemberGetter public native Pointer gregs();
    /* Note that fpregs is a pointer.  */
    @MemberGetter public native Pointer fpregs();
    public native @Cast("unsigned long") long __reserved1(int i); public native mcontext_t __reserved1(int i, long setter);
    @MemberGetter public native @Cast("unsigned long*") CLongPointer __reserved1();
}
