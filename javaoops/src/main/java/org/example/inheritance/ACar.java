package org.example.inheritance;

public class ACar implements  CarCompany,CompanyCarTwo{
    @Override
    public void openAirBag() {

    }

    @Override
    public void closeAirBag() {

    }

    public void addFrontLogo(){
//        logic specific to ACar
        System.out.println("Iam from ACar class");
    }



    @Override
    public void moveForward() {

    }

    @Override
    public void moveBackward() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
