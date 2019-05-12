// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;
	/* special day to force password
					 * change at next login */
// #endif

@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class passwd extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public passwd() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public passwd(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public passwd(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public passwd position(long position) {
        return (passwd)super.position(position);
    }

	public native @Cast("char*") BytePointer pw_name(); public native passwd pw_name(BytePointer setter);		/* user name */
	public native @Cast("char*") BytePointer pw_passwd(); public native passwd pw_passwd(BytePointer setter);		/* encrypted password */
	public native @Cast("uid_t") int pw_uid(); public native passwd pw_uid(int setter);			/* user uid */
	public native @Cast("gid_t") int pw_gid(); public native passwd pw_gid(int setter);			/* user gid */
	public native @Cast("__darwin_time_t") long pw_change(); public native passwd pw_change(long setter);		/* password change time */
	public native @Cast("char*") BytePointer pw_class(); public native passwd pw_class(BytePointer setter);		/* user access class */
	public native @Cast("char*") BytePointer pw_gecos(); public native passwd pw_gecos(BytePointer setter);		/* Honeywell login info */
	public native @Cast("char*") BytePointer pw_dir(); public native passwd pw_dir(BytePointer setter);		/* home directory */
	public native @Cast("char*") BytePointer pw_shell(); public native passwd pw_shell(BytePointer setter);		/* default shell */
	public native @Cast("__darwin_time_t") long pw_expire(); public native passwd pw_expire(long setter);		/* account expiration */
}
