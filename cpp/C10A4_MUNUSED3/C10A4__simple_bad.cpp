int unusedtype() 
{ 
    typedef int local_Type_10A4; // Non-compliant
    return 67; 
}

int main() 
{
    int result = unusedtype();
    return 0;
}
