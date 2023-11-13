#include <iostream>

int main() {
    int x, y;
    bool test1 = true;
    bool test2 = true;

    // if ( condition ) 구문 뒤에는 복합 문으로 작성 합니다.(준수)
    if (test1)
    { 
        x = 1; 
    }

    // else 키워드 뒤에 다른 if 문이 오고 있습니다.(준수)
    else if ( test2 )
    { 
        x = 0;
    }
    // else 키워드 뒤에 복합 문이 오고 있습니다.(준수)
    else
    {
        x = 3;
        y = 2;
    }

    return 0;
}
