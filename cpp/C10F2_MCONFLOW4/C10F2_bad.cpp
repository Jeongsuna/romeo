#include <iostream>

int main(){
    for (int32_t i = 0; i < 10; i++) 
    { 
        if (i == 4) 
        { 
            break; 
        } 
        else if (i == 6) 
        { 
            // for 반복문 의 루프 종료에 사용되는 break이 두개 이상 존재합니다.(비준수)
            break; 
        } 
        else 
        { 
            // ...
        } 
    }

    while (true) 
    { 
        int32_t i;
        if (i == 4) 
        { 
            break; 
        } 
        if (i == 6) 
        { 
            // for 반복문 의 루프 종료에 사용되는 break이 두개 이상 존재합니다.(비준수)
            break;
        } 
    }
    return 0;
}