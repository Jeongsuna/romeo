int fake_main() {
	int x = 1;
	switch (x)
	{
	case 0:
		break;    /* Compliant - unconditional break */
	case 1:       /* Compliant - empty fall through allows a group */
	case 2:
		break;    /* Compliant */
	default:
		break;    /* Compliant - default must also have a break */
	}
	return 0;
}