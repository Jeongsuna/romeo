#include <iostream>
// x를 정의합니다.
#define x 42

int main() { 
    // #define 지시문을 사용하여 "x"를 정의한 다음, 해당 매크로가 정의되었을 때만 조건을 검사하게합니다.(준수)
    #if defined(x)
        #if x < 0
            std::cout << "x is less than 0." << std::endl;
        #endif
    #endif

    return 0;
}