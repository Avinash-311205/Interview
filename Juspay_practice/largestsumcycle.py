t = int(input())
for _ in range(t):
    n = int(input())
    edge = list(map(int, input().split()))

    vis = [0] * n
    max_sum = -1
    comp_id = 1
    for i in range(n):
        if vis[i] != 0:
            continue
        curr = i

        while curr != -1 and vis[curr] == 0:
            vis[curr] = comp_id
            curr = edge[curr]
        if curr != -1 and vis[curr] == comp_id:
            cycle_sum = 0
            node = curr
            while True:
                cycle_sum += node
                node= edge[node]
                if node == curr:
                    break
            if cycle_sum > max_sum:
                max_sum = cycle_sum
        comp_id += 1

    print(max_sum)