// #include <cstdint> 추가
// main 추가
#include <cstdint>

void usedtag ( void )
{
	enum state { S_init, S_run, S_sleep };
	enum state s; /* Compliant */
	s = S_run;

}
typedef struct /* Compliant */
{
	uint16_t key;
	uint16_t val;
} record2_t;

int main()
{
	usedtag();

	return 0;
}