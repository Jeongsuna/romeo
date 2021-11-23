#include <cstdint>

int16_t glob2 = 0;

void proc2(int16_t para)
{
	para = glob2;      /* Non-compliant */
}

void f2(char* p, char* q)
{
	p = q;            /* Non-compliant */
}

int fake_main()
{
	return 0;
}