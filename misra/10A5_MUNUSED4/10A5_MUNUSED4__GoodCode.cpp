#include <cstdint>

enum state2 { S_init, S_run, S_sleep }; /* Compliant */

typedef struct record_t_2 /* Compliant */
{
	uint16_t key;
	uint16_t val;
} record_t_2_2;

typedef struct /* Compliant */
{
	uint16_t key;
	uint16_t val;
} record_t_3_3;

int main()
{
	enum state2 myState = S_init;
	record_t_2_2 myRecord;
	myRecord.key = 1;
	myRecord.val = 2;
	return 0;
}
