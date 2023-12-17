package com.tr.fs;

import com.tr.fs.threads.MiHilo1Runnable;
import com.tr.fs.threads.MiHilo2Runnable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FsApplication.class, args);

        MiHilo1Runnable miHilo1Runnable = new MiHilo1Runnable();
        MiHilo2Runnable miHilo2Runnable = new MiHilo2Runnable();

        Thread myThread1 = new Thread(miHilo1Runnable);
        Thread myThread2 = new Thread(miHilo2Runnable);

        myThread1.start();
        myThread2.start();
    }
}