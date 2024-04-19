class C
{
public:
    C ( )
    {
        // Avoid throwing exceptions in the constructor
    }

    ~C ( )
    {
        // Avoid throwing exceptions in the destructor
    }
};

int main( ... )
{
    try
    {
         // Now, an exception thrown in C's constructor or destructor will not cause the program to terminate
        C c;
        // program code
        return 0;
    }
    catch ( ... )
    {
        // Handle exception
        return 0;
    }
}