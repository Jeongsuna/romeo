// #include <cstdint> 추가
// main() 추가
#include <cstdint>

void unusedtag(void)
{
	enum state { S_init, S_run, S_sleep }; /* Non-compliant */
}
typedef struct record_t /* Non-compliant */
{
	uint16_t key;
	uint16_t val;
} record1_t;

int main()
{
	return 0;
}