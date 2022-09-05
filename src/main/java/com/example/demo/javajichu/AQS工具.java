package com.example.demo.javajichu;

import java.util.concurrent.*;

public class AQS工具 {

    private ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        new AQS工具().countDownlatch();
    }

    //等待多个任务都准备好，再各自往下做
    public void cyclicbarrier() {
        CyclicBarrier cb = new CyclicBarrier(10);
        for(int i=0; i <10 ; i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("准备好");
                    try {
                        cb.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("后续操作");
                }
            });
        }
    }

    //等待多个任务都做完，再做某事
    public void countDownlatch(){
        CountDownLatch cd = new CountDownLatch(10);
        for(int i=0; i <10 ; i++){
            executorService.execute(()->{
                cd.countDown();
                System.out.println("昨晚某事");
            });
        }
        try {
            cd.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("再做事");
    }

    //限流
    public void semaPhore(){
        Semaphore semaphore = new Semaphore(3);
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            semaphore.release();
        }

    }

}
