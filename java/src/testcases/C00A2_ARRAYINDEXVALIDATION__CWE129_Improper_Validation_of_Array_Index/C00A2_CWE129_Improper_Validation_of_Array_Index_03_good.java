package testcases.C00A2_ARRAYINDEXVALIDATION__CWE129_Improper_Validation_of_Array_Index;

public class C00A2_CWE129_Improper_Validation_of_Array_Index_03_good {
    int[] arrays;
    StringBuffer listArrays;

    private void goodCase() {
        for (int i = 0; i < arrays.length; i++) {
            if (i != DirectConstant.INT_10) {
                listArrays.append(arrays[i]);
            }
        }
    }

    public static class DirectConstant {
        static int INT_10 = 10;
    }
}