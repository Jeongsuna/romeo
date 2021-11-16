#include <cstdint>
uint32_t zext(uint16_t s)
{
	struct /* Compliant */
	{
		int32_t ul = 0;
		int16_t us = 0;
	}tmp;

	tmp.us = s;
	return tmp.ul;
}
int main() {
	zext(1);
	return 0;
}