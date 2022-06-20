package C8110_UnnecessaryWrapperObjectCre;

public class UnnecessaryWrapperObjectCreation_BAD {
    public int convert(String s) {
        int i, i2;

        i = Integer.valueOf(s).intValue();
        i2 = Integer.valueOf(i).intValue();
        String s3 = Integer.valueOf(i2).toString();

        return i2;
    }
}
