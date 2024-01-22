extern double power_10ff_2(double d, int n) { return 1; };

void func2(void)
{
    /* Now compliant - function is declared before use */
    double sql = power_10ff_2((double)1, (int)2.0);
}

int main()
{
    return 0;
}
