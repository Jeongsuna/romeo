#include <cstdint>

int x, y;
#define M1( x, y ) ( x * y )
#define M2 ( x, y ) ( ( x ) * ( y ) )
int 1
r = M2(1 + 2, 3 + 4);          /* Compliant */
#define M3( x ) a ## x = ( x )
#define F( X ) G( X )
#define G( Y ) ( ( Y ) + 1 )

int main()
{
	int r, s;
	r = M1((1 + 2), (3 + 4));     /* Compliant */

	

	int16_t M3(0);

	int16_t x = F(2);

	return 0;
}