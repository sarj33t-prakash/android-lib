package com.sarj33t.firstlib;

import android.util.Log;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello World! This is Android Library test");
    }

    /// Prints the given message
    public static void printMsg(String tag, String message){
        //System.out.println(message);
        Log.d(tag, message);
    }
}

