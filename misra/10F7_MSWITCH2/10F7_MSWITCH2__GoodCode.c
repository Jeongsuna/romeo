int main() {
	int x = 1;
	switch (x)
	{
	case 1:   /* Compliant */

	case 2:   /* compliant */
		x = 1;
		break;
	default:
		break;
	}
	return 0;
}