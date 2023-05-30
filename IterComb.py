from itertools import combinations

S, k = input().split()

for i in range(int(k)): 
    print(*sorted(list(map("".join, combinations(sorted(S), i+1)))), sep="\n")