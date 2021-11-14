package com.pb.Krivolapova.HW7;

    public class Tshirt extends Clothes implements ManClothes, WomanClothes{
        public Tshirt(Size size, String color) {
            super(size, color);
        }

        public Tshirt(Size size, String color, double cost) {
            super(size, color, cost);
        }

        @Override
        public String toString() {
            return "Футболка{" +
                    "размер = " + getSize() +
                    ", цена = " + getCost() + " грн" +
                    ", цвет = " + getColor() +
                    "}";
        }
    }

