#include <iostream>

int main() {
    try {
        // 예외를 발생 시키는 코드
        int result = 10 / 0;
        std::cout << "결과: " << result << std::endl;
    } catch (std::exception& e) {
        std::cout << "예외 처리: " << e.what() << std::endl;
    // 처리되지 않은 모든 예외를 처리하기 위한" catch 블록이 하나 이상 존재합니다.
    } catch (...) {
        std::cout << "모든 예외 처리" << std::endl;
    }
    
    return 0;
}