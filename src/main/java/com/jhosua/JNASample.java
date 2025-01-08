package com.jhosua;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;


/** Simple example of JNA interface mapping and usage. */
public class JNASample {

    private static final int _SC_NPROCESSORS_ONLN = 58;
    private static final int _SC_PAGE_SIZE = 47;

    // This is the standard, stable way of mapping, which supports extensive
    // customization and mapping of Java to native types.
    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary)
                Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
                        CLibrary.class);

        void printf(String format, Object... args);
        int getpid();
        long sysconf(int name);
        long time(long buf[]);
    }

    public static void main(String[] args) {
        CLibrary.INSTANCE.printf("Hello, World\n");
        System.out.println("pid: " + CLibrary.INSTANCE.getpid());
        long[] timenul = new long[1];
        System.out.println("Time: " + CLibrary.INSTANCE.time(timenul));
        System.out.println("CPUs: " + CLibrary.INSTANCE.sysconf(_SC_NPROCESSORS_ONLN));
        System.out.println("Page Size: " + CLibrary.INSTANCE.sysconf(_SC_PAGE_SIZE));

        System.out.println("CPUs: " + Runtime.getRuntime().availableProcessors());
        JnaInterface jna = new JnaInterface();
        System.out.println(jna.getValue());
    }
}
