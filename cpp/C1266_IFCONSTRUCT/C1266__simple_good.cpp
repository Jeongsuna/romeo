#include <iostream>

int main()
{
    int x, y;
    bool test1 = true;
    bool test2 = false;

    // if ( condition ) 구문 뒤에는 복합 문으로 작성 합니다.(준수)
    if (test1)
    {
        x = 1;
    }

    if (test1){
        x = 1;
    }else if (test1){
        x = 2;
    }else{
        x = 3;
        y = 2;
    }
    return 0;
}
