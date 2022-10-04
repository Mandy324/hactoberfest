#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

struct Node* create(){
    struct Node* start = (struct Node*)malloc (sizeof(struct Node));
    struct Node* current = start;
    start->next = NULL;
    int Ans;
    printf("Enter the data:\n");
    scanf("%d", &start->data);
    printf("Another Node?\n");
    scanf("%d", &Ans);
    while(Ans == 1){
    struct Node* temp = (struct Node*)malloc (sizeof(struct Node));
    temp->next = NULL;
    printf("Enter the data:\n");
    scanf("%d", &temp->data);
    current->next = temp;
    current = current->next;
    printf("Another Node?\n");
    scanf("%d", &Ans);
    }
    current->next = start;
    return start;
}

void display(struct Node* start){
    struct Node* head;
    head = start;
    do
    {
        printf("%d " ,head->data);
        head = head->next;
    } while (head!= start);
    printf("\n");
}

struct Node* insert_at_begin(struct Node* start,int data){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node)),*q = start;
    temp->data = data;
    while (q->next != start)
    {
        q = q->next;
    }
    temp->next = start;
    q->next = temp;
    start = temp;
    return start;
}

struct Node* insert(struct Node* start,int data,int index){
    struct Node* temp,*q;
    q = start;
    temp = (struct Node*)malloc (sizeof(struct Node));
    temp->data = data;
    int i=1;
    while (index-2)
    {
        q = q->next;
        index--;
    }
    temp->next = q->next;
    q->next = temp;
    return start;
    }

int main()
{
    struct Node*start;
    start = create();
    display(start);
    start = insert_at_begin(start,4);
    display(start);
return 0;
}