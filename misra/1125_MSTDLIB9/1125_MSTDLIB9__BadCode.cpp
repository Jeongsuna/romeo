#include <stdlib.h>
#include <string.h>
#include <stdio.h>

int compare(char** arg1, char** arg2)
{
    /* Compare all of both strings: */
    return _strcmpi(*arg1, *arg2);
}

int fake_main(void)
{
    char* arr[] = { "book", "desk", "pencil", "notebook", "monitor", "tissue", "calender", "chair" };
    char** result;
    char* key = "pencil";
    int i;

    /* Sort using Quicksort algorithm: */
    qsort((void*)arr, sizeof(arr) / sizeof(arr[0]), sizeof(char*), (int (*)(const void*, const void*))compare);   /* Non-compliant - use of qsort() from stdlib.h */

    for (i = 0; i < sizeof(arr) / sizeof(arr[0]); ++i)
        printf("%s ", arr[i]);

    /* Find the word "pencil" using a binary search algorithm: */
    result = (char**)bsearch((char*)&key, (char*)arr, sizeof(arr) / sizeof(arr[0]),
        sizeof(char*), (int (*)(const void*, const void*))compare);   /* Non-compliant - use of bsearch() from stdlib.h */
    if (result)
        printf("\n%s found at %Fp\n", *result, result);
    else
        printf("\nCat not found!\n");
}