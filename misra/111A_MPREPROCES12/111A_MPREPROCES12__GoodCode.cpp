#include <cstdint>

int32_t speed;
int32_t speed_scale;
int32_t scaled_speed;

#define SCALE( X ) ( ( X ) * X ## _scale )

int main()
{
	/* expands to scaled_speed = ( ( speed ) * speed_scale ); */
	scaled_speed = SCALE(speed);

	return 0;
}
