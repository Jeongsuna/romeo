#include <iostream>

void setCursorPosition(int x, int y) {
	printf("x, y");
}

void C0028_UNINIT(int position, int base_position, int i) {
	int x, y;

	switch (position) {
		case 0:
			x = base_position;
			y = base_position;
			break;
		case 1:
			x = base_position + i;
			y = base_position - i;
			break;
		default: x = 1;
			break;
	}
	setCursorPosition(x, y);
}

