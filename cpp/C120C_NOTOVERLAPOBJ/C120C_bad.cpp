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
    union // Breaks Rule 9–5–1 
    { 
        struct s u1; 
        struct t u2; 
    } a;

    a.u2.m3 = a.u1; // Non-compliant

        union // Breaks Rule 9–5–1
        {
            int u1;
            long u2;
        } b;

        b.u1 = b.u2; // Non-compliant
}

int main() {
    fn();
    return 0;
}
