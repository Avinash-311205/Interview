from collections import defaultdict

def getFrequencyQueries(threshold, timestamp, queryTypes):
    mp = defaultdict(list)

    for t, q in zip(timestamp, queryTypes):
        mp[q].append(t)

    res = []

    for q, times in mp.items():
        times.sort()

        l = 0
        for r in range(len(times)):
            while times[l] > times[r] > 600:
                l += 1
            if r - l + 1 >= threshold:
                res.append(q)
                break
    return res
def main():
    threshold = 3
    timestamp = [1, 100, 200, 700, 800, 900]
    queryTypes = ["A", "A", "A", "B", "B", "B"]
    result = getFrequencyQueries(threshold, timestamp, queryTypes)
    print(result)
main()