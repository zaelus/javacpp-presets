// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;
                        // Back to 4 byte packing

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_THUNK_DATA32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_THUNK_DATA32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_THUNK_DATA32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_THUNK_DATA32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_THUNK_DATA32 position(long position) {
        return (IMAGE_THUNK_DATA32)super.position(position);
    }

        @Name("u1.ForwarderString") public native @Cast("DWORD") int u1_ForwarderString(); public native IMAGE_THUNK_DATA32 u1_ForwarderString(int setter);      // PBYTE 
        @Name("u1.Function") public native @Cast("DWORD") int u1_Function(); public native IMAGE_THUNK_DATA32 u1_Function(int setter);             // PDWORD
        @Name("u1.Ordinal") public native @Cast("DWORD") int u1_Ordinal(); public native IMAGE_THUNK_DATA32 u1_Ordinal(int setter);
        @Name("u1.AddressOfData") public native @Cast("DWORD") int u1_AddressOfData(); public native IMAGE_THUNK_DATA32 u1_AddressOfData(int setter);        // PIMAGE_IMPORT_BY_NAME
}
