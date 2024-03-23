package org.example.inheritance;

public interface CompanyCarTwo {

    default void addFrontLogo(String name){
        System.out.println("Iam coming from the second interface with default method");
    }

}
