package io.javabrains.unit1;

public class Greeter {
    public void greet(Greeting greeting) {
//        System.out.print("Hello World!");
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello World!");
        helloWorldGreeting.perform();
        lambdaGreeting.perform();
    }
}
