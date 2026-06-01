from collections import deque

class Node:
    def __init__(self, name):
        self.s = name
        self.isLocked = False
        self.id = 0
        self.parent = None
        self.desc_locked = 0
        self.children = []
        self.desc_locklist = set()


def lockNode(node, id):

    if node.isLocked:
        return False

    if node.desc_locked > 0:
        return False

    parent = node.parent
    while parent is not None:
        if parent.isLocked:
            return False
        parent = parent.parent

    parent = node.parent
    while parent is not None:
        parent.desc_locked += 1
        parent.desc_locklist.add(node)
        parent = parent.parent

    node.isLocked = True
    node.id = id

    return True


def unlockNode(node, id):

    if not node.isLocked or node.id != id:
        return False

    parent = node.parent
    while parent is not None:
        parent.desc_locked -= 1
        parent.desc_locklist.discard(node)
        parent = parent.parent

    node.isLocked = False
    node.id = 0

    return True


def upgradeNode(node, id):

    if node.isLocked or node.desc_locked == 0:
        return False

    arr = node.desc_locklist.copy()

    for child in arr:
        if child.isLocked and child.id != id:
            return False

    n = len(arr)

    parent = node.parent
    while parent is not None:

        parent.desc_locked -= n

        for x in arr:
            parent.desc_locklist.discard(x)

        parent.desc_locklist.add(node)

        parent = parent.parent

    for child in arr:

        child.isLocked = False
        child.id = 0

        parent = child.parent
        while parent != node:
            parent.desc_locked -= 1
            parent.desc_locklist.discard(child)
            parent = parent.parent

    node.desc_locked = 0
    node.desc_locklist.clear()

    node.isLocked = True
    node.id = id

    return True


def main():

    n = int(input().strip())
    k = int(input().strip())
    q = int(input().strip())

    nodes = []
    for _ in range(n):
        nodes.append(input().strip())

    mp = {}

    root = Node(nodes[0])
    mp[nodes[0]] = root

    que = deque()
    que.append(root)

    index = 1

    while que and index < n:

        parent = que.popleft()

        for _ in range(k):

            if index >= n:
                break

            curr = Node(nodes[index])
            curr.parent = parent
            parent.children.append(curr)

            mp[nodes[index]] = curr
            que.append(curr)

            index += 1

    for _ in range(q):

        op, name, id = input().split()
        op = int(op)
        id = int(id)

        node = mp.get(name)

        if node is None:
            print("false")
            continue

        result = False

        if op == 1:
            result = lockNode(node, id)

        elif op == 2:
            result = unlockNode(node, id)

        elif op == 3:
            result = upgradeNode(node, id)

        if result:
            print("true")
        else:
            print("false")


main()