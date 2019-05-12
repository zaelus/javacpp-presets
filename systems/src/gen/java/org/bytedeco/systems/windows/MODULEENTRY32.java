// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class MODULEENTRY32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MODULEENTRY32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MODULEENTRY32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MODULEENTRY32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MODULEENTRY32 position(long position) {
        return (MODULEENTRY32)super.position(position);
    }

    public native @Cast("DWORD") int dwSize(); public native MODULEENTRY32 dwSize(int setter);
    public native @Cast("DWORD") int th32ModuleID(); public native MODULEENTRY32 th32ModuleID(int setter);       // This module
    public native @Cast("DWORD") int th32ProcessID(); public native MODULEENTRY32 th32ProcessID(int setter);      // owning process
    public native @Cast("DWORD") int GlblcntUsage(); public native MODULEENTRY32 GlblcntUsage(int setter);       // Global usage count on the module
    public native @Cast("DWORD") int ProccntUsage(); public native MODULEENTRY32 ProccntUsage(int setter);       // Module usage count in th32ProcessID's context
    public native @Cast("BYTE*") BytePointer modBaseAddr(); public native MODULEENTRY32 modBaseAddr(BytePointer setter);        // Base address of module in th32ProcessID's context
    public native @Cast("DWORD") int modBaseSize(); public native MODULEENTRY32 modBaseSize(int setter);        // Size in bytes of module starting at modBaseAddr
    public native @Cast("HMODULE") Pointer hModule(); public native MODULEENTRY32 hModule(Pointer setter);            // The hModule of this module in th32ProcessID's context
    public native @Cast("char") byte szModule(int i); public native MODULEENTRY32 szModule(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer szModule();
    public native @Cast("char") byte szExePath(int i); public native MODULEENTRY32 szExePath(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer szExePath();
}
