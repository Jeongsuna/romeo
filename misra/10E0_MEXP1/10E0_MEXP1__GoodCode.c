
int f(int x, int y)
{
	return x + y;
}

int main()
{
	int a[] = {1,2,3,4,5};
	int i = 1, b = 2, c = 3, d = 4;
	int* p;
	int n = 1;
	int ptr = 1;
	p = &ptr;

//	a[i]->n;      /* Compliant - no need to write ( a[ i ] )->n */
	*p++;            /* Compliant - no need to write *( p++ ) */
	a + b;
	a + b + c;
	(a + b) + c;
	a + (b + c);
	a + b - c + d;
	(a + b) - (c + d);
	/* Compliant - no need to write f ( ( a + b ), c ) */
	int x = 0;
	x = f(a + b, c);
	/* Compliant */
	x = (a == b) ? a : (a - b);

	/* Compliant
	 * Operands of << operator (precedence 10) are:
	 *  a  precedence 16 does not need parentheses
	 * ( E ) precedence 16 already parenthesized
	 */
	x = a[1] << (b + c);

	/* Compliant
	 * Operands of && operator (precedence 4) are:
	 *  a  precedence 16 does not need parentheses
	 *  && precedence 4 does not need parentheses
	 */
	if (a && b && c)
	{
	}

	x = a, b; /* Complinat - parsed as ( x = a ), b */

	return 0;
}
/* Compliant
 * Operends of && operator (precedence 4) are:
 *   defined(X) precedence 14 does not need parentheses
 *   (E) precedence 16 already parenthesized
 */
#if defined ( X ) && ( X + Y ) > Z 
#endif

/* Compliant
 * Operands of && operator (precedence 4) are:
 *   !defined ( X ) precedence 14 does not need parentheses
 *    defined ( Y ) precedence 14 does not need parentheses
 * Operand of ! operator (precedence 14) is:
 *    defined ( X ) precedence 14 does not need parentheses*/
#if !defined ( X ) && defined ( Y )
#endif