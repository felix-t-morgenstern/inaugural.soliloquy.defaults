package inaugural.soliloquy.defaults.constants;

public class ItemData {
    // TODO: Modifications regarding Capacities

    /**
     * The percentage by which this weapon's to-hit chance is increased (positive) or decreased
     * (negative)
     * <p>
     * Type: int
     */
    public final static String ItemToHitModification = value("ToHitModification");

    /**
     * The number of dice to role to determine the base damage of this weapon
     * <p>
     * Type: int
     */
    public final static String ItemBaseNumberOfDice = value("BaseNumberOfDice");

    /**
     * The number of sides on the dice to role to determine the base damage of this weapon
     * <p>
     * Type: int
     */
    public final static String ItemBaseDiceSides = value("BaseDiceSides");

    /**
     * The number of dice to role to determine the damage of this weapon which comes from a
     * Character's derived Impact for a given weapon type (e.g.
     * {@link CharacterStaticStatistics#DerivedSpearImpact})
     * <p>
     * Type: int
     */
    public final static String ItemImpactNumberOfDice = value("ImpactNumberOfDice");

    /**
     * The number of sides on the dice to role to determine the damage of this weapon which comes
     * from a Character's derived Impact for a given weapon type (e.g.
     * {@link CharacterStaticStatistics#DerivedSpearImpact})
     * <p>
     * Type: int
     */
    public final static String ItemImpactDiceSides = value("ImpactDiceSides");

    /**
     * The percentage by which this weapon's ability to bypass
     * {@link CharacterStaticStatistics#DerivedPhysicalGuard} is increased (positive) or decreased
     * (negative)
     * <p>
     * Type: int
     */
    public final static String ItemPierceModification = value("PierceModification");

    /**
     * The percentage by which this weapon's ability to score a Devastating Hit is increased
     * (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemIncisivenessModification = value("IncisivenessModification");

    /**
     * The amount by which the AP cost of attacking with this weapon is increased (positive) or
     * decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemAttackApCostModification = value("AttackApCostModification");

    /**
     * Returns true, if and only if this item is a ranged weapon
     * <p>
     * Type: bool
     */
    public final static String ItemIsRanged = value("IsRanged");

    /**
     * The number of spaces away from the equipping Character at which this weapon can make an
     * attack
     * <p>
     * Type: int
     */
    public final static String ItemAttackRange = value("AttackRange");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade a melee weapon attack
     * <p>
     * Type: int
     */
    public final static String ItemMeleeWeaponEvasionModification = value(
            "MeleeWeaponEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade a missile weapon attack
     * <p>
     * Type: int
     */
    public final static String ItemMissileWeaponEvasionModification = value(
            "MissileWeaponEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any elemental Ability
     * <p>
     * Type: int
     */
    public final static String ItemElementalEvasionModification = value(
            "ElementalEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any Ignis Ability
     * <p>
     * Type: int
     */
    public final static String ItemIgnisEvasionModification = value("IgnisEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any Metallum Ability
     * <p>
     * Type: int
     */
    public final static String ItemMetallumEvasionModification = value(
            "MetallumEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any Terra Ability
     * <p>
     * Type: int
     */
    public final static String ItemTerraEvasionModification = value("TerraEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any Crystallos Ability
     * <p>
     * Type: int
     */
    public final static String ItemCrystallosEvasionModification = value(
            "CrystallosEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any Aqua Ability
     * <p>
     * Type: int
     */
    public final static String ItemAquaEvasionModification = value("AquaEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any Flora Ability
     * <p>
     * Type: int
     */
    public final static String ItemFloraEvasionModification = value("FloraEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any Aero Ability
     * <p>
     * Type: int
     */
    public final static String ItemAeroEvasionModification = value("AeroEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any Electrica Ability
     * <p>
     * Type: int
     */
    public final static String ItemElectricaEvasionModification = value(
            "ElectricaEvasionModification");

    /**
     * The percentage by which the equipping Character is more likely (positive) or less likely
     * (negative) to evade any Aether Ability
     * <p>
     * Type: int
     */
    public final static String ItemAetherEvasionModification = value("AetherEvasionModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedPhysicalGuard} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemPhysicalGuardModification = value("PhysicalGuardModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedElementalBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemElementalBarrierModification = value("ElementalBarrierModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedIgnisBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemIgnisBarrierModification = value("IgnisBarrierModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedMetallumBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemMetallumBarrierModification = value("MetallumBarrierModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedTerraBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemTerraBarrierModification = value("TerraBarrierModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedCrystallosBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemCrystallosBarrierModification = value("CrystallosBarrierModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedAquaBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemAquaBarrierModification = value("AquaBarrierModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedFloraBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemFloraBarrierModification = value("FloraBarrierModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedAeroBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemAeroBarrierModification = value("AeroBarrierModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedElectricaBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemElectricaBarrierModification = value("ElectricaBarrierModification");

    /**
     * The amount by which the equipping Character's {@link CharacterStaticStatistics#DerivedAetherBarrier} is increased (positive) or decreased (negative)
     * <p>
     * Type: int
     */
    public final static String ItemAetherBarrierModification = value("AetherBarrierModification");

    private static String value(String name) {
        return String.format("itemData%s", name);
    }
}
