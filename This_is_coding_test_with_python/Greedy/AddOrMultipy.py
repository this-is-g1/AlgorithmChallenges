sequence = str(input())
sum = int(sequence[0])

for num in range(1, len(sequence)):
    temp = int(sequence[num])
    if sum <= 1 or temp <= 1:
        sum += temp
    else:
        sum *= temp

print(sum)