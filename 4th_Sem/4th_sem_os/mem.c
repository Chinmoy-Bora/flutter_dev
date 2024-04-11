#include<stdio.h>
#include<string.h>
#include<sys/shm.h>
#include<sys/ipc.h>
#include<sys/types.h>

int main()
{
  int x;
  char *p,ar[10];
x=shmget(7055,20,IPC_CREAT|0666);

if (x!=-1)
{
	p=(char *)shmat(x,NULL,0);
	printf("Enter the msg:\n");
	scanf("%[^\n]s",ar);
	strcpy(p,ar);

}
return 0;

}
