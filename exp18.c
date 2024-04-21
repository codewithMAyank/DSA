#include <stdio.h>
int largest(int a[])
{
    int larger = a[0], i;
    for (i = 1; i < 10; i++)
    {
        if (a[i] > larger)
        {
            larger = a[i];
        }
    }
    return larger;
}
void radixsort(int a[], int n)
{
    int bucket[10][10], bucket_count[10];
    int i, j, k, r, NOP = 0, divisor = 1, lar, pass;
    lar = largest(a);
    while (lar > 0)
    {
        NOP++;
        lar /= 10;
    }
    for (pass = 0; pass < NOP; pass++)
    {
        for (i = 0; i < 10; i++)
        {
            bucket_count[i] = 0;
        }
        for (i = 0; i < n; i++)
        {
            r = (a[i] / divisor) % 10;
            bucket[r][bucket_count[r]] = a[i];
            bucket_count[r] += 1;
        }
        i = 0;
        for (k = 0; k < 10; k++)
        {
            for (j = 0; j < bucket_count[k]; j++)
            {
                a[i] = bucket[k][j];
                i++;
            }
        }
        divisor *= 10;
        printf("After pass %d : ", pass + 1);
        for (i = 0; i < n; i++)
        {
            printf("%d ", a[i]);
        }
        printf("\n");
    }
}
int main()
{
    int i, n, a[10];
    printf("enter the no of items to be sorted : ");
    scanf("%d", &n);
    printf("Enter the items : ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    radixsort(a, n);
    printf("Sorted items : ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
    return 0;
}