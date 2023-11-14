#include <iostream>

class ExpBase 
{ 
public: 
    virtual const char *who ( ) 
    { 
        return "base"; 
    }; 
};

class ExpD1: public ExpBase 
{ 
public: 
    virtual const char *who ( ) 
    { 
        return "type 1 exception"; 
    }; 
};

class ExpD2: public ExpBase 
{ 
public: 
    virtual const char *who ( ) 
    { 
        return "type 2 exception"; 
    }; 
};

int main(void){
    try 
    { 
        // ... 
        throw ExpD1 ( ); 

        // ... 
        throw ExpBase ( ); 
    }
    // 클래스 타입 예외를 값으로 전달 하고 있습니다.
    catch (ExpBase b)
    { 
        b.who();
        throw b;
    }
    return 0;
}
