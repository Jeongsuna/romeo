#include <stdlib.h>
#include <cstdint>

void fn(void)
{
	int32_t a;
}

void g(void)
{
	char* p = (char*)malloc(512);
	char* q = p;

	/* Compliant - You should free only once as p and q are same block of memory. */
	free(p);
	//free ( q );

}

int main()
{
	return 0;
}