package com.learning.check;

class newthread implements Runnable{
    Thread t;
    newthread() {
        t = new Thread(this, "My thread");
        t.start();
    }

    public void run() {
        System.out.println(t.getName());
    }
}

class multithreaded_programming {
    public static void main(String[] args) {
        new newthread();
    }
}