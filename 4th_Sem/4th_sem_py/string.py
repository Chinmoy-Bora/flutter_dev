s=input("Enter the string ")

print(len(s))

print(s*10,end=' ')

print(s[0])

print(s[0:3])

print(s[-3:])

print(s[::-1])

if(len(s)>=7):
	print(s[6])
else:
	print("Sutmaroni ho tum");

print(s.replace(s[0],'',1))
print(s.replace(s[-1],'',1))


print(s.upper())
print(s.replace("a","e"))


for i in s:
	s=s.replace(i,' ')
print(s)



