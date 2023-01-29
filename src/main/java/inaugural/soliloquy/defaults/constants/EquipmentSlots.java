package inaugural.soliloquy.defaults.constants;

public class EquipmentSlots {
    public final static String Head = slot("Head");
    public final static String Armor = slot("Armor");
    public final static String MainHand = slot("MainHand");
    public final static String OffHand = slot("OffHand");
    public final static String Vambraces = slot("Vambraces");
    public final static String Gloves = slot("Gloves");
    public final static String Greaves = slot("Greaves");
    public final static String Boots = slot("Boots");
    public final static String Neck = slot("Neck");
    public final static String MainHandRing = slot("MainHandRing");
    public final static String OffHandRing = slot("OffHandRing");

    private static String slot(String type) {
        return String.format("equipmentType%s" , type);
    }
}
