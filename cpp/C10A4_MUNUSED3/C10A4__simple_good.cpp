int unusedtype() 
{ 
    // typedef int local_Type; // Now-compliant
    return 67; 
}

int main() 
{
    int result = unusedtype();
    return 0;
}
