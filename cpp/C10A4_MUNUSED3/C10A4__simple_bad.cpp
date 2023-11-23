int unusedtype() 
{ 
    typedef int local_Type; // Non-compliant
    return 67; 
}

int main() 
{
    int result = unusedtype();
    return 0;
}
