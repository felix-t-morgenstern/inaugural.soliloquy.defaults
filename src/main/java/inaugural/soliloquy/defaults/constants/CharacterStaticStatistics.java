package inaugural.soliloquy.defaults.constants;

public class CharacterStaticStatistics {
    /**
     * The higher a Character's Impulse, the likelier they are to have their turn sooner each round.
     */
    public final static String CapacityImpulse = capacity("Impulse");

    /**
     * The higher a Character's Alacrity, the likelier they are to have additional AP each round.
     */
    public final static String CapacityAlacrity = capacity("Alacrity");

    /**
     * The higher a Character's Evasion, the likelier they are to avoid incoming attacks or
     * Abilities.
     */
    public final static String CapacityEvasion = capacity("Evasion");

    /**
     * The higher a Character's Melee Accuracy, the likelier they are to successfully hit a target
     * in melee.
     */
    public final static String CapacityMeleeAccuracy = capacity("MeleeAccuracy");

    /**
     * The higher a Character's Melee Impact, the more damage they will do to a target in melee.
     */
    public final static String CapacityMeleeImpact = capacity("MeleeImpact");

    /**
     * The higher a Character's Melee Pierce, the more they will bypass a target's Physical Guard in
     * melee.
     */
    public final static String CapacityMeleePierce = capacity("MeleePierce");

    /**
     * The higher a Character's Melee Incisiveness, the likelier they are to make a Devastating Hit
     * when they hit a target in melee.
     */
    public final static String CapacityMeleeIncisiveness = capacity("MeleeIncisiveness");

    /**
     * The higher a Character's Ranged Accuracy, the likelier they are to successfully hit a target
     * with a ranged weapon.
     */
    public final static String CapacityRangedAccuracy = capacity("RangedAccuracy");

    /**
     * The higher a Character's Ranged Impact, the more damage they will do to a target with a
     * ranged weapon.
     */
    public final static String CapacityRangedImpact = capacity("RangedImpact");

    /**
     * The higher a Character's Ranged Pierce, the more they will bypass a target's Physical Guard
     * with a ranged weapon.
     */
    public final static String CapacityRangedPierce = capacity("RangedPierce");

    /**
     * The higher a Character's Ranged Incisiveness, the likelier they are to make a Devastating Hit
     * when they hit a target with a ranged weapon.
     */
    public final static String CapacityRangedIncisiveness = capacity("RangedIncisiveness");

    /**
     * The higher a Character's Handling, the likelier they are to successfully hit a target with an
     * elemental Ability.
     */
    public final static String CapacityElementalHandling = capacity("ElementalHandling");

    /**
     * The higher a Character's Potency, the more damage they will do to a target with an elemental
     * Ability.
     */
    public final static String CapacityElementalPotency = capacity("ElementalPotency");

    /**
     * The higher a Character's Bypass, the more they will bypass a target's Physical Guard with an
     * elemental Ability.
     */
    public final static String CapacityElementalBypass = capacity("ElementalBypass");

    /**
     * The higher a Character's Inspiration, the likelier they are to make a Devastating Hit when
     * they hit a target with an elemental Ability.
     */
    public final static String CapacityElementalInspiration = capacity("ElementalInspiration");

    private static String capacity(String name) {
        return String.format("capacity%s", name);
    }

    /**
     * The chance a Character has to evade an incoming melee Ability (e.g. "Attack")
     */
    public final static String DerivedMeleeEvasion = derived("MeleeEvasion");

    /**
     * The chance a Character has to evade an incoming ranged Ability (e.g. "Attack")
     */
    public final static String DerivedRangedEvasion = derived("RangedEvasion");

    /**
     * The chance a Character has to evade an incoming magic Ability (e.g. "Fireball")
     */
    public final static String DerivedMagicEvasion = derived("MagicEvasion");

    /**
     * The chance a Character has to hit their target in melee
     */
    public final static String DerivedMeleeAccuracy = derived("MeleeAccuracy");

    /**
     * The degree to which a Character's damage is increased in melee
     */
    public final static String DerivedMeleeImpact = derived("MeleeImpact");

    /**
     * The degree to which a Character's damage in melee bypasses the target's Physical Guard
     */
    public final static String DerivedMeleePierce = derived("MeleePierce");

    /**
     * The chance a Character has to make a successful hit into a Devastating Hit in melee
     */
    public final static String DerivedMeleeIncisiveness = derived("MeleeIncisiveness");

    /**
     * The chance a Character has to hit their target with a ranged weapon
     */
    public final static String DerivedRangedAccuracy = derived("RangedAccuracy");

    /**
     * The degree to which a Character's damage is increased with a ranged weapon
     */
    public final static String DerivedRangedImpact = derived("RangedImpact");

    /**
     * The degree to which a Character's damage with a ranged weapon bypasses the target's Physical
     * Guard
     */
    public final static String DerivedRangedPierce = derived("RangedPierce");

    /**
     * The chance a Character has to make a successful hit into a Devastating Hit with a ranged
     * weapon
     */
    public final static String DerivedRangedIncisiveness = derived("RangedIncisiveness");

    /**
     * The chance a Character has to hit their target with an elemental Ability
     */
    public final static String DerivedHandling = derived("Handling");

    /**
     * The degree to which a Character's damage is increased with an elemental Ability
     */
    public final static String DerivedPotency = derived("Potency");

    /**
     * The degree to which a Character's damage with an elemental Ability bypasses the target's
     * Physical Guard
     */
    public final static String DerivedBypass = derived("Bypass");

    /**
     * The chance a Character has to make a successful hit into a Devastating Hit with an elemental
     * Ability
     */
    public final static String DerivedInspiration = derived("Inspiration");

    /**
     * The percentage of incoming physical damage blocked, or the percentage chance of a physical
     * status effect to fail or be reduced
     */
    public final static String DerivedPhysicalGuard = derived("PhysicalGuard");

    /**
     * The percentage of incoming elemental damage blocked, or the percentage chance of an elemental
     * status effect to fail or be reduced
     */
    public final static String DerivedElementalBarrier = derived("ElementalBarrier");

    /**
     * The percentage of incoming Ignis damage blocked, or the percentage chance of Ignis status
     * effects to fail or be reduced
     */
    public final static String DerivedIgnisBarrier = derived("IgnisBarrier");

    /**
     * The percentage of incoming Metallum damage blocked, or the percentage chance of Metallum
     * status effects to fail or be reduced
     */
    public final static String DerivedMetallumBarrier = derived("MetallumBarrier");

    /**
     * The percentage of incoming Terra damage blocked, or the percentage chance of Terra status
     * effects to fail or be reduced
     */
    public final static String DerivedTerraBarrier = derived("TerraBarrier");

    /**
     * The percentage of incoming Crystallos damage blocked, or the percentage chance of Crystallos
     * status effects to fail or be reduced
     */
    public final static String DerivedCrystallosBarrier = derived("CrystallosBarrier");

    /**
     * The percentage of incoming Aqua damage blocked, or the percentage chance of Aqua status
     * effects to fail or be reduced
     */
    public final static String DerivedAquaBarrier = derived("AquaBarrier");

    /**
     * The percentage of incoming Flora damage blocked, or the percentage chance of Flora status
     * effects to fail or be reduced
     */
    public final static String DerivedFloraBarrier = derived("FloraBarrier");

    /**
     * The percentage of incoming Aero damage blocked, or the percentage chance of Aero status
     * effects to fail or be reduced
     */
    public final static String DerivedAeroBarrier = derived("AeroBarrier");

    /**
     * The percentage of incoming Electrica damage blocked, or the percentage chance of Electrica
     * status effects to fail or be reduced
     */
    public final static String DerivedElectricaBarrier = derived("ElectricaBarrier");

    /**
     * The percentage of incoming Aether damage blocked, or the percentage chance of Aether status
     * effects to fail or be reduced
     */
    public final static String DerivedAetherBarrier = derived("AetherBarrier");

    /**
     * The Accuracy a Character has when determining to-hit chance when wielding a spear
     */
    public final static String DerivedSpearAccuracy = derived("SpearAccuracy");

    /**
     * The Impact a Character has when determining damage when wielding a spear
     */
    public final static String DerivedSpearImpact = derived("SpearImpact");

    /**
     * The Pierce a Character has when determining damage when wielding a spear
     */
    public final static String DerivedSpearPierce = derived("SpearPierce");

    /**
     * The Incisiveness a Character has when determining damage when wielding a spear
     */
    public final static String DerivedSpearIncisiveness = derived("SpearIncisiveness");

    private static String derived(String name) {
        return String.format("derived%s", name);
    }
}
