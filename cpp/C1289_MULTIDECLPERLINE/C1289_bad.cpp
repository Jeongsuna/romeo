#include <iostream>

int main(){
    //변수를 동시에 선언하여, 각각이 단일 init-declarator가 아닙니다.(비준수)
    int32_t i2, *j2;
    int32_t *i3, &j3 = i2;
    return 0;
} 
