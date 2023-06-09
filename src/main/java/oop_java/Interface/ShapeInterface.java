package oop_java.Interface;

//An interface is a collection of abstract methods and constant variables that must be implemented by any class that uses the interface.

interface Shape extends Language {

    //method signatures
    
    double getArea();
    double getPerimeter();
    default void getSides() {
        System.out.println("I can get the sides of a polygon.");
    }
}

//It allows flexibility and consistency in the implementation of a certain functionality.