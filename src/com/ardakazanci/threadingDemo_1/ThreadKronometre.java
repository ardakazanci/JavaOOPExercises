package com.ardakazanci.threadingDemo_1;

public class ThreadKronometre implements Runnable {

    private Thread thread;
    private String threadName;


    public ThreadKronometre(String threadName) {
        System.out.println("Thread oluşturuluyor.");
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread içinde ki görev yürütülüyor.");

        for (int i = 0; i <= 10; i++) {
            System.out.println(threadName + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(threadName + " Hata aldı" + e.toString());
            }


        }


    }

    public void start() {

        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }


    }
}
