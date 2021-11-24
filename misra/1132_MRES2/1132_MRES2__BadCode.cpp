#include <stdlib.h>
#include <cstdint>

void fn2(void)
{
	int32_t a;

	/* Non-compliant - a does not point to allocated storage */
	free(&a);
}

void g2(void)
{
	char* p = (char*)malloc(512);
	char* q = p;

	free(p);

	/* Non-compliant - allocated block freed a second time */
	free(q);

	/* Non- compliant - aloocated block may be freed a third time */
	p = (char*)realloc(p, 1024);
}

int fake_main()
{
	return 0;
}