// include <cstdint> 추가
// main() 추가

#include <cstdint>
extern int32_t x; /* Non-compliant */
int32_t f(void) /* Non-compliant */
{
	return 1;
}
extern int32_t g(void) /* Non-compliant */
{
	return 1;
}

int main()
{
	return 0;
}