#include <stdio.h>
#include <stdbool.h>

int x;
int y;
int z;

int fake_main()
{
    switch (x == 0)   /* Non-compliant - essentially Boolean */
    {                   /* In this case an ""if-else"" would be more logical */
        if (false)
            y = x;
        else
            y = z;

        return 0;
    }
}