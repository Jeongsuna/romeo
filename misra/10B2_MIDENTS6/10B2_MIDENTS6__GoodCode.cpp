#include <cstdint>
void func2(void)
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
int fake_main()
{
	func2();
    return 0;
}