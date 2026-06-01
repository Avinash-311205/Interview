n = int(input())
m = int(input())
k = int(input())
arr = list(map(int, input().split()))

arr.sort()
l = 0
n = len(arr)
r = n - 1
count = 0
avg = sum(arr) / n

if (avg == k):
    print(0)
else:
    while l < r:
        x = abs(m - arr[l])
        arr[0] = arr[l] + x
        count += 1
        avg_l = sum(arr) / n
        l += 1
        if (avg_l == k):
            print(count)
            break
    if (avg > k):
        while l < r:
            y = abs(m - arr[r])
            arr[n-1] = arr[r] - y
            count += 1
            avg_r = sum(arr) / n
            r -= 1
            if (avg_r == k):
                print(count)
                break
print(count)
