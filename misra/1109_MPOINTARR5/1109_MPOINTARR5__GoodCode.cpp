#include <cstdint>
typedef int8_t INTPTR;

void function(int8_t* arrPar[])     /* compliant */
{
	int8_t** obj2;       /* Compliant */
	INTPTR* obj4;        /* Compliant */
	int8_t** arr[10];  /* Compliant */
	int8_t** (*parr)[10]; /* Compliant */
	int8_t* (**pparr)[10];/* Compliant */
}

struct s {
	int8_t* s1;       /* Compliant */
	int8_t** s2;       /* Compliant */
};

struct s* ps1;    /* Compliant */
struct s** ps2;    /* Compliant */

int8_t** (*pfunc1) (void);   /* Compliant */
int8_t** (**pfunc2) (void);   /* Compliant */

int main() {
	function(0);
	return 0;
}