#include <iostream>
#include <random>

void C0018_RANDOM() {
	int temp, count = 0;

	// srand() 에서 상수 형태의 seed를 사용하고 있다.
	srand(100);
	while (1) {
		if (count % 6 == 0)
			printf("%s", "\n");

		temp = rand() % 101;
		if (temp != 100)
			count++;

		else
			break;

		printf("%5d", temp);
	}
	printf("\n100 이 나오기 전까지 나온 숫자의 갯수 : %d \n", count);
}