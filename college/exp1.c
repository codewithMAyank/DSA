#include <stdio.h>
#include <conio.h>
void insert_ele(int i, int arr[], int len)
{
    int ele, loc;
    printf("\n enter the element to be inserted \n");
    scanf("%d", &ele);
    printf("\n enter the location\n");
    scanf("%d", &loc);
    if (i == 19)
    {
        printf("\nOverflow\n");
    }
    else
    {
        while (i >= loc)
        {
            arr[i + 1] = arr[i];
            i--;
        }
    }
    arr[loc] = ele;
    len++;
    printf("\n New array: ");
    for (i = 0; i < len; i++)
    {
        printf("%d ", arr[i]);
    }
}
void delete_ele(int i, int arr[], int len)
{
    int loc;
    printf("enter the location of element to be deleted \n");
    scanf("%d ", &loc);
    if (len == 0)
    {
        printf("\n Underflow");
    }
    else
    {
        for (i = loc; i < len; i++)
        {
            arr[i] = arr[i + 1];
        }
        len--;
        printf("\n new array is\n");
        for (i = 0; i < len; i++)
        {
            printf("\t%d ", arr[i]);
        }
    }
}
void main()
{
    int arr[20], i = 0, len = 0, ch;
    char choice;
    printf("\nEnter number of elements you want to insert : ");
    scanf("%d", &len);
    for (i = 0; i < len; i++)
    {
        printf("enter the element %d :", i);
        scanf("%d", &arr[i]);
    }
    i--;
label:
    printf("\n 1.To insert element,2.To delete \n");
    scanf("%d", &ch);
    switch (ch)
    {
    case 1:
        insert_ele(i, arr, len);
        break;
    case 2:
        delete_ele(i, arr, len);
        break;
    default:
        printf("\n Invalid operation\n");
        break;
    }
    printf("\n press y to continue or any other key to quit : ");
    scanf("%s", &choice);
    if (choice == 'y' || choice == 'Y')
    {
        goto label;
    }
}