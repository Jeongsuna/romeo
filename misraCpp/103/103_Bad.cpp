#include <iostream>

int main() {
    int x, y;
    bool test1 = true;


    // if ( condition ) 구문 뒤에 (;) 있습니다.(비준수)
    // if ( condition ) 구문 뒤에는 복합 문이 와야 합니다
    if (test1);
    { 
        x = 1; 
    }
    // else 뒤에 중괄호 없이 정의 하고 있습니다.(비준수)
    // else 키워드 뒤에는 복합 문 또는 다른 if 문이 와야 합니다.
    else
    x = 3;
    y = 2;
    
    return 0;
}