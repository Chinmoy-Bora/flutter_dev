from random import randint

lst=[]

for i in range(0,20):
	j=randint(1,100)
	lst.append(j)
print(lst)
	
b=0
for i in range(0,20):
	a=lst[i]
	b+=(b+a)/20
        
print(b)

c=200
d=lst[0]
for i in range(0,20):
	if(lst[i]<c):
		c=lst[i]
	if(d<lst[i]):
		d=lst[i]	
print(c)
print(d)

lst.sort()

print(lst)
print(lst[1],lst[18])
flag=0
for i in range(0,20):
	if(lst[i]%2==0):
		flag+=1
print(flag)
