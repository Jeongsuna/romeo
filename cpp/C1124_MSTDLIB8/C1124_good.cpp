#include <iostream>

void f() {
    // 좋은 예: 프로그램이 정상적으로 종료됨
    // 아무것도 하지 않음

    // 좋은 예: 환경 변수 값을 가져오지 않음
    //const char* env_var = std::getenv("SOME_ENV_VARIABLE");

    // 좋은 예: 시스템 명령을 실행하지 않음
    //std::cout << "Hello, world!" << std::endl;

    // 좋은 예: 프로그램이 정상적으로 종료됨
    //return 0;
}

int main() {
    f();
    return 0;
}