#include <cstdint>
#include <arm_neon.h>
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
	float32_t mass = 0.0f; /* Non-compliant - reuse */
}
typedef struct list
{
	struct list* next;
	uint16_t
		element;
} list; /* Compliant - exception */
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