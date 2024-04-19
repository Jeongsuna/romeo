
int main() {

    int a = 10;
    int b = 2;
    int c = 5;
    int d = 1;

    bool u8_a = true;
    bool* ptr = &u8_a;

    // 1은 정수 리터럴 입니다. (Non-compliant)
    if ( 1 && ( c < d ) ) {}
    //  c + d는 정수 연산의 결과입니다. (Non-compliant)
    if ( ( a < b ) || ( c + d ) ) {} 
    //  c + d 는 bool 타입이 아닙니다. (Non-compliant)
    if ( u8_a && ( c + d ) ) {}
    // 0은 정수 형식입니다. (Non-compliant)
    if ( !0 ) {}
    // ptr은 포인터 형식입니다. (Non-compliant)
    if ( !ptr ) {}

    bool result1 = !a;          // Non-compliant
    bool result2 = b && c;      // Non-compliant
    bool result3 = d || ptr;    // Non-compliant

}