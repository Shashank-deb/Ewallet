package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("New Hello world!");
        String s1="abc";
        String s2=new String("abc");
        String s3="abc";

        System.out.println(s1==s2);//false->one is for stack and one is for heap
        System.out.println(s2==s3);//false->one is for stack and one is for heap
        System.out.println(s3==s1);//true->both are sharing the stack so same and true


        StringBuilder  sb=new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
//        converting stringbuilder to string in one short by using the toString() method
        String stringbuildertostring=sb.toString();
        System.out.println(stringbuildertostring);

        Person  p=new Person();
        p.setName("Shivam");
        p.setAge(23);
        System.out.println(p);


        Car myCar = new Car();
        myCar.setModel("Tesla Model S"); // Using setter for controlled access
        myCar.setYear(2023);             // Using setter with data validation

        System.out.println("Car model: " + myCar.getModel());
        System.out.println("Car year: " + myCar.getYear());


        ElectricCar myElectricCar = new ElectricCar("Tesla", "Lithium-ion");
        System.out.println("Car brand: " + myElectricCar.getBrand()); // Inherited from Vehicle
        System.out.println("Battery type: " + myElectricCar.getBatteryType());







    }

    Main(String abc){
        System.out.println(abc);
    }
}


/*
* .java file
* .class file
*
* byte code
* java->javac->jvm->processor
*
*
*
* heap where the reference is stored
* stack where the value is stored
*
*
* the new keyword in Java allocates memory on the heap for a new object, invokes the constructor to initialize it, and returns a reference variable that holds the memory address of the created object.

*
* Garbage collector->which release the memory
* GC clear all types of objects user created and system create objects
* Person p=new Person();->new space allocated for person p
* p=null;
* p as a reference is removed from stack.
*
* 1.serial GC->Stops the thread and one thread works single person cleaning the theatre
* 2.parallel GC->Thread works in parallel
*
* -high through put Garbage Collector
*
*
* 1.z GC->
* Prioritizes high application throughput by focusing on efficiently collecting garbage.
  Well-suited for general-purpose applications with large heaps and varying memory allocation patterns.
  Might have slightly higher memory overhead compared to some low-latency collectors.
*
*
* 2.shenandough GC ->
* Designed for minimal garbage collection pause times, ideal for low-latency and real-time applications.
Achieves this through concurrent marking, allowing the application to run while identifying garbage.
May have slightly lower overall throughput compared to G1 due to its focus on minimizing pauses.
*
* void someMethod(){
* Person p =// get from database;
* return p.name();
* }
*
*
* List<Object> l=new ArrayList<>();
* for 1 to 1000 times;
* l.add(new Person());
*
* l.clear();
*
*
*
*
* int,float,double, boolean
*
* String is divided into two parts in java
* Object in a heap   String s=new String("abc");
* String Pool        String s1="xyz";
*
* Person,Car,
* */