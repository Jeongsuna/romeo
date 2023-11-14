#include <iostream>

uint8_t fn(void){
    return 1;
}

int main(){
    uint8_t u8a;
    int x;
    // u8a는 bool값이 아니라 루프를 종료할 조건에 사용되고 있지 않습니다.(비준수)
    for (x = 0; (x < 10) && (u8a != 3U); ++x) 
    { 
        u8a = fn();
    }
    return 0;
}   