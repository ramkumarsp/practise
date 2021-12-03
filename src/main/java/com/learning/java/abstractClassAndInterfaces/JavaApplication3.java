package com.learning.java.abstractClassAndInterfaces;

abstract class DemoAbstractClass3 implements printable{
    abstract void display();
}

abstract class Class2 extends DemoAbstractClass3 {
//    @Override
//    void display() {
//        System.out.println("Hi.");
//    }

    public void print1() {
        System.out.println("This comes from the printable interface");
    }
}

class ConcreteClass2 extends Class2 {
    @Override
    void display() {
        System.out.println("Hi.");
    }

    @Override
    public void print() {
        System.out.println("This comes from the printable interface");
    }
}

public class JavaApplication3 {
    public static void main(String[] args) {
        ConcreteClass2 C = new ConcreteClass2();
        C.display();
        System.out.println("How are you?");
    }
}