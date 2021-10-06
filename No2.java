package com;

public class No2 {
    public static void main(String[] args){
        Character raiden = new Character("Raiden", 100, 10, 25);
        Character subZero = new Character("Sub-Zero", 100, 5, 25);

        raiden.kick(subZero);
        subZero.kick(raiden);

        for (int i = 0; i < 3; i++) {
            subZero.hit(raiden);
        }
        for (int i = 0; i < 4; i++) {
            raiden.hit(subZero);
        }

        System.out.println("LifePoint");
        System.out.println(raiden.getName() + " " + raiden.getLifePoint());
        System.out.println(subZero.getName() + " " + subZero.getLifePoint());

        if (raiden.getLifePoint() > subZero.getLifePoint()){
            System.out.println("Pemenangnya adalah : " + raiden.getName());
        } else {
            System.out.println("Pemenangnya adalah : " + subZero.getName());
        }
    }
}


