package com.example.demo.javajichu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ABC顺序执行 {

    private ExecutorService executorService = Executors.newFixedThreadPool(3);

    private String next = "A";

    private Object o = new Object();

    public static void main(String[] args) {
        new ABC顺序执行().print();
    }

    private void print(){
        executorService.execute(new A());
        executorService.execute(new B());
        executorService.execute(new C());
    }



    //打印A
    class A implements Runnable{
        @Override
        public void run() {
            for(int i =0; i<3; i++){
            synchronized (o){
                    if(next != "A"){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("A");
                        next = "B";
                        o.notifyAll();
                    }
                }


            }
        }
    }
    //打印B
    class B implements Runnable{
        @Override
        public void run() {
            for(int i =0; i<3; i++){
            synchronized (o){

                    if(next != "B"){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("B");
                        next = "C";
                        o.notifyAll();
                    }
                }

            }

        }
    }
    //打印C
    class C implements Runnable{
        @Override
        public void run() {
            for(int i =0; i<3; i++){
            synchronized (o){
                    if(next != "C"){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("C");
                        next = "A";
                        o.notifyAll();
                    }
                }

            }
        }
    }

}
