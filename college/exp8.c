#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head = NULL; // Initialize head to NULL for an empty list

// Function prototypes
void beginsert(int item);
void lastinsert(int item);
void randominsert(int item, int loc);
void begin_delete();
void last_delete();
void random_delete(int loc);
void display();

int main()
{
    int choice, item, loc;

    while (choice != 8)
    {
        printf("\n\n *****Main menu*****\n");
        printf("\n Choose one of the options:\n");
        printf("\n 1. Insert at beginning\n");
        printf("\n 2. Insert at last\n");
        printf("\n 3. Insert at a specific location\n");
        printf("\n 4. Delete from beginning\n");
        printf("\n 5. Delete from last\n");
        printf("\n 6. Delete from a specific location\n");
        printf("\n 7. Display the list\n");
        printf("\n 8. Exit the program\n");
        printf("\n Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("\nEnter the value to insert: ");
            scanf("%d", &item);
            beginsert(item);
            break;
        case 2:
            printf("\nEnter the value to insert: ");
            scanf("%d", &item);
            lastinsert(item);
            break;
        case 3:
            printf("\nEnter the value to insert: ");
            scanf("%d", &item);
            printf("\nEnter the location (starting from 1): ");
            scanf("%d", &loc);
            randominsert(item, loc);
            break;
        case 4:
            begin_delete();
            break;
        case 5:
            last_delete();
            break;
        case 6:
            printf("\nEnter the location of the node to delete: ");
            scanf("%d", &loc);
            random_delete(loc);
            break;
        case 7:
            display();
            break;
        case 8:
            exit(0);
        default:
            printf("\nEnter a valid choice\n");
        }
    }

    return 0;
}

// Function definitions (implementation details omitted for brevity)
void beginsert(int item)
{
    // ... (implementation for inserting at the beginning)
}

void lastinsert(int item)
{
    // ... (implementation for inserting at the last)
}

void randominsert(int item, int loc)
{
    // ... (implementation for inserting at a specific location)
}

void begin_delete()
{
    // ... (implementation for deleting from the beginning)
}

void last_delete()
{
    // ... (implementation for deleting from the last)
}

void random_delete(int loc)
{
    // ... (implementation for deleting from a specific location)
}

void display()
{
    // ... (implementation for displaying the list)
}
