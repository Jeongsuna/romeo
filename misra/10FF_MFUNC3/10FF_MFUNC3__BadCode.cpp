extern double power2(double d, int n) { return 1; };

void func2(void)
{
	/* Non-compliant - return type and both argument types incorrect */
	double sql = power2(1, 2.0);
}

int fake_main()
{
	return 0;
}