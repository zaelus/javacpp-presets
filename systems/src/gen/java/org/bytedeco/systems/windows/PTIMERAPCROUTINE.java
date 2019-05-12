// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


// #if WINAPI_FAMILY_PARTITION(WINAPI_PARTITION_DESKTOP)

@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PTIMERAPCROUTINE extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PTIMERAPCROUTINE(Pointer p) { super(p); }
    protected PTIMERAPCROUTINE() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("LPVOID") Pointer lpArgToCompletionRoutine,
    @Cast("DWORD") int dwTimerLowValue,
    @Cast("DWORD") int dwTimerHighValue
    );
}
