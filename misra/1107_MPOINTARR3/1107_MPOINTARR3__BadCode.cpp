#include <cstdint>

void f1_2(void)
{
	int32_t a1[10];
	int32_t a2[10];
	int32_t* p1 = a1;

	if (p1 < a1)      /* Compliant */
	{
	}

	if (p1 < a2)      /* Non-compilant */
	{
	}
}

struct limits
{
	int32_t lwb;
	int32_t upb;
};

void f2_2(void)
{
	struct limits limits_1 = { 2, 5 };
	struct limits limits_2 = { 10, 5 };

	if (&limits_1.lwb <= &limits_1.upb) /* Compliant */
	{
	}
	if (&limits_1.lwb > &limits_2.upb)            /* Non-compliant */
	{
	}
}
int fake_main() {
	f1_2();
	f2_2();
	return 0;
}