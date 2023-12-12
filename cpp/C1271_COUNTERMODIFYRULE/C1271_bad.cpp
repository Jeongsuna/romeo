#include <iostream>

int fn(){
    return 5;
}

int main(){
    int x, n;
    // 함수 fn()의 결과를 사용하여 x를 수정하고 있습니다.(비준수)
    for (x = 0; x < 10; x += fn()){

    }

    // for의 본문 안에서 x를 수정하고 있습니다.(비준수)
    for (x = 0; x < 10; x += n){
        n++;
        n+1;
        n+=1;
    }


    return 0;
}