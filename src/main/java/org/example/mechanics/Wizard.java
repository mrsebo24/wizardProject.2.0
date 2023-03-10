package org.example.mechanics;

import java.util.List;
import java.util.Random;

public class Wizard {
    private Random random = new Random();
    private String WizardName;
    private double hp = 200.0;
    private double Age;
    private WizardType wizardType;
    public Wizard(String wizardName, double age, WizardType wizardType) {
        WizardName = wizardName;
        Age = age;
        this.wizardType = wizardType;
    }
    public void throwSpell(String spell, Wizard enemyWizard) {
        SpellType spellType = getSpell(spell);
        if (this.hp == 0)
            System.out.println("you are death, cannot throw any spells");
        else if (enemyWizard == null)
            System.out.println("not found enemy wizard");
        else if (!knownSpells(spellType))
            System.out.println("spell not found");
        else
            hpCheck(spellType, enemyWizard);
    }

    private SpellType getSpell(String spell) {
        if(spell.equals("heal"))
            return SpellType.valueOf("HEAL");
        if(spell.equals("fireball"))
            return SpellType.valueOf("FIREBALL");
        if(spell.equals("shitStorm"))
            return SpellType.valueOf("SHIT_STORM");
        if(spell.equals("lightingStrike"))
            return SpellType.valueOf("LIGHTING_STRIKE");
        return null;
    }


    private boolean knownSpells(SpellType spell) {
        SpellType[] knownSpell = this.wizardType.getSpellTypes();
        for (SpellType value : knownSpell) {
            if (value == spell)
                return true;
        }
        return false;
    }
    private void hpCheck(SpellType spell, Wizard enemyWizard) {
        enemyWizard.hp -= spell.getDamage();
        if (enemyWizard.hp > 200)
            enemyWizard.hp = 200;
        if(enemyWizard.hp < 0)
            enemyWizard.hp = 0;
        System.out.println(enemyWizard.hp);

    }

}
