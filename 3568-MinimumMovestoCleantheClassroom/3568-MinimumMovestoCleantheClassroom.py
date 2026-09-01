# Last updated: 9/1/2026, 1:16:51 PM
1class Solution:
2    def minMoves(self, classroom: List[str], energy: int) -> int:
3        m, n = len(classroom), len(classroom[0])
4        litterMap = {}
5        startRow = startCol = -1
6        litterIndex = 0
7
8        for i in range(m):
9            for j in range(n):
10                if classroom[i][j] == 'S':
11                    startRow, startCol = i, j
12                elif classroom[i][j] == 'L':
13                    litterMap[(i, j)] = litterIndex
14                    litterIndex += 1
15
16        totalLitter = len(litterMap)
17        if totalLitter == 0:
18            return 0
19
20        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
21
22        heap = []
23        heapq.heappush(heap, (0, startRow, startCol, energy, 0))
24        visited = {}
25
26        while heap:
27            moves, x, y, energyLeft, mask = heapq.heappop(heap)
28
29            if mask == (1 << totalLitter) - 1:
30                return moves
31
32            stateKey = (x, y, mask)
33            if stateKey in visited and visited[stateKey] >= energyLeft:
34                continue
35            visited[stateKey] = energyLeft
36
37            for dx, dy in directions:
38                nx, ny = x + dx, y + dy
39                if not (0 <= nx < m and 0 <= ny < n):
40                    continue
41                cell = classroom[nx][ny]
42                if cell == 'X':
43                    continue
44
45                if energyLeft == 0:
46                    continue
47
48                nextEnergy = energy if cell == 'R' else energyLeft - 1
49                if nextEnergy < 0:
50                    continue
51
52                nextMask = mask
53                if cell == 'L' and (nx, ny) in litterMap:
54                    nextMask |= (1 << litterMap[(nx, ny)])
55
56                heapq.heappush(heap, (moves + 1, nx, ny, nextEnergy, nextMask))
57
58        return -1