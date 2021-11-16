/* file2.c */
#include <cstdint>
static void foo2(void) 
{
    int32_t index; /* Compliant - both "index" and "nbytes" */
    int16_t nbytes; /* are not unique but have no linkage */
}
void bar2(void)
{
    static uint8_t nbytes; /* Compliant - "nbytes" is not unique but
                            * has no linkage and the storage class is
                            * irrelevant */
}
int main()
{
	return 0;
}
/* End of file2.c */