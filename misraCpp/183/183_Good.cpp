#include <iostream>
#include <stdint.h>
void f1 (void) 
{ 
    try 
    { 
        throw (42); 
    }
    catch (int i)
    { 
        if (i > 0) 
        { 
            // catch 핸들러의 복합 문에서 empty throw를 사용하고 있습니다(준수)
            throw 1;
            if(i <5){
                 throw 2; 
                 while(true){
                    throw 3;
                 }
            } 
        } 

        
    } 
}

void g1 (void) 
{ 
    try 
    { 
        f1 (); 
    }
    catch (int i) 
    { 
        // f1의 핸들러가 필요한 작업을 완료한 후 f1()에서 다시 throw를 처리합니다
    } 
}

int main(void){return 0;}