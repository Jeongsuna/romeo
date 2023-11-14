#include <iostream>

char * p = NULL;

int main(){
    try 
    { 
        // NULL을 const char_t* 포인터로 캐스트하고 그 후에 throw하고 있습니다.(준수) 
        throw (static_cast<const char*>(NULL));
        // NULL을 명시적으로 throw하지 않고 변수 p를 throw합니다.(준수)
        throw (p);

    }
    catch (int i) 
    { 
        // ... 
    }
    catch (const char *)
    { 
        // ... 
    }
    return 0;
}