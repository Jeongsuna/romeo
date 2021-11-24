
int fake_main()
{
    int x = 0, y = 0;
    int a = 1, b = 2;
    sizeof x + y; /* Non-compliant - write either sizeof ( x ) + y
                   * or sizeof ( x + y ) */
                   /* Non-compliant
                    * Operands of conditional operator (precedence 2) are:
                    *  == precedence 8 needs parentheses
                    *  a  precedence 16 does not need parentheses
                    *  -  precedence 11 needs parentheses
                    */
    x = a == b ? a : a - b;

    return 0;
}   