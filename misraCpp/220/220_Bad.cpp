#include <iostream>
#include <stdlib.h>

int32_t f1(const char * numstr) 
{ 
    // atoi() 함수를 사용하고 있습니다.
    return atoi (numstr);
}

double f2(const char* numstr)
{
    // atof() 함수를 사용하고 있습니다.
    return atof(numstr);
}

long f3(const char* numstr)
{
    // atol() 함수를 사용하고 있습니다.
    return atol(numstr);
}

int main(void){return 0;}