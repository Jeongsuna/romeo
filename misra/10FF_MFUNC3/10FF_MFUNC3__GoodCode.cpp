extern double power_10ff_2(double d, int n);

void func2(void)
{
    /* Now compliant - function is declared before use */
    double sql = power_10ff_2(1.0, 2);
}

int fake_main()
{
    return 0;
}
