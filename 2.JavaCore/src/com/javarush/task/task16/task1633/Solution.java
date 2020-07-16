package com.javarush.task.task16.task1633;
/*
public static interface Thread.UncaughtExceptionHandler
Interface for handlers invoked when a Thread abruptly terminates due to an uncaught exception.
When a thread is about to terminate due to an uncaught exception the Java Virtual Machine will query the thread for its UncaughtExceptionHandler
using Thread.getUncaughtExceptionHandler() and will invoke the handler's uncaughtException method, passing the thread and the exception as arguments.
If a thread has not had its UncaughtExceptionHandler explicitly set, then its ThreadGroup object acts as its UncaughtExceptionHandler.
If the ThreadGroup object has no special requirements for dealing with the exception, it can forward the invocation to the default uncaught exception handler.
 */
public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);
        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");

        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setDefaultUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }

    }
}
