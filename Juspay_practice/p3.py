def solve(n,a):
    a.sort()

    l = 0
    max_stu = 0

    for r in range(n):
        while a[r] - a[l] > n - 1:
            l += 1
        max_stu = max(max_stu, r - l + 1)
    return n - max_stu
def main():
    n = int(input())
    a = list(map(int, input().split()))
    result = solve(n,a)
    print(result)
main()
