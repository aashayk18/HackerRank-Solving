# Enter your code here. Read input from STDIN. Print output to STDOUT

from collections import Counter

X = int(input())
S = input().split()
N = int(input())

sp = []
res = []

for _ in range(N):
    X = input().split(" ")
    sp.append(X)
    
for k in sp:
    if k[0] in S:
        res.append(k[1])
        S.remove(k[0])
        
res = list(map(int, res))

print(sum(res))
