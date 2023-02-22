package C906C_HARDSTATEMENT__HardCodingStatement;

public class C906C_HARDSTATEMENT_HardCodingStatement_bad {

    private void badMethod(String param) {

        if("기타하드코딩".equals(param)){// @violation
            //...
        }
    }
}
