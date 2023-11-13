#include <cstring>
#include <iostream>

void fn(const char* pChar) 
{ 
    char array[10];
    // strcpy 호출을 strncpy로 대체합니다.
    strncpy(array, pChar, sizeof(array) - 1);
    // 널 종료 문자를 추가하여 문자열을 유효하게 만듭니다
    array[sizeof(array) - 1] = '\0';
}

int main(void){return 0;}