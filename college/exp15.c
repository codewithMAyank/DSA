#include <stdio.h>
void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}
void selectionsort(int arr[], int n)
{
    int i, j, min_id;
    for (i = 0; i < n - 1; i++)
    {
        min_id = i;
        for (j = i + 1; j < n; j++)
        {
            if (arr[j] < arr[min_id])
            {
                min_id = j;
            }
        }
        swap(&arr[min_id], &arr[i]);
    }
}
void printarray(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
int main()
{
    int arr[] = {64, 25, 12, 22, 11};
    int n = sizeof(arr) / sizeof(arr[0]);
    selectionsort(arr, n);
    printarray(arr, n);
    return 0;
}