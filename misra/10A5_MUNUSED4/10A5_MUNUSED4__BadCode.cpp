#include <cstdint>

enum state1 { S_init, S_run, S_sleep }; /* Non-compliant */

typedef struct record_t_1 /* Non-compliant */
{
	uint16_t key;
	uint16_t val;
} record_t_1_1;

int main()
{
	return 0;
}