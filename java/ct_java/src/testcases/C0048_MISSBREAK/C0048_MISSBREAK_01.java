package testcases.C0048_MISSBREAK;

public class C0048_MISSBREAK_01 {
	public void bad() {
		int a = 0;
		switch (a) {
		case 1:
		case 2:
			break;
		case 3:
			return;
		case 4: // FLAW
			a = 4;
		case 5:
			a = 5;
			break;
		case 6: // FLAW
			if (a == 0)
				break;
		case 7:
			if (a == 0);
			break;
		default:
			a = -1;
		}
	}

}
