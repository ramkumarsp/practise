package com.practise.java.abstractClassAndInterfaces;

abstract class DemoAbstractClass1 {
    abstract void display();
}

public class JavaApplication1 {
    public static void main(String[] args)
    {
//        DemoAbstractClass AC = new DemoAbstractClass();
        DemoAbstractClass1 AC = new DemoAbstractClass1() {
            @Override
            void display() {
                System.out.println("Hi.");
            }
        };
        AC.display();
        System.out.println("How are you");
    }
}