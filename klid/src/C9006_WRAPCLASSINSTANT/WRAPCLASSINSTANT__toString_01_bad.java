package C9006_WRAPCLASSINSTANT;

public class WRAPCLASSINSTANT__toString_01_bad {
    public static void bad(int myInteger, boolean myBoolean, byte myByte, char myCharacter, double myDouble,
                           float myFloat, long myLong, short myShort, String myString) {
        new Integer(myInteger).toString();      // Noncompliant
        new Boolean(myBoolean).toString();      // Noncompliant
        new Byte(myByte).toString();            // Noncompliant
        new Character(myCharacter).toString();  // Noncompliant
        new Double(myDouble).toString();        // Noncompliant
        new Float(myFloat).toString();          // Noncompliant
        new Long(myLong).toString();            // Noncompliant
        new Short(myShort).toString();          // Noncompliant
        new String(myString).toString();        // Noncompliant
    }
}

