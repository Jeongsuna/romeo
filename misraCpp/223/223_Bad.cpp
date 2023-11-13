#include <cstring>
#include <iostream>

void fn(const char * pChar) 
{ 
    char array [10];
    // strcpy는 복사할 문자열의 길이를 체크하지 않아 Buffer Overflow 발생 위험이 있습니다.
    strcpy (array, pChar);
}

int main(void){return 0;}