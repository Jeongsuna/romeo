#include <cstdint>

void func(void)
{
	{
		typedef unsigned char u8_t;
	}
	{
		typedef unsigned char u8_t; /* Non-compliant - reuse */
	}
}

typedef float mass;

void func1(void)
{
	uint32_t mass = 0.0f; /* Non-compliant - reuse */
}

typedef struct
{
	struct chain
	{
		struct chain* list;
		uint16_t
			element;
	} s1;
	uint16_t length;
} chain; /* Non-compliant - tag "chain" not
* associated with typedef */

int main() {
	func();
	func1();
	return 0;
}