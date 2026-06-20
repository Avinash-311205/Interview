t = int(input())
for _ in range(t):
    n = int(input())
    edge = list(map(int, input().split()))

    c1, c2 = list(map(int, input().split()))
    dist1 = [-1] * n
    node = c1
    d = 0

    while node != -1 and 0 <= node < n and dist1[node] == -1:
        dist1[node] = d
        d += 1
        node = edge[node]

    dist2 = [-1] * n
    node = c2
    d = 0

    while node != -1 and 0 <= node < n and dist2[node] == -1:
        dist2[node] = d
        d += 1
        node = edge[node]

    common = []
    for i in range(n):
        if dist1[i] != -1 and dist2[i] != -1:
            common.append(i)
    if not common:
        print(-1)
        continue
    ans = min(common, key=lambda cell: dist1[cell] + dist2[cell])

    print(ans)