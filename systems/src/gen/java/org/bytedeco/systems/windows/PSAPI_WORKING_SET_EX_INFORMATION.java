// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PSAPI_WORKING_SET_EX_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PSAPI_WORKING_SET_EX_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PSAPI_WORKING_SET_EX_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PSAPI_WORKING_SET_EX_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PSAPI_WORKING_SET_EX_INFORMATION position(long position) {
        return (PSAPI_WORKING_SET_EX_INFORMATION)super.position(position);
    }

    public native @Cast("PVOID") Pointer VirtualAddress(); public native PSAPI_WORKING_SET_EX_INFORMATION VirtualAddress(Pointer setter);
    public native @ByRef PSAPI_WORKING_SET_EX_BLOCK VirtualAttributes(); public native PSAPI_WORKING_SET_EX_INFORMATION VirtualAttributes(PSAPI_WORKING_SET_EX_BLOCK setter);
}
