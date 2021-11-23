#include <cstdint>

typedef float float32_t;

int fake_main()
{
	uint32_t counter = 0u;

	for (float32_t f = 0.0f; f < 1.0f; f += 0.001f)
	{
		++counter;
	}

	float32_t f = 0.0f;
	while (f < 1.0f)
	{
		f += 0.001f;
	}
	
	return 0;
}