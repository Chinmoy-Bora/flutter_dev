#include<stdio.h>
#include<string.h>
#include<unistd.h>
#include<pthread.h>

void *task_1();
void *task_2();
pthread_mutex_t first_mutex;
pthread_mutex_t second_mutex;

int main()
{
 pthread_mutex_init(&first_mutex,NULL);
 pthread_mutex_init(&second_mutex,NULL);

pthread_t one ,two;

pthread_create(&one,NULL,&task_1,NULL);
pthread_create(&two,NULL,&task_2,NULL);
pthread_join(one,NULL);
pthread_join(two,NULL);

return 0;
}


void *task_1()
{
  pthread_mutex_lock(&first_mutex);
printf("1\n");
pthread_mutex_lock(&second_mutex);
printf("2\n");

pthread_mutex_unlock(&second_mutex);
printf("3\n");
pthread_mutex_unlock(&first_mutex);
printf("4\n");

}

void *task_2()
{
pthread_mutex_lock(&second_mutex);
printf("1\n");
pthread_mutex_lock(&first_mutex);
printf("2\n");

pthread_mutex_unlock(&first_mutex);
printf("3\n");
pthread_mutex_unlock(&second_mutex);
printf("4\n");



}


