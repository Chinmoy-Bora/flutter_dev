lst=[]
n=int(input())
for i in range(0,n):
 j=int(input())
 lst.append(j)
print(lst)
print(len(lst))
print(lst[-1])

#del(lst[0])
#del(lst[-1])
#print(lst)

#lst.sort()
print(lst)
flag=0
for i in range(0,n):
	if(lst[i]<5):
		flag=flag+1
print(flag)
