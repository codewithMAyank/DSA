#include <stdio.h>
int main()
{
    int arr[100], search, c, n;
    printf("Enter no of elements\n ");
    scanf("%d", &n);
    printf("Enter %d integer(s)\n", n);

    for (c = 0; c < n; c++)
    {
        scanf("%d", &arr[c]);
    }
    printf("Enter the element to search for \n");
    scanf("%d", &search);
    for (c = 0; c < n; c++)
    {
        if (arr[c] == search)
        {
            printf("%d is present at location %d\n", search, c + 1);
            break;
        }
    }
    if (c == n)
    {
        printf("%d isnt present in the array.\n", search);
    }
    return 0;
}