// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class MEMORY_BASIC_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MEMORY_BASIC_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MEMORY_BASIC_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MEMORY_BASIC_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MEMORY_BASIC_INFORMATION position(long position) {
        return (MEMORY_BASIC_INFORMATION)super.position(position);
    }

    public native @Cast("PVOID") Pointer BaseAddress(); public native MEMORY_BASIC_INFORMATION BaseAddress(Pointer setter);
    public native @Cast("PVOID") Pointer AllocationBase(); public native MEMORY_BASIC_INFORMATION AllocationBase(Pointer setter);
    public native @Cast("DWORD") int AllocationProtect(); public native MEMORY_BASIC_INFORMATION AllocationProtect(int setter);
    public native @Cast("SIZE_T") long RegionSize(); public native MEMORY_BASIC_INFORMATION RegionSize(long setter);
    public native @Cast("DWORD") int State(); public native MEMORY_BASIC_INFORMATION State(int setter);
    public native @Cast("DWORD") int Protect(); public native MEMORY_BASIC_INFORMATION Protect(int setter);
    public native @Cast("DWORD") int Type(); public native MEMORY_BASIC_INFORMATION Type(int setter);
}
