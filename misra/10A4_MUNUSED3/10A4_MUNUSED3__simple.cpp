#include <cstdint>
/* badcode */
int16_t unusedtype2(void)
{
	typedef int16_t local_Type; /* Non-compliant */
	return 67;
}
/* goodcode */
int16_t usedtype(void)
{
	typedef int16_t local_Type; /* Compliant */
	local_Type num = 5;
	return num;
}
int fake_main() {
	unusedtype2();
	usedtype();
	return 0;
}