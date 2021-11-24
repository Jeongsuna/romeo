typedef unsigned short uint16_t;
typedef unsigned int uint32_t;

int main()
{
    uint16_t p16 = 0;
    uint32_t p32 = 0;
    void* p;

    p = p32;                /* Compliant - pointer to uint32_t into
                              * pointer to void */
    p = (void*)p16;     /* Compliant */
    
    return 0;
}

