package com.pb.Krivolapova.HW6;
import java.util.Objects;

public class Dog extends Animal {
    private String size;

    public Dog(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав гав!");
    }

    @Override
    public void eat() {
        System.out.println("Собака кушает");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Собака{" +
                "еда='" + food + '\'' +
                ", местоположение='" + location + '\'' +
                ", Кличка='" + name + '\'' +
                ", размер='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(size, dog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
}
