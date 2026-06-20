def solve(n, intervals):
    intervals.sort()

    def can_place(d):
        prev = intervals[0][0]

        for i in range(1, n):
            pos = max(intervals[i][0], prev + d)

            if pos > intervals[i][1]:
                return False
            prev = pos

        
        return True
    l = 0
    h = 10**14
    ans = 0

    while l <= h:
        mid = (l+h)//2

        if can_place(mid):
            ans = mid
            l = mid + 1
        else:
            h = mid - 1
    return ans
def main():
    n = int(input())
    intervals = []
    for _ in range(n):
        l, r = map(int, input().split())
        intervals.append((l, r))
    print(solve(n, intervals))
main()