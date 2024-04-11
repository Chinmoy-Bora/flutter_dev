#include<stdio.h>
#include<sys/types.h>
#include<fcntl.h>
#include<sys/stat.h>
#include<string.h>
#include<unistd.h>

int main()
{
	 int a,b;
	char *ptr="/temp/7053",buf[100];
	printf("Enter the sentence you want to send");
        scanf("%s",buf);
	a=mkfifo(ptr,6600);
if(a==0)
	{
	  b=open(ptr,O_WRONLY);
	if(b!=-1)
	{
	write(b,buf,strlen(buf)+1);
	
	}

	else
	
	  printf("ERROR!!!\n");
	int g=unlink(ptr);
	if(g==0)
{
	printf("LAMAO\n");

}

	else
	printf("LOL\n");


	}
	else
	printf("\nERROR\n");
	return 0;
}
