void f1 ( ) 
{ 
    int a1[ 10 ]; 
    int a2[ 10 ];
    int * p1 = a1;
    if ( p1 < a2 ) // Non-compliant 
    { 
    } 
}

int main() {
    f1();
    return 0;
}
