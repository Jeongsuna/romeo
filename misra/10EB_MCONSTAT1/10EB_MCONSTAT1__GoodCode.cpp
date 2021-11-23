#include <cstdint>

typedef float float32_t;

float32_t read_float32()
{
	return 0;
}
int read_u32()
{
	return 0;
}
int main()
{
	float32_t f;

	for (uint32_t counter = 0u; counter < 1000u; ++counter)
	{
		f = (float32_t)counter * 0.001f;
	}

	uint32_t u32a;

	f = read_float32();

	do
	{
		u32a = read_u32();
		/* f does not change in the loop so cannot be a loop counter */
	} while (((float32_t) u32a - f) > 10.0f );
	
	return 0;
}