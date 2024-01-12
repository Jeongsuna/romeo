#define C(x, y) # x ## y // Non-compliant
#define D(x, y, z, yz) x ## y ## z // Non-compliant

int main()
{
	return 0;
}