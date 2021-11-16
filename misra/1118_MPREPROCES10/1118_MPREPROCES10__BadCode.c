#define mc2_1913A(x,y) (#x = (y)) /* Non-compliant */
#define mc2_1913B(x,y) (x##y = 0) /* Non-compliant */

int main() {
	return 0;
}