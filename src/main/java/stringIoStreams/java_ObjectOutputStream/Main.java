package stringIoStreams.java_ObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        int data1 = 5;
        String data2 = "This is programiz";
        Dog dog = new Dog("Tom", "Labrador");

        try {

            FileOutputStream file = new FileOutputStream("file.txt");

            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // writes objects to output stream
            output.writeInt(data1);
            output.writeObject(data2);
            output.writeObject(dog);

            // Reads data using the ObjectInputStream
            FileInputStream fileStream = new FileInputStream("file.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            Dog newDog = (Dog) objStream.readObject();

            System.out.println("Integer data :" + objStream.readInt());
            System.out.println("String data: " + objStream.readObject());

            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

            output.close();
            objStream.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
