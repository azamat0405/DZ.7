package com.company;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility[] heroArray = {new Magic(), new Warrior(), new Medic()};
        for (int i = 0; i < heroArray.length; i++) {
            heroArray[i].applySuperAbility("- ");
        }
    }
}
