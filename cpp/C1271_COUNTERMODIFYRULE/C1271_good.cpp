#include <iostream>

class Thing {
public:
    Thing(int startValue) : startValue_(startValue) {
    }

    int start(int value) {
        return startValue_ + value;
    }

    int end() {
        // end()에 대한 구현 추가
        // 이 부분은 루프의 끝을 정의할 때 사용하는 방식에 따라 다를 수 있습니다.
        return 10; // 예를 들어, 10으로 가정
    }

private:
    int startValue_;
};

int main(){
    int x, n;

    Thing thing(0);

    // 루프 카운터는 --,++, -=n 또는 +=n 중 하나로 수정되어야 합니다(준수)
    for ( x = 0; x < 10; --x ){

    }

    for ( x = thing.start(0); x != thing.end( ); ++x ){

    }

    for ( x = 0; x < 10; x += 1 ){

    }

    for ( x = 0; x < 10; x -= n ){

    }


    return 0;
}