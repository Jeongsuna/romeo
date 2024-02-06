#include <iostream>

int fn(){
    return 5;
}

int main(){
    int x, n;
    // 함수 fn()의 결과를 사용하여 x를 수정하고 있습니다.(비준수)
    for (x = 0; x < 10; x += fn()){

    }

    // 루프 카운터 수정 방식은 (-- , ++, -=, +=) 연산자만을 사용해야합니다. (비준수)
    for (int x = 1; x < 1024; x = x << 1) {

    }


    return 0;
}