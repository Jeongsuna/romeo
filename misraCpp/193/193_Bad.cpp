#include <iostream>

// Exception 클래스를 정의
class Exception {
public:
    Exception(const char* message) : message(message) {}
    const char* what() const { return message; }
    
private:
    const char* message;
};

// foo 함수는 예외 사양이 없으므로 int를 포함한 모든 유형의 예외를 전파할 수 있습니다.
void foo()
{
    throw (21);
}

// goo 함수는 예외 사양으로 Exception 유형의 예외만 던질 것을 지정합니다.
// foo가 int를 던질 경우 unexpected() 함수가 호출되어 프로그램을 종료할 수 있습니다.
void goo() throw(Exception)
{
    // foo 함수에서 던지는 int 예외를 처리할 수 없습니다.
    foo();
}

int main(void){return 0;}