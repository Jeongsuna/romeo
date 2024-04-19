#include <iostream>

uint8_t fn(void){
    return 1;
}

int main(){
    uint8_t u8a;
    int x;
    // bool변수 flag를 선언하고 초기화합니다.
    bool flag = true;
    // bool값 flag를 사용하여 루프의 종료 여부를 결정합니다(준수)
    for (x = 0; (x < 10) && flag; ++x)
    { 
        u8a = fn();
        // flag를 부울 값을 사용하여 설정합니다.
        flag = u8a != 3U;
    }
    return 0;
}