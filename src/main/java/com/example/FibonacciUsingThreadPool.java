package com.example;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.RecursiveTask;

public class FibonacciUsingThreadPool extends RecursiveTask<Integer> {
    private int n;
    FibonacciUsingThreadPool(int n){
        this.n = n;

    }

    @Override
    protected Integer compute() {
        if(n<2){
            return n;
        }



        FibonacciUsingThreadPool fibonacciUsingThreadPool1 = new FibonacciUsingThreadPool(n-1);
        FibonacciUsingThreadPool fibonacciUsingThreadPool2 = new FibonacciUsingThreadPool(n-2);
        fibonacciUsingThreadPool1.fork();
        fibonacciUsingThreadPool2.fork();
        return fibonacciUsingThreadPool1.join()+fibonacciUsingThreadPool2.join();


    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.invoke(new FibonacciUsingThreadPool(5)));
    }
}
