#include "stdbool.h"

int main() {

    // 예외 - 무한루프
    int ec = 0;
    for (;;) {
        ec++;
    }

    // first clause
    // init이 없거나
    int i = 0;
    for ( ; i < 10; i++) {
        // 루프 본체
    }
    int j = 0;
    // 루프 카운터에 값을 할당하거나
    for (j = 5; j < 10; j++) {
        // 루프 본체
    }

    // 루프카운터를 정의하고 초기화 함
    for (int k = 0; k < 10; k++) {
        // 루프 본체
    }

    // second clause
    // 지속적인 부작용이 없으며, 루프 카운터와 선택적으로 루프 제어 플래그를 사용하며, 루프 본체에서 변경되는 다른 객체를 사용 안함
    for (int x = 0; x < 10; x++) {
        // 루프 본체
    }

    //third clause
    // 루프 카운터의 값을 변경하기 위한 유일한 지속적인 부작용이 있는 표현식으로 루프 본체에서 수정되지 않은 경우
    for (int a = 0; a < 10; a = a + 2) {
        // 루프 본체
    }


	return 0;
}