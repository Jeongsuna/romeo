void f1() 
{ 
    int a1[10]; 
    int a2[10];
    int* p1 = &a1[1]; 
    int* p2 = &a2[10]; 
    int diff;
    diff = p1 - a1; // Compliant 
    diff = p2 - a2; // Compliant 
    diff = p1 - p2; // Non-compliant 
}
