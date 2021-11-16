#include <cstdint>

void f1(void)
{
	int32_t a1[10];
	int32_t* p1 = a1;

	if (p1 < a1)      /* Compliant */
	{
	}
}

struct limits
{
	int32_t lwb;
	int32_t upb;
};

void f2(void)
{
	struct limits limits_1 = { 2, 5 };
	if (&limits_1.lwb <= &limits_1.upb) /* Compliant */
	{
	}
}

int main() {
	f1();
	f2();
	return 0;
}