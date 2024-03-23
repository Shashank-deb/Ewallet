package org.example.inheritance;

public interface CarCompany extends Car{

    void openAirBag();

    void closeAirBag();


   default void addFrontLogo(int number){
       System.out.println("Iam coming from the first  interface with default method");
    }
}
