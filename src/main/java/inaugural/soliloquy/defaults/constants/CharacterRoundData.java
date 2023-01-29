package inaugural.soliloquy.defaults.constants;

public class CharacterRoundData {
    /**
     * The effective Impulse calculated by
     * {@link soliloquy.specs.ruleset.gameconcepts.ActiveCharactersProvider} for the
     * Character in question at the start of the round
     * <p>
     * Type: int
     */
    public final static String RoundDataCombatOrder = field("CombatOrder");

    /**
     * The AP a {@link soliloquy.specs.gamestate.entities.Character} has in the current round
     * <p>
     * Type: int
     */
    public final static String RoundDataAp = field("Ap");

    private static String field(String name) {
        return String.format("roundData%s", name);
    }
}
