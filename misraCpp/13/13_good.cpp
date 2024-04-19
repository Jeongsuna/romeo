#include <cstdint>

struct s 
{ 
    int16_t m1[32]; 
};

struct t 
{ 
    int32_t m2; 
    struct s m3; 
};

void fn() 
{ 
    union
    { 
        struct s u1; 
        struct t u2; 
    } a;

    struct s temp = a.u1; // Use a temporary variable
    a.u2.m3 = temp; // Assign the temporary variable to the target
}

int main() {
    fn();
    return 0;
}
