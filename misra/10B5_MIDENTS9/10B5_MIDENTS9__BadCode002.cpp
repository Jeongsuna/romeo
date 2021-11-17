// #include <cstdint> 추가
// main() 추가
// file1.c와 file2.c 파일 분리(한 파일에서 분리하는 것도 나쁘지 않을 것 같음)

#include <cstdint>

/* file2.c */
static int8_t count; /* Non-compliant - ""count"" has internal
* linkage but clashes with other
* identifiers of the same name */
static void foo(void) /* Non-compliant - ""foo"" has internal
* linkage but clashes with a function of
* the same name */
{
	int32_t index; /* Compliant - both ""index"" and ""nbytes"" */
	int16_t nbytes; /* are not unique but have no linkage */
}
void bar2(void)
{
	static uint8_t nbytes; /* Compliant - ""nbytes"" is not unique but
	* has no linkage and the storage class is
	* irrelevant */
}
/* End of file2.c */

int main2()
{

	return 0;
}