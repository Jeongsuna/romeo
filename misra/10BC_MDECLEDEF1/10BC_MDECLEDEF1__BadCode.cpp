//extern x; /* Non-compliant - implicit int type */
//const y; /* Non-compliant - implicit int type */
//extern f(void); /* Non-compliant - implicit
//* int return type */
//extern void g(char c, const k); /* Non-compliant - implicit
//* int for parameter k */
//typedef (*pfi) (void); /* Non-compliant - implicit int
//*return type */
//typedef void (*pfv) (const x); /* Non-compliant - implicit int
//*for parameter x */
//struct str
//{
//	const y; /* Non-compliant - implicit int for member y */
//} s;
int main() {
	return 0;
}

