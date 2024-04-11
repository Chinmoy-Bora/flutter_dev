#include<stdio.h>
#include<pthread.h>
#include<unistd.h>

pthread_mutex_t first;
pthread_mutex_t second;

void *todo1();
void *todo2();

int main()
{
   pthread_mutex_init(&first,NULL);
   pthread_mutex_init(&second,NULL);
 pthread_t one, two;
pthread_create(&one,NULL,&todo1,NULL);
pthread_create(&two,NULL,&todo2,NULL);

pthread_join(one,NULL);
pthread_join(two,NULL);


}

void *todo1()
{
  pthread_mutex_lock(&first);
 printf("1\n");
pthread_mutex_lock(&second);
printf("2\n");
pthread_mutex_unlock(&second);
printf("3\n");
pthread_mutex_unlock(&first);
printf("4\n");
}

void *todo2()
{
pthread_mutex_lock(&second);
printf("5\n");
pthread_mutex_lock(&first);
printf("6\n");
pthread_mutex_unlock(&first);
printf("7\n");
pthread_mutex_unlock(&second);
printf("8\n");


}


