package com.pb.Krivolapova.HW6;
import java.util.Objects;

public class Dog {
    public String name;
    public String type;
    public boolean makeNoise;
    public boolean eat;
    public boolean sleep;
    public String collar;

    public Dog(String type, String name, boolean makeNoise, boolean eat, boolean sleep, String collar) {
        this.name = name;
        this.makeNoise = makeNoise;
        this.eat = eat;
        this.sleep = sleep;
        this.type = type;
        this.collar = collar;
    }

    public Dog() {
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMakeNoise() {
        return makeNoise;
    }

    public void setMakeNoise(boolean makeNoise) {
        this.makeNoise = makeNoise;
    }

    public boolean isEat() {
        return eat;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", makeNoise=" + makeNoise +
                ", eat=" + eat +
                ", sleep=" + sleep +
                ", collar='" + collar + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return makeNoise == dog.makeNoise && eat == dog.eat && sleep == dog.sleep && name.equals(dog.name) && type.equals(dog.type) && collar.equals(dog.collar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, makeNoise, eat, sleep, collar);
    }
}


