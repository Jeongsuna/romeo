// #include <cstdint> �߰�
// main() �߰�

#include <cstdint>
static int32_t x = 0; /* definition: internal linkage */
static int32_t f(void); /* declaration: internal linkage */
static int32_t g(void); /* declaration: internal linkage */

int fake_main()
{
	return 0;
}