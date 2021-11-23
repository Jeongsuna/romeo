#include <cstdint>

int f()
{
	return 0;
}

void g(uint16_t a)
{

}

int fake_main()
{
	uint16_t u8a = 0;
	uint16_t u8b = 0;
	uint16_t u8c = 0;

	u8a = ++u8b + u8c--;

	if ((f() + --u8a) == 0u)
	{
	}

	g(u8b++);

	u8a = (1u == 1u) ? 0u : u8b++;

	if (u8a++ == ((1u == 1u) ? 0u : f()))
	{
	}
	
	return 0;
}