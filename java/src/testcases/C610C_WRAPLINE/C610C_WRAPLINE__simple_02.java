package testcases.C610C_WRAPLINE;

public class C610C_WRAPLINE__simple_02 {

    public void foo(long bar1, long bar2, long bar3, long bar4, long bar5){}

    public void bad1(int expression1, int expression2, int expression3,
                     int expression4, int expression5){
        long longExpression1 = 0;
        long longExpression2 = 0;
        long longExpression3 = 0;
        long longExpression4 = 0;
        long longExpression5 = 0;

        /* Non-compliant */
        int total = expression1 * (expression2 + expression3
                - expression4) + 2 * expression5;

        /* Non-compliant - Argument */
        foo(longExpression1, longExpression2, longExpression3
                , longExpression4, longExpression5);
    }

    public void good(int expression1, int expression2, int expression3,
                     int expression4, int expression5){

        long longExpression1 = 0;
        long longExpression2 = 0;
        long longExpression3 = 0;
        long longExpression4 = 0;
        long longExpression5 = 0;

        /* Compliant */
        int total = expression1 * (expression2 + expression3 - expression4)
                + 2 * expression5;

        /* Compliant - Argument */
        foo(longExpression1, longExpression2, longExpression3,
                longExpression4, longExpression5);
    }
}
