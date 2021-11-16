// #include <cstdint> �߰�
// main() �߰�
// file1.c�� file2.c ���� �и�(�� ���Ͽ��� �и��ϴ� �͵� ������ ���� �� ����)

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