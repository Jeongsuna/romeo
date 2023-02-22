package C906C_HARDSTATEMENT__HardCodingStatement;

public class C906C_HARDSTATEMENT_HardCodingStatement_good {
    static final String ETC_CODE = "기타하드코딩";

    private void goodMethod(String param) {

        if(ETC_CODE.equals(param)){// @fixed
            //...
        }
    }
}
