N, M = map(int, input().split())

cur = 0
for i in range(N):
    numbers = list(map(int, input().split()))
    min_value = min(numbers)
    cur = max(cur, min_value)

print(cur)