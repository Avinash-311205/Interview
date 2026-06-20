t = int(input())

for _ in range(t):
    n = int(input())
    edges = list(map(int, input().split()))

weight = [0] * n
has_edge = False

for i, v in enumerate(edges):
    if v != -1:
        has_edge = True

        if 0 <= v < n:
            weight[v] += 1
    
    if not has_edge:
        print(-1)
        continue
    max_weight = -1
    ans = -1

    for i in range(n):
        if weight[i] > max_weight or (weight[i] == max_weight and ans > i):
            max_weight = weight[i]
            ans = i
print(ans)
