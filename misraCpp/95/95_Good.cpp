 #include <iostream>
 int f(int x) {
    // 여기에 f(x) 함수의 내용을 작성합니다.
    // 부작용이 없어야 합니다.
    x++;

    return x;
}

int main() {
    bool ishigh = true;  // 예시로 'ishigh'를 true로 설정
    int x = 42;          // 예시로 'x'를 42로 설정    
    // f(x)가 부작용이 없음이 알려진 경우에만 허용합니다.(준수)
    if (ishigh && (x == f(x)))
    return 0;
}
