#include <stdlib.h>
/* badcode */
void f_badcode(void)
{
	char* p = (char*)malloc(10);
	char* q;
	free(p);
	q = p; /* Undefined behaviour - value of p is indeterminate */
}
/* goodcode */
void f_goodcode(void)
{
	char* p = (char*)malloc(10);
	char* q;
	free(p);
	p = NULL; /* Assigning NULL to freed pointer makes it determinate */
}
int main() {
	f_badcode();
	f_goodcode();
	return 0;
}