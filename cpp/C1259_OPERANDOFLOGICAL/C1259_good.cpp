
int main() {

    int a = 1;
    int b = 12;
    int c = 4; 
    int d = 5;

    bool condition1 = true;
    bool condition2 = false;

    // ! 연산자, 논리 & & 또는 논리 || 연산자는 bool 타입이어야 합니다. (Compliant)
    if ( ( a < b ) && ( c < d ) ) {}
    if ( !false ) {}
    if ( !(true) ) {}
    if ( !condition1 ) {}
    if ( !(condition2) || condition1 ) {}
    if ( condition1 || !( c < d ) ) {}
    if ( ( a < b ) && ( c < d ) || (condition1) && ( a >= 8 ) ) {}
    
    bool result1 = !condition1;                 // Compliant
    bool result2 = condition1 && condition2;    // Compliant
    bool result3 = condition1 || condition2;    // Compliant
}