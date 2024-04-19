#include <iostream>
#include <cstdlib> 
#include <cerrno>


void f1(const char * str) 
{ 
    // 오류 표시기 errno는 사용하지 않아야 합니다.
    errno = 0; 
    int32_t i = atoi (str);

    if (0 != errno)
    { 
        // handle error case??? 
    } 
}

int main(void){return 0;}