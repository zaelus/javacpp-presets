// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_memory_related Memory and memory related operations
 *  \{
 <p>
 *  \addtogroup cpp_api_memory Memory
 *  A primitive to describe and store data.
 * 
 *  For more information, refer to \ref c_api_memory in \ref c_api.
 *  \{
 <p>
 *  Memory primitive that describes the data. */
@Namespace("mkldnn") @NoOffset @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class memory extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public memory(Pointer p) { super(p); }


    /** Data type specification. See #mkldnn_data_type_t for a detailed
     *  description. */
    /** enum mkldnn::memory::data_type */
    public static final int
        data_undef = mkldnn_data_type_undef,
        f32 = mkldnn_f32,
        s32 = mkldnn_s32,
        s16 = mkldnn_s16,
        s8 = mkldnn_s8,
        u8 = mkldnn_u8;

    /** Memory format specification. See #mkldnn_memory_format_t
     *  for a detailed description. */
    /** enum mkldnn::memory::format */
    public static final int
        format_undef = mkldnn_format_undef,
        any = mkldnn_any,
        blocked = mkldnn_blocked,
        x = mkldnn_x,
        nc = mkldnn_nc,
        ncw = mkldnn_ncw,
        nwc = mkldnn_nwc,
        nCw16c = mkldnn_nCw16c,
        nchw = mkldnn_nchw,
        nhwc = mkldnn_nhwc,
        chwn = mkldnn_chwn,
        nCw8c = mkldnn_nCw8c,
        nChw8c = mkldnn_nChw8c,
        nChw16c = mkldnn_nChw16c,
        ncdhw = mkldnn_ncdhw,
        ndhwc = mkldnn_ndhwc,
        nCdhw8c = mkldnn_nCdhw8c,
        nCdhw16c = mkldnn_nCdhw16c,
        oi = mkldnn_oi,
        io = mkldnn_io,
        oiw = mkldnn_oiw,
        wio = mkldnn_wio,
        Owi8o = mkldnn_Owi8o,
        OIw8o8i = mkldnn_OIw8o8i,
        OIw8i8o = mkldnn_OIw8i8o,
        OIw16i16o = mkldnn_OIw16i16o,
        OIw16o16i = mkldnn_OIw16o16i,
        Oiw16o = mkldnn_Oiw16o,
        Owi16o = mkldnn_Owi16o,
        OIw8i16o2i = mkldnn_OIw8i16o2i,
        OIw8o16i2o = mkldnn_OIw8o16i2o,
        IOw16o16i = mkldnn_IOw16o16i,
        oihw = mkldnn_oihw,
        ihwo = mkldnn_ihwo,
        hwio = mkldnn_hwio,
        iohw = mkldnn_iohw,
        hwio_s8s8 = mkldnn_hwio_s8s8,
        dhwio = mkldnn_dhwio,
        oidhw = mkldnn_oidhw,
        OIdhw8i8o = mkldnn_OIdhw8i8o,
        OIdhw8o8i = mkldnn_OIdhw8o8i,
        Odhwi8o = mkldnn_Odhwi8o,
        OIdhw16i16o = mkldnn_OIdhw16i16o,
        OIdhw16o16i = mkldnn_OIdhw16o16i,
        Oidhw16o = mkldnn_Oidhw16o,
        Odhwi16o = mkldnn_Odhwi16o,
        oIhw8i = mkldnn_oIhw8i,
        oIhw16i = mkldnn_oIhw16i,
        oIdhw8i = mkldnn_oIdhw8i,
        oIdhw16i = mkldnn_oIdhw16i,
        OIhw8i8o = mkldnn_OIhw8i8o,
        OIhw16i16o = mkldnn_OIhw16i16o,
        OIhw8o8i = mkldnn_OIhw8o8i,
        OIhw16o16i = mkldnn_OIhw16o16i,
        IOhw16o16i = mkldnn_IOhw16o16i,
        OIhw8i16o2i = mkldnn_OIhw8i16o2i,
        OIdhw8i16o2i = mkldnn_OIdhw8i16o2i,
        OIhw8o16i2o = mkldnn_OIhw8o16i2o,
        OIhw4i16o4i = mkldnn_OIhw4i16o4i,
        OIhw4i16o4i_s8s8 = mkldnn_OIhw4i16o4i_s8s8,
        Oihw8o = mkldnn_Oihw8o,
        Oihw16o = mkldnn_Oihw16o,
        Ohwi8o = mkldnn_Ohwi8o,
        Ohwi16o = mkldnn_Ohwi16o,
        OhIw16o4i = mkldnn_OhIw16o4i,
        goiw = mkldnn_goiw,
        gOwi8o = mkldnn_gOwi8o,
        gOIw8o8i = mkldnn_gOIw8o8i,
        gOIw8i8o = mkldnn_gOIw8i8o,
        gOIw16i16o = mkldnn_gOIw16i16o,
        gOIw16o16i = mkldnn_gOIw16o16i,
        gOiw16o = mkldnn_gOiw16o,
        gOwi16o = mkldnn_gOwi16o,
        gOIw8i16o2i = mkldnn_gOIw8i16o2i,
        gIOw16o16i = mkldnn_gIOw16o16i,
        gOIw8o16i2o = mkldnn_gOIw8o16i2o,
        goihw = mkldnn_goihw,
        hwigo = mkldnn_hwigo,
        giohw = mkldnn_giohw,
        hwigo_s8s8 = mkldnn_hwigo_s8s8,
        gOIdhw8i8o = mkldnn_gOIdhw8i8o,
        gOIdhw8o8i = mkldnn_gOIdhw8o8i,
        gOdhwi8o = mkldnn_gOdhwi8o,
        gOIhw8i8o = mkldnn_gOIhw8i8o,
        gOIhw16i16o = mkldnn_gOIhw16i16o,
        gOIhw8i16o2i = mkldnn_gOIhw8i16o2i,
        gOIdhw8i16o2i = mkldnn_gOIdhw8i16o2i,
        gOIhw8o16i2o = mkldnn_gOIhw8o16i2o,
        gOIhw4i16o4i = mkldnn_gOIhw4i16o4i,
        gOIhw4i16o4i_s8s8 = mkldnn_gOIhw4i16o4i_s8s8,
        gOihw8o = mkldnn_gOihw8o,
        gOihw16o = mkldnn_gOihw16o,
        gOhwi8o = mkldnn_gOhwi8o,
        gOhwi16o = mkldnn_gOhwi16o,
        Goihw8g = mkldnn_Goihw8g,
        Goihw16g = mkldnn_Goihw16g,
        Goihw16g_s8s8 = mkldnn_Goihw16g_s8s8,
        gOIhw8o8i = mkldnn_gOIhw8o8i,
        gOIhw16o16i = mkldnn_gOIhw16o16i,
        gIOhw16o16i = mkldnn_gIOhw16o16i,
        gOhIw16o4i = mkldnn_gOhIw16o4i,
        goidhw = mkldnn_goidhw,
        gOIdhw16i16o = mkldnn_gOIdhw16i16o,
        gOIdhw16o16i = mkldnn_gOIdhw16o16i,
        gOidhw16o = mkldnn_gOidhw16o,
        gOdhwi16o = mkldnn_gOdhwi16o,
        ntc = mkldnn_ntc,
        tnc = mkldnn_tnc,
        ldsnc = mkldnn_ldsnc,
        ldigo = mkldnn_ldigo,
        ldgoi = mkldnn_ldgoi,
        ldgo = mkldnn_ldgo,
        rnn_packed = mkldnn_rnn_packed,
        wino_fmt = mkldnn_wino_fmt,
        format_last = mkldnn_format_last;

    /** A memory descriptor. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        /** The underlying C API data structure. */
        
        ///
        public native @ByRef mkldnn_memory_desc_t data(); public native desc data(mkldnn_memory_desc_t setter);

        /** Constructs a memory descriptor.
         * 
         *  @param adims Data dimensions
         *  @param adata_type Data precision/type.
         *  @param aformat Data layout format. */
        
        ///
        public desc(@StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer adims, @Cast("mkldnn::memory::data_type") int adata_type,
                        @Cast("mkldnn::memory::format") int aformat) { super((Pointer)null); allocate(adims, adata_type, aformat); }
        private native void allocate(@StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntPointer adims, @Cast("mkldnn::memory::data_type") int adata_type,
                        @Cast("mkldnn::memory::format") int aformat);
        public desc(@StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer adims, @Cast("mkldnn::memory::data_type") int adata_type,
                        @Cast("mkldnn::memory::format") int aformat) { super((Pointer)null); allocate(adims, adata_type, aformat); }
        private native void allocate(@StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal IntBuffer adims, @Cast("mkldnn::memory::data_type") int adata_type,
                        @Cast("mkldnn::memory::format") int aformat);
        public desc(@StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] adims, @Cast("mkldnn::memory::data_type") int adata_type,
                        @Cast("mkldnn::memory::format") int aformat) { super((Pointer)null); allocate(adims, adata_type, aformat); }
        private native void allocate(@StdVector("std::remove_extent<mkldnn_dims_t>::type") @ByVal int[] adims, @Cast("mkldnn::memory::data_type") int adata_type,
                        @Cast("mkldnn::memory::format") int aformat);

        /** Constructs a memory descriptor from a C API data structure.
         * 
         *  @param adata A C API #mkldnn_memory_desc_t structure. */
        public desc(@Const @ByRef mkldnn_memory_desc_t adata) { super((Pointer)null); allocate(adata); }
        private native void allocate(@Const @ByRef mkldnn_memory_desc_t adata);
    }

    /** A memory primitive descriptor. */
    public static class primitive_desc extends mkldnn_primitive_desc_handle {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    

        // TODO: make private
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a memory primitive descriptor. */
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine);

        /** Returns the memory primitive descriptor. */
        public native @ByVal desc desc();

        /** Returns the number of bytes required to allocate the memory described
         *  including the padding area. */
        public native @Cast("size_t") long get_size();

        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef primitive_desc other);

        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef primitive_desc other);

        public native @ByVal engine get_engine();
    }

    /** Constructs a memory primitive from a generic primitive.
     * 
     *  @param aprimitive The primitive to treat as memory. */
    
    ///
    public memory(@Const @ByRef primitive aprimitive) { super((Pointer)null); allocate(aprimitive); }
    private native void allocate(@Const @ByRef primitive aprimitive);
    /** Constructs a memory primitive.
     * 
     *  @param adesc Memory primitive descriptor. */
    public memory(@Const @ByRef primitive_desc adesc) { super((Pointer)null); allocate(adesc); }
    private native void allocate(@Const @ByRef primitive_desc adesc);

    public memory(@Const @ByRef primitive_desc adesc, Pointer ahandle) { super((Pointer)null); allocate(adesc, ahandle); }
    private native void allocate(@Const @ByRef primitive_desc adesc, Pointer ahandle);

    /** Returns the descriptor of the memory primitive. */
    public native @ByVal primitive_desc get_primitive_desc();

    /** Returns a handle of the data contained in the memory primitive. On
     *  the CPU engine, this is a pointer to the allocated memory. */
    public native Pointer get_data_handle();

    public native void set_data_handle(Pointer handle);

    // Must go away or be private:
    public static native @Cast("mkldnn_data_type_t") int convert_to_c(@Cast("mkldnn::memory::data_type") int adata_type);
}
