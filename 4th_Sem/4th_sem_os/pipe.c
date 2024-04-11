#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/types.h>
#include<sys/stat.h>
#include<string.h>
#include<sys/wait.h>
int main()
{
  int a,id,ar[2];
  char buf[100];
a=pipe(ar);

if(a==0)
{
  id =fork();

if(id==0)
{
printf("Child\n");
printf("Enter the string");
scanf("%[^\n]s",buf);

write(ar[1],buf,strlen(buf)+1);

}

else
{ wait(NULL);
 printf("Parent\n");
printf("%s\n",buf);
read(ar[0],buf,20);



}
}
return 0;
}



