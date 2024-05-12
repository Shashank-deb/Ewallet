package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        List<Integer> numberList=new ArrayList();
        numberList.add(1);
        numberList.add(2);
        System.out.println(numberList.get(0));
        System.out.println(numberList.get(1));
        addNumbers(numberList);


    }

    public static  void addNumbers(List<Integer> numberList){
        int count=0;
        for(int i=0;i<numberList.size();i++){
            count+=numberList.get(i);

        }
        System.out.println(count);
    }

    public static <T> void add(T a,T b){
        System.out.println(a);
        System.out.println(b);
//        System.out.println(a+b);
    }


    /***
     * 1. searching a list with ID and returing an output -> ArrayList->  direct index
     * 2. one by one entry to store the student data ->  LinkedList->unknown capacity
     *
     */


}
