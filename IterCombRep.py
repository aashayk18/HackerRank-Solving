from itertools import combinations_with_replacement as comb

S, k = input().split()

for each in comb(sorted(S), int(k)):
    print(''.join(each))