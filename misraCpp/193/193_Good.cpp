#include <iostream>

// Exception 클래스를 정의
class Exception {
public:
    Exception(const char* message) : message(message) {}
    const char* what() const { return message; }
    
private:
    const char* message;
};

void foo()
{
    throw (21);
}

void goo() throw(Exception)
{
    try {
        foo();
    // foo 함수에서 throw 하는 int 타입 예외를 처리할 수 있습니다.
    } catch (int e) {
        // 예외 처리
    }
}

int main(void){return 0;}