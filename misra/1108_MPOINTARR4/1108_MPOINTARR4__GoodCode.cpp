#include <cstdint>

void fn2(void)
{
    uint8_t array_2_2[2][2] = { { 1U, 2U }, { 4U, 5U } };
    uint8_t i = 0U;
    uint8_t j = 0U;
    uint8_t sum = 0U;

    for (i = 0U; i < 20U; i++)
    {
        uint8_t* row = array_2_2[i];

        for (j = 0U; j < 2U; j++)
        {
            sum += row[j];    /* Compliant */
        }
    }
}

int main()
{
    return 0;
}