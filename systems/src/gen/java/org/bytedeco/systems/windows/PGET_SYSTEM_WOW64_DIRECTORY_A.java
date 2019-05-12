// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// for GetProcAddress
//
@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PGET_SYSTEM_WOW64_DIRECTORY_A extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PGET_SYSTEM_WOW64_DIRECTORY_A(Pointer p) { super(p); }
    protected PGET_SYSTEM_WOW64_DIRECTORY_A() { allocate(); }
    private native void allocate();
    public native @Cast("UINT") int call(@Cast("LPSTR") BytePointer lpBuffer, @Cast("UINT") int uSize);
}
