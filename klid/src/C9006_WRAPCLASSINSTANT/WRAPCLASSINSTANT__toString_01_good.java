package C9006_WRAPCLASSINSTANT;

public class WRAPCLASSINSTANT__toString_01_good {
    public static void good(int myInteger, boolean myBoolean, byte myByte, char myCharacter, double myDouble,
                            float myFloat, long myLong, short myShort, String myString) {
        Integer.toString(myInteger);      // Compliant
        Boolean.toString(myBoolean);      // Compliant
        Byte.toString(myByte);            // Compliant
        Character.toString(myCharacter);  // Compliant
        Double.toString(myDouble);        // Compliant
        Float.toString(myFloat);          // Compliant
        Long.toString(myLong);            // Compliant
        Short.toString(myShort);          // Compliant
    }
}
