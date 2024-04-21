#include <stdio.h>
#include <stdlib.h>

struct node {
  int data;
  struct node *next;
};

struct queue {
  struct node *front;
  struct node *rear;
};

void enqueue(struct queue *q, int data) {
  struct node *new_node = (struct node *)malloc(sizeof(struct node));
  new_node->data = data;
  new_node->next = NULL;

  if (q->rear == NULL) {
    q->front = new_node;
    q->rear = new_node;
  } else {
    q->rear->next = new_node;
    q->rear = new_node;
  }
}

int dequeue(struct queue *q) {
  if (q->front == NULL) {
    return -1;
  } else {
    int data = q->front->data;
    struct node *temp = q->front;
    q->front = q->front->next;

    if (q->front == NULL) {
      q->rear = NULL;
    }

    free(temp);
    return data;
  }
}

void print_queue(struct queue *q) {
  struct node *temp = q->front;

  while (temp != NULL) {
    printf("%d ", temp->data);
    temp = temp->next;
  }

  printf("\n");
}

int main() {
  struct queue *q = (struct queue *)malloc(sizeof(struct queue));
  q->front = NULL;
  q->rear = NULL;

  enqueue(q, 1);
  enqueue(q, 2);
  enqueue(q, 3);

  print_queue(q);

  dequeue(q);

  print_queue(q);

  return 0;
}