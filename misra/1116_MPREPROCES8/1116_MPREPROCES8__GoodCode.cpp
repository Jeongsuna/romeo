#define FALSE 0
#define TRUE 1

#if FALSE       /* Compliant */
#endif

#if ! defined ( X )     /* Compliant */
#endif

#if A > B               /* Compliant assuming A and B are numeric */
#endif

int main()
{
	return 0;
}