package com.example;

public class ProfilingExercise07 {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Math.pow(Math.random(), Math.random());
            Thread.sleep(1);
        }
    }
}
