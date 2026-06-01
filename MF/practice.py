def count_color(n, edges, colors):
    graph = [[] for _ in range(n + 1)]
    for u, v in edges:
        graph[u].append(v)
        graph[v].append(u)
    visited = [False] * (n+1)

    def dfs(node, visited_count, same_color_count):
        if visited_count == n:
            return 1
        ways = 0
        for nei in graph[node]:
            if not visited[nei]:
                if colors[nei] == colors[node]:
                    new_count = same_color_count + 1
                else:
                    new_count = 1

                if new_count >= 3:
                    continue

                visited[nei] = True

                ways += dfs(nei, visited_count + 1, new_count)
                visited[nei] = False
        return ways
    ans = 0
    for start in range(1, n+1):
        visited[start] = True
        ans += dfs(start, 1, 1)
        visited[start] = False
    return  ans

n = 4

edges = [
    (1,2),
    (1,3),
    (2,3),
    (2,4),
    (3,4)
]

colors = ['', 'r', 'g', 'r', 'r']

print(count_color(n, edges, colors))