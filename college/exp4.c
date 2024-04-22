#include <stdio.h>
int main()
{
    int c, first, l, last, middle, n, search, arr[100];
    printf("Enter No of elements \n");
    scanf("%d", &n);
    printf("Enter %d Integers\n", n);
    for (c = 0; c < n; c++)
    {
        scanf("%d", &arr[c]);
    }
    printf("Enter the value to find :\n");
    scanf("%d", &search);
    first = 0;
    last = n - 1;
    middle = (first + last) / 2;
    while (first <= last)
    {
        if (arr[middle < search])
        {
            first = middle + 1;
        }
        else if (arr[middle] == search)
        {
            printf("%d found at location %d.\n", search, middle + 1);
            break;
        }
        else
        {
            last = middle - 1;
            middle = (first + last) / 2;
        }
    }
    if (first > last)
    {
        printf("Not found ! %d isn't present in the list\n", search);
    }
    return 0;
}