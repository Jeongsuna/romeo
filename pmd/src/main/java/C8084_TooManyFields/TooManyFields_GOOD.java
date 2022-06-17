package C8084_TooManyFields;

import java.util.Date;

public class TooManyFields_GOOD {
    public class Person {   // this is more manageable
        Date birthDate;
        BodyMeasurements measurements;
    }

    private class BodyMeasurements {
    }
}
