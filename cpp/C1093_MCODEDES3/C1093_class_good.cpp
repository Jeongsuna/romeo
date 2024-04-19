#include <iostream>

class Assembler {
public:
    Assembler() {}
    ~Assembler() {}

    int add(int a, int b) {
        int result;
        
        // 어셈블리 코드가 캡슐화 되어 있습니다.
        asm("movl %1, %%eax;"
            "addl %2, %%eax;"
            "movl %%eax, %0;"
            : "=r" (result)
            : "r" (a), "r" (b)
            : "%eax"
        );

        return result;
    }
};

int main(void){
    return 0;
}