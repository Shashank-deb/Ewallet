package org.example.polymorphism;

public class Calculator {


    public int add(int a, int b){
        System.out.println("First method");
        return a+b;
    }


    public double add(double a, double b){
        System.out.println("Second method");
        return a+b;
    }

    public double add(double a, double b,double c){
        System.out.println("Third method");
        return a+b+c;
    }


    public int add2(int a, double b){
        return a+(int)b;
    }


//    public int add2(double b,int a){
//      return a+(int)b;
//    }


    public int add2(double b,int a){
        return a+(int)b;
    }

    /*
    *  public int add2(double b,int a){
    * return a+(int)b;
    * }
    *
    * */

}
