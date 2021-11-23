

int f()
{
    return 1;
}

int fake_main()
{

    int x = 2, y = 1;
    bool bool_var;
    int a[] = {1,2,3,4,5};
    int b = 1, c = 2;

    a[x] = a[x = y];      /* Non-compliant - the value of x = y
                                * is used */

                                /*
                                 * Non-compliant - value of bool_var = false is used but
                                 * bool_var == false was probably intended
                                 */
    if (bool_var = false)
    {
    }

    /* Non-compliant even though bool_var = true isn't evaluated */
    if ((0u == 0u) || (bool_var = true))
    {
    }

    /* Non-compliant - value of x = f() is used */
    if ((x = f()) != 0)
    {
    }

    /* Non-compliant - value of b += c is used */
    a[b += c] = a[b];

    /* Non-compliant - value of c = 0 and b = c = 0 are used */
//    a = b = c = 0;

    return 0;
}