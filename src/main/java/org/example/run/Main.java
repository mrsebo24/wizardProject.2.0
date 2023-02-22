package org.example.run;

import org.example.mechanics.SpellType;
import org.example.mechanics.Wizard;
import org.example.mechanics.WizardType;

public class Main {
    public static void main(String[] args) {
        SpellType [] spellTypes = SpellType.values();

        String heal = SpellType.HEAL.name();
        String fireball = SpellType.FIREBALL.name();
        String lightingStrike = SpellType.LIGHTING_STRIKE.name();
        String shitStorm = SpellType.SHIT_STORM.name();

        Wizard gandalf = new Wizard("gandalf", 345454, WizardType.WIZARD_OF_FIRE);
        Wizard saruman = new Wizard("saruman", 3534545, WizardType.WIZARD_OF_WIND);

        gandalf.throwSpell(fireball, saruman);
        gandalf.throwSpell(heal, saruman);
        gandalf.throwSpell(fireball, saruman);
        gandalf.throwSpell(fireball, saruman);
        gandalf.throwSpell(fireball,saruman);
        gandalf.throwSpell(heal, saruman);
        gandalf.throwSpell(heal, gandalf);
        gandalf.throwSpell(shitStorm, saruman);



    }
}