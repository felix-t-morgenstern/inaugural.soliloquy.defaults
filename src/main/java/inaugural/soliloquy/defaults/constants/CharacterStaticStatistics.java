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

    private static String capacity(String name) {
        return String.format("capacity%s",name);
    }
}
