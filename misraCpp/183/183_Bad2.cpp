#include <iostream>

void f2 (void) 
{
    // 함수 안에서 empty throw 를 사용하고 있습니다.(비준수)
    throw (50); 
}

void g2 (void) 
{ 
    try 
    { 
        // try 블럭 안에서 empty throw 를 사용하고 있습니다.(비준수)
        throw 7;
    }
    catch (...) 
    { 
        throw i;
        // ... 
    } 
}

int main(void){return 0;}