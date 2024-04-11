sum = 0
for NUM in range(1, 2001):
       series = NUM - (NUM + 1) + (NUM - 1)
       sum += series
print(sum)
