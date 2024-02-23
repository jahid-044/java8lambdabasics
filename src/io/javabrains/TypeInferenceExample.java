package io.javabrains;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda lambda = s -> s.length();
        System.out.println(lambda.getLength("Hello World"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }

}
