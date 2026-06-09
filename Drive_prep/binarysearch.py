# Binary search
def binary_search(arr, target):
    l, r = 0, len(arr) - 1
    while l <= r:
        mid = l + (r-l)//2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            l = mid + 1
        else:
            r = mid - 1
    return -1
def main():
    arr = [1,2,3,4,5,6,7,8,9]
    target = 5
    result = binary_search(arr, target)
    print(result)
main()