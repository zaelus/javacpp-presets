// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SID_AND_ATTRIBUTES_HASH extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SID_AND_ATTRIBUTES_HASH() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SID_AND_ATTRIBUTES_HASH(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SID_AND_ATTRIBUTES_HASH(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SID_AND_ATTRIBUTES_HASH position(long position) {
        return (SID_AND_ATTRIBUTES_HASH)super.position(position);
    }

    public native @Cast("DWORD") int SidCount(); public native SID_AND_ATTRIBUTES_HASH SidCount(int setter);
    public native @Cast("PSID_AND_ATTRIBUTES") SID_AND_ATTRIBUTES SidAttr(); public native SID_AND_ATTRIBUTES_HASH SidAttr(SID_AND_ATTRIBUTES setter);
    public native @Cast("SID_HASH_ENTRY") long Hash(int i); public native SID_AND_ATTRIBUTES_HASH Hash(int i, long setter);
    @MemberGetter public native @Cast("SID_HASH_ENTRY*") SizeTPointer Hash();
}
