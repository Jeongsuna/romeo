#include <iostream>
#include <stdint.h>
void f (int32_t i) 
{ 
    if (10 == i) 
    { 
        // goto문을 사용하여 try-catch 블록 내부로 제어를 전송하고 있습니다.(비준수)
        goto Label_10;
    }
    if (11 == i) 
    { 
        // goto문을 사용하여 try-catch 블록 내부로 제어를 전송하고 있습니다.(비준수)
        goto Label_11;
    }
    switch (i) 
    { 
        case 1: 
            try 
            { 
                Label_10: 
                // switch문을 사용하여 try-catch 블록 내부로 제어를 전송하고 있습니다.(비준수)
                case 2: 
                    break; 
            }
            catch (...) 
            { 
                Label_11: 
                // switch문을 사용하여 try-catch 블록 내부로 제어를 전송하고 있습니다.(비준수)
                case 3:
                    break; 
            } 
            break;
        default: 
        { 
            break; 
        } 
    } 
}

int main(){
    return 0;
}