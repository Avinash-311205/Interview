def modified_binary_search(arr, target):
    l, r = 0, len(arr) - 1
    result = -1
    while l <= r:
        mid = l + (r-l)//2
        if arr[mid] == target:
            result = mid
            r = mid - 1
        elif arr[mid] < target:
            l = mid + 1
        else:
            r = mid - 1
    return result
def main():
    arr = [1,2,3,4,5,5,5,6,7,8,9]
    target = 6
    result = modified_binary_search(arr, target)
    print(result)
main()