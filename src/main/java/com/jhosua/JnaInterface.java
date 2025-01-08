package com.jhosua;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class JnaInterface {

    public interface CLibrary extends Library{
        CLibrary INSTANCE = (CLibrary)Native.loadLibrary("JnaSample",CLibrary.class);
        int JnaInterface_getValue(Pointer self);
    }

    private Pointer self;

    public int getValue(){
        return CLibrary.INSTANCE.JnaInterface_getValue(self);
    }

}
