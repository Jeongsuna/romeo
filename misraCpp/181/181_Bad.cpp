#include <iostream>


class E2 
{ 
public: 
    E2() 
    { 
        // 생성자에서 예외를 던짐 (비준수)
        throw 10; 
    } 
};


int main(void)
{
    bool condition = true;
    try 
    { 
        if (condition) 
        { 
            // 생성자에서 예외를 던지므로 비준수
            throw E2();
        } 
    } 
    catch (int e)
    {
        
    }
    
    return 0;
}
