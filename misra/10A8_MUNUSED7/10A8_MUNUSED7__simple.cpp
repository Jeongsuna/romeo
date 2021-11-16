#include <cstdint>
/* badcode */
void withunusedpara(uint16_t* para1,
	int16_t unusedpara) /* Non-compliant - unused */
{
	*para1 = 42U;
}
/* goodcode */
void withusedpara(uint16_t* para1,
	int16_t para2) /* Compliant - All used */
{
	int16_t value = para2;
	*para1 = 42U;
}
int main() {
	withunusedpara(0, 1);
	withusedpara(0, 1);

	return 0;
}