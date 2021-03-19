N, M, K = map(int, input().split())
numbers = sorted(list(map(int, input().split())), reverse=True) # O(NlgN)

sum = 0

count = int(M / (K + 1)) * K + M % (K + 1)

sum += count * numbers[0]
sum += (M - count) * numbers[1]

print(sum)