// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;


/* Userlevel context.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class ucontext_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ucontext_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ucontext_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ucontext_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ucontext_t position(long position) {
        return (ucontext_t)super.position(position);
    }

    public native @Cast("unsigned long int") long uc_flags(); public native ucontext_t uc_flags(long setter);
    public native ucontext_t uc_link(); public native ucontext_t uc_link(ucontext_t setter);
    public native @ByRef stack_t uc_stack(); public native ucontext_t uc_stack(stack_t setter);
    public native @ByRef mcontext_t uc_mcontext(); public native ucontext_t uc_mcontext(mcontext_t setter);
    public native @ByRef sigset_t uc_sigmask(); public native ucontext_t uc_sigmask(sigset_t setter);
    public native @ByRef @Cast("_libc_fpstate*") Pointer __fpregs_mem(); public native ucontext_t __fpregs_mem(Pointer setter);
  }
