double power(double d, int n) { return 1; };

void func(void)
{
	/* Compliant */
	double sql = power(1.0, 2);
}

int main()
{
	return 0;
}