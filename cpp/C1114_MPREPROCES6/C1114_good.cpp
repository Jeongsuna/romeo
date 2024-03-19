// #include <stdio.h>

#define M(A) printf ( A )

int main ( ) 
{ 
    //  매크로 함수 "M"을 호출할 때 전처리 지시어나 관련된 토큰 대신에 "Message 1"과 "Message 2" 문자열을 직접 전달합니다.(준수)
    M("Message 1");
    M("Message 2");
    return 0;
}