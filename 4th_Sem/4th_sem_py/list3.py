lst=[8,9,10]
lst[1]=17
print(lst)

lst.extend([4,5,6])
print(lst)

del lst[0]

print(lst)

lst.sort()

print(lst)

lst.extend(lst)

print(lst)

lst.insert(3,25)

print(lst)
