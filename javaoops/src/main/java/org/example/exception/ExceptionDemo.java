package org.example.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        int ans = sample(6, 0);
        System.out.println(ans);
        sample2("test.txt");
    }

    public static int sample(int a, int b) throws  MyCustomException{
        if(b==0){
            throw new MyCustomException();
        }
        try {
            Integer k=null;
            k=k*10;
            int [] b1=new int[10];
            System.out.println(b1[12]);
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("exception while dividing");
        }
        catch (NullPointerException e){
            System.out.println("exception while checking");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return a;
    }


    public static void sample2(String filename) throws MyCustomException{
        try{
            File f=new File(filename);
            BufferedReader bf=new BufferedReader(new FileReader(
                    f
            ));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }


/*
* Checked Exceptions:

Compile-time: Must be handled (try-catch or throws)
Type: Inherit from Exception (except RuntimeException)
Usage: External events, potential recovery
*
*
Unchecked Exceptions:
Compile-time: Not mandatory to handle
Type: Inherit from RuntimeException or Error
Usage: Programming errors, unexpected conditions
*
* */
}
