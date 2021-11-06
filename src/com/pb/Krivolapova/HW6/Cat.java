package com.pb.Krivolapova.HW6;

import java.util.Objects;

public class Cat {
    public String name;
    public String type;
    public boolean makeNoise;
    public boolean eat;
    public boolean sleep;
    public String kogtetoska;

    public Cat(String name, String type, boolean makeNoise, boolean eat, boolean sleep,String kogtetoska) {
        this.name = name;
        this.makeNoise = makeNoise;
        this.eat = eat;
        this.sleep = sleep;
        this.type = type;
        this.kogtetoska = kogtetoska;
    }
    public Cat() {
    }

    public String getKogtetoska() {
        return kogtetoska;
    }

    public void setKogtetoska(String kogtetoska) {
        this.kogtetoska = kogtetoska;
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", makeNoise=" + makeNoise +
                ", eat=" + eat +
                ", sleep=" + sleep +
                ", kogtetoska='" + kogtetoska + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return makeNoise == cat.makeNoise && eat == cat.eat && sleep == cat.sleep && name.equals(cat.name) && type.equals(cat.type) && kogtetoska.equals(cat.kogtetoska);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, makeNoise, eat, sleep, kogtetoska);
    }
}

