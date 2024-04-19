#define C ( x, y )  #x ## y /* Non-compliant */
#define D(x, y, z, yz) x ## y ## z /* Non-compliant */
#define V(x) (## y) x ## y /* Non-compliant */

int fake_main()
{
	return 0;
}
