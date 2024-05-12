package org.example.collections;

public class GenericsExample {

/***
 * T->Type
 * E->Element
 * In the Generics which is nothing but the datatype name passed in the runtime definition of the class creation
 *
 */

    static class Box<T> {
        T a;
        T b;
    }


    public static void main(String[] args) {
        Box<String> stringBox = new Box();
        stringBox.a = "hello";
        stringBox.b = "hi";
        String newString = stringBox.a;
        System.out.println(newString);


        Box<Integer> intBox=new Box<>();
        intBox.a=10;
        intBox.b=20;
        int newIntBox=intBox.a;
        System.out.println(newIntBox);


    }
}
