#include <iostream>
#include <stdint.h>

class Vector2 {
   
public:
    float x = 1, y = 2;
    bool operator&&(const Vector2&) {
        // && 연산자를 오버로드하는 코드
        return true;
    }

    bool operator||(const Vector2&) {
        // || 연산자를 오버로드하는 코드
        return true;
    }
};

Vector2 operator,(const Vector2& v1, const Vector2& v2) {
    Vector2 ans;
    ans.x = v1.x + v2.x;
    ans.y = v1.y + v2.y;
    return ans;
}


int main() {
    Vector2 a, b;
    bool result1 = a && b;  // 오버로드된 && 연산자 사용
    bool result2 = a || b;  // 오버로드된 || 연산자 사용

    Vector2 c = a, b;      // 오버로드된 쉼표(,) 연산자 사용

    return 0;
}