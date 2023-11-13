#include <iostream>

int main(){
    for (int32_t i = 0; i < 10; i++) 
    { 
        if (i == 5) 
        { 
            // for 반복문 의 루프 종료에 사용되는 break이 한개만 존재합니다.(준수)
            break;
        } 
    }

    while (true) 
    { 
        int32_t i;
        if (i == 4) 
        { 
            // while 반복문 의 루프 종료에 사용되는 break이 한개만 존재합니다.(준수)
            break;
        }    
    }
    return 0;
}