package stringIoStreams.Java_Nested_Static_Class;

public class Main {
    public static void main(String... args){
        Animal animal = new Animal();

    Animal.Reptile reptile = animal.new Reptile();

    //creating object of the static nested class
    Animal.Mammal mammal = new Animal.Mammal();
    reptile.displayInfo();
    
    }
}
