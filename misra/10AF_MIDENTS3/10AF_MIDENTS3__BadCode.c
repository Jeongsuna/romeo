// #include <arm64_neon.h> 추가
// main() 추가
// 10AF_MIDENTS3_extern.c 추가

#include <arm64_neon.h>

void fn1(void)
{
	int16_t i; /* Declare an object ""i"" */
	{
		int16_t i; /* Non-compliant - hides previous ""i"" */
		i = 3; /* Could be confusing as to which ""i"" this refers */
	}
}
struct astruct
{
	int16_t m;
};
extern void g(struct astruct* p);
int16_t xyz = 0; /* Declare an object ""xyz""*/
void fn2(struct astruct xyz) /* Non-compliant - outer ""xyz"" is
* now hidden by parameter name */
{
	g(&xyz);
}
uint16_t speed;
void fn3(void)
{
	typedef float32_t speed; /* Non-compliant - type hides object */
}
int main()
{
	return 0;
}