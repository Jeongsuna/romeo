#include <cstdint>
#include <string.h>
uint16_t f(uint16_t* p)
{
	return *p;
}
void h(const uint16_t* p)
{
	unsigned short i = 0;
	p = &i;
}
char last_char(char* const s)
{
	return s[strlen(s) - 1u];
}
uint16_t first(uint16_t a[5])
{
	return a[0];
}
int main() {
	f(0);
	h(0);
	last_char((char*)"hello");
	first(0);
	return 0;
}