#include <cstdint>

int x, y;
#define M1( x, y ) ( x * y )
#define M2 ( x, y ) ( ( x ) * ( y ) )
#define M3( x ) a ## x = ( x )
#define F( X ) G( X )
#define G( Y ) ( ( Y ) + 1 )
#define GET_MEMBER( S, M ) ( S ).M



int main()
{
	int r;
	r = M1((1 + 2), (3 + 4));     /* Compliant */

//	r = M2(1 + 2, 3 + 4);         /* Compliant */

	int16_t M3(0);

	int16_t x = F(2);
	
	int v = GET_NUMBER ( s1, minval );
	
	

	return 0;
}