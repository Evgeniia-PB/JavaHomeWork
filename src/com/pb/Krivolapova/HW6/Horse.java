package com.pb.Krivolapova.HW6;

import java.util.Objects;

public class Horse {
    public String name;
    public String type;
    public boolean makeNoise;
    public boolean eat;
    public boolean sleep;
    public String stirrups;

    public Horse(String name, String type, boolean makeNoise, boolean eat, boolean sleep, String stirrups) {
        this.name = name;
        this.makeNoise = makeNoise;
        this.eat = eat;
        this.sleep = sleep;
        this.type = type;
        this.stirrups = stirrups;
    }

    public Horse() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStirrups() {
        return stirrups;
    }

    public void setStirrups(String stirrups) {
        this.stirrups = stirrups;
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
        return "Horse{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", makeNoise=" + makeNoise +
                ", eat=" + eat +
                ", sleep=" + sleep +
                ", stirrups='" + stirrups + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return makeNoise == horse.makeNoise && eat == horse.eat && sleep == horse.sleep && name.equals(horse.name) && type.equals(horse.type) && stirrups.equals(horse.stirrups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, makeNoise, eat, sleep, stirrups);
    }
}

