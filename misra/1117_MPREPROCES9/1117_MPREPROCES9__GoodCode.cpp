#if defined ( M )     /* Compliant - M is not evaluated */
#if M == 0            /* Compliant - M is known to be defined */
#endif
#endif

/* Compliant - B is only evaluated in ( B == 0 ) if it is defined */
#if defined ( B ) && ( B == 0 )
#endif

int main()
{
	return 0;
}