package org.example.exception;

public class ExceptionExampleService {

    public static void main(String[] args) {
        int ans = sample(6, 0);
        System.out.println(ans);
    }

    public static int sample(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return a;
    }

}
