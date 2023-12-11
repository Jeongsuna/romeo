#include <iostream>

enum Alphabet { A, B, C };

struct S 
{ 
    // 비트 필드에 열거형 타입 사용(비준수)
    enum Alphabet a : 1;
    enum Alphabet b : 1;
    enum Alphabet c : 1;
};

int main(void){return 0;}