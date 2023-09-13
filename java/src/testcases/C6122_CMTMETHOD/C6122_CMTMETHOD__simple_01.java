package testcases.C6122_CMTMETHOD;

public class C6122_CMTMETHOD__simple_01 {
    public String bad(){
        return "Hello world!";
    } /* Non-compliant - Method Comment Below */

    /**
     * Compliant
     * <p>
     * Method Description
     *
     * @param
     * @return
     * @throws
     */
    public String good(){
        return "Hello world!";
    }
}
