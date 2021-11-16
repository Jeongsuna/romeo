/* badcode */
struct s_badcode {
	int b2 : 2; /* Non-compliant - plain int not permitted */
	signed long b4 : 2; /* Non-compliant even if long and int are the
	* same size */
};
/* goodcode */
typedef unsigned int UINT_16;
struct s_goodcode {
	unsigned int b1 : 2; /* Compliant */
	UINT_16 b3 : 2; /* Compliant - typedef designating unsigned int */
};
int main() {
	struct s_badcode b;
	struct s_goodcode g;
	return 0;
}