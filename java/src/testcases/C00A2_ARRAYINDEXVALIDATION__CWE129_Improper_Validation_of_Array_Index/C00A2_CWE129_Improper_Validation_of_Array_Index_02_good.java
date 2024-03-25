package testcases.C00A2_ARRAYINDEXVALIDATION__CWE129_Improper_Validation_of_Array_Index;

public class C00A2_CWE129_Improper_Validation_of_Array_Index_02_good {
    String[] goodArray;
    String goodCnt;

    public boolean isValidIndex(String[] array, int index) {
        return index >= 0 && index < array.length;
    }

    private String goodCase(int index) {
        if (isValidIndex(goodArray, index)) {
            goodCnt = goodArray[index];
        }
        return goodCnt;
    }

}