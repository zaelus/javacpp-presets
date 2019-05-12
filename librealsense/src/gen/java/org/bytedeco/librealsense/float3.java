// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;

    @Namespace("rs") @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class float3 extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public float3() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public float3(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public float3(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public float3 position(long position) {
            return (float3)super.position(position);
        }
     public native float x(); public native float3 x(float setter);
public native float y(); public native float3 y(float setter);
public native float z(); public native float3 z(float setter); }
