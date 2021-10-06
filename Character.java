package com;


public class Character {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    public void hit(Character karB){
        karB.lifePoint = karB.getLifePoint() - this.attackHitPoint;
    }

    public void kick(Character karB){
        karB.lifePoint = karB.getLifePoint() - this.attackKickPoint;
    }

    public Character(String name, int lifePoint, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.lifePoint = lifePoint;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public int getLifePoint(){
        return lifePoint;
    }

    public String getName(){
        return name;
    }
}

