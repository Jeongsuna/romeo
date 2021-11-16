// #include <cstdint> 추가
// main() 추가
// file1.c와 file2.c 파일 분리(한 파일에서 분리하는 것도 나쁘지 않을 것 같음)

#include <cstdint>
/* file1.c */
static int32_t count; /* ""count"" has internal linkage */
static void foo(void) /* ""foo"" has internal linkage */
{
	int16_t count;/* Non-compliant - ""count"" has no linkage
	* but clashes with an identifier with
	* internal linkage */
	int16_t index; /* ""index"" has no linkage */
}
void bar1(void)
{
	static int16_t count; /* Non-compliant - ""count"" has no linkage
	* but clashes with an identifier with
	* internal linkage */
	int16_t index; /* Compliant - ""index"" is not unique but
	* has no linkage */
	foo();
}
/* End of file1.c */
int main()
{

	return 0;
}