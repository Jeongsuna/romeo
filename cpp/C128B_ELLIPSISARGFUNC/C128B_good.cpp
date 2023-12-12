#include <iostream>

// 함수가 명시적인 매개변수를 사용하여 정의 되었습니다.(준수)
void MyPrintf(const char *pFormat, int arg1, double arg2) {
    // 함수 내용
}
int main(){
    // 함수 호출
    MyPrintf("Formatting string %d %f", 42, 3.14);
    return 0;
}
