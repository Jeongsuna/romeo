#include <iostream>

int main() {
    try {
        // 예외를 발생 시키는 코드
        int result = 10 / 0;
        std::cout << "결과: " << result << std::endl;
    // 처리되지 않은 모든 예외를 catch하기 위한 예외 처리기가 하나 이상 있어야 합니다.
    } catch (std::exception& e) {
        std::cout << "예외 처리: " << e.what() << std::endl;
    }

    return 0;
}