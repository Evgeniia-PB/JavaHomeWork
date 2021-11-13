package com.pb.Krivolapova.HW6;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Мурчик", "сиамский");
        cat.setFood("Молоко и рыба");
        cat.setLocation("Дом");

        Horse horse = new Horse("Плотва", "коричневый");
        horse.setFood("Овес и яблоки");
        horse.setLocation("Задний двор");

        Dog dog = new Dog("Барон", "средняя");
        dog.setFood("Мясо");
        dog.setLocation("Квартира");

        Class clazzCat = Cat.class;
        Class clazzHorse = Horse.class;
        Class clazzDog = Dog.class;

        Animal[] animals = new Animal[] {cat, horse, dog};

        Class clazz = Class.forName("com.pb.Krivolapova.HW6.Veterinarian");

        Constructor constr = clazz.getConstructor(String.class);
        Object vet = constr.newInstance("Док");

        Method treatAnimal = clazz.getMethod("treatAnimal", Animal.class);

        for(Animal animal: animals) {
            treatAnimal.invoke(vet, animal);
        }

        Class catClazz = Cat.class;
        Class horseClazz = Horse.class;
        Class dogClazz = Dog.class;

    }
}
