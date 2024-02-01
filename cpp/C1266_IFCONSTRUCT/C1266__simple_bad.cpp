#include <iostream>

int main()
{
    int x, y;
    bool test1 = true;
    bool test2 = false;

    // if ( condition ) 구문 뒤에 (;) 있습니다.(비준수)
    if (test1);
    {
        x = 1;
    }


    if (test1)
    {
        x = 1;
    }
    // else 뒤에 중괄호 없이 정의 하고 있습니다.(비준수)
    else
        x = 3;
        y = 2;

    return 0;
}
