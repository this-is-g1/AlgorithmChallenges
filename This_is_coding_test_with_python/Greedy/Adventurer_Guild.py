N = int(input())
adventurers = sorted(list(map(int, input().split()))) # O(NlgN)

count = 0
maxGroups = 0

for adventurer in adventurers:
    count += 1
    if count >= adventurer:
        maxGroups += 1
        count = 0

print(maxGroups)