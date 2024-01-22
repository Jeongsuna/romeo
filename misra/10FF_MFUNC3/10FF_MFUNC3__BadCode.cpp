extern double power_10ff_1(double d, int n) { return 1; };

void func1(void)
{
	/* Non-compliant - return type and both argument types incorrect */
	double sql = power_10ff_1(1, 2.0);
}

int main()
{
	return 0;
}