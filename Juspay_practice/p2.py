def solve(n,k,s):
    chars = sorted(set(s))
    def generate(curr):
        if len(curr) == k:
            return curr if curr > s else None
        for ch in chars:
            res = generate(curr + ch)
            if res:
                return res
        return None
    ans = generate("")
    return ans if ans else "-1"
def main():
    n = int(input())
    k = int(input())
    s = input()
    result = solve(n,k,s)
    print(result)
main()