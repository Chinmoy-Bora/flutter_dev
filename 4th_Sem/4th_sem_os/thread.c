#include<stdio.h>
#include<string.h>
#include<pthread.h>
#include<unistd.h>
void *task_1()
{
   printf("\n1st task executed\n");
}

void *task_2()
{

   printf("\n2nd task executed\n");

}

int main()
{
  int x;
  pthread_t t[2];
x=pthread_create(&t[0],NULL,&task_1,NULL);
x=pthread_create(&t[1],NULL,&task_2,NULL);

sleep(1);
return 0;


}


