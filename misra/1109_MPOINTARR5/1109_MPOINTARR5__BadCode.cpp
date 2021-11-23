#include <cstdint>
typedef int8_t INTPTR;

void function2(int8_t** arrPar[])     /* Non-compliant */
{
	int8_t** obj2;       /* Compliant */
	int8_t*** obj3;      /* Non-compliant */
	INTPTR* obj4;        /* Compliant */
	INTPTR const* obj5;  /* Non-compliant */
	int8_t** arr[10];  /* Compliant */
	int8_t** (*parr)[10]; /* Compliant */
	int8_t* (**pparr)[10];/* Compliant */
}

struct s2 {
	int8_t* s1;       /* Compliant */
	int8_t** s2;       /* Compliant */
	int8_t*** s3;      /* Non-compliant */
};

struct s2* ps1_2;    /* Compliant */
struct s2** ps2_2;    /* Compliant */
struct s2*** ps3_2;    /* Non-compliant */

int8_t** (*pfunc1_2) (void);   /* Compliant */
int8_t** (**pfunc2_2) (void);   /* Compliant */
int8_t** (***pfunc3) (void);   /* Non-compliant */
int8_t*** (**pfunc4) (void);   /* Non-compliant */


int fake_main() {
	function2(0);
	return 0;
}