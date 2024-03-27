package io.javabrains.unit2;

import java.util.function.IntConsumer;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(a, i -> System.out.println(i+b));
    }

    public static void doProcess(int i, IntConsumer intConsumer){
        intConsumer.accept(i);
    }
}
