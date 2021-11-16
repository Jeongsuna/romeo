// #include <stdio.h> 추가
// main() 추가

#include <stdio.h>

struct s {
signed long b2 : 1; /* Non-compliant */
};

int main()
{

	return 0;
}