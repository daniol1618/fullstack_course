package com.tr.fs.threads;

public class MiHilo1V2 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
