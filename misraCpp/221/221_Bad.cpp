#include <cstdlib>

void f() 
{
    // exit() 함수를 호출 
    exit(0);
}

void f2()
{
    // abort() 함수를 호출 
    abort();
}

const char* f3(const char* name)
{

    // getenv() 함수를 호출
    return getenv(name);
}

void f4(const char* command)
{
    // system() 함수를 호출
    system(command);
}
int main(){return 0;}