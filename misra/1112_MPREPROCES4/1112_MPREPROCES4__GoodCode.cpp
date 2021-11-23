#define unledss( E ) if ( ! ( E ) )     /* Compliant */

#define seq( S1, S2 ) do { \
  S1; S2; } while ( false )             /* Compliant */
#define compound( S ) { S; }            /* Compliant */

int main()
{
	return 0;
}