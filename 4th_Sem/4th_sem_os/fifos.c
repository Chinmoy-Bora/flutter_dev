#include<stdio.h>
#include<string.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
   int a,b;
char *path="/temp/7071";
char buf[100];
printf("Enter the msg:");
scanf("%[^\n]s",buf);
a=mkfifo(path,0666);
if(a==0)
{
  b=open(path,O_WRONLY);
if(b!=-1)
{

write(b,buf,strlen(buf)+1);

}

int g=unlink(path);

		if (g==0)
			printf("LMAO");
		else
			printf("LOL");
}
return 0;
}
