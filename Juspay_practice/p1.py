def solve(s):
    ans = 0
    for i in range(len(s) - 1):
        if s[i:i+2] == "DE":
            ns = s[:i] + "EC" + s[i+2:]
            ans = max(ans, 1 + solve(ns))
        elif s[i:i+2] == "ED":
            ns = s[:i] + "CE" + s[i+2:]
            ans = max(ans, 1 + solve(ns))
    return ans
print(solve(""))        