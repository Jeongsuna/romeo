/* badcode */
void use_macro_badcode(void)
{
#define SIZE 4
#define DATA 3 /* Non-compliant - DATA not used */
	volatile int use_int16(SIZE);
}
/* goodcode */
#include <cstdint>
void use_macro_goodcode(void)
{
#define SIZE 4
#define DATA 3 
	volatile int use_int16(SIZE);
	int16_t value = DATA;
}
int main() {
	use_macro_badcode();
	use_macro_goodcode();
	return 0;
}