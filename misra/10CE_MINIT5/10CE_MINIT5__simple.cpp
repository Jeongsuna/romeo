/* badcode */
/* Non-compliant - probably unintentional to have single element */
int a1[] = { a1[0] = 1 };

/* goodcode */
/* Compliant */
int a2[10] = { a2[0] = 1 };

int main() {
	return 0;
}