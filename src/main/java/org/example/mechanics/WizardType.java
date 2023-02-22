package org.example.mechanics;

public enum WizardType {
    WIZARD_OF_FIRE("Mag ognia", new SpellType[]{SpellType.HEAL, SpellType.FIREBALL, SpellType.SHIT_STORM}),
    WIZARD_OF_WIND("Mag wiatru", new SpellType[]{SpellType.HEAL, SpellType.LIGHTING_STRIKE, SpellType.SHIT_STORM});
    private String description;
    private SpellType [] spellTypes;

    WizardType(String description, SpellType[] spellTypes) {
        this.description = description;
        this.spellTypes = spellTypes;
    }


    public SpellType[] getSpellTypes() {
        return spellTypes;
    }
}
