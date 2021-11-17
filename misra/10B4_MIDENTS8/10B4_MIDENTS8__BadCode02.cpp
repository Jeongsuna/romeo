/* file2.c */
#include <cstdint>
static void foo(void) /* Non-compliant - "foo" is not unique
* (it is already defined with external
* linkage in file1.c) */
{
	int16_t count; /* Non-compliant - "count" has no linkage
	* but clashes with an identifier with
	* external linkage */
	int32_t index; /* Compliant - "index" has no linkage */
}
int fake_main() {
	foo();
	return 0;
}