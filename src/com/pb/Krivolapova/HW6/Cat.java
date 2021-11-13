package com.pb.Krivolapova.HW6;
import java.util.Objects;

public class Cat extends Animal {

    private String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Кот{" +
                "еда='" + food + '\'' +
                ", местоположение='" + location + '\'' +
                ", кличка='" + name + '\'' +
                ", порода='" + breed + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("Мур мур");
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает");
    }
}