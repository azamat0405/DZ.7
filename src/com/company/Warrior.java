package com.company;

public class Warrior extends Hero {
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType + "Warrior применил суперспособность CRITICAL DAMAGE");
    }
}
