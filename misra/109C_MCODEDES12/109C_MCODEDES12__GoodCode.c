#include <stdlib.h>
void f2(void)
{
    char* p = (char*)malloc(20);
    free(p);
    p = NULL;  /* Compliant */ /* Assigning NULL to freed pointer makes it determinate */
}

int main()
{
	f();
    return 0;
}
