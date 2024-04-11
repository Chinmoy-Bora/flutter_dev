#include<stdio.h>
#include<unistd.h>
#include<string.h>
#include<pthread.h>

int a=10;
pthread_mutex_t lock;

void * task_1()

{
  pthread_mutex_lock(&lock);
 printf("Chinmoy\n");
a=a+100;
printf("The value of a=%d\n",a);

}

void * task_2()
{
 printf("chinmoy\n");
a=a*100;
printf("The value of a=%d\n",a);
pthread_mutex_unlock(&lock);

}

int main()
{
  int x;
pthread_t t[2];
pthread_mutex_init(&lock,NULL);
pthread_mutex_lock(&lock);

x=pthread_create(&t[0],NULL,&task_1,NULL);
x=pthread_create(&t[1],NULL,&task_2,NULL);

sleep(1);
return 0;

}


