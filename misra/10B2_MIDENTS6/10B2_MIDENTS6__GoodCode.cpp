#include <cstdint>
void func(void)
{
	{
		typedef unsigned char u8_t;  /* Compliant */
	}
}
typedef float mass;  /* Compliant */
typedef struct list
{
	struct list* next;
	uint16_t
		element;
} list; /* Compliant - exception */
int main()
{
	func();
    return 0;
}