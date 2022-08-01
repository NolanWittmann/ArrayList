package org.example;

public class Fish extends Animal{

    public Fish(String name) {
        super(name);
        int age;
    }


    @Override
    public String swimming() {
        if(getAge() == 0){
            return getName() + " ne sait pas encore nagé, il n'a que " + getAge() + " an.";
        }
        else if (getAge() > 0 && getAge() < 18) {
            return getName() + " apprend à nager, il a déjà " + getAge() + " ans.";
        }
        return getName() +" adore nagé et a " + getAge() + " ans.";
    }

    }
