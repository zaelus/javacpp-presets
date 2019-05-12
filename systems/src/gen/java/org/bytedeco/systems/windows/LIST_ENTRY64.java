// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class LIST_ENTRY64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LIST_ENTRY64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LIST_ENTRY64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LIST_ENTRY64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LIST_ENTRY64 position(long position) {
        return (LIST_ENTRY64)super.position(position);
    }

    public native @Cast("ULONGLONG") long Flink(); public native LIST_ENTRY64 Flink(long setter);
    public native @Cast("ULONGLONG") long Blink(); public native LIST_ENTRY64 Blink(long setter);
}
