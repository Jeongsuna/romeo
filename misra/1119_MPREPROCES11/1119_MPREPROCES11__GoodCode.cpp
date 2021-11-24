#define A ( x )     #x      /* Compliant */
#define B ( x, y )  x ## y  /* Compliant */

int main()
{
	return 0;
}