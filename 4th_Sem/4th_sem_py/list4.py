lst=[]

for i in range(0,4):
	j=int(input())
	lst.append(j)
print(lst)

for i in range(0,4):
	if(lst[i]>10):
		lst[i]=10

print(lst)

