#define M1( x, y ) ( x * y )

#define J( X ) K( X )
#define K( Y ) (  Y * 1)
int fake_main()
{
	int r;
	r = M1(1 + 2, 3 + 4);
	
	int16_t w = J(5);
	return 0;
}