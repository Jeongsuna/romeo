#include <stdio.h>

#define M(A) printf(#A)

int main()
{
    M(
        // 전처리 지시어와 유사한 토큰을 인자로 전달하고있습니다.(비준수)
        #ifdef SW 
        "Message 1"
        #else 
        "Message 2"
        #endif 
    );
    return 0;
}

