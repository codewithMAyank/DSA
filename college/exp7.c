#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

// Initialize front and rear to NULL for an empty queue
struct node *front = NULL;
struct node *rear = NULL;

void insert(int item)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    if (ptr == NULL)
    {
        printf("\nOVERFLOW\n");
        return;
    }
    else
    {
        ptr->data = item;
        ptr->next = NULL;

        if (front == NULL)
        {
            front = rear = ptr; // Handle empty queue case
        }
        else
        {
            rear->next = ptr;
            rear = ptr;
        }
    }
}

void delete()
{
    struct node *ptr;
    if (front == NULL)
    {
        printf("\nUNDERFLOW\n");
        return;
    }
    else
    {
        ptr = front;
        front = front->next;
        free(ptr);
        if (front == NULL)
        { // Handle queue becoming empty after deletion
            rear = NULL;
        }
    }
}

void display()
{
    struct node *ptr = front;
    if (front == NULL)
    {
        printf("\nEMPTY QUEUE\n");
    }
    else
    {
        printf("\nPrinting values...\n");
        while (ptr != NULL)
        {
            printf("%d ", ptr->data);
            ptr = ptr->next;
        }
    }
}

int main()
{
    int choice, item;

    while (1)
    { // Use a loop for continuous menu interaction
        printf("\n********Main menu***********");
        printf("\n1. Insert an element");
        printf("\n2. Delete an element");
        printf("\n3. Display");
        printf("\n4. Exit the program\n");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("\nEnter a value to insert: ");
            scanf("%d", &item);
            insert(item);
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
            printf("\nEnter a valid choice\n");
        }
    }

    return 0; // Explicitly return 0 to indicate successful program termination
}
