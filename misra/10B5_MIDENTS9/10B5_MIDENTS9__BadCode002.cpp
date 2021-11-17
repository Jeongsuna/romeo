// #include <cstdint> �߰�
// main() �߰�
// file1.c�� file2.c ���� �и�(�� ���Ͽ��� �и��ϴ� �͵� ������ ���� �� ����)

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