package com.pb.Krivolapova.HW7;
import java.awt.*;

public class Pants extends Clothes implements ManClothes, WomanClothes{
    public Pants(Size size, String color) {
        super(size, color);
    }

    public Pants(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
