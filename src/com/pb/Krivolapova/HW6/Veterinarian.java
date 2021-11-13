package com.pb.Krivolapova.HW6;


public class Veterinarian {

    private String name;

    public Veterinarian(String name)  {
        this.name = name;
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Ветеринар " + name + " лечит животное по кличке " + animal.getName() +
                " на локации \"" + animal.getLocation() + "\", которое кушает еду следующего типа \"" + animal.getFood() + "\"");
    }
}



