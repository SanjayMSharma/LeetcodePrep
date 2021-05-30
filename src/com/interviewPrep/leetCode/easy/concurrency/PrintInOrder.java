package com.interviewPrep.leetCode.easy.concurrency;

import java.util.concurrent.Semaphore;

public class PrintInOrder {
    Semaphore sem;
    public PrintInOrder() {
        sem = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        sem.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        sem.acquire(1);
        printSecond.run();
        sem.release(2);
    }

    public void third(Runnable printThird) throws InterruptedException {
        sem.acquire(2);
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        sem.release(2);
    }
}
