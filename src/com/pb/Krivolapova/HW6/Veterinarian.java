package com.pb.Krivolapova.HW6;

import com.pb.Krivolapova.HW5.Reader;

import java.util.Arrays;

public class Veterinarian extends Animal {
    private static String food;
    private static String location;
    String name;

   public Veterinarian(String food, String location, String type, String health) {
        super(food, location, type, health);
    }
   public Veterinarian(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Veterinarian nb;
        nb = new Veterinarian("Коля");
        Class clazz = nb.getClass();
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));

        food = food;
        location = location;
        Animal animal1 = new Animal("рыба","дом","кот","");
        Animal animal2 = new Animal("мясо","будка","собака","");
        Animal[] animals = {animal1,animal2};

        treatAnimal(animals);
    }

    public String food() {
        return food;
    }

    public void setFood(String food) {
        Veterinarian.food = food;
    }

    public String location() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        String s = "Veterinarian{" +
                "food - " + food +
                "location -" + location +
                "} " + super.toString();
        return s;
    }
    public static void treatAnimal(Animal[] animals) {
        for (Animal animal : animals)
        {
            System.out.println("Животное " + animal.getType()+ " употребляет еду " + animal.getFood() + ", локация проживания - " + animal.getLocation());
        }
    }

    }




