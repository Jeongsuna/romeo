package C8110_UnnecessaryWrapperObjectCre;

public class UnnecessaryWrapperObjectCreation_GOOD {
    public int convert(String s) {
        int i, i2;

        i = Integer.parseInt(s);
        i2 = i;
        String s3 = Integer.toString(i2);

        return i2;
    }
}
