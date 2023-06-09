package oop_java.Encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

//Encapsulation refers to bundling of fields and methods inside a single class as shown above.
