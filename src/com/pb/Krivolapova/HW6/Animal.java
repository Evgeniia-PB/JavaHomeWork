package com.pb.Krivolapova.HW6;

public class Animal {
    String food;
    String location;
    String type;
    String health;


    public Animal(String food, String location, String type, String health) {
        this.food = food;
        this.location = location;
        this.type = type;
        this.health = health;
    }

    public Animal(String name) {
    }


    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static boolean Sleep (Cat... cats) {
        String isSleep = new String();
        for (Cat cat : cats) {
            if (cat.isSleep() == true) {
                isSleep = " спит";
            } else isSleep = " не спит";
            System.out.println(cat.getType() + " " + cat.getName() + " " + isSleep);
        }
        return false;
    }
    public static boolean Sleep (Dog... dogs) {
        String isSleep = new String();
        for (Dog dog : dogs) {
            if (dog.isSleep()==true){
                isSleep = " спит";}
            else isSleep = " не спит";
            System.out.println(dog.getType() + " " + dog.getName()  + " " + isSleep);
        }
        return false;
    }
    public static boolean Sleep (Horse... horses) {
        String isSleep = new String();
        for (Horse horse : horses) {
            if (horse.isSleep() == true) {
                isSleep = " спит";
            } else isSleep = " не спит";
            System.out.println(horse.getType() + " " + horse.getName() + " " + isSleep);
        }
        return false;
    }
    public static boolean MakeNoise (Cat... cats) {
        String isMakeNoise = new String();
        for (Cat cat : cats) {
            if (cat.isMakeNoise()==true){
                isMakeNoise = " шумит";}
            else isMakeNoise = " не шумит";
            System.out.println(cat.getType() + " " + cat.getName()  + " " + isMakeNoise);
        }
        System.out.println();
        return false;
    }
    public static boolean MakeNoise (Dog... dogs) {
        String isMakeNoise = new String();
        for (Dog dog : dogs) {
            if (dog.isMakeNoise()==true){
                isMakeNoise = " шумит";}
            else isMakeNoise = " не шумит";
            System.out.println(dog.getType() + " " + dog.getName()  + " " + isMakeNoise);
        }
        System.out.println();
        return false;
    }

    public static boolean MakeNoise (Horse... horses) {
        String isMakeNoise = new String();
        for (Horse horse : horses) {
            if (horse.isMakeNoise()==true){
                isMakeNoise = " шумит";}
            else isMakeNoise = " не шумит";
            System.out.println(horse.getType() + " " + horse.getName()  + " " + isMakeNoise);
        }
        System.out.println();
        return false;
    }
    public static boolean Eat (Cat... cats) {
        String isEat = new String();
        for (Cat cat : cats) {
            if (cat.isEat()==true){
                isEat = " кушает";}
            else isEat = " не кушает";
            System.out.println(cat.getType() + " " + cat.getName()  + " " + isEat);
        }
        System.out.println();
        return false;
    }
    public static boolean Eat (Dog... dogs) {
        String isEat = new String();
        for (Dog dog : dogs) {
            if (dog.isEat()==true){
                isEat = " кушает";}
            else isEat = " не кушает";
            System.out.println(dog.getType() + " " + dog.getName()  + " " + isEat);
        }
        System.out.println();
        return false;
    }

    public static boolean Eat (Horse... horses ) {
        String isEat = new String();
        for (Horse horse : horses) {
            if (horse.isEat()==true){
                isEat = " кушает";}
            else isEat = " не кушает";
            System.out.println(horse.getType() + " " + horse.getName()  + " " + isEat);
        }
        System.out.println();
        return false;
    }
}





