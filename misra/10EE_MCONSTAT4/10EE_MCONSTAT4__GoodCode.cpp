#include <cstdint>
#define bool_t bool

int main()
{
	int32_t* q = NULL;

	while (q != NULL)   /* Compliant */
	{
	}

	while (true)        /* Compliant */
	{
	}

	//extern bool_t flag;
	//while (flag)        /* Compliant */
	//{
	//}

	int32_t i = 1;
	if (i != 0)         /* Compliant */
	{
	}
	
	return 0;
}