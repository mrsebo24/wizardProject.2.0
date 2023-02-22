package org.example.mechanics;

import java.util.Random;

public enum SpellType {
    SHIT_STORM(150),
    HEAL(30),
    FIREBALL(25),
    LIGHTING_STRIKE(20);


    private int damage;
    private Random random = new Random();
    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        if(SpellType.this.name().equals(SpellType.HEAL.name())) {
            return (-random.nextInt(damage + 1) - 1);
        }else if(SpellType.this.name().equals(SpellType.SHIT_STORM.name())){
            int rand = (random.nextInt(damage + 1) - 1);
            if (rand < SHIT_STORM.damage / 2)
                return 150;
            else return 0;
        }
        else
            return (random.nextInt(1 + damage) - 1);
    }
}
