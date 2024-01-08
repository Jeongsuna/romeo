#include <stdint.h>

uint16_t multiply(uint16_t para1)  //func의 타입을 명시하지 않았을 때는 어떻게 하지?
{ 
    return para1 * 2; 
}

void aFunc(uint16_t aParam)
{
    aParam++;
}

void good1(uint16_t para2) 
{ 
    uint16_t a = multiply(para2);
    uint16_t b = a;               // 1. a를 b에 assign하므로 사용하는 것으로 판단. - Compliant

}
void good2(uint16_t para2) 
{ 
    uint16_t a = multiply(para2); 
    if( a > 1000) {    }       // 2. a를 if문의 조건으로 사용. - Compliant
}

void good3(uint16_t para2) 
{ 
    uint16_t a = multiply(para2);
    while( a > 1000) {}        // 3. a를 while문의 조건으로 사용. - Compliant
}

void good4(uint16_t para2) 
{ 
    uint16_t arrayUint[10];
    uint16_t a = multiply(para2);
    uint16_t c = arrayUint[a]; // 4.배열의 인덱스로 사용 - Compliant
}

void good5(uint16_t para2) 
{ 
    uint16_t a = multiply(para2);
    aFunc(a);                  // 5. a 다른 함수의 인자로 사용 - Compliant
}

void good6(uint16_t para2) 
{ 
    uint16_t a = multiply(para2);
    uint16_t plus = 10 + a;    // 6. 연산의 일부로 사용됨. - Compliant
}

uint16_t main() 
{
    uint16_t returnA = multiply(10);
    return returnA;                   // 7. a를 main의 return하는데 사용 됨 - Compliant
}
