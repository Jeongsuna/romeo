// #include <arm64_neon.h> �߰�
// main() �߰�
// 10AF_MIDENTS3_extern.c �߰�

#include <arm64_neon.h>

void fn1(void)
{
	int i; /* Declare an object ""i"" */
	{
		int i; /* Non-compliant - hides previous ""i"" */
		i = 3; /* Could be confusing as to which ""i"" this refers */
	}
}
struct astruct
{
	int m;
};
extern void g(struct astruct* p);
int xyz = 0; /* Declare an object ""xyz""*/
void fn2(struct astruct xyz) /* Non-compliant - outer ""xyz"" is
* now hidden by parameter name */
{
	g(&xyz);
}
int speed;
void fn3(void)
{
	typedef float speed; /* Non-compliant - type hides object */
}
int main()
{
	return 0;
}