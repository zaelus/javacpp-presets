// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;

@Opaque @Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class posix_cred extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public posix_cred() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public posix_cred(Pointer p) { super(p); }
}
