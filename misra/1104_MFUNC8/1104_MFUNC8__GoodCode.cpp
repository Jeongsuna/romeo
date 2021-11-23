#include <cstdint>

int16_t glob = 0;

void proc(int16_t para)
{
	glob = para;     /* Compliant - Use of parameter value */
}

void f(char* p, char* q)
{
	*p = *q;          /* Compliant */
}

int main()
{
	return 0;
}