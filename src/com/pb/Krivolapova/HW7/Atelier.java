package com.pb.Krivolapova.HW7;

public class Atelier {
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println(clothe);
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomanClothes) {
                System.out.println(clothe);
            }
        }
    }
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Size.XS, "серый", 1500),
                new Tshirt(Size.L, "белый", 1200),
                new Pants(Size.M, "черный", 2100),
                new Pants(Size.XXS, "синий", 2500),
                new Skirt(Size.S, "бледно-розовый", 1800),
                new Skirt(Size.M, "красный", 1900),
                new Tie(Size.L, "зеленый", 900),
                new Tie(Size.L, "бордовый", 500),
        };

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWoman(clothes);
    }
}