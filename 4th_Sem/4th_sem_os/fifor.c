#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<string.h>

int main()
{
 int b;
char *path="/temp/7071";
char buf[100];
b=open(path,O_RDONLY);

if(b!=-1)
{ 
  read(b,buf,20);
 

}

printf("%s",buf);

return 0;
}
