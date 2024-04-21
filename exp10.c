#include <stdio.h>

#define MAXSIZE 5

void insert();
void delete();
void display();

int front = -1, rear = -1;
int queue[MAXSIZE];

int main()
{
    int choice;

    while (choice != 4)
    {
        printf("\n******** Main Menu ********\n");
        printf("===============================\n");
        printf("1. Insert an element\n");
        printf("2. Delete an element\n");
        printf("3. Display list\n");
        printf("4. Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            insert();
            break;
        case 2:
            delete ();
            break;
        case 3:
            display();
            break;
        case 4:
            exit(0);
        default:
            printf("\nEnter valid choice\n");
        }
    }

    return 0;
}

void insert()
{
    int item;
    printf("\nEnter the element: ");
    scanf("%d", &item);

    if (rear == MAXSIZE - 1)
    {
        printf("\nOVERFLOW\n");
        return;
    }

    if (front == -1 && rear == -1)
    {
        front = 0;
        rear = 0;
    }
    else
    {
        rear++;
    }

    queue[rear] = item;
    printf("\nValue inserted\n");
}

void delete()
{
    int item;

    if (front == -1 || front > rear)
    {
        printf("\nUNDERFLOW\n");
        return;
    }
    else
    {
        item = queue[front];
        if (front == rear)
        {
            front = rear = -1;
        }
        else
        {
            front++;
        }
        printf("\nValue deleted\n");
    }
}

void display()
{
    int i;

    if (rear == -1)
    {
        printf("\nEmpty queue\n");
    }
    else
    {
        printf("\nPrinting values...\n");
        for (i = front; i <= rear; i++)
        {
            printf("%d ", queue[i]);
        }
    }
}
