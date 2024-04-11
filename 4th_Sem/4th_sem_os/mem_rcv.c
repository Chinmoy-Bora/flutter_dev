#include<stdio.h>
#include<string.h>
#include<sys/ipc.h>
#include<sys/shm.h>
#include<sys/types.h>

int main()
{
  int x;
  char *p,ar[10];
x=shmget(7055,20,IPC_CREAT|0666);

if(x!=-1)
{
	p=(char *)shmat(x,NULL,0);
	printf("%s",p);
}

return 0;

}
