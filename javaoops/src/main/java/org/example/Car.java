package org.example;

public class Car {

        private String model; // Encapsulated data (private)
        private int year;     // Encapsulated data (private)

        // Public methods (getters and setters) for controlled access
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if (year > 0) { // Data validation (optional)
                this.year = year;
            } else {
                System.out.println("Error: Year cannot be negative.");
            }
        }

/*
Inhertiance   to class




   Car
    {
      //wheels
      //engine
      //body


      moveForward();
      moveBackward();
      stop();
      start();
    }
    class SampleCar implements Car {



     }


     Class to Class

*/


}
