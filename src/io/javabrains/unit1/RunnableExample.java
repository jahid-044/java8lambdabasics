package io.javabrains.unit1;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        });
        myThread.start();

        Thread myLambdaThread = new Thread(() -> System.out.println("Hello Lambda"));
        myLambdaThread.start();
    }
}
