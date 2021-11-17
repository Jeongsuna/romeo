// #include <cstdint> 추가
// main() 추가

#include <cstdint>
static int32_t x = 0; /* definition: internal linkage */
static int32_t f(void); /* declaration: internal linkage */
static int32_t g(void); /* declaration: internal linkage */

int fake_main()
{
	return 0;
}