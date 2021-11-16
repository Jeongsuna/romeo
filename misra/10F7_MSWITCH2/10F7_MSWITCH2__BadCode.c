int main() {
	int i = 0;
	int x = 1;
	switch (x)
	{
	case 1:   /* Compliant */
		if (i == 5)
		{
	case 2:   /* Non-compliant */
		x = 1;
		}
		break;
	default:
		break;
	}
	return 0;
}