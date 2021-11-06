package com.pb.Krivolapova.HW6;
import com.pb.Krivolapova.HW5.Reader;


public class VetСlinic {
    public static void main(String[] args) {
        Dog dog = new Dog("Собака", "Барон", true, false, false, "");
        Cat cat = new Cat("Макс", "Кот", true, true, true, "");
        Horse horse = new Horse("Елена", "Лошадь", true, true, false, "");
        Dog[] dogs = {dog};
        Cat[] cats = {cat};
        Horse[] horses = {horse};

        System.out.println(Animal.Sleep(dogs));
        System.out.println(Animal.MakeNoise(dogs));
        System.out.println(Animal.Eat(dogs));

        System.out.println(Animal.Sleep(cats));
        System.out.println(Animal.MakeNoise(cats));
        System.out.println(Animal.Eat(cats));

        System.out.println(Animal.Sleep(horses));
        System.out.println(Animal.MakeNoise(horses));
        System.out.println(Animal.Eat(horses));

        Animal animal1 = new Animal("рыба","дом","кот","здоров");
        Animal animal2 = new Animal("мясо","будка","собака","не здоров");
        Animal animal3 = new Animal("трава","хлев","лошадь","не здоров");
        Animal[] animals = {animal1,animal2,animal3};
        Health(animals);
        }

    public static void Health(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.health == "не здоров"){
                System.out.println("Животному "+ animal.getType() + " нужно обратиться к врачу");
            }
        }
    }
}

