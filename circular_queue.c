//CIRCULAR QUEUE
#include<stdio.h>
#define N 5
int cq[N];
int front=-1,rear=-1;
void enqueue(int x)
{
  if(front==(rear+1)%N)
  {
    printf("CQ is full");
  }
  else
  {
    if(front==-1 && rear==-1)
    {
      front=0;
      rear=0;
      cq[rear]=x;
    }
    else
    {
      rear=(rear+1)%N;
      cq[rear]=x;
    }
  }
}
void display()
{
  int i;
  if(front==-1 && rear==-1)
  printf("CQ is empty");
  else
  {
    i=front;
    while(i!=rear)
    {
      printf("%d->",cq[i]);
      i=(i+1)%N;
    }
    printf("%d",cq[rear]);
  }
}
int dequeue()
{
  int x;
  if(front==-1 && rear==-1)
  {
    printf("CQ is empty");
    return -1;
  }
  else
  {
    x=cq[front];
    front=(front+1)%N;
    return x;
  }
}
void main()
{
  enqueue(21);
  enqueue(-2);
  enqueue(40);
  enqueue(70);
  enqueue(60);
  display();
  dequeue();
  dequeue();
  display();
  enqueue(-50);
  display();
}
