package com.practise.java.abstractClassAndInterfaces;

abstract class DemoAbstractClass2 implements printable{
    abstract void display();
}

class ConcreteClass1 extends DemoAbstractClass2 {
    @Override
    void display() {
        System.out.println("Hi.");
    }

    @Override
    public void print() {
        System.out.println("This comes from the printable interface");
    }
}

public class JavaApplication2 {
    public static void main(String[] args) {
        ConcreteClass1 C = new ConcreteClass1();
        C.display();
        System.out.println("How are you?");
    }
}