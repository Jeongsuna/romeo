#include <iostream>

// foo는 예외 사양이 없으므로 int를 포함한 모든 유형의 예외를 전파할 수 있습니다.
void foo() {
 throw(21);
}

// goo는 std::exception 유형의 예외만 발생하도록 지정합니다.
// foo가 int를 throw하면 unexpected() 함수가 호출되어 프로그램이 종료될 수 있습니다.
void goo() throw(std::exception) {
  // int(type)은 throw 사양에 나열되지 않음 (비준수)
 foo();
}