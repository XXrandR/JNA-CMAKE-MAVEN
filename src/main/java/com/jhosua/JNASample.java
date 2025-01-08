package com.jhosua;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;


/** Simple example of JNA interface mapping and usage. */
public class JNASample {

    public static void main(String[] args) {
        JnaInterface jna = new JnaInterface();
		Integer maxNumber = 10;
		if(args.length > 0){
			maxNumber = Integer.valueOf(args[0].toString());
		}
        System.out.println("The precious value: " + jna.getValue(maxNumber));
    }
}
