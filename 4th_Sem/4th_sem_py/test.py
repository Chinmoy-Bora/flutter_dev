import math
m=0
x=0
for n in range(0,2001): 
   if(n%2==1):
        m=m+n
for t in range (0,2001):
    if(t%2==0):
      x=x-t

b=x+m

print("The sum is ",b)
