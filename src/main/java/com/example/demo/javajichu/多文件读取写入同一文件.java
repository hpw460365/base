package com.example.demo.javajichu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class 多文件读取写入同一文件 {
    //定义线程池
    private ExecutorService executorService = Executors.newFixedThreadPool(3);
    //定义线程，1.读文件，2同步写文件
    ReentrantLock lock = new ReentrantLock();

    void resolve(){
        executorService.execute(new A("a.txt", lock));
        executorService.execute(new A("b.txt", lock));
        executorService.execute(new A("c.txt", lock));
    }
}

class A extends Thread {

    private ReentrantLock lock;
    private String filePath;
    public A(String filaPath, ReentrantLock lock){
        this.filePath = filaPath;
        this.lock = lock;
    }

    @Override
    public void run() {
        byte[] b = new byte[1028];
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream(new File(filePath));
            out = new FileOutputStream(new File("D.txt"));
            int len = 0;
            if(lock.tryLock()){
                while ((len = in.read(b)) !=-1){
                    out.write(b,0, len);

                }
                lock.unlock();
            }
        }catch (IOException e){

        }finally {
            try{
                if(in !=null){
                    in.close();
                }
                if(out !=null){
                    out.close();
                }
            }catch (IOException e){

            }

        }


    }
}