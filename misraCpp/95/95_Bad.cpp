#include <iostream>
int main() {
    bool ishigh = true;  // 예시로 'ishigh'를 true로 설정
    int x = 42;          // 예시로 'x'를 42로 설정
    int i = 41;          // 예시로 'i'를 41로 설정
    
    // 논리 && 연산자의 오른쪽 피연산자인 (x == i++)에서
    // i++ 작업은 변수 i를 수정하는 부작용있습니다.(비준수)
    if (ishigh && (x == i++))
    return 0;
}