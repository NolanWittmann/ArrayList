package org.example;

public abstract class Animal {
    //attribut
    private String name;
    private int age;

    //constructor
    public Animal(String name){
        this.name = name;
        this.age = 0;
    }

    //getters and setters

    public String getName(){
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getAge(){
        return  this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String swimming();
}
