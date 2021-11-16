#include <cstdint>
int16_t unusedtype(void)
{
	typedef int16_t local_Type; /* Non-compliant */
	return 67;
}
int main() {
	unusedtype();
	return 0;
}