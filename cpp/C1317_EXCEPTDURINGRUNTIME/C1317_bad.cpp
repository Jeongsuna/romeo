class C
{
public:
    C ( )
    {
        // Non-compliant – thrown before main starts
        throw (0);
    }

    ~C ( )
    {
        // Non-compliant – thrown after main exits
        throw (0);
    }
};
// An exception thrown in C's constructor or destructor will cause the program to terminate, and will not be caught by the handler in main
C c;

int main( ... )
{
    try
    {
        // program code
        return 0;
    }
    // The following catch-all exception handler can only catch exceptions thrown in the above program code
    catch ( ... )
    {
        // Handle exception
        return 0;
    }
}