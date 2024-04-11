#include <cstdlib>
#include <iostream>

void f() {
    // 나쁜 예: abort 함수 사용
    // 이 함수는 프로그램을 갑작스럽게 종료시킵니다
    abort();

    // 나쁜 예: getenv 함수 사용
    const char* env_var = getenv("SOME_ENV_VARIABLE");
    if (env_var != nullptr) {
        std::cout << "SOME_ENV_VARIABLE의 값: " << env_var << std::endl;
    } else {
        std::cout << "SOME_ENV_VARIABLE이 설정되지 않았습니다." << std::endl;
    }

    // 나쁜 예: system 함수 사용
    // 이 함수는 시스템 명령을 실행합니다
    system("echo Hello, world!");

    // 나쁜 예: exit 함수 사용
    // 이 함수는 프로그램을 종료시킵니다. 일반적인 프로그램 흐름에서 사용하기에 권장되지 않습니다
    exit(0);
}

int main() {
    f();
    return 0;
}