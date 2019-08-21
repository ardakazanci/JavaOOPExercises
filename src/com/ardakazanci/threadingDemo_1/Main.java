package com.ardakazanci.threadingDemo_1;

import javax.net.ssl.HostnameVerifier;

public class Main {

    public static void main(String[] args) {

        ThreadKronometre thread_1 = new ThreadKronometre("Thread-1");
        ThreadKronometre thread_2 = new ThreadKronometre("Thread-2");
        ThreadKronometre thread_3 = new ThreadKronometre("Thread-3");
        ThreadKronometre thread_4 = new ThreadKronometre("Thread-4");

        // Her biri , aynı anda çalışmaya başlayacak
        // Biri diğerinin bitmesini beklemeden çalışacak.

        thread_1.start();
        thread_2.start();
        thread_3.start();
        thread_4.start();

    }

}
