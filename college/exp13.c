#include <stdio.h>

void insertionSort(int arr[], int n) {
    // Sorts the array `arr` of size `n` in ascending order using Insertion Sort
    for (int i = 1; i < n; i++) {
        int temp = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
}

int main() {
    int s, i;
    printf("Enter the size of the list: \n");
    scanf("%d", &s);

    int lst[s];
    printf("Enter the integer values: ", s);
    for (i = 0; i < s; i++) {
        scanf("%d", &lst[i]);
    }

    insertionSort(lst, s);  // Call the sorting function

    printf("List after sorting is: ");
    for (i = 0; i < s; i++) {
        printf("%d ", lst[i]);
    }
    printf("\n");

    return 0;
}
