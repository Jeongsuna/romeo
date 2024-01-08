#include "stdbool.h"

int fake_main() {

    // first clause
    // init 이 없거나, 루프카운터에 값을 할당하거나, 루프카운터를 정의하고 초기화 하지 않는 경우
    // ex) 루프카운터가 아닌 값을 정의하고 할당한 경우
    int i = 0;
    for (int k = 0; i < 10; i++) {
        // 루프 본체
    }

    // second clause
    // 지속적인 부작용이 있는 표현식
    for (int x = 0; x++ < 10; x++) {
        // 루프 본체
    }

    // 루프 카운터를 사용하지 않음
    for (int y = 0; y < 10; i++) {
        // 루프 본체
    }

    // 루프 본체에서 변경되는 다른 객체를 사용함
    for (int z = 0; i < 10; z++) {
        i += 1;
    }

    //third clause
    // 루프 카운터 값이 아닌 다른 값을 변경하는 표현식
    int b = 0;
    for (int a = 0; a < 10; a++, b += 2) {
        // 루프 본체
    }

    // 루프 카운터에가 본체에서 수정되는 경우
    for (int i = 0; i < 10; i++) {
        i += 2;
    }

	return 0;
}