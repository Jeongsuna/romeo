package C9026_CALLCOLLECTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CALLCOLLECTION_GOOD {
    public static void main(String[] args) {
        String foo = "42";
        Map<Integer, Object> map = new HashMap<>();
        if(map.remove(foo) == null){
            int intfoo = Integer.parseInt(foo);
            map.remove(intfoo);
        }
        // ...
        List<String> list = new ArrayList<String>();
        Integer i = Integer.valueOf(1);
        if (list.contains(i)) { // Compliant
            list.remove(i); // Compliant
        }else{
            if(i.getClass().getName() != "java.lang.String"){
                String strfoo = Integer.toString(i);
                if (list.contains(strfoo)) { // Compliant
                    list.remove(strfoo); // Compliant
                }
            }
        }
    }
}
