package com.tr.fs;

import com.tr.fs.runnable.MiHilo1;
import com.tr.fs.runnable.MiHilo2;
import com.tr.fs.threads.MiHilo1V2;
import com.tr.fs.threads.MiHilo2V2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FsApplication.class, args);

        /*MiHilo1 miHilo1 = new MiHilo1();
        MiHilo2 miHilo2 = new MiHilo2();

        Thread myThread1 = new Thread(miHilo1);
        Thread myThread2 = new Thread(miHilo2);

        myThread1.start();
        myThread2.start();*/

        MiHilo1V2 miHilo1V2 = new MiHilo1V2();
        MiHilo2V2 miHilo2V2 = new MiHilo2V2();

        new Thread(miHilo1V2).start();
        new Thread(miHilo2V2).start();
    }
}